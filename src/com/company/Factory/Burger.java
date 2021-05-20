package com.company.Factory;

public abstract class  Burger {
    public String name;
    public String desc="";
    public double cal;


    public abstract double cost();
    public String getDesc() {
        return desc;
    }

    public void Prepare(){
        System.out.println("Preparing" +getDesc());


    }
    public void Boxing(){
        System.out.println("Boxing"+getDesc());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getCal() {
        return cal;
    }

    public void setCal(double cal) {
        this.cal = cal;
    }

    public void Refund(){
        System.out.println("Refund request received.");
    }
    public void Fine(){
        System.out.println("Thank you for choosing us.");
    }
}
