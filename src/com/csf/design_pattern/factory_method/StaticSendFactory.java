package com.csf.design_pattern.factory_method;

public class StaticSendFactory {
    public static Send produceMailSend(){
        return new MailSend();
    }
    public static Send producePhoneSend(){
        return new PhoneSend();
    }
}
