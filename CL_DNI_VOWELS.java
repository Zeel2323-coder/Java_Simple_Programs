package com.company;
import java.util.Random;
public class CL_DNI_VOWELS
{
    public static void main(String[] args)
    {
        // Method 1 //

        Random r=new Random();
        char c[]=new char[5];
        for (int i=0;i<5;i++)
        {
            c[i]=(char)(r.nextInt(26)+'A');
        }
        for (int i=0;i<5;i++)
        {
            switch(c[i])
            {
                case 'A':
                    System.out.println("Sorry this letter is a vowel");
                    break;

                case 'E':
                    System.out.println("Sorry this letter is a vowel");
                    break;

                case 'I':
                    System.out.println("Sorry this letter is a vowel");
                    break;

                case 'O':
                    System.out.println("Sorry this letter is a vowel");
                    break;

                case 'U':
                    System.out.println("Sorry this letter is a vowel");
                    break;

                default :
                    System.out.println(c[i]);
                    break;

            }
        }


        // Method 2 //


    /*    int counter=0;
        int num=5;
        char symbol=0;

        while(counter<num)
        {
            symbol=(char)(26*Math.random()+'A');
            switch (symbol)
            {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    break;

                default:
                    System.out.println(symbol + " ");
                    counter++;
                    break;
            }
        }*/
    }
}
