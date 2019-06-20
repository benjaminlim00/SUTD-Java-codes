package com.example.week7;

public class overloadandoverride {
    public static class Dog {
        public void bark() {
            System.out.println("woof");
        }

        public void drool() {
            System.out.println("drool");
        }
    }

    public static class Hound extends Dog {
        @Override
        public void bark() {
            System.out.println("growl");
        }

        public void drool(int time) {
            System.out.println("drool" + time);
        }

        public void flame() {
            System.out.println("flaming");
        }

    }


    public static void main(String[] args) {
        Dog g = new Hound(); // treat this as a dog, but it's actual type is hound so it will growl
        g.bark();
        //Hound h = new Dog() NOT POSSIBLE. The variable type must be a superclass.
    }
}