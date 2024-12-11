package com.com.advanced.workshop;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgramming {
    public static void main(String[] args) {
        // Imperative style programming is we have to say what to do and how to do it.
        List<String> names = Arrays.asList("John", "Arunan", "Adbul", "Stella");

        boolean isThere = false; //garbage variables

        for (String name : names) {
            if (name.equals("Stella")) {
                isThere = true;
                break; //Still the how part is haunting us
            }
        }
        if(isThere) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found!");
        }

        // Declarative programming is we say what to do and NOT how to do it.
        if (names.contains("Stella")) {
            System.out.println("Stella is found!");
        } else {
            System.out.println("Stella not found!");
        }

        // Higher order functions
        // What is a function?
        // 1. Pass objects to a function
        // 2. Create objects in a function
        // 3. Return objects from a function
        // What is higher order function?
        // 1. Pass functions to a function
        // 2. Create function within a function
        // 3. Return function from a function

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is invoked");
            }
        });

        th.start();
        System.out.println("Main Thread");

        Thread thread = new Thread (() -> System.out.println("Thread is invoked!!")); // Instead of accepting an object, thread constructor is accepting a function
    }
}
