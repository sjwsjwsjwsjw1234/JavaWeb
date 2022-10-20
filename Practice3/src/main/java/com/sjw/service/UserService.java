package com.sjw.service;

import com.sjw.mapper.UserMapper;
import com.sjw.pojo.User;
import com.sjw.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserService {
    public User selectByUsernameAndPassword(String username,String password){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        var user=mapper.selectByUsernameAndPassword(username,password);
        sqlSession.close();
        return user;
    }
    public void insert(String username,String password){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insert(username,password);
        sqlSession.close();
    }
    public User SelectByUsername(String username){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        var user=mapper.selectByUsername(username);
        sqlSession.close();
        System.out.println(username);
        System.out.println(user);
        return user;
    }
}
