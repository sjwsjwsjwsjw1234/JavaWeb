package com.sjw.json;

import com.alibaba.fastjson.JSON;
import com.sjw.pojo.User;

public class JsonTest {
    public static void main(String[] args) {
        User user=new User();
        user.setId(1);
        user.setUsername("sjw");
        user.setPassword("123");
        String s = JSON.toJSONString(user);
        System.out.println(s);
        System.out.println(JSON.parseObject(s, User.class));
    }
}
