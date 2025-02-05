package com.keyin.GameStore;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Game> games;

    public Store() {
        games = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
        System.out.println("Game added: " + game.getName());
    }
}
