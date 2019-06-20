package com.example.lib.ClearBuilderMethod;

public class BenNewBuilderMethod{
    public static void main(String[] args) {

        //we are creating the game builder here
        Game.GameBuilder builder = new Game.GameBuilder();

        //the benefit is that we no longer need to specify the parameters in order
        Game newGame = builder.setLanguage("english")
                .setName("sonic").setPrice(123).createGame();

        // or we can do it in one line
        Game newGame2 = new Game.GameBuilder().setLanguage("chinese").setName("mario").setPrice(122).createGame();


    }



}
