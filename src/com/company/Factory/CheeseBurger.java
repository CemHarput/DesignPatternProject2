package com.company.Factory;

public class CheeseBurger extends Burger {


    public CheeseBurger(){
        setName(" This is a Cheese Burger");
        setDesc(" Cheese Burger");
        setCal(300.5);
    }

    @Override
    public double cost() {
        return 25.5;
    }
}
