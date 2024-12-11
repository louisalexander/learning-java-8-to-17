package com.com.advanced.workshop.lesson1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String...args) {
        List<Car> cars = Arrays.asList(new Car(500, BRAND.MARUTI),
                                        new Car(1000, BRAND.BMW),
                                        new Car(700, BRAND.TATA),
                                        new Car(200, BRAND.MARUTI));

        //Solution below this line
    }

    public static void printDynamically(List<Car> cars, CarPrinter printer) {
        for (Car car : cars) {
            printer.print(car);
        }

    }
}
