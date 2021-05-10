package com.company;
class A
{
    void display1()
    {
        System.out.println("j");
    }
}
class B extends A
{
    void display2()
    {
        System.out.println("A");
    }
}
class C extends B
{
    void display3()
    {
        System.out.println("V");
    }
}
public class D extends C
{
    void display4()
    {
        System.out.println("A");
    }

    public static void main(String[] args)
    {
        D d=new D();
        d.display1();
        d.display2();
        d.display3();
        d.display4();
    }
}



