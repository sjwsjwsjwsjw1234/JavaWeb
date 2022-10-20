package com.sjw.annotation;

public @interface Anno2 {
    int id() default -1;
    Anno1[] a();
}
