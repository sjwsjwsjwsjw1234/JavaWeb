package com.sjw.reflect;

import com.sjw.domain.Person;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. forName

        Class cls1=Class.forName("com.sjw.domain.Person");

        //2. 类名.class

        Class cls2=Person.class;

        //3. 对象.getClass
        Person p = new Person();
        Class cls3=p.getClass();

        System.out.println(cls1 == cls2);
        System.out.println(cls2 == cls3);
        System.out.println(cls1 == cls3);
    }
}
