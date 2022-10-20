package com.sjw.mapper;

import com.sjw.pojo.Brand;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandMapper {
    @Select("select * from tb_brand")
    List<Brand> selectAll();
    void add(Brand brand);
    @Select("select * from tb_brand where id=#{id}")
    Brand selectById(String id);

    void update(Brand brand);
    @Delete("delete from tb_brand where id=#{id}")
    void deleteById(String id);
    @Insert("insert into tb_brand values(null,#{brand_name},#{company_name},#{ordered},#{description},#{status})")
    int insertBrand(Brand brand);
}
