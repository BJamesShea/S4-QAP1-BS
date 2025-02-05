package com.keyin.GameStore;

public class Game {

    private int id;
    private String name;
    private double price;

    public Game(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
    }
}

