package com.javaTechie.mvcexceptionhandling.SpringMVCExceptionHandling.service;

import com.javaTechie.mvcexceptionhandling.SpringMVCExceptionHandling.Exception.OrderServiceException;
import com.javaTechie.mvcexceptionhandling.SpringMVCExceptionHandling.dao.OrderRepository;
import com.javaTechie.mvcexceptionhandling.SpringMVCExceptionHandling.model.Order;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @PostConstruct
    public void addOrder2DB()
    {
        List<Order> orders = new ArrayList<>();
        Order order1 = new Order(100,"Mobile","Electronics",8000);
        Order order2 =new Order(101,"Bike","Vehicle",9000);
        orders.add(order1);
        orders.add(order2);
        orderRepository.save(order1);
        orderRepository.save(order2);

    }


    public double getPrice(String productName) throws OrderServiceException {
        Order order = null;
        double amount = 0;

        try
        {
            order = orderRepository.findByName(productName);
            amount=order.getAmount();
        } catch (Exception ex)
        {
            throw new OrderServiceException("order not found with product : " + productName);
        }
        return amount;
    }

}
