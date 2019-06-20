package com.example.lib01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MyClass {
    //USING A CONSTANT, basically using final modifier
    private static final String INVALID_VAL_MSG = "invalid value";
    //you cannot reassign it's value


    //METHODS
    public static int myAdd(int x, int y) {
        return x + y;
    }

    //FIBONACCI
        /*
        python version

        def F(n):
            if n == 0:
                return 0
            elif n == 1:
                return 1
            else:
                return F(n-1)+F(n-2)*/
    public static int fib(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            return fib(x - 1) + fib(x - 2);
        }
    }

    public static String printfib(int y) {
        String ans = "";
        for (int z = 0; z < y + 1; z++) {

            ans = ans + fib(z) + ",";
        }
        return ans;
    }

    //HAILSTONE SEQUENCES (mine)
    public static LinkedList<Integer> hailstone(int n) {
            LinkedList<Integer> arr = new LinkedList<Integer>();
            int b = n;
            arr.add(b);
        while (b != 1) {
            if (b % 2 == 0) {//even
                int x = b / 2;
                arr.add(x);
                b = x;

            } else {
                int x = 3 * b + 1;
                arr.add(x);
                b = x;
            }
        }
        return arr;
    }


    //HAILSTONE SEQUENCE (prof)
    public static ArrayList hailstoneSeq(int n) {
        ArrayList<Integer> w = new ArrayList<Integer>();
        while (n!=1) {
            w.add(n);
            if (n%2==0) {
                n = n/2;
            }
            else {
                n = n*3+1;
            }
        }
        return w;
    }

    //METHOD OVERLOADING
    public static int calculate(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + " years old");
        return 0;
    }

    public static int calculate(String name) {
        System.out.println("Hello " + name + ", you are unknown years old");
        return 0;
    }


    //THROWING EXCEPTIONS
    public static int getIntLBYL(){
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("please enter an integer");
        String input = s.next();
        for (int i=0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }


    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter an integer");
        try {
            return s.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }



    //MAIN METHOD
    public static void main(String[] args) {
        //Week 1 Lesson 1 & 2
        //VARIABLES
        int a = 10;
        a = 20;
        //System.out.println(a);

        byte number1 = -128;
        byte newnumber = (byte) (number1 / 2); // We need to cast to type byte

        int number2 = 13;
        short number3 = 50;
        long longnum = 1233_213;
        long number4 = 3232L + (number1 + number2 + number3); //If in bracket, will be converted to Int, and also Long accepts Int.
        //System.out.println(number4);
        int numbertest = 5 / 2; //will round to 2 because type int
        float myfloat = 5.22f;//or cast it
        double mydouble = 4d;

        //INT MAX AND MIN VALUES
//        int min = Integer.MIN_VALUE;
//        int max = Integer.MAX_VALUE;
//        System.out.println(min);



        //float has width of 32(4 bytes), double has 64(8 bytes)
        //double has 16 digiits of precision, compared to 7 for float
        //java assumes ur variable is a double if you did not indicate.
        double convertedpounds = 200d * 0.45359d;
        char charact = 'w';
        char charc = '\u00A9';
        //System.out.println(charc);
        boolean bool = true;
        //System.out.println(longnum);


        //ARRAY
        int[] b;
        b = new int[10];

        //int [] b = new int[10];

        b[0] = 5; //assign 5 to memory cell
        b[1] = 23;

        //System.out.println(b);
        /*for (int element: b) {
            System.out.println(element);

        }*/

        //STRING
        String c = "hello boys";
        //System.out.println(c.length());
        c = c + "!!" + 2;
        //System.out.println(c);

        //IF AND ELSE

        int t = 10;
        /*if (t>5) {
            System.out.println("more than 5");
        } else if (t > 7) {
            System.out.println("case 2");
        } else {
            System.out.println("case 3");
        }

        if (t > 5 && t < 50) {
            System.out.println("in between 5 and 50");
        }

        if (t < 5 || t > 5) {
            System.out.println("one of the above");
        }

        boolean bool2 = true;
        if (bool2) {
            System.out.println("is true");
        }

        boolean iscar = true;
        boolean wascar = iscar ? true : false;
        if (wascar) {
            System.out.println("iscar is true");
        }*/


        // FOR LOOP

        /*for (int i = 0; i < 10; i++) // no need brackets for one liner but best to put
            System.out.println(i);*/

        //CALLING METHODS

        //System.out.println(myAdd(2,4));


        //FIBONACCI
        //System.out.println(printfib(7));

        //EXPRESSIONS
        //int score = 100; from score to 100 is an expression
        /*if (score > 90) {     the part in bracket only
            System.out.println("high score!"); the part inside "" only
            score = 20; from score to 20
        }*/

        //ERRORS
        //STATICALLY CHECKED ERRORS

        int e1 = 1000;
        String e2 = "Hello";

        //e1 = e2; there is an error and the code cannot be run

        // DYNAMICALLY CHECKED ERRORS

        int x1 = 0;
        int x2 = 10000;

        //System.out.println(x2/x1); the error is only found when the code is run

        //NO AUTOMATIC CHECK
        int big = 2000000000;
        //System.out.println(big * 2); //the output is wrong but there is no indication. int overflow

        //STATEMENT
        int myVariable = 50; //the whole line is a statement

        /*System.out.println("This is" +
                " one way" +
                " to do it"
        ); //i can do this */

        int i2 = 323;
        int i3 = 2323; // i can do this


        //ARRAYLIST & LINKEDLIST

        //ArrayList<Integer> w = new ArrayList<Integer>(); // in an arraylist, data are stored adjacent to each other.
        //LinkedList<Integer> w = new LinkedList<Integer>();
        //w.add(1000);
        //w.add(2323);

        //w.remove(0);

        //System.out.println(w.get(0));

        //w.set(0,213123); // I can only overwrite existing data aka replace

        //System.out.println(w.get(0));
        //System.out.println(w.size());

        //IMPORTANT***************************************####################
        // for random access: ArrayList is faster
        // for insertion: LinkedList is faster

        /*
        // we test the time for adding insertion

        Integer [] aa = new Integer[50000];
        //LinkedList<Integer> w = new LinkedList<>(Arrays.asList(aa));
        ArrayList<Integer> w = new ArrayList<> (Arrays.asList(aa));


        long started = System.nanoTime();
        int totalcnt = 100000;
        for (int k = 0; k < totalcnt; k++) {
            w.add(5, 2000);//this is insertion
        }
        long time = System.nanoTime();
        long timetaken = time - started;
        System.out.println("time taken: " + timetaken/1000000.0 + " ms");
        */


        //ITERATION TYPES
        /*

        //FOR ITERATION LOOP
        ArrayList<Integer> w = new ArrayList<>();

        w.add(100);
        w.add(200);
        w.add(300);

        int mySum = 0;

        for (int i=0; i<w.size(); i++) {
            mySum += w.get(i);
        }
        System.out.println("Using count: " + mySum); //This is the longer way

        //FOR ELEMENT IN LOOP
        mySum = 0;

        for (int x: w)
            mySum += x;
        System.out.println("Using element in list: " + mySum); // This is the faster way

        //USING ITERATOR TO LOOP

        Iterator<Integer> iter = w.iterator();
        mySum = 0;
        while (iter.hasNext())
            mySum += iter.next();

        System.out.println("Using iterator: " + mySum);


        //WHILE LOOP
        int count = 1;
        while (count != 6) {
            System.out.println(count);
            count++;
        }


        count = 1;


        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        //DO WHILE LOOP, the condition is checked at the start

        do {
            System.out.println("count value is " + count);
            count++; // This part will definitely work at least once
            // you can use break here as well
        } while(count != 6); // semi-colon!!!!!!

        */

        //USING CONTINUE KEYWORD
        //continue with a loop by bypassing all other code in the block/body





        //HAILSTONE SEQ (mine)

        //LinkedList<Integer> arr = hailstone(5);
        //System.out.println(arr);

        //METHOD OVERLOADING
        //calculate("ben");
        //calculate("ben", 233);

        //SWITCH
//        int value = 5;
//
//        switch(value) {
//            case 1:
//                System.out.println("value was 1");
//                break;
//
//
//            case 2:
//                System.out.println("The number was 2");
//                break;
//
//            case 3:case 4:case 5:
//                System.out.println("3/4/5");
//                break;
//
//
//            default:
//                System.out.println("not 1 or 2 or 3/4/5");
//                break; //not really needed but just leave in
//        }

        //PARSING VALUES FROM A STRING
/*
        String stringg = "2018";
        int number = Integer.parseInt(stringg);
        double doublee = Double.parseDouble(stringg);

        stringg += 1;
        number += 1;
        doublee += 1;

        System.out.println("The string is: " + stringg);
        System.out.println("The parsed number is: " + number);
        System.out.println("The parsed double is: " + doublee);
*/


        //READING USER INPUT
        /*
        Scanner scanner = new Scanner(System.in); // type input into console


        System.out.println("Enter your year of birth: ");
        boolean hasnextint = scanner.hasNextInt();

        if (hasnextint) {
            int year = scanner.nextInt();
            scanner.nextLine(); //handle next line char (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2018 - year;

            System.out.println("Your name is " + name + " and you are " + age + " years old");

        } else {
            System.out.println("You did not enter an Int for year");
        }

        scanner.close();

        */


        //OBJECT-ORIENTED PROGRAMMING
//        Car porsche = new Car(); //new is impt
//        Car toyota = new Car();
//
//        System.out.println("Model is " + porsche.getModel());
//        porsche.setModel("version m");
//        System.out.println("Model is " + porsche.getModel());


        //BANK ACCOUNT CLASS
        /*
        Account bobAccount = new Account();

        //Here we are using the self-defined constructor.
        //Account bobAccount = new Account("12345", 0.00, "benjamin", "benjamin@hotmail", "99999999");

        bobAccount.withdrawal(100.0);

        bobAccount.deposit(50.0);
        bobAccount.withdrawal(100.0);

        bobAccount.deposit(51.0);
        bobAccount.withdrawal(100.0);

        Account timAccount = new Account("Tim", "Tim@hotmail", "32131323");
        System.out.println(timAccount.getNumber() + " name is : " + timAccount.getCustomerName());
        */

        //INHERITANCE

//        Animal animal = new Animal("Animal", 1, 1, 5, 5);
//
//        Dog dog = new Dog("yorkie", 8, 20, 2, 4, 1,20, "long silky");
////        dog.eat();
//        dog.walk();
//        dog.run();

        //SUTD WEEK 2 LESSON 1
//        Circle c1 = new Circle();
//        System.out.println(c1.getArea());
//
//        Circle c2 = new Circle(1);
//        System.out.println(c2.getArea());

        //SUTD WEEK 2 LESSON 2 - static vs instance methods
//        Circle cir1 = new Circle();
//        Circle cir3 = new Circle();
//        System.out.println(Circle.numOfCircleCreated); //Static method can be called without creating an instance of the class

        //THIS AND SUPER
        // We can use them anywhere except in static methods.
        // super is usually used for method overriding
        //we can use this() in the constructor to call another constructor.


        //METHOD OVERLOADING VS OVERRIDING
        //method overloading means providing two or more separate methods in a class with the same name but different parameters
        //we can overload static and instance methods

        //method overriding means defining a method in a child class that alr exists in the parent class with same name and same args.
        //by extending the parent class, the child class gets all the methods defined in the parent class
        //we indicate with @Override
        //we CANNOT override static methods, only instance methods

        //STATIC METHODS VS INSTANCE METHODS
        //Static methods can't access instance methods and variables.
        //They are used for operations that don't require data from an instance of an class.
        //we cannot use this keyword in static methods


        //instance methods can access instance variables and methods directly.
        //as well as access static variables and methods

        //WHEN DO WE USE STATIC?
        //If the methods uses instance variables or methods, use instance.
        //else, static



        //STATIC VARIABLES
        //Every instance of a class shares the same static variable.
        //if changes are made to that variable, all other instances will see the effect of the change.
        //Static methods cannot access non-static variables and methods in its own class
        //(but can access non static methods in other classes, because an instance is created to use them)
        //THE REVERSE IS NOT TRUE, instance method CAN access static variables and methods.

        //FINAL VARIABLES
        //A final class is simply a class that can't be extended.
        //prevent inheritance(extends) of a class
        //final methods cannot be overwritten



        //INSTANCE VARIABLES
        //Each instance has it's own copy of an instance variable
        //each instance can have a diff value.

        //COMPOSITION
//        Camera cc = new Camera(1,1,30, new Screen(50,40));
//        int height = cc.getScreen().getHeight();
//        System.out.println(height);

        //WEEK4 LESSON 1
        //PUBLIC: the obj is visible to all classes everywhere, whether they are in same
        //package or have imported the package containing the public class.




        //PROTECTED
        //Protected modififer means that data/method can be accessed by any class in the same package
        //or its subclasses, even if subclasses are in a different package.
        //higher accessibility than public!!!

        //PRIVATE
        //You cannot have private class!!
        //the obj is only visible within the class it is declared. It is not visible anywhere else.
        //, including in subclasses of its classes.

        //PACKAGE-PRIVATE:
        //the obj is only available within its own package. It is specified by default (means ____ class PackagePriClass) if you do
        //not specify public. there is no "package-private" keyword.

        //EXCEPT with interface methods and variables(auto public)



        //ABSTRACT
        //An abstract class is a class that is declared abstract—it may or may not include abstract methods.
        //Abstract classes cannot be instantiated, but they can be subclassed.

        //If a class includes abstract methods, then the class itself must be declared abstract.

        //JAVAMASTERCLASS ARRAY
        //we can do this.
        int[] myintarr = {1,232,3,23,32,3}; // We call this an anonymous arr
        int[] anotherarr = myintarr;
        //shortcut for List
        //List<Integer> x = Arrays.asList(1, 242141, 3,314134);

        //how to print an array
//        System.out.println(Arrays.toString(myintarr));
//        System.out.println(Arrays.toString(anotherarr));
//
//        //here we change one of them
//        myintarr[0] = 123312;
//        System.out.println(Arrays.toString(myintarr));
//        System.out.println(Arrays.toString(anotherarr));
        //We can see that both of them changed.


        //ARRAYLIST
        /*
        .size for length
        .get to retrieve item
        .set(position, item) to place item
        we use .get to get index of item
        .remove(position) to remove a particular something, or we can use .remove(item)
        .contains tells if something is in the list
        .indexOf returns index of item or -1
         */

//        ArrayList<String> ar = new ArrayList<>();
//        ar.add("cat");
//        ar.add("dog");
//        ar.add("snake");
//        ar.remove("snake");
//        System.out.println(ar);



        /*
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(2);
        test.indexOf(2);
        ArrayList<Integer> newarr = new ArrayList<Integer>();
        //shortcut to add one whole array without iterating
        newarr.addAll(test);
        ArrayList<Integer> newarr2 = new ArrayList<Integer>(test);
        //System.out.println(newarr2);

        //convert ArrayList to array - method 1
        Integer[] intarr = new Integer[test.size()];
        intarr = test.toArray(intarr);
        //convert ArrayList to array - method 2
        ArrayList<String> newarr3 = new ArrayList<String>();
        newarr3.add("hello");
        newarr3.add("im");
        newarr3.add("ben");
        String[] strarr = new String[newarr3.size()];
        strarr = newarr3.toArray(strarr);
        System.out.println(Arrays.toString(strarr));


        */

        //LINKEDLIST
        //each integer takes 4 bytes of memory

        /*
        LinkedList<Integer> newlinkedls = new LinkedList<Integer>();
        newlinkedls.add(1);
        newlinkedls.add(3);
        newlinkedls.add(4);
        //We can use add to add at a specific index
        newlinkedls.add(1, 2);
        //method 1 to print
        System.out.println(Arrays.toString(newlinkedls.toArray()));
        //method 2 to print
        for (int i = 0; i < newlinkedls.size(); i++) {
            System.out.println(newlinkedls.get(i));
        }
        */

        //Linked list is better for adding stuff midway because
        //it uses link and data. No rigid order => faster for inserting and deleting.
        //isEmpty() to check if list is empty

        //INTERFACE vs ABSTRACT
        // abstract class can have member variables that are inherited


        // interfaces can have VARIABLES but they are all PUBLIC STATIC FINAL!
        // constant values that cannot be changed with a static scope
        // they have to be static because non static variables require an instance.


        //It is not possible to have anything except public methods in an interface.
        //because the whole point of interfaces is to provide methods that have to be implemented.
        //but we can make the methods effectively PACKAGE-PRIVATE, by ensuring that the interface itself is package-private



        // interfaces cannot have constructors but abstract classes can.
        //all methods of interfaces are auto PUBLIC abstract, but abstract classes can have defined modifiers.

        //STRING FORMATTING
//        String str = "adadad";
//        System.out.println(String.format("%-10s", str));
//

        //TRY-CATCH BLOCK
        try {
            int x = 50;
            int y = 0;
            System.out.println(x/y);
            System.out.println("within try block");
        }
        catch (ArithmeticException ex){
            System.out.println("Error: dividing by 0");
        }

        finally {
            System.out.println("Done computing");
        }

        //THROWS
        // In Java, exceptions are required to be handled using Try-Catch blocks.

        //    void show() throws Exception {
        // this is just telling Java i am not going to handle the error in the code.
        // so that Java does not bother me.

        //NAMING CONVENTIONS
        //packages should be all lower case
        //ClassNames should be CamelCase
        //interface camelcase and descriptive
        //methodNames should be mixedCase and desciptive of their fnc
        //constants should be ALLUPPER_CASE with underscore between words
        //and declared final
        //variableNames should be mixedCase, no underscore


        //HASHMAP
        //we can use .get(key)
        // .put(key, val)
        // .containsKey
        // for (String key: languages.keySet()) {
        //      sout(languages.get(key)
        // there is no specific order in a hashmap
        //use .remove(key) to remove, it can also return true or false via sout
        // use .replace(key, value) to replace
        // use .replace(key, oldval, newval) to ensure the old val is replaced

        //System.out.println(getIntLBYL());
        System.out.println(getIntEAFP());






    }




}
//UDEMY
/*
import java.lang.Math;

public class AreaCalculator {
     private static final double pi = 3.14159;
     public static double area(double radius) {
         double r = radius;
         if (r < 0) {
             return -1;
         }

         return 3.14159 * Math.pow(r, 2);
     }
     public static double area(double x, double y) {
         if (x < 0 || y < 0) {
             return -1;
         }
         return x * y;
     }
}


public class IntEqualityPrinter {
    // write your code
    public static void printEqual(int a, int b, int c) {
        if (a<0 || b<0 || c<0) {
            System.out.println("Invalid Value");
        } else if (a != b && a != c && b != c ) {
            System.out.println("All numbers are different");
        } else if (a == b && a == c && b == c ) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}

public class PlayingCat {
    // write your code here
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean b = summer;
        int t = temperature;
        if (b) {
            if (t <=45 && t >= 25) {
                return true;
            } else {
                return false;
            }
        } else {
            if (t <= 35 && t >= 25) {
                return true;
            } else {
                return false;
            }
        }

    }
}

 */



