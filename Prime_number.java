package com.company;
import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args)
    {
        System.out.print("Enter Number : ");
        Scanner SC=new Scanner(System.in);
        int n=SC.nextInt();


        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }
        else
        {
            for(i=2;i<=m;i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }

            }
            if(flag==0)
            {
                System.out.println(n+" is prime number");
            }
        }


        System.out.println("--------------------------------------------------------------------");

        /*With Other Logic*/


        System.out.print("Enter Number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean a=false;

        for (int j=2;j<=num/2;j++)
        {
            if (num%j==0)
            {
                a=true;
                break;
            }
        }
        if(!a)
        {
            System.out.println(num +" is prime number");
        }
        else
        {
            System.out.println(num +" is not prime number");
        }
    }
}
