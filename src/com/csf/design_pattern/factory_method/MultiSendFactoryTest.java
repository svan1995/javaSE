package com.csf.design_pattern.factory_method;

public class MultiSendFactoryTest {
    public static void main(String[] args) {
        MultiSendFactory multiSendFactory = new MultiSendFactory();
        Send mail = multiSendFactory.produceMailSend();
        Send phone = multiSendFactory.producePhoneSend();
        mail.send();
        phone.send();
    }
}
