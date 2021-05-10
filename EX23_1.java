package com.company;

class Vehicle
{
    int speed=50;
}
public class EX23_1 extends Vehicle
{
    int speed=100;
    void display()
    {
        System.out.println(super.speed);
    }
    public static void main(String[] args)
    {
       EX23_1 b=new EX23_1();
       b.display();
    }
}
