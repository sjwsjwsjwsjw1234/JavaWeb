package com.sjw.reflect;

import com.sjw.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // 获取Field
        //getFields()方法，返回public修饰的实例字段,返回一个数组
        Class cls=Person.class;
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        //getField(Field Name),返回特定字段
        Field a = cls.getField("a");
        System.out.println(a);
        //Filed对象的get方法和set方法
        Person p = new Person();
        System.out.println(a.get(p));
        a.set(p,100);
        System.out.println(a.get(p));

        //getDeclaredFields方法，返回所有对象，包括私有
        Field[] fields1 = cls.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field);
        }
        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);  //设置忽略访问权限异常，这样就可以获取private变量的值。称为暴力反射
        System.out.println(name.get(p));


    }
}
