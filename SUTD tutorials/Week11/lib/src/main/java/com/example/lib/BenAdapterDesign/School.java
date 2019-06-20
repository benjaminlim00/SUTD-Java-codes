package com.example.lib.BenAdapterDesign;

public class School {
    public static void main(String[] args) {
        AssignmentWork aw = new AssignmentWork();

        //PilotPen pp = new PilotPen();   //we gonna need a adapter to change it to Pen
        Pen p = new PenAdapter();



        aw.setP(p);
        aw.writeAssignment("im writing my assignment");
//        System.out.println(1e-10);

        String str = "adadad";
//        System.out.println(String.format("%-10s", str));
//        String.format();

        System.out.println(ben.d);
        System.out.println(new ben().a);
        Foo foo = new Foo();

        System.out.println(foo.y);

        System.out.println(new Foo().y);
    }

    static class ben {
        int a;
        static int d;

        public ben() {
            this.a = 2;
            this.d = 1;
        }
    }




}


class Foo {
    int y;
    Foo() {
        y = 1;
    }
}