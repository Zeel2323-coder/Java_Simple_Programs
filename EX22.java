package com.company;


interface Printablev
{
    void print();
}
interface Showable
{
    void show();
}

public class EX22 implements Printablev,Showable
{
    public void print()
    {
        System.out.println("Hello");
    }
    public void show()
    {
        System.out.println("Welcome");
    }

    public static void main(String[] args)
    {
        EX22 obj =new EX22();
        obj.print();
        obj.show();
    }
}
