package com.commerce.Order_Service.repository;

import com.commerce.Order_Service.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order,String> {

}
