package com.atguigu.servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get document
        String username = request.getParameter("username");
        System.out.println("in caisse2 cheque document"+username);
        //vérifier la signature de caisse1
        Object key1 = request.getAttribute("key1");
        System.out.println("est ce qu''il ya siganture de caisse 1 :" + key1);

        //faire son travail
        System.out.println("servlet 32faire son travail");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}