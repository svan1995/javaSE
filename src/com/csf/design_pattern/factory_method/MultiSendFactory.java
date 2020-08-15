package com.csf.design_pattern.factory_method;

public class MultiSendFactory {
    public Send produceMailSend(){
        return new MailSend();
    }
    public Send producePhoneSend(){
        return new PhoneSend();
    }
}
