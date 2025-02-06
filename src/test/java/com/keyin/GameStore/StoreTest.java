package com.keyin.GameStore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StoreTest {

    @Test
    public void testGameAdd() {
        Store store = new Store();

        Game game = new Game(1, "Marvel Rivals", "Third Person Shooter", 1.99);
        store.addGame(game, true);
        Assertions.assertEquals("Marvel Rivals", store.getGames().getFirst().getName());


    }
}