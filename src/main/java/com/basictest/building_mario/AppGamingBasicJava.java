package com.basictest.building_mario;

import com.basictest.building_mario.game.GameRunner;
import com.basictest.building_mario.game.MarioGame;
import com.basictest.building_mario.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {
        //var game = new MarioGame();
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }







}
