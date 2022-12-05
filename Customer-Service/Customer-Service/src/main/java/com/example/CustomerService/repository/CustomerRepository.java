package com.example.CustomerService.repository;

import com.example.CustomerService.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer ,String> {
}
