package com.accenture.CoffeeMachineSimulator;

import java.util.List;

public interface Drink {
    public String message();
    public double Price();
    public List<String> getIngredients();
}
