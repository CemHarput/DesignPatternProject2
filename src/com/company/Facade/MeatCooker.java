package com.company.Facade;

public class MeatCooker {
    private Doneness Rare;
    private Doneness Medium;
    private Doneness WellDone;

    public MeatCooker() {
        Rare = new Rare();
        Medium = new Medium();
        WellDone = new WellDone();
    }
    public void cookRare(){
        Rare.Cook();
    }
    public void cookMedium(){
        Medium.Cook();
    }
    public void cookWellDone(){
        WellDone.Cook();
    }
}
