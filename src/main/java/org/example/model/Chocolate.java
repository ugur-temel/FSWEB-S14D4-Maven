package org.example.model;

public class Chocolate extends ProductForSale{
    private int cacaoPercentage;

    public Chocolate(String type, int price, String description, int cacaoPercentage) {
        super(type, price, description);
        this.cacaoPercentage = cacaoPercentage;
    }
    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }
    @Override
    public void showDetails() {
        System.out.println("Cacao Percentage in this product: " + cacaoPercentage);
    }
}
