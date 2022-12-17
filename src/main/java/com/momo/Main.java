package com.momo;

public class Main {
    public static void main(String[] args) {
        PizzaComponent pizzaQueen = new PizzaQueen();
        System.out.println(pizzaQueen.getName() + ": " + pizzaQueen.getPrice() + " XOF");

        PizzaComponent pizzaQueenSauceHot = new SauceHot(new PizzaQueen());
        System.out.println(pizzaQueenSauceHot.getName() + ": " + pizzaQueenSauceHot.getPrice() + " XOF");

        PizzaComponent pizzaQueenSauceTomate = new SauceTomate(new PizzaQueen());
        System.out.println(pizzaQueenSauceTomate.getName() + ": " + pizzaQueenSauceTomate.getPrice() + " XOF");
    }
}