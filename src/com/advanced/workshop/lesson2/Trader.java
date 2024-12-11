package com.com.advanced.workshop.lesson2;

public class Trader{
    private final String name;
    private final String city;

    private final Main.ECONOMICCLASS economicclass;
    public Trader(String n, String c, Main.ECONOMICCLASS economicclass){
        this.name = n;
        this.city = c;
        this.economicclass = economicclass;
    }

    public Main.ECONOMICCLASS getEconomicclass() {
        return economicclass;
    }

    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }
    public String toString(){
        return "Trader:"+this.name + " in " + this.city;
    }
}
