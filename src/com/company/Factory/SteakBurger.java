package com.company.Factory;

public class SteakBurger extends Burger {
    public SteakBurger() {
        setName(" This is a Steak Burger");
        setDesc(" Steak Burger");
        setCal(310.0);
    }

    @Override
    public double cost() {
        return 56.6;
    }
}
