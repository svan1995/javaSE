package com.csf.design_pattern.abstract_factory;

public class PhoneSendFactory implements SendFactory {
    @Override
    public Send produce() {
        return new PhoneSend();
    }
}
