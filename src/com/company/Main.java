package com.company;

import com.company.Adapter.CostAdapter;
import com.company.Adapter.CostAdapterImpl;
import com.company.Command.FineProduct;
import com.company.Command.RefundProduct;
import com.company.Command.ShopButton;
import com.company.Facade.MeatCooker;
import com.company.Factory.Burger;
import com.company.Factory.BurgerFactory;
import com.company.Factory.BurgerStore;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner scan=new Scanner(System.in);


        System.out.println("Welcome to the Burger Shop\n*******\n");

        System.out.println("MENU\n1.Vegan Burger\n2.Cheese Burger\n3.Steak Burger\n");
        System.out.println("Enter your Order:");

        int orderCode=scan.nextInt();


        System.out.println("Extra Ingredients\n");
        System.out.println("1.Tomato\n2.Lettuce\n");

        int ExtraIng=scan.nextInt();




        MeatCooker meatCooker= new MeatCooker();
        BurgerFactory burgerFactory = new BurgerFactory();
        BurgerStore burgerStore=new BurgerStore(burgerFactory);

        if(orderCode==3){

            System.out.println("How would you like your meat to be cooked?");
            System.out.println("1.Rare\n2.Medium\n3.WellDone\n");
            int CookLevel= scan.nextInt();
            switch (CookLevel){
                case 1: meatCooker.cookRare();
                break;
                case 2:meatCooker.cookMedium();
                break;
                case 3:meatCooker.cookWellDone();
                break;
            }
        }




        Burger burger = burgerStore.orderBurger(orderCode);
        burgerStore.addExtraIng(ExtraIng,burger);

        CostAdapter costAdapter= new CostAdapterImpl(burger); // adaptee to burger object
        System.out.println("Your product cost is :"+costAdapter.getCost()+" TL");

        System.out.println("Is there any problem(1:Refund the Product,2:No Problem)");
        int QA= scan.nextInt();
        switch (QA){
            case 1:
                RefundProduct refundProduct = new RefundProduct(burger);
                ShopButton refundButton=new ShopButton(refundProduct);
                refundButton.buttonWasPressed();
                break;
            case 2:
                FineProduct fineProduct=new FineProduct(burger);
                ShopButton fineButton=new ShopButton(fineProduct);
                fineButton.buttonWasPressed();
                break;
        }

    }
}
