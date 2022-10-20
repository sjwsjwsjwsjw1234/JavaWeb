package com.sjw.web;

import com.sjw.pojo.Brand;
import com.sjw.service.BrandService;
import com.sjw.utils.ChineseUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    private BrandService brandService;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        brandService = new BrandService();
        Brand brand = new Brand();
        brand.setBrand_name(ChineseUtils.transfer(request,"brand_name"));
        brand.setStatus(ChineseUtils.transfer(request,"status"));
        brand.setCompany_name(ChineseUtils.transfer(request,"company_name"));
        brand.setDescription(ChineseUtils.transfer(request,"description"));
        brand.setOrdered(ChineseUtils.transfer(request,"ordered"));
       // System.out.println(brand);
        brandService.add(brand);
        List<Brand> brands = brandService.selectAll();
        request.setAttribute("brands",brands);
        request.getRequestDispatcher("brand.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
