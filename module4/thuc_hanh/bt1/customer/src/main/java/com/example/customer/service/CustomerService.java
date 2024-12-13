package com.example.customer.service;

import com.example.customer.model.Customer;
import com.example.customer.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

    public Customer findById(Integer id){
        return customerRepo.findById(id);
    }
}
