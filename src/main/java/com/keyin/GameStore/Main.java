package com.keyin.GameStore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Preloaded the GOATs
        Store store = new Store();
        store.addGame(new Game(1, "Bloodborne", "Action/Souls Like", 24.99), false);
        store.addGame(new Game(2, "Baldur's Gate 3", "Isometric RPG", 69.99), false);
        store.addGame(new Game(3, "Alan Wake 2", "Survival Horror", 49.99), false);

        Scanner scanner = new Scanner(System.in);
        boolean appOn = true;

        System.out.println();
        System.out.println("============================================");
        System.out.println("      WELCOME TO BRANDON'S GAME STORE       ");
        System.out.println("============================================");
        System.out.println("Default games have been loaded.");
        System.out.println();

        while (appOn) {
            System.out.println("============================================");
            System.out.println("                  MAIN MENU                 ");
            System.out.println("============================================");
            System.out.println("1. View Available Games");
            System.out.println("2. Add New Game");
            System.out.println("3. Purchase a Game");
            System.out.println("4. Exit");
            System.out.println("============================================");
            System.out.print("Choose an option: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        store.displayGames();
                        break;

                    case 2:
                        System.out.println("\n--- Add a New Game ---");
                        System.out.print("Enter game ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter game name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter game genre: ");
                        String genre = scanner.nextLine();

                        System.out.print("Enter game price: $");
                        double price = scanner.nextDouble();

                        Game newGame = new Game(id, name, genre, price);
                        store.addGame(newGame, true);
                        break;

                    case 3:
                        System.out.println("Purchase feature coming soon!");
                        break;

                    case 4:
                        System.out.println("Thank you for visiting Brandon's Game Store. See you next time!");
                        appOn = false;
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
