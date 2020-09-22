package com.csf.design_pattern.abstract_factory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        Send mail = new MailSendFactory().produce();
        Send phone = new PhoneSendFactory().produce();
        mail.send();
        phone.send();
    }
}
