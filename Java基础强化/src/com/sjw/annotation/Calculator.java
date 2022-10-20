package com.sjw.annotation;

import com.sjw.domain.Person;

public class Calculator {
    @Check
    public void add(){
        System.out.println((3 / 0));
    }
    @Check
    public void sub(){
        Person a=null;
        System.out.println(a.toString());
    }
    @Check
    public void mul(){

    }
}
