package com.example.customermanagement.repository;

import com.example.customermanagement.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepo {
    private List<Customer> customers=new ArrayList<>();

    public List<Customer> findAll() {
        List<Customer> customers=BaseRepository.entityManager.createQuery("from customer", Customer.class).getResultList();
        return customers;
    }
    public void save(Customer s) {
//
        EntityTransaction transaction  = BaseRepository.entityManager.getTransaction();
        transaction.begin();
        BaseRepository.entityManager.persist(s);
        transaction.commit();
    }
}
