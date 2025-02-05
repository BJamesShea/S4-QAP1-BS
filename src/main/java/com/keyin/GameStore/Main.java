package com.keyin.GameStore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();
        Scanner scanner = new Scanner(System.in);
        boolean appOn = true;

        System.out.println("Welcome to Brandon's Roadside Game-bar!");

        while (appOn)
        {
            System.out.println("Menu:");
            System.out.println("1. View available games");
            System.out.println("2. Add new game");
            System.out.println("3. Purchase a game");
            System.out.println("4. Exit");
            System.out.print("Choose option!");

            int choice = scanner.nextInt();


        }



//        // Three best video games ever made (fight me)
//        Game game1 = new Game(1, "Bloodborne", "Action/Souls Like", 24.99);
//        Game game2 = new Game(2, "Baldurs Gate 3", "Isometric RPG", 69.99);
//        Game game3 = new Game(3, "Alan Wake 2", "Survival Horror", 49.99);
//
//        store.addGame(game1);
//        store.addGame(game2);
//        store.addGame(game3);
//
//        store.displayGames();
    }
}