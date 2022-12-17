package com.momo;

import java.math.BigDecimal;

public class SauceTomate extends Decorator {

    public SauceTomate(PizzaComponent pizza) {
        pizzaComponent = pizza;
        setName("Sauce Tomate");
        setPrice(new BigDecimal(1000));
    }

    @Override
    public String toString() {
        return "SauceTomate{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
