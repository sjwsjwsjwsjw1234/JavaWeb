package com.sjw.reflect;

import com.sjw.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> cls = Person.class;
        //1. getConstructor方法获取构造器,newInstance调用构造器

        Constructor<Person> constructor = cls.getConstructor(String.class, int.class, int.class);
        Person sjw = constructor.newInstance("sjw", 23, 23);
        System.out.println(sjw);

        //2. getConstructors方法获取多个构造器
        Constructor<?>[] constructors = cls.getConstructors();
        for (Constructor<?> constructor1 : constructors) {
            System.out.println(constructor1);
        }

        //3. getMethod方法获取方法,invoke方法调用函数
        Method eat = cls.getMethod("eat", String.class);
        Person p = new Person();
        eat.invoke(p,"eggs");

        
    }
}
