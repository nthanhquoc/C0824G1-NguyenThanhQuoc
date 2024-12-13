package com.example.customer.repo;

import com.example.customer.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepo {
    private static List<Customer> customers= new ArrayList<>();

    static{
        customers.add(new Customer(1, "Nguyen Khac Nhat", "nhat@codegym.vn" ,"HàNội" ));
        customers.add(new Customer(2, "Nguyen Khac Nhat", "nhat@codegym.vn" ,"HàNội" ));
        customers.add(new Customer(3, "Nguyen Khac Nhat", "nhat@codegym.vn" ,"HàNội" ));
        customers.add(new Customer(4, "Nguyen Khac Nhat", "nhat@codegym.vn" ,"HàNội" ));
    }

    public List<Customer> findAll(){
        return customers;
    }

    public Customer findById(Integer id) {
        return customers.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}
