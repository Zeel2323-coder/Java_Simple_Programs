package com.company;

public class All_Loops {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");

        /*Loops*/


        System.out.println("-------------------------------------");
        /*For loop*/
        System.out.println("Loops");
        System.out.println("-------------------------------------");

        System.out.println("For loops ");
        int i=1;
        for (i=1;i<=10;i++)
        {
            System.out.println(i);
        }



        System.out.println("-------------------------------------");
        /*For loop using break*/
        System.out.println("For Loop using Break & Continue");
        System.out.println("-------------------------------------");

        for (int j=1;j<=10;j++)
        {
            if (j==5)
            {
               continue;
            }
            System.out.println(j);
        }




        System.out.println("-------------------------------------");
        System.out.println("While loops ");
        /*while loop */
        System.out.println("-------------------------------------");
        int ii = 1;
        while (ii <= 10) {
            System.out.println(ii);
            ii++;
        }
        System.out.println("-------------------------------------");



    }
}
