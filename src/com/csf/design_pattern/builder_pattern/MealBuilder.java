package com.csf.design_pattern.builder_pattern;

public class MealBuilder {
    public Meal prepareVerMeal(){
        Meal meal = new Meal();
        meal.addItem(new VerBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVerMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
