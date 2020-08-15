package com.csf.design_pattern.factory_method;

public class CommonSendFactory {
    public Send produce(String type){
        if (type.equals("phone")){
            return new PhoneSend();
        }else if (type.equals("mail")){
            return new MailSend();
        }
        return null;
    }
}
