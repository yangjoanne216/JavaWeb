package com.atguigu.servlet2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


public class RequestAPIServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                System.out.println("URI =>" + request.getRequestURI());
                System.out.println("URL =>" + request.getRequestURL());
                System.out.println("ip adrees"+request.getRemoteHost());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}