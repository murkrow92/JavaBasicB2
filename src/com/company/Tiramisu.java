package com.company;

public class Tiramisu extends Cake {
    public Tiramisu(int quantity) {
        this.setPrice(45);
        this.setQuantity(quantity);
    }

    @Override
    public float total() {
        float result = super.total();
        int minimumQuantity = 10;
        if (this.getQuantity() >= minimumQuantity) {
            result = result * 0.9f;
        }
        return result;
    }
}
