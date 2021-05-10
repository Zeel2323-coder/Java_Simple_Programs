package com.company;

import java.util.*;

public class EX35
{
        public static void main(String[] args)
        {
            LinkedList<String> a2=new LinkedList<String>();
            // For Remove a2.remove("Red");
            a2.add("Red");
            a2.add("Green");
            a2.add("Black");
            a2.add("Pink");
            a2.add("Orange");
            System.out.println("The Original Linked List :"+a2);
            Collections.swap(a2,0,2);
            System.out.println("The New Linked List after Swap :"+a2);


        }
}


