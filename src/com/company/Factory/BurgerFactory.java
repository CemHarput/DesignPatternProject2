package com.company.Factory;

import com.company.Decorator.Lettuce;
import com.company.Decorator.Tomato;

public class BurgerFactory {

    public Burger createBurger(int type){
        Burger burger = null;
        if (type == 1) {
            burger = new VeganBurger();
        } else if (type == 2) {
            burger = new CheeseBurger();
        } else if (type == 3) {
            burger = new SteakBurger();
        }
        return burger;


    }
    public Burger addExtraIng(int type,Burger burger){
        if (type == 1) {
            burger = new Tomato(burger);

            return burger;


        } else if (type == 2) {
            burger = new Lettuce(burger);

            return burger;
        }
        return burger;
    }
}
