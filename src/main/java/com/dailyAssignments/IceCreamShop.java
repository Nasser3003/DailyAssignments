package com.dailyAssignments;

import java.util.ArrayList;

public class IceCreamShop {

    private String name;
    private double amountEarned;
    private ArrayList<IceCream> flavors; // Are the flavors available at a given store
    private ArrayList<Customer> customerLine = new ArrayList<>();

    public IceCreamShop(String name, ArrayList<IceCream> flavors) {
        this.name = name;
        this.flavors = flavors;
    }

    public void serviceCustomer() {
        if (customerLine.isEmpty())
                throw new IndexOutOfBoundsException();

        Customer customer = customerLine.get(0);

        if (customer.getIceCream() == null)
            throw new IllegalArgumentException();

        String customerFlavor = customer.getIceCream().getFlavor();
        boolean flavorExists = flavors.stream().anyMatch(iceCream -> iceCream.getFlavor().equals(customerFlavor));

        if (!flavorExists)
            throw new IllegalArgumentException();

        amountEarned += customer.getIceCream().getPrice();
        customerLine.remove(0);
    }


    public void addCustomer(Customer c) {
        customerLine.add(c);
    }


    public void addFlavor(IceCream flavor) {
        if (!flavors.stream().anyMatch(iceCream -> iceCream.getFlavor().equals(flavor.getFlavor())))
            flavors.add(flavor);
    }


    public void removeFlavor(IceCream flavor) {
        if (flavors.stream().anyMatch(iceCream -> iceCream.getFlavor().equals(flavor.getFlavor())))
            flavors.remove(flavor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmountEarned() {
        return amountEarned;
    }

    public void setAmountEarned(double amountEarned) {
        this.amountEarned = amountEarned;
    }

    public ArrayList<IceCream> getFlavors() {
        return flavors;
    }

    public void setFlavors(ArrayList<IceCream> flavors) {
        this.flavors = flavors;
    }

    public ArrayList<Customer> getCustomerLine() {
        return customerLine;
    }

    public void setCustomerLine(ArrayList<Customer> customerLine) {
        this.customerLine = customerLine;
    }
}