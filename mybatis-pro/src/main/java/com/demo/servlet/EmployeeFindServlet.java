package com.demo.servlet;

import com.demo.dao.EmployeeDAO;
import com.demo.entity.Employee;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/index")
public class EmployeeFindServlet extends HttpServlet {
    private EmployeeDAO employeeDAO=new EmployeeDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> list=employeeDAO.findAll();
        System.out.println(list);
        req.setAttribute("employeeList",list);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
