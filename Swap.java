package com.company;

public class Swap {
    public static void main(String[] args) {


        /*With variable*/

        System.out.println("Two value x and y ");
        int x=10;
        int y=20;
        int temp;
        System.out.println("After Swaping Value is x and y " +x+ " and " +y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("After Swaping Value is x and y " +x+ " and " +y);
        System.out.println("");

        /*Without Variale*/

        System.out.println("Two value a and b ");

        int a=100;
        int b=200;

        a  = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swaping Value is a and b " +a+ " and " +b);

        System.out.println("After Swaping Value is a and b " +a+ " and " +b);


    }
}

