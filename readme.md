# Design Pattern Decorator

This is an implementation of the design pattern Decorator.

## PizzaComponent

PizzaComponent : defines the abstract class of the base component that is our raw material for the Pizza.

```java
public abstract class PizzaComponent {
    protected String name;
    protected BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

```

## PizzaQueen

PizzaQueen : inherit from PizzaComponent and is concrete component, i.e. our different Pizza offered for sale.

```java
public class PizzaQueen extends PizzaComponent {

    public PizzaQueen() {
        setName("Pizza Queen");
        setPrice(new BigDecimal(3500));
    }
}

```

## PizzaSaison

PizzaSaison : inherit from PizzaComponent and is concrete component, i.e. our different Pizza offered for sale.

```java
public class PizzaSaison extends PizzaComponent {

    public PizzaSaison() {
        setName("Pizza Saison");
        setPrice(new BigDecimal(4500));
    }
}

```

## PizzaTeranga

PizzaTeranga : inherit from PizzaComponent and is concrete component, i.e. our different Pizza offered for sale.

```java
public class PizzaTeranga extends PizzaComponent {

    public PizzaTeranga() {
        setName("Pizza Teranga");
        setPrice(new BigDecimal(5500));
    }
}

```

## Decorator

Decorator is an abstract class that inherits from PizzaComponent, it allows us to decorate the basic component, which is similar to adding an extra to our Pizza.

```java
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

```

## SauceTomate

SauceTomate inherit from Decorator, it allow us to enhance our base element without modifying our base class. In this case, the supplement here will be a sauce with an additional cost added to the price of the chosen Pizza.

```java
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

```

## SauceHot

SauceHot inherit from Decorator, it allow us to enhance our base element without modifying our base class. In this case, the supplement here will be a sauce with an additional cost added to the price of the chosen Pizza.

```java
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

```

## Main

Main : this class is used for testing purpose.

```java
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

```
