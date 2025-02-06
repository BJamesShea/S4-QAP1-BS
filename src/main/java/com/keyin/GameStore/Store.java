package com.keyin.GameStore;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Game> games;

    public Store() {
        games = new ArrayList<>();


    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
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
