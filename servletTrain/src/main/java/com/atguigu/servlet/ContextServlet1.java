package com.atguigu.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ContextServlet1", value = "/ContextServlet1")
public class ContextServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取servlet context对象
        ServletContext context = getServletContext();
        System.out.println("avant enregistrement : "+context.getAttribute("key1"));
        context.setAttribute("key1","value1");
        System.out.println("après enregistrement : "+context.getAttribute("key1"));


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}