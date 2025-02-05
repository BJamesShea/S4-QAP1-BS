package com.keyin.GameStore;

public class Game {

    private final int id;
    private final String name;
    private final String genre;
    private final double price;


    public Game(int id, String name, String genre, double price) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre(){
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Genre: " + genre + ", Price: $" + price);

    }
}

