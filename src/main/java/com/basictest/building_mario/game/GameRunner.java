package com.basictest.building_mario.game;

import com.basictest.building_mario.GamingConsole;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Mario is running"+ game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
