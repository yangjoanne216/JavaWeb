package com.atguigu.servlet2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get document
        String username = request.getParameter("username");
        System.out.println("in caisse1 cheque document"+username);
        //signer le document
        request.setAttribute("key1","signature de caisse1");
        //demander ou le servlette 2
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/form.html");
        //aller à servlet 2
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}