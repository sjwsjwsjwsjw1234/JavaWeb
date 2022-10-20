package com.sjw.mapper;

import com.sjw.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User selectByUsername(@Param("username") String username);
    int insertUser(@Param("username") String username,@Param("password") String password);

}
