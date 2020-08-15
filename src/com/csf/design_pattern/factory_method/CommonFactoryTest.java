package com.csf.design_pattern.factory_method;

public class CommonFactoryTest {
    public static void main(String[] args) {
        CommonSendFactory commonSendFactory = new CommonSendFactory();
        Send mail = commonSendFactory.produce("mail");
        mail.send();
    }
}
