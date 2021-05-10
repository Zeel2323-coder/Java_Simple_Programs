package com.company;
import java.util.Random;
public class Random_Number
{
    public static void main(String[] args)
    {
    Random random = new Random();
    int x=random.nextInt(50);
    int y=random.nextInt(1000);
        System.out.println("Rendomaly Generated Integers Values");
        System.out.println(x);
        System.out.println(y);
        System.out.println();
        /*-------------------------------------------------------------------*/
        System.out.println("Randomaly Genrated Double Values");
    double a = random.nextDouble();
    double b = random.nextDouble();
        System.out.println(a);
        System.out.println(b);
        System.out.println();
        /*-------------------------------------------------------------------*/
        System.out.println("Randomaly Genrated float Values");
    float aa = random.nextFloat();
    float bb = random.nextFloat();
        System.out.println(aa);
        System.out.println(bb);
        System.out.println();
        /*-------------------------------------------------------------------*/
        System.out.println("Randomaly Genrated long Values");
    Long aaa = random.nextLong();
    long bbb = random.nextLong();
        System.out.println(aaa);
        System.out.println(bbb);
        System.out.println();
        /*-------------------------------------------------------------------*/
        System.out.println("Randomaly Genrated boolean Values");
    boolean aaaa = random.nextBoolean();
    boolean bbbb = random.nextBoolean();
        System.out.println(aaaa);
        System.out.println(bbbb);
        System.out.println();
        /*-------------------------------------------------------------------*/

    }
}
