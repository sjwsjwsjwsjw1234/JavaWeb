package com.sjw.web.servlet;

import com.alibaba.fastjson.JSON;
import com.sjw.pojo.Brand;
import com.sjw.pojo.PageBean;
import com.sjw.service.BrandService;
import com.sjw.service.impl.BrandServiceImpl;
import com.sjw.utils.ChineseUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/brand/*")
public class BrandServlet extends BaseServlet {
    BrandService brandService=new BrandServiceImpl();
    public void insertBrand(HttpServletRequest request, HttpServletResponse response) throws IOException {
        brandService.insertBrand(JSON.parseObject(request.getReader().readLine(),Brand.class));
        response.getWriter().write("success");
    }
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Brand> brands = brandService.selectAll();
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(JSON.toJSONString(brands));
    }
    public void deleteByIds(HttpServletRequest request, HttpServletResponse response) throws IOException {
        brandService.deleteByIds(JSON.parseObject(request.getReader().readLine(),int[].class));
        response.getWriter().write("success");
    }
    public void selectByPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String page = ChineseUtils.transfer(request,"page");
        String size = ChineseUtils.transfer(request, "size");
//        System.out.println(page);
//        System.out.println(size);
        PageBean<Brand> brandPageBean = brandService.selectByPage((Integer.parseInt(page) - 1) * Integer.parseInt(size), Integer.parseInt(size));
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(JSON.toJSONString(brandPageBean));
    }
    public void selectByCondition(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String page = ChineseUtils.transfer(request,"page");
        String size = ChineseUtils.transfer(request, "size");
//        System.out.println(page);
//        System.out.println(size);
        Brand brand = JSON.parseObject(request.getReader().readLine(), Brand.class);
        PageBean<Brand> brandPageBean = brandService.selectByCondition((Integer.parseInt(page) - 1) * Integer.parseInt(size), Integer.parseInt(size),brand);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(JSON.toJSONString(brandPageBean));
    }
}
