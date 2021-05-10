package com.company;
abstract class View
{
    View()
    {
        System.out.println("View is created");
    }
    abstract void run();
    void show()
    {
        System.out.println("Show Is created");
    }
}
class Rtb extends View
{
    void run()
    {
        System.out.println("Running Safely");
    }
}
class abstract_class
{
    public static void main(String[] args)
    {
        View obj=new Rtb();
        obj.run();
        obj.show();
    }
}