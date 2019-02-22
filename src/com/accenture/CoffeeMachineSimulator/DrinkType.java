package com.accenture.CoffeeMachineSimulator;

import java.util.List;

public class DrinkType implements Drink{
    private String name = "";
    private double price = 0.00;
    private List<String> recipe;

    public DrinkType(String name, double price, List<String> recipe) {
        this.name = name;
        this.price = price;
        this.recipe = recipe;
    }

    @Override
    public String message() {
        return null;
    }

    @Override
    public double Price() {
        return 0;
    }

    @Override
    public List<String> getIngredients() {
        return null;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getRecipe() {
        return recipe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRecipe(List<String> recipe) {
        this.recipe = recipe;
    }
}
