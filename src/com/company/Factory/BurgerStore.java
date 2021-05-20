package com.company.Factory;

public class BurgerStore {

    public BurgerFactory burgerFactory;
    public Burger burger;
    public BurgerStore(BurgerFactory burgerFactory) {
        this.burgerFactory = burgerFactory;
    }
    public Burger orderBurger(int type){
        burger=burgerFactory.createBurger(type);
        burger.Prepare();
        burger.Boxing();
        return burger;
    }

    public void addExtraIng(int type, Burger burger){
        burger = burgerFactory.addExtraIng(type,burger);
        System.out.println("Cost:"+burger.cost()+" $$, Product and Extra Ingredient: "+burger.getDesc());
    }


}
