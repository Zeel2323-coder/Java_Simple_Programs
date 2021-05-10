package com.company;
// Write program to convert a char array to a string in Java. Study Array and String.
public class CONVERT_CHAR_ARRAY_TO_STRING
{
    public static void main(String[] args)
    {
        // Method 1: Using String object
        char[] ch = {'J', 'A', 'V', 'A', ' ', 'P', 'R', 'O', 'G', 'A', 'M' , 'M'};
        String str = new String(ch);
        System.out.println(str);

        // Method 2: Using value Of method
        // String str2 = String.valueOf(ch);
        // System.out.println(str2);
    }
}
