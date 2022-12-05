package com.commerce.Order_Service.service;

import com.commerce.Order_Service.model.Order;

import java.util.List;

public interface OrderService {
    public Order addOrder (Order order);
    public List<Order> RetreiveAllOrder ();

    Order updateOrder(Order order);
    Order findById (String id);
    public void DeleteOrder(String id);

}
