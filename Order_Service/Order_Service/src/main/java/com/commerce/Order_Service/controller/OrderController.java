package com.commerce.Order_Service.controller;


import com.commerce.Order_Service.service.OrderServiceImpl;

import com.commerce.Order_Service.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderServiceImpl OrderService;

    @PostMapping("/Add")
    @ResponseBody
    public Order addOrder(@RequestBody Order order){

        return OrderService.addOrder(order);
    }

    @GetMapping("/retrieve-all-Order")
    @ResponseBody
    public List<Order> getAllCreationidm() {
        List<Order> list = OrderService.RetreiveAllOrder();
        return list;
    }


    @GetMapping("/retrieve-Order/{id}")
    @ResponseBody
    public Order getCreationidmById(@PathVariable("id")String id) {
        return OrderService.findById(id);
    }


    @PutMapping("/updateOrder")
    public Order updateOrder(@RequestBody Order order) {
        return  OrderService.updateOrder(order);
    }

    @DeleteMapping("/remove-Order/{id}")
    @ResponseBody
    public void removeCreationidm(@PathVariable("id") String id) {
        OrderService.DeleteOrder(id);
    }
}

