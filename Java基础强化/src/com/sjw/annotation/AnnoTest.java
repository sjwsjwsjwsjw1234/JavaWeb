package com.sjw.annotation;

@Anno2(id = 2,a={@Anno1(age = 18,name="sjw"),@Anno1(age = 22,name="lll")})
@Anno3
public class AnnoTest {
    @Anno3
    private int a;

}
