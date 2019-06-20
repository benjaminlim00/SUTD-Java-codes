package com.example.lib01;


public class MyClass {
    public static void main(String[] args) {
        MyRectangle2D rec = new MyRectangle2D(0,0,2,2);
        MyRectangle2D rec2 = new MyRectangle2D(0,-2,2,1.9);

        System.out.println(rec.contains(0,6));

    }





}



/* VOCAREUM

public class Fibonacci{

    public static String fibonacci( int n ){
        int f1 = 0;
        int f2 = 1;

        String ans = f1 + "," + f2;

        for (int i = 3; i <= n; i++) {
            int mySum = f1 + f2;

            f1 = f2;
            f2 = mySum;


            ans = ans + "," + mySum;
        }

        return ans;
    }

}


QNS A2:


    public static void main(String[] args) {
        ArrayList<Integer> yo = new ArrayList<Integer>(5);
        yo.add(2);
        yo.add(4);
        yo.add(6);

        int w = Act2Iterator(yo);
        System.out.println(w);
        }


public static int Act2Iterator(List<Integer> integers) {
        int sum = 0;

        // Insert code here to sum up input using an Iterator ...
        List w = integers;
        Iterator<Integer> iter = w.iterator();

        while (iter.hasNext()) {
            sum += iter.next();
        }


        return sum;
    }


//QNS 4

public static void main (String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " +
                account.getMonthlyInterest());
    }


//HW 1
public static int isPrime(int num){
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return 0;//is not prime
            }
        }
        return 1;
    }


//HW 2
MyRectangle2D rec = new MyRectangle2D(0,0,2,2);
        MyRectangle2D rec2 = new MyRectangle2D(0,-2,2,1.9);

        System.out.println(rec.overlaps(rec2));

*/


/*
//WEEK 2 HW 1

Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for a");
        double a = scanner.nextDouble();

        System.out.println("Enter value for b");
        double b = scanner.nextDouble();

        System.out.println("Enter value for c");
        double c = scanner.nextDouble();

        System.out.println("Enter value for d");
        double d = scanner.nextDouble();

        System.out.println("Enter value for e");
        double e = scanner.nextDouble();

        System.out.println("Enter value for f");
        double f = scanner.nextDouble();

        LinearEquation eqn = new LinearEquation(a,b,c,d,e,f);
        if (!eqn.isSolvable()) {
            System.out.println("The equation has no solution");
        } else {
            System.out.println("Solving...");
            System.out.println("X is: " + eqn.getX() +  ",Y is " + eqn.getY());

        }


//LINEAR EQN TEST

double a = 1.0; double b = 2.0; double c = 3.0;
        double d = 5.0; double e = 6.0; double f = 7.0;

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
        if (equation.isSolvable()) {
            System.out.println("x is " +
                    equation.getX() + " and y is " + equation.getY());
        }
        else {
            System.out.println("The equation has no solution");
        }

        LinearEquation equation2 = new LinearEquation(1.25, 2.0, 2.0, 4.2, 3.0, 6.0);
        if (equation2.isSolvable()) {
            System.out.println("x is " + equation2.getX() + " y is " + equation2.getY());
        }

        LinearEquation equation3 = new LinearEquation(1.0, 2.0, 2.0, 4.0, 3.0, 6.0);
        System.out.println(equation3.isSolvable());


//TRIANGLE
Triangle myTri = new Triangle();
        myTri.setColor("red");
        myTri.setFilled(true);
        System.out.println(myTri);
        System.out.println(myTri.isFilled());

        Triangle myTri2 = new Triangle(2.0, 4.0, 5.5);
        System.out.println(myTri2);
        System.out.println("area : " + myTri2.getArea() + " perimeter: " + myTri2.getPerimeter());


//Withdrawal acc

/*CheckingAccount myCheckAcc = new CheckingAccount(1024, 8000.0);
        myCheckAcc.deposit(2000);
        myCheckAcc.withdraw(15000);

        System.out.println(myCheckAcc.getBalance());
        myCheckAcc.withdraw(200);
        System.out.println(myCheckAcc.getBalance());
        myCheckAcc.deposit(7000);
        myCheckAcc.withdraw(200);
        System.out.println(myCheckAcc.getBalance());


        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " +
                account.getMonthlyInterest());




//HASHMAP
System.out.println(Pset1.isAllCharacterUnique("abcdefghijklmnopqrstuvABC"));
        System.out.println(Pset1.isAllCharacterUnique("abcdefgghijklmnopqrstuvABC"));
        System.out.println(Pset1.isPermutation("@ab", "a@b"));
        System.out.println(Pset1.isPermutation("abcd", "bcdA"));


                */




