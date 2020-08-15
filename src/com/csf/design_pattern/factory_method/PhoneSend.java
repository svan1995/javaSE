package com.csf.design_pattern.factory_method;

public class PhoneSend implements Send {
    @Override
    public void send() {
        System.out.println("phone");
    }
}
