package com.momo;

import java.math.BigDecimal;

public abstract class Decorator extends PizzaComponent {
    protected PizzaComponent pizzaComponent;

    @Override
    public String getName() {
        return pizzaComponent.getName() + " " + super.getName();
    }

    @Override
    public BigDecimal getPrice() {
        return pizzaComponent.getPrice().add(super.getPrice());
    }
}
