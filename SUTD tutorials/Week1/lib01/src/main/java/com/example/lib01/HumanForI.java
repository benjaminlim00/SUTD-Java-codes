package com.example.lib01;

class HumanForI {    // here we use interface as an input. So anything that implements eatable, we can put in. (chocolate)
    public void eat (Eatable food) {
        System.out.println("You are eating " + food);
    }

    public static void main(String[] args) {
        Chocolate hersheys = new Chocolate("hersheys");
        HumanForI ben = new HumanForI();
        ben.eat(hersheys);
    }
}