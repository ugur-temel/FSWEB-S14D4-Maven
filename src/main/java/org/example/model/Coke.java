package org.example.model;

public class Coke extends ProductForSale{
    private double liter;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }
    public Coke(String type, int price, String description, double liter) {
        super(type, price, description);
        this.liter = liter;
    }

    @Override
    public void showDetails() {
        System.out.println("Tis product is " + liter + " liter.");
    }
}
