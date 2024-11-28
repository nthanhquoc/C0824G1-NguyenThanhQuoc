package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslateServlet",urlPatterns = "/translate")
public class TranslateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello","Xin Chào");
        dictionary.put("how","Thế Nào");
        dictionary.put("book","Quyển Vở");
        dictionary.put("computer","Máy Tính");
        String search = req.getParameter("txtSearch");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        String result= dictionary.get(search);
        if(result!=null){
            out.println("World: "+search);
            out.println("<br>");
            out.println("Result: "+result);
        }else {
            out.println("Not Found");
        }
        out.println("</html>");
    }
}
