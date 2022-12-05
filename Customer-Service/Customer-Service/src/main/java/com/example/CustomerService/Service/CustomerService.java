package com.example.CustomerService.Service;



import com.example.CustomerService.model.Customer;

import java.util.List;

public interface CustomerService {
    public Customer addCustomer (Customer customer);
    public List<Customer> RetreiveAllCustomer ();

    Customer updateCustomer(Customer customer);
    Customer findById (String id);
    public void DeleteCustomer(String id);
}
