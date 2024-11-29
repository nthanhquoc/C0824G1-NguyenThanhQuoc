package com.example.khachhang.repository;

import com.example.khachhang.model.Client;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClientRepository {
    private static List<Client> clients = new ArrayList<>();

    static {
        clients.add(new Client("Mai Văn Hoàn", LocalDate.of(1983, 8, 20), "Đà Nẵng", "https://cdn.dribbble.com/users/3181487/screenshots/10005324/media/03b6b55b6a8de9863dd4572d4f4b9c2a.png?resize=1000x750&vertical=center"));
        clients.add(new Client("Nguyễn Văn Nam", LocalDate.of(1983, 8, 20), "Đà Nẵng", "https://cdn.dribbble.com/users/3181487/screenshots/10005324/media/03b6b55b6a8de9863dd4572d4f4b9c2a.png?resize=1000x750&vertical=center"));
        clients.add(new Client("Nguyễn Thái Hòa", LocalDate.of(1983, 8, 20), "Đà Nẵng", "https://cdn.dribbble.com/users/3181487/screenshots/10005324/media/03b6b55b6a8de9863dd4572d4f4b9c2a.png?resize=1000x750&vertical=center"));
    }

    public List<Client> getClients() {
        return clients;
    }

}
