package com.csf.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@MyAnnotation2(name = "csf", schools = {"ZJU"})
@MyAnnotation3("fff")
public class Demo2 {
}

@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    String name() default "";
    int age() default 0;
    String[] schools();
}

@interface MyAnnotation3{
    String value();
}