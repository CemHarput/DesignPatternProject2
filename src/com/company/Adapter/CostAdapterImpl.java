package com.company.Adapter;

import com.company.Factory.Burger;

public class CostAdapterImpl implements CostAdapter {
    //adapter
   Burger burger;

    public CostAdapterImpl(Burger burger) {
        this.burger=burger;
    }

    @Override
    public double getCost() {
        return convertDollarToTL(burger.cost());//convert  Dollar to TL.
    }
    private double convertDollarToTL(double cost){
        return cost*8;
    }
}
