package com.company;

public class Main {

    public static void main(String[] args) {
	// Training session 25-03-2022
     task1();
     task2();
     task3();
     task4();
     task5();

    }
    static void task1(){
        //abc

        int intVar1 = 2, intVar2 = 3;

        short shortSum = (short)(intVar1 + intVar2);
        System.out.println(shortSum);

        //d
        System.out.println(shortSum++);//5
        System.out.println(shortSum);//6
        System.out.println(++shortSum);//7

        //ef
        byte byteSum = (byte)(intVar1+intVar2);
        System.out.println(byteSum);

        //g
        System.out.println(++byteSum);//6
    }
    static void task2(){

        float number = 13.43f;

        //1
        double roundDown = Math.floor(number);
        System.out.println(roundDown);

        //2
        int rounded = Math.round(number);
        System.out.println(rounded);

        //3
        double roundUp = Math.ceil(number); //in formula it is shown that we have to use double
        System.out.println(roundUp);
    }
    static void task3(){
        //Values shown in radians
        //sin 45
        System.out.println(Math.sin(45));
        //cos 45
        System.out.println(Math.cos(45));
        //tan 45
        System.out.println(Math.tan(45));
        //asin 45
        System.out.println(Math.asin(45));
        //acos 45
        System.out.println(Math.acos(45));
        //atan 45
        System.out.println(Math.atan(45));
        //atan2 45; 55 (for atan2 there have to be two coordinates)
        System.out.println(Math.atan2(45,55));
    }
    static void task4 (){
        //Increment and decrement operators
        int a = 5;
        System.out.println("\nNew value of a: " + ++a); //6
        double b = 6.66d;
        System.out.println("New value of b: " + --b); //5.66

        //Bitwise Complement operator
        int c = 5;
        int NewValue = ~ c;
        System.out.println("New value of c: " + NewValue);

        //Arithmetic operator
        double Multiplication = a * b;
        System.out.println("a * b =" + Multiplication);

        //Relational operator
        System.out.println(a != b); //true
        System.out.println(a >= b); //true
        System.out.println(a == c); //false

        //Bitwise operator
        //Bitwise inclusive OR (|)
        int x = 3, y = 9;
        System.out.println("x | y =" + (x | y));

        //Conditional operator
        System.out.println(a > c && c <= b); //both sides are true
    }
    static void task5(){


    }
}
