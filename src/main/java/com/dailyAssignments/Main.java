package com.dailyAssignments;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IceCream iceCreamStrawberryBanana = new IceCream("Strawberry Banana", 3.99d);
        IceCream iceCreamStrawberryMango = new IceCream("Strawberry Mango", 5.99d);
        IceCream iceCreamStrawberryVanilla = new IceCream("Strawberry Vanilla", 4.99d);
        IceCream iceCreamOrangeLemon = new IceCream("Orange Lemon", 6.99d);

        ArrayList<IceCream> flavors = new ArrayList<>(2);
        flavors.add(iceCreamStrawberryBanana);
        flavors.add(iceCreamStrawberryMango);

        Customer customerSomedude = new Customer(iceCreamStrawberryBanana, "Somedude");
        Customer customerSomedude2 = new Customer(iceCreamStrawberryMango, "Somedude 2");
        Customer customerSomedude3 = new Customer(iceCreamStrawberryVanilla, "Somedude 3");
        Customer customerSomedude4 = new Customer(iceCreamOrangeLemon, "Somedude 4");

        IceCreamShop iceCreamShop = new IceCreamShop("Shop", flavors);
        iceCreamShop.addCustomer(customerSomedude);
        iceCreamShop.addCustomer(customerSomedude2);
        iceCreamShop.addCustomer(customerSomedude3);
        iceCreamShop.addCustomer(customerSomedude4);

        iceCreamShop.addFlavor(iceCreamStrawberryVanilla);
        iceCreamShop.addFlavor(iceCreamOrangeLemon);

        iceCreamShop.serviceCustomer();
        System.out.println(iceCreamShop.getAmountEarned());
        iceCreamShop.serviceCustomer();
        System.out.println(iceCreamShop.getAmountEarned());
        iceCreamShop.serviceCustomer();
        System.out.println(iceCreamShop.getAmountEarned());
        iceCreamShop.removeFlavor(iceCreamOrangeLemon);
        iceCreamShop.serviceCustomer();
        System.out.println(iceCreamShop.getAmountEarned());

    }
}
