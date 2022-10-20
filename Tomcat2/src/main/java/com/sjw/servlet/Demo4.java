package com.sjw.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/demo4")
public class Demo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> parameterMap = req.getParameterMap();
        parameterMap.forEach((k,v)->{
            System.out.print(k +":");
            for (String s : v) {
                System.out.print(s+" ");
            }
            System.out.println("");
        });
        System.out.println("----------------");
        for (String name : req.getParameterValues("username")) {
            System.out.println(name);
        }
        System.out.println("----------------");
        System.out.println(req.getParameter("password"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
