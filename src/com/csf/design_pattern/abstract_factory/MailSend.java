package com.csf.design_pattern.abstract_factory;



public class MailSend implements Send {
    @Override
    public void send() {
        System.out.println("mail");
    }
}
