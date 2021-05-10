package com.company;

public class PRO17
{
    public static void main(String[] args)
    {
        simple ab=new simple();
        ab.display('Z');
        ab.display('Z',123456);
    }
}
class simple
{
    public void display(char c)
    {
        System.out.println(c);
    }
    public void display(char a,int b)
    {
        System.out.println(a+" "+b);
    }

}
