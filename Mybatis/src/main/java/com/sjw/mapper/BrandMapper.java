package com.sjw.mapper;

import com.sjw.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandMapper {
    List<Brand> selectAll();
    Brand selectByid(int id);
    Brand selectByCondition(@Param("status")int status,@Param("company_name")String name,@Param("brand_name")String brand);
    List<Brand> selectBySingle(Brand brand);
}
