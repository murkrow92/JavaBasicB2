package com.company;

public class Mousse extends Cake {

    public Mousse(int quantity) {
        this.setPrice(30);
        this.setQuantity(quantity);
    }

    @Override
    public float total() {
        int minimumQuantity = 5;
        if (this.getQuantity() >= minimumQuantity) {
            return super.total() * 0.5f;
        } else {
            return super.total();
        }
    }

}