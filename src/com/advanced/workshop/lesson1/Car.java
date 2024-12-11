package com.com.advanced.workshop.lesson1;

public class Car {
    private int weight;
    private BRAND carBrand;

    public Car(int weight, BRAND carBrand) {
        this.weight = weight;
        this.carBrand = carBrand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public BRAND getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(BRAND carBrand) {
        this.carBrand = carBrand;
    }
}

enum BRAND {
    MARUTI,
    BMW,
    TATA
}
