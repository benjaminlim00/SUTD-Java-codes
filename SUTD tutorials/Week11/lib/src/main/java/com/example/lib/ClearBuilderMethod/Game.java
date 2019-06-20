package com.example.lib.ClearBuilderMethod;

class Game {
    String name;
    int price;
    String language;

    //now we cannot use the constructor, we are forced to use the builder
    private Game(String name, int price, String language) {
        this.name = name;
        this.price = price;
        this.language = language;
    }






    //implementation of builder method
    public static class GameBuilder {
        private String name;
        private int price;
        private String language;

        public GameBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public GameBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public GameBuilder setLanguage(String language) {
            this.language = language;
            return this;
        }

        public Game createGame() {
            return new Game(name, price, language);
        }
    }
}