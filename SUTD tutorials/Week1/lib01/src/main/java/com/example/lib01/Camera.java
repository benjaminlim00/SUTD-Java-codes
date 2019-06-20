package com.example.lib01;

public class Camera extends Machine{
    private int film;
    private Screen screen; //THIS IS COMPOSITION

    public Camera(int state, int battery, int film, Screen screen) {
        super(state, battery, 2); //Thats how you use super.
        this.film = film;
        this.screen = screen;
    }
    //        Camera cc = new Camera(2,3,43);
    //        System.out.println(cc.component);


    public int getFilm() {
        return film;
    }

    public void setFilm(int film) {
        this.film = film;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
