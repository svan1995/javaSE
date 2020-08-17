package com.csf.design_pattern.builder_pattern;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 18.0f;
    }
}
