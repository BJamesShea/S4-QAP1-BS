package com.keyin.GameStore;

public class Game {

    private int id;
    private String name;
    private String genre;
    private double price;


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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Genre: " + genre + ", Price: $" + price);

    }
}

