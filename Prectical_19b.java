package com.company;
class AAAAA
{
    void display1()
    {
        System.out.println("J");
    }
}
class BBBB extends AAAAA
{
    void display2()
    {
        System.out.println("A");
    }
}
class CCCC extends BBBB
{
    void display3()
    {
        System.out.println("V");
    }
}
class Practical_19b extends CCCC
{
    void display4()
    {
        System.out.println("A");
    }
    public static void main(String[] args)
    {
        Practical_19b obj = new Practical_19b();
        obj.display1();
        obj.display2();
        obj.display3();
        obj.display4();
    }
}
