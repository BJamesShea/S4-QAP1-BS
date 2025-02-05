package com.keyin.GameStore;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Game> games;

    public Store() {
        games = new ArrayList<>();
//        System.out.println("It's time to play The Game ( Not sponsored by Triple H )");
    }

    public void addGame(Game game, boolean showMessage) {
        games.add(game);
        if (showMessage) {
            System.out.println("Game added: " + game.getName());
        }
    }

    public void displayGames() {
        if (games.isEmpty()) {
            System.out.println("No games available.");
        } else {
            System.out.println("Available games:");
            for (Game game : games) {
                game.displayInfo();
            }
            System.out.println();
        }
    }
}
