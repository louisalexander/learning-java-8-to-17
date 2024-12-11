package com.com.advanced.workshop.lesson2;

import java.util.*;

public class Main {
    enum ECONOMICCLASS {
        WEALTHY,
        MIDDLECLASS,
        UPPERMIDDLECLASS
    }
    public static void main(String... args) {

        Trader ramki = new Trader("Ramki", "Chennai", ECONOMICCLASS.WEALTHY);
        Trader maran = new Trader("Maran","Madurai", ECONOMICCLASS.MIDDLECLASS);
        Trader arun = new Trader("Arun","Chennai", ECONOMICCLASS.UPPERMIDDLECLASS);
        Trader bharathi = new Trader("Bharathi","Chennai", ECONOMICCLASS.WEALTHY);

        List<Transaction> transactions = Arrays.asList(
                new Transaction(bharathi, 2011, 300),
                new Transaction(ramki, 2012, 1000),
                new Transaction(ramki, 2011, 400),
                new Transaction(maran, 2012, 710),
                new Transaction(maran, 2012, 700),
                new Transaction(arun, 2012, 950)
        );


        //Solution down this line
        // Answer all the questions by getting a stream out of "transactions" list, don't create a new list

    }
}
