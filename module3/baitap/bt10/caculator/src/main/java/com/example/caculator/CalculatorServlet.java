package com.example.caculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "calculatorServlet",urlPatterns = "/result")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float firstNumber= Float.parseFloat(req.getParameter("firstNumber"));
        float secondNumber= Float.parseFloat(req.getParameter("secondNumber"));
        String operator= req.getParameter("operator");

        Calculator calculator = new Calculator();
        String errorMes=null;
        float result=0;
        try {
            result = calculator.calculate(firstNumber, secondNumber, operator);
        } catch (ArithmeticException e) {
            errorMes = e.getMessage();
        } catch (IllegalArgumentException e) {
            errorMes = "Invalid operator.";
        }
        req.setAttribute("firstNumber", firstNumber);
        req.setAttribute("secondNumber", secondNumber);
        req.setAttribute("operator", operator);
        req.setAttribute("result", result);
        req.setAttribute("error", errorMes);
        req.getRequestDispatcher("/WEB-INF/result.jsp").forward(req, resp);
    }
}
