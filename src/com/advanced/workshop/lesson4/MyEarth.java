package com.com.advanced.workshop.lesson4;

public class MyEarth {
    int getDamage(Object obj) {
        int damage = 0;
        if (obj instanceof AirPollution) {
            final AirPollution airPollution = ((AirPollution) obj);
            damage = airPollution.getDamage();
        } else if (obj instanceof Discrimination) {
            Discrimination discrimination = ((Discrimination) obj);
            damage = discrimination.damagingGenerations();
        } else if (obj instanceof Deforestation) {
            Deforestation deforestation = ((Deforestation) obj);
            damage = deforestation.getTreeDamage();
        } else {
            damage = -1;
        }
        return damage;
    }

    public static void main(String[] args) {

        MyEarth earth = new MyEarth();
        int damageByAirpollution = earth.getDamage(new AirPollution());
        int damageByDiscrimination = earth.getDamage(new Discrimination());
        int damageByDeforestation = earth.getDamage(new Deforestation());
        int dummyObject = earth.getDamage(new Object());

        if (damageByAirpollution == 100) System.out.println("PASSED");
        else System.out.println("FAILED");

        if (damageByDiscrimination == 2000) System.out.println("PASSED");
        else System.out.println("FAILED");

        if (damageByDeforestation == 300) System.out.println("PASSED");
        else System.out.println("FAILED");

        if (dummyObject == -1) System.out.println("PASSED");
        else System.out.println("FAILED");

    }
}