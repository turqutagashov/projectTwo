package com.company;

public class Product{

    private String title;
    private double price;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void purchase(){
        System.out.println("The product is purchased.");
    }

    public void download(){
        System.out.println("The product is downloaded.");
    }

    public void information(){
        System.out.printf("NAME: %s\n", getTitle());
        System.out.printf("PRICE: %s$\n", getPrice());
    }
}
