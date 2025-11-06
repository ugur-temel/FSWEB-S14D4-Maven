package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] storeProducts = new ProductForSale[3];
        storeProducts[0] = new Chocolate("Bitter", 19,"From Belgium");
        storeProducts[1] = new Coke("Diet Coke", 3, "No Sugar");
        storeProducts[2] = new Bread("Rye Bread", 2, "A Healthy Choice");
        Store store = new Store();
        store.listProducts(storeProducts);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product: products){
            product.showDetails();
        }
    }
}