package com.javaTechie.mvcexceptionhandling.SpringMVCExceptionHandling.dao;

import com.javaTechie.mvcexceptionhandling.SpringMVCExceptionHandling.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {


    Order findByName(String productName);
}
