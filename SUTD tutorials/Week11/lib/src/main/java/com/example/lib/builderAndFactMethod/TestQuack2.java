package com.example.lib.builderAndFactMethod;

public class TestQuack2 {
    public static void main(String[] args) {
        Pond2 pond2 = Pond2.createPond2(1.0, "swan lake");

        //below is the same, just longer version
        Pond2 pond22 = new Pond2.Pond2Builder().setSize(1.0).setType("Lake").createPond2();


    }

}

class Pond2 {
    private double size;
    private String type;

    private Pond2(double size, String type) {
        this.size = size;
        this.type = type;
    }

    public static Pond2 createPond2(double size, String type) {
        return new Pond2Builder().setSize(size).setType(type).createPond2();
    }


    public static class Pond2Builder {
        private double size;
        private String type;

        public Pond2Builder setSize(double size) {
            this.size = size;
            return this;
        }

        public Pond2Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Pond2 createPond2() {
            return new Pond2(size, type);
        }
    }
}