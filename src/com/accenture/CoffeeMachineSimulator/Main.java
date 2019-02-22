package com.accenture.CoffeeMachineSimulator;

import java.util.List;
import java.util.Scanner;

//    Print out what I can order
//    Cappuccino
//    Black coffee
//    Late, etc
//
//    also show prices of each
//    let me enter number or name of coffee type
//    also let me put money, how much I want to stick in
//    for example coffee costs 0,50 and I have only  1 euro,
//    so in the end coffee machine will bring me out coffee + 0,50
public class Main {

    public static void main(String[] args) {

        DrinkOrder order = new DrinkOrder();
        System.out.println("Choose coffee type:");
        printOutDrinkList(order.drinkTypes);
        orderCoffee(order);
    }

    private static void orderCoffee(DrinkOrder order) {

        Scanner read = new Scanner(System.in);
        String coffeeType = read.next();

        System.out.println("Enter the amount of money");
        double money = read.nextDouble();

        System.out.println("You ordered " + coffeeType + " and paid " + money);
        DrinkOrder newOrder = null;
        boolean doWeHaveACoffee = false;
        for (DrinkType drinkType : order.drinkTypes) {
            if(coffeeType.equals(drinkType.getName())) {
                newOrder = new DrinkOrder(drinkType, drinkType.getName(), drinkType.getPrice(), 1);
                doWeHaveACoffee = true;
            }
        }
        if(doWeHaveACoffee == false) {
            System.out.println("Sorry, no coffee for you.");
            System.out.println("Choose coffee type:");
            orderCoffee(order);
        } else {
            order.validateOrder(newOrder);
            order.make(newOrder);
            System.out.println("Choose coffee type:");
            orderCoffee(order);
        }

    }

    private static void printOutDrinkList(List<DrinkType> drinkTypes) {
        for (DrinkType drinkType : drinkTypes) {
            System.out.print(drinkType.getName());
            System.out.println("....." + drinkType.getPrice());
        }

    }
}