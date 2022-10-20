package com.sjw.web;

import com.alibaba.fastjson.JSON;
import com.sjw.pojo.Brand;
import com.sjw.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddBrandServlet")
public class AddBrandServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s = request.getReader().readLine();
        System.out.println(s);
        Brand brand = JSON.parseObject(s, Brand.class);
        System.out.println(brand);
        response.getWriter().write(""+new BrandService().insertBrand(brand));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
