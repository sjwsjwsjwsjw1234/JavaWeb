package com.sjw.annotation;


import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented()
@Inherited
public @interface Anno3 {

}
