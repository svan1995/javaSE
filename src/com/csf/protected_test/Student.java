package com.csf.protected_test;

public class Student extends People {
    public void test(){
        hello();
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.hello();
        student.sayhi();

    }



}
