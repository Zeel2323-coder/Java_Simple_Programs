package com.company;

class Person
{
    void message()
    {
        System.out.println("Welcome");
    }
}
class Student16 extends Person
{
    void message()
    {
        System.out.println("Welcome to Java");
    }
    void display()
    {
        message();
        super.message();
    }
}
public class EX23_3
{
    public static void main(String[] args)
    {
        Student16 s=new Student16();
        s.display();
    }
}
