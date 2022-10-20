package com.sjw.test;

import com.sjw.junit.Calculator;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    @BeforeEach
    public void init(){
        System.out.println("开始");
    }
    @Test
    void testAdd()
    {
        int r= Calculator.add(2,5);
        Assertions.assertEquals(7,r);
    }

    @AfterEach
    void close()
    {
        System.out.println("关闭");
    }
}
