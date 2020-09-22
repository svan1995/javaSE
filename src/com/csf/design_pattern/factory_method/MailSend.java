package com.csf.design_pattern.factory_method;

public class MailSend implements Send {
    @Override
    public void send() {
        System.out.println("mail");
    }
}
