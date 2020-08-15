package com.csf.design_pattern.abstract_factory;

public class MailSendFactory implements SendFactory {
    @Override
    public Send produce() {
        return new MailSend();
    }
}
