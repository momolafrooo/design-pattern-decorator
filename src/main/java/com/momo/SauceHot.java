package com.momo;

import java.math.BigDecimal;

public class SauceHot extends Decorator {

    public SauceHot(PizzaComponent pizza) {
        pizzaComponent = pizza;
        setName("Sauce Hot");
        setPrice(new BigDecimal(2000));
    }

    @Override
    public String toString() {
        return "SauceHot{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
