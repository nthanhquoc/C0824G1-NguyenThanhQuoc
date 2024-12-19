package com.example.customermanagement.service;

import com.example.customermanagement.model.Customer;
import com.example.customermanagement.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public List<Customer> getAll() {
        return customerRepo.findAll();
    }
    public void save(Customer s) {
        customerRepo.save(s);
    }
}
