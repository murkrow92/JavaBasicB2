package com.company;

public class Cake {
    private float price;
    private int quantity;

    public Cake() {
        this.price = 0;
        this.quantity = 0;
    }

    public float total() {
       return this.price * this.quantity;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
