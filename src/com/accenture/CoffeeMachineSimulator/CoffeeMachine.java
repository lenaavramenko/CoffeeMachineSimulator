package com.accenture.CoffeeMachineSimulator;

public interface CoffeeMachine {
    public Drink make(DrinkOrder drinkOrder);
    public boolean validateOrder(String validate);

    boolean validateOrder(DrinkOrder order);

    public String inStock(String ingredients);
    public boolean isBusy() throws InterruptedException;
}
