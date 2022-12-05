package com.example.CustomerService.Controller;

import com.example.CustomerService.Service.CustomerServiceImpl;
import com.example.CustomerService.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerServiceImpl CustomerService;

    @PostMapping("/Add")
    @ResponseBody
    public Customer addOrder(@RequestBody Customer c){

        return CustomerService.addCustomer(c);
    }

    @GetMapping("/retrieve-all-Customer")
    @ResponseBody
    public List<Customer> getAllCreationidm() {
        List<Customer> list = CustomerService.RetreiveAllCustomer();
        return list;
    }


    @GetMapping("/retrieve-Customer/{id}")
    @ResponseBody
    public Customer getCreationidmById(@PathVariable("id")String id) {
        return CustomerService.findById(id);
    }


    @PutMapping("/updateCustomer")
    public Customer updateCustomer(@RequestBody Customer c)
    {
        return  CustomerService.updateCustomer(c);
    }

    @DeleteMapping("/remove-Customer/{id}")
    @ResponseBody
    public void removeCreationidm(@PathVariable("id") String id) {
        CustomerService.DeleteCustomer(id);
    }
}

