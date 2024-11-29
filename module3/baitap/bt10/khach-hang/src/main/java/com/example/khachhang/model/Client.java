package com.example.khachhang.model;

import java.time.LocalDate;

public class Client {
    private String name;
    private LocalDate dob;
    private String address;
    private String url;
    public Client() {

    }
    public Client(String name, LocalDate dob, String address, String url) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.url = url;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
