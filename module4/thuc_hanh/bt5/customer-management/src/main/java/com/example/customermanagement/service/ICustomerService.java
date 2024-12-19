package com.example.customermanagement.service;

import com.example.customermanagement.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();
    void save(Customer s);

}
