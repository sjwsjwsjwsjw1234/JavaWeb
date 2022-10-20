package com.sjw.service.impl;

import com.sjw.mapper.BrandMapper;
import com.sjw.pojo.Brand;
import com.sjw.pojo.PageBean;
import com.sjw.service.BrandService;
import com.sjw.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class BrandServiceImpl implements BrandService {
    private final SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
    @Override
    public List<Brand> selectAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectAll();
        sqlSession.close();
        return brands;
    }

    @Override
    public void insertBrand(Brand brand) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.insertBrand(brand);
        sqlSession.close();
    }

    @Override
    public void deleteByIds(int[] ids) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.deleteByIds(ids);
        sqlSession.close();
    }

    @Override
    public int selectTotalCount() {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        int k=mapper.selectTotalCount();
        sqlSession.close();
        return k;
    }

    @Override
    public PageBean<Brand> selectByPage(int begin, int length) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands=mapper.selectByPage(begin,length);
        PageBean<Brand> brandPageBean = new PageBean<>();
        brandPageBean.setLength(selectTotalCount());
        brandPageBean.setRow(brands);
        sqlSession.close();
        return brandPageBean;
    }

    @Override
    public int selectTotalCountByCondition(Brand brand) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        int k=mapper.selectTotalCountByCondition(brand);
        sqlSession.close();
        return k;
    }

    @Override
    public PageBean<Brand> selectByCondition(int begin, int length, Brand brand) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        if (brand.getBrand_name()!=null && !"".equals(brand.getBrand_name())){
            brand.setBrand_name("%"+brand.getBrand_name()+"%");
        }
        if (brand.getCompany_name()!=null && !"".equals(brand.getCompany_name())){
            brand.setCompany_name("%"+brand.getCompany_name()+"%");
        }
        List<Brand> brands=mapper.selectByCondition(begin,length,brand);
        PageBean<Brand> brandPageBean = new PageBean<>();
        brandPageBean.setLength(selectTotalCountByCondition(brand));
        brandPageBean.setRow(brands);
        sqlSession.close();
        return brandPageBean;
    }
}
