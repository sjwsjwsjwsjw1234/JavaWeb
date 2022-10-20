package com.sjw.annotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class CalculatorTest {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        Class<? extends Calculator> cls = calculator.getClass();
        Method[] methods = cls.getMethods();
        int cnt=0;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    cnt++;
                    bufferedWriter.write(method.getClass().getSimpleName()+"方法出现"+e.getCause().getClass().getSimpleName()+"异常");
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常原因"+e.getCause().getMessage());
                    bufferedWriter.newLine();
                    bufferedWriter.write("----------------------------------------");
                    bufferedWriter.newLine();

                }
            }
        }
        bufferedWriter.write("共出现"+cnt+"次异常");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
    
}
