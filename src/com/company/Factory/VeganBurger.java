package com.company.Factory;

public class VeganBurger extends Burger{

    public VeganBurger() {
       setName(" This is a Vegan Burger");
       setDesc(" Vegan Burger");
       setCal(110.6);
    }

    @Override
    public double cost() {
        return 15.7;
    }
}
