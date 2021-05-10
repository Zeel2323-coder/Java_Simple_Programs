package com.company;

import java.util.Scanner;

public class CHECK_VOWELS
{
    public static void main(String[ ] arg)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Any String:");
        int v=0 , c=0;
        String str=s.nextLine();

        // str=str.toLowerCase(Locale.ROOT);

        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u' || ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')
            {
               v++;
            }
            else if (ch>='a'&& ch<='z')
            {
                c++;
            }
        }
        System.out.println("Entered Sring :-"+str);
        System.out.println("No of Vowels are :- "+v);
        System.out.println("No of Vowels are :- "+c);
        System.out.print("Total Constant is ");
        System.out.println(str.length());
    }
}