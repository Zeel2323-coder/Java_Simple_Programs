package com.company;
import java.util.Random;
/*Prectical 9*/
public class Display_Random_choice
{
    public static void main(String[] args)
    {
        Random randomnumber = new Random();
        int r=randomnumber.nextInt(6);
        System.out.println("Random Number="+r);
        System.out.println("\n1.Scrambled\n 2.Aggseaffles\n 3.Fruits\n 4.cereal\n 5.toast\n 6.yogurt");
        switch (r)
        {
            case 1:
                System.out.print("Your Selected Choice is Scrambled");
                break;
            case 2:
                System.out.print("Your Selected Choice is Aggseaffles");
                break;
            case 3:
                System.out.print("Your Selected Choice is Fruits");
                break;
            case 4:
                System.out.print("Your Selected Choice is Cereal");
                break;
            case 5:
                System.out.print("Your Selected Choice is Toast");
                break;
            case 6:
                System.out.print("Your Selected Choice is Yogurt");
                break;

            default:
                System.out.print("Invalied Choice");
                break;
        }

    }
}
