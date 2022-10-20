package com.sjw.reflect;

import java.io.InputStream;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {

        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream pro = classLoader.getResourceAsStream("pro.properties");
        Properties properties = new Properties();
        properties.load(pro);
        String className = properties.getProperty("className");
        String method = properties.getProperty("method");
        Class<?> cls = Class.forName(className);
        Object o = cls.getConstructor().newInstance();
        cls.getMethod(method).invoke(o);
    }
}
