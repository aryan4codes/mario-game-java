package com.basictest.building_mario;

import com.basictest.building_mario.game.GameRunner;
import com.basictest.building_mario.game.MarioGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }







}
