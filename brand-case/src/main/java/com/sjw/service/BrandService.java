package com.sjw.service;

import com.sjw.pojo.Brand;
import com.sjw.pojo.PageBean;

import java.util.List;

public interface BrandService {
    List<Brand> selectAll();
    void insertBrand(Brand brand);
    void deleteByIds(int ids[]);
    int selectTotalCount();
    PageBean<Brand> selectByPage(int begin,int length);
    int selectTotalCountByCondition(Brand brand);
    PageBean<Brand> selectByCondition(int begin,int length,Brand brand);
}
