package com.company;

class overload1
{
    void add (int m,int n)
    {
        int sum=m+n;
        System.out.println("Sum of m+n is "+sum);
    }
    void add (int a,int b,int c)
    {
        int sum=a+b+c;
        System.out.println("Sum of a+b+c is "+sum);
    }
    void add (double a,double b)
    {
        double sum=a+b;
        System.out.println("Sum of a+b is "+sum);
    }
    void add(String s1,String s2)
    {
        String s=s1+s2;
        System.out.println(s);
    }

}
public class Overloadingfunc
{
    public static void main(String[] args)
    {
      overload1 obj=new overload1();
      obj.add(12,19);
      obj.add(12,6,18);
      obj.add(6.2,1.8);
      obj.add("Example:","Method Oveloading");
    }
}
