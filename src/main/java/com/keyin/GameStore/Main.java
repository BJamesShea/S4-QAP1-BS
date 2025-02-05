package com.keyin.GameStore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Preloaded the goats
        Store store = new Store();
        store.addGame(new Game(1, "Bloodborne", "Action/Souls Like", 24.99), false);
        store.addGame(new Game(2, "Baldur's Gate 3", "Isometric RPG", 69.99),false);
        store.addGame(new Game(3, "Alan Wake 2", "Survival Horror", 49.99),false);





        Scanner scanner = new Scanner(System.in);
        boolean appOn = true;

        System.out.println();
        System.out.println("Welcome to Brandon's Roadside Game-bar!");

        System.out.println();
        System.out.println("Default games have been loaded!");
        System.out.println();

        while (appOn)
        {
            System.out.println("Menu:");
            System.out.println("1. View available games");
            System.out.println("2. Add new game");
            System.out.println("3. Purchase a game");
            System.out.println("4. Exit");
            System.out.print("\nChoose option! ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    store.displayGames();
                    break;


                case 2:
                    System.out.print("Enter game ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter game name: ");
                    String name = scanner.nextLine();


                    System.out.print("Enter game genre: ");
                    String genre = scanner.nextLine();


                    System.out.print("Enter game price: ");
                    double price = scanner.nextDouble();

                    Game newGame = new Game(id, name, genre, price);
                    store.addGame(newGame, true);
                    break;

                case 3:
                    System.out.println("Purchase feature coming soon!");
                    break;

                case 4:
                    System.out.println("Thanks for visiting Brandon's Roadside Game-bar!");
                    appOn = false;
                    break;

                default:
                    System.out.println("Invalid option. Oops.");


            }


        }

        scanner.close();



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