package com.sjw.mapper;

import com.sjw.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandMapper {
    @Select("select * from tb_brand")
    List<Brand> selectAll();

    @Select("select * from tb_brand where id=#{id}")
    Brand selectById(String id);

    @Insert("insert into tb_brand values(null,#{brand_name},#{company_name},#{ordered},#{description},#{status})")
    int insertBrand(Brand brand);

    void deleteByIds(@Param("ids") int ids[]);

    @Select("select count(*) from tb_brand")
    int selectTotalCount();

    @Select("select * from tb_brand limit #{begin},#{length}")
    List<Brand> selectByPage(@Param("begin") int begin,@Param("length")int length);

    int selectTotalCountByCondition(Brand brand);

    List<Brand> selectByCondition(@Param("begin") int begin,@Param("length")int length,@Param("brand") Brand brand);
}
