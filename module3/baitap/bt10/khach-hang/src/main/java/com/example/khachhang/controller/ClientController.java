package com.example.khachhang.controller;

import com.example.khachhang.model.Client;
import com.example.khachhang.service.ClientService;
import com.example.khachhang.service.IClientService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "clientController",urlPatterns ="/clients")
public class ClientController  extends HttpServlet {
    private static IClientService iClientService = new ClientService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Client> clients= iClientService.getClients();
        req.setAttribute("clients", clients);
        req.getRequestDispatcher("WEB-INF/view/clients.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
