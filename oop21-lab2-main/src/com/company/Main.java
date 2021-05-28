package com.company;

import com.company.animals.Animal;
import com.company.animals.Human;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");

        dog.name = "Szarik";

        Human me = new Human(1000.0);



        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = dog;

        Phone onePlus = new Phone("onePlus",
                "8Pro",
                2.3,
                "Android");

        Phone iPhone6 = new Phone("apple", "6s", 5.0, "iOs");
        Phone SamsungS20 = new Phone("Samsung","Galaxy",3.5,"Android");
        System.out.println("phone: " + onePlus);
        System.out.println("phone: " + iPhone6);
        System.out.println("human: " + me);




        onePlus.turnOn();


        Diesel fiat = new Diesel();
        fiat.engineSize = 1.9;
        fiat.fuelType = "diesel";
        fiat.producer = "Fiat";
        fiat.model = "Bravo";


        Petrol vw = new Petrol();
        vw.engineSize = 1.4;
        vw.fuelType = "petrol";
        vw.producer = "Volkswagen";
        vw.model = "Golf";


        Electric tesla = new Electric();
        vw.engineSize = 1.4;
        vw.fuelType = "electric";
        vw.producer = "Tesla";
        vw.model = "S";


         me.car = vw;
         me.phone = iPhone6;
         Human buyer = new Human(10000.0);
         buyer.cash = 1000.0;

         vw.sell(me,buyer,100.0);
         iPhone6.sell(me,buyer,100.0);
         System.out.println(buyer.car);
         System.out.println(buyer.phone);

        System.out.println(iPhone6.os);
        System.out.println(iPhone6.screenSize);
        System.out.println(iPhone6.model);
        System.out.println(iPhone6.producer);

        fiat.turnOn();
        iPhone6.turnOn();

        System.out.println(me instanceof Human);
        System.out.println(me instanceof Animal);

        System.out.println(me.getClass());
        System.out.println(me.getClass().getSuperclass());
        System.out.println(me.getClass().getSuperclass().getSuperclass());
        System.out.println(me.getClass().getSuperclass().getSuperclass().getSuperclass());

    }
}
