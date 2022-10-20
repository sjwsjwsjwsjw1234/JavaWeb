package com.sjw.servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet("/demo8")
public class Demo8 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
//        //response.setStatus(302);
//        //response.setHeader("location","https://www.baidu.com");
//        System.out.println("11");
//        response.sendRedirect("/demo9");

        ServletOutputStream outputStream = response.getOutputStream();
        InputStream pc = Demo8.class.getClassLoader().getResourceAsStream("01.jpg");
//        outputStream.write(pc.readAllBytes());
        IOUtils.copy(pc, outputStream);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
