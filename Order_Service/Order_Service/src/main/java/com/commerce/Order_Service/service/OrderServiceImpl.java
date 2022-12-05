package com.commerce.Order_Service.service;

import com.commerce.Order_Service.model.Order;
import com.commerce.Order_Service.repository.OrderRepository;
import com.commerce.Order_Service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> RetreiveAllOrder() {
        return orderRepository.findAll();
    }
    @Override
    public Order updateOrder(Order order) {

        String id = order.getId();
        Order or = orderRepository.findById(id).get();
        or.setSkuCode(order.getSkuCode());
        or.setPrice(order.getPrice());
        or.setQuantity(order.getQuantity());
        return orderRepository.save(or);
    }
    @Override
    public Order findById(String id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public void DeleteOrder(String id) {
        orderRepository.deleteById(id);
    }
}
