package com.dailyAssignments;

public class CoffeMug implements Fillable {

    private final double OUNCES;

    private double coffee;

    public CoffeMug(double OUNCES, double coffee) {
        this.OUNCES = OUNCES;
        this.coffee = coffee;
    }

    public CoffeMug() {
        OUNCES = 10;
    }

    public CoffeMug(double ounces) {
        this.OUNCES = ounces;
    }

    @Override
    public void fill() {
        coffee = OUNCES;
        System.out.println("You filled the whole mug");

    }

    @Override
    public void empty() {
        coffee = 0;
        System.out.println("you emptied the whole mug");

    }

    @Override
    public void fill(double quantity) {
        if (quantity > (OUNCES - coffee))
            System.out.println("Exess quantity, the mug cant handle total capacity");
        else {
            coffee += quantity;
            System.out.println("you filled " + quantity);
        }
    }

    @Override
    public void empty(double quantity) {
        if (quantity > coffee)
            System.out.println("You cant empty more than you have");
        else {
            coffee -= quantity;
            System.out.println("you emptied " + quantity);

        }
    }

    @Override
    public String toString() {
        return "CoffeMug{" +
                "OUNCES=" + OUNCES +
                ", coffee=" + coffee +
                '}';
    }
}