package com.sjw.test;

import com.sjw.mapper.BrandMapper;
import com.sjw.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {

    @Test
    public void testSelectAll(){
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = build.openSession();
        BrandMapper brand = sqlSession.getMapper(BrandMapper.class);
        System.out.println(brand.selectAll());

    }

    @Test
    public void testSelectById(){
        int id=1;
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = build.openSession();
        BrandMapper brand = sqlSession.getMapper(BrandMapper.class);
        System.out.println(brand.selectByid(1));
    }

    @Test
    public void testSelectByCondition(){
        int status=0;
        String name="%松鼠%";
        String brand_name="%只%";
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = build.openSession();
        BrandMapper brand = sqlSession.getMapper(BrandMapper.class);
        System.out.println(brand.selectByCondition(status,name,brand_name));
    }
    @Test
    public void testSelectBySingle(){
        String status=null;
        String name="";
        String brand_name="";
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = build.openSession();
        BrandMapper brand = sqlSession.getMapper(BrandMapper.class);
        Brand temp = new Brand();
        temp.setSTATUS(status);
        temp.setBrand_name(brand_name);
        temp.setCompany_name(name);
        System.out.println(brand.selectBySingle(temp));
    }

    public static void main(String[] args) {

    }
}
