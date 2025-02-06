package com.keyin.GameStore;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GameTest {

    @Test
    public void testGameCreation(){
        Game game = new Game(1,"Marvel Rivals","Third Person Shooter",1.99);
        List<Game> games = new ArrayList<>();
        games.add(game);

        Assertions.assertSame("Marvel Rivals", game.getName());

        game.setName("Black Ops 2");
        game.setGenre("FPS");
        Assertions.assertEquals(1, games.size());

        Assertions.assertEquals("Black Ops 2",game.getName());


    }

}
