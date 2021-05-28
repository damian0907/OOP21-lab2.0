package com.company.devices;

import com.company.animals.Human;

public class Phone extends Device {
    public final Double screenSize;
    public String os;
    public String producer;
    public String model;

    public static String greetings = "HELLO";


    public Phone(String producer, String model, Double screenSize, String os) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.os = os;
    }

    public String toString() {
        return "producer: " + this.producer
                + " model: " + this.model;
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is turned on");
    }

    @Override
    public boolean sell(Human seller, Human buyer, Double price) {
        if (seller.phone == this && buyer.cash >= price) {
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("Phone " + this +  " has been sold");
            buyer.phone = this;
            seller.phone = null;

            return true;
        } else {
            System.out.println("Phone has not been sold");
        }
        return false;}
    }

