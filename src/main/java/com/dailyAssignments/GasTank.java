package com.dailyAssignments;

public class GasTank  implements Fillable {

    private final double GALLONS;

    private double gas;

    public GasTank(double GALLONS, double gas) {
        this.GALLONS = GALLONS;
        this.gas = gas;
    }

    public GasTank() {
        GALLONS = 30;
    }

    public GasTank(double gallons) {
        this.GALLONS = gallons;
    }

    @Override
    public void fill() {
        gas = GALLONS;
        System.out.println("You filled the whole tank");
    }

    @Override
    public void empty() {
        gas = 0;
        System.out.println("you emptied the whole tank");
    }

    @Override
    public void fill(double quantity) {
        if (quantity > (GALLONS - gas))
            System.out.println("Exess quantity, the Tank cant handle total capacity");
        else {
            gas += quantity;
            System.out.println("you filled " + quantity);

        }
    }

    @Override
    public void empty(double quantity) {
        if (quantity > gas)
            System.out.println("You cant empty more than you have");
        else {
            gas -= quantity;
            System.out.println("you emptied " + quantity);
        }
    }

    @Override
    public String toString() {
        return "GasTank{" +
                "GALLONS=" + GALLONS +
                ", gas=" + gas +
                '}';
    }
}