package com.company.Decorator;

import com.company.Factory.Burger;

public class Tomato extends BurgerDecorator{
    private Burger burger;

    public Tomato(Burger burger) {
        this.burger=burger;
    }

    @Override
    public double cost() {
        return burger.cost()+2;
    }

    @Override
    public String getDesc() {
        return burger.getDesc()+", Tomato";
    }
}
