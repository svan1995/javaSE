package com.csf.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@DBTable(name = "MEMBER")
public class Member {

    @SQLString(name = "ID", value = 50, constraint = @Constraints(primaryKey = true))
    private String id;

    @SQLString(name = "NAME", value = 30)
    private String name;

    @SQLInteger(name = "AGE")
    private int age;

    @SQLString(name = "DESCRIPTION" ,value = 150 , constraint = @Constraints(allowNull = true))
    private String description;//个人描述

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface DBTable{
    String name() default "";

}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface SQLInteger{
    String name() default "";
    Constraints constraint() default @Constraints;
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface SQLString{
    String name() default "";
    int value() default 0;
    Constraints constraint() default @Constraints;

}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Constraints{
    boolean primaryKey() default false;
    boolean allowNull() default false;
    boolean unique() default false;
}