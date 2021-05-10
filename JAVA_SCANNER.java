package com.company;

import java.util.*;
public class JAVA_SCANNER {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Username:");
        String username;
        username=sc.nextLine();
        System.out.println("Username is :"+username);
    }
}
