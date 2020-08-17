package com.csf.design_pattern.builder_pattern;

public class Test {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal nonVerMeal = mealBuilder.prepareNonVerMeal();
        nonVerMeal.showItems();
    }
}
