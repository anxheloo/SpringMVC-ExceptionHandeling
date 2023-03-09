package com.javaTechie.mvcexceptionhandling.SpringMVCExceptionHandling.controller;

import com.javaTechie.mvcexceptionhandling.SpringMVCExceptionHandling.Exception.OrderServiceException;
import com.javaTechie.mvcexceptionhandling.SpringMVCExceptionHandling.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;


    @GetMapping("/getPrice/{productName}")
    public String getOrderPrice(@PathVariable String productName) throws OrderServiceException {
        double amount = orderService.getPrice(productName);
        return "amount for product " + productName + " is " + amount;
    }

}
