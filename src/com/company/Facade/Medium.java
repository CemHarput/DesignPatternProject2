package com.company.Facade;

public class Medium implements Doneness{
    @Override
    public void Cook() {
        System.out.println("Your hamburger's meat will be rare cooked.");
    }
}
