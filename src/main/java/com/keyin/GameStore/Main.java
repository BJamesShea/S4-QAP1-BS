package com.keyin.GameStore;

public class Main {
    public static void main(String[] args) {

        // Three best video games ever made (fight me)
        Game game1 = new Game(1, "Bloodborne", "Action/Souls Like", 24.99);
        Game game2 = new Game(2, "Baldurs Gate 3", "Isometric RPG", 69.99);
        Game game3 = new Game(3, "Alan Wake 2", "Survival Horror", 49.99);

        game1.displayInfo();
        game2.displayInfo();
        game3.displayInfo();

    }
}