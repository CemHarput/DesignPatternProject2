package com.company.Decorator;

import com.company.Factory.Burger;

public class Lettuce extends BurgerDecorator {

    private Burger burger;
    public Lettuce(Burger burger) {
        this.burger=burger;
    }

    @Override
    public double cost() {
        return burger.cost()+1;
    }

    @Override
    public String getDesc() {
        return burger.getDesc()+", Lettuce";
    }
}
