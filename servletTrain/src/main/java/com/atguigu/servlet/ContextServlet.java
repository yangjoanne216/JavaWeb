package com.atguigu.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext= getServletConfig().getServletContext();
        //System.out.println(servletContext.getAttributeNames());
        //System.out.println(servletContext.getInitParameter("password"));
        //System.out.println(servletContext.getContextPath());
        System.out.println(servletContext.getRealPath("/"));
        System.out.println(servletContext.getRealPath("/css"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}