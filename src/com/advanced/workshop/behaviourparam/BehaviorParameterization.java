package com.com.advanced.workshop.behaviourparam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BehaviorParameterization {
    interface ApplePredicate {
        public boolean test(Apple apple);
    }
    static class AppleHeavyWeightPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() > 150;
        }
    }
    static class AppleGreenColorPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return "green".equals(apple.getColor());
        }
    }

    public static void main(String...args) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155,"green"), new Apple(120,"red"));
        List<Apple> heavyApples = filterApples(inventory, new AppleHeavyWeightPredicate());
        List<Apple> greenApples = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(heavyApples);
        System.out.println(greenApples);

    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>(10);
        for (Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
