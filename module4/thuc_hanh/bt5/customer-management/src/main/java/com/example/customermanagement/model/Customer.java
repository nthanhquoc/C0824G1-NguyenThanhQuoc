package com.example.customermanagement.model;

import javax.persistence.*;

@Entity(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition = "INT")
    private int id;
    @Column(name = "name",columnDefinition = "VARCHAR(100)",nullable = false)
    private String name;
    @Column(name = "email",columnDefinition ="VARCHAR(100)")
    private String email;
    @Column(name = "address",columnDefinition = "VARCHAR(100)")
    private String address;

    public Customer(){

    }

    public Customer(int id,String name,String email,String address){
        this.id=id;
        this.name=name;
        this.email=email;
        this.address=address;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}