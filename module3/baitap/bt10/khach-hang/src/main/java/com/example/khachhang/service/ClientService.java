package com.example.khachhang.service;

import com.example.khachhang.model.Client;
import com.example.khachhang.repository.ClientRepository;

import java.util.List;

public class ClientService implements IClientService {
    private static final ClientRepository CLIENT_REPOSITORY = new ClientRepository();

    public List<Client> getClients() {
        return CLIENT_REPOSITORY.getClients();
    }
}
