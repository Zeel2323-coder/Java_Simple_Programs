package com.company;

public class One_D_array
{
    public static void main(String[] args)
    {

        /*Method 1*/

        int a[]=new int [5] ;
        a[0] = 10;
        a[1] = 11;
        a[2] = 12;
        a[3] = 13;
        a[4] = 14;

        for (int i=0;i <= a.length;i++)
        {
            System.out.println(a[i]);
        }

        /*Method 2*/

        int b[]={1,2,3,4,5,6,7,8,9,0};
        for (int j=0;j<b.length;j++)
        {
            System.out.println(b[j]);
        }
    }
}
