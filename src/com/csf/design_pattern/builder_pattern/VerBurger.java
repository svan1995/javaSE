package com.csf.design_pattern.builder_pattern;

public class VerBurger extends Burger {
    @Override
    public String name() {
        return "Ver Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
