package com.sjw.annotation;

@Pro(className = "com.sjw.domain.Person",methodName = "eat")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Pro annotation = ReflectTest.class.getAnnotation(Pro.class);
        String className = annotation.className();
        String methodName = annotation.methodName();
        Object p = Class.forName(className).getConstructor().newInstance();
        Class.forName(className).getMethod(methodName).invoke(p);

    }
}
