package com.csf.design_pattern.builder_pattern;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 20.0f;
    }
}
