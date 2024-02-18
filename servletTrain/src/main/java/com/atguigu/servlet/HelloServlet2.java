package com.atguigu.servlet;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       System.out.println("HelloServlet中的get方法");
       ServletConfig servletConfig = getServletConfig();
        System.out.println(servletConfig.getServletName());
        System.out.println(servletConfig.getInitParameter("username"));
        System.out.println(servletConfig.getServletContext());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServelt2的post方法");
    }
}
