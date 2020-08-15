package com.csf.design_pattern.abstract_factory;

public class PhoneSend implements Send {
    @Override
    public void send() {
        System.out.println("phone");
    }
}
