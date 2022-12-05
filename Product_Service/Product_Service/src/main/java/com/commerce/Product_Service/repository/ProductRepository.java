package com.commerce.Product_Service.repository;

import com.commerce.Product_Service.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {

}
