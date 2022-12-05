package com.example.CustomerService.Service;

import com.example.CustomerService.model.Customer;
import com.example.CustomerService.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer addCustomer(Customer c) {
        return customerRepository.save(c);
    }

    @Override
    public List<Customer> RetreiveAllCustomer() {
        return customerRepository.findAll();
    }
    @Override
    public Customer updateCustomer(Customer c) {

        String id = c.getId();
        Customer cu = customerRepository.findById(id).get();
        cu.setFirstname(c.getFirstname());
        cu.setLastname(c.getLastname());
        cu.setEmail(c.getEmail());
        cu.setAdresse(c.getAdresse());
        cu.setPhone(c.getPhone());
        return customerRepository.save(cu);
    }
    @Override
    public Customer findById(String id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public void DeleteCustomer(String id) {
        customerRepository.deleteById(id);
    }
}
