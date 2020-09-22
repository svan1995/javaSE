package com.csf.protected_test;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Test test = new Test();
        People people = new People();
        try {
            people.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
