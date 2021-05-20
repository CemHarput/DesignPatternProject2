package com.company.Command;

import com.company.Factory.Burger;

public class FineProduct implements Command{
    Burger burger;

    public FineProduct(Burger burger) {
        this.burger = burger;
    }

    @Override
    public void execute() {
         burger.Fine();
    }
}
