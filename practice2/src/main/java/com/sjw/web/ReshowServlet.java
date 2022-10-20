package com.sjw.web;

import com.sjw.pojo.Brand;
import com.sjw.service.BrandService;
import com.sjw.utils.ChineseUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/ReshowServlet")
public class ReshowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BrandService brandService = new BrandService();
        Brand brand = brandService.selectById(ChineseUtils.transfer(request, "id"));
        request.setAttribute("brand",brand);
        request.getRequestDispatcher("/update.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
