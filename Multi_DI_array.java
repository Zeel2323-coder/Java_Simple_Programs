package com.company;

public class Multi_DI_array
{
    public static void main(String[] args)
    {
        //int a[][]= new int[4][4];

        //int a [][] = {{1,2,3} {4,5,6} {7,8,9}}; <---- Second Type of Initialization

        /*Assign Value for 1ST row of an Array
        a[0][0]=1;
        a[0][1]=2;
        a[0][2]=3;

        /*Assign Value for 2ST row of an Array
        a[1][0]=4;
        a[1][1]=5;
        a[1][2]=6;

        /*Assign Value for 2ST row of an Array
        a[2][0]=7;
        a[2][1]=8;
        a[2][2]=9;

        for(int i=0;i<3;i++)
        {
                     for (int j=0;j<3;j++)
                     {
                      System.out.print(""+a[i][j]);
                     }
                     System.out.println("");

        }*/

        int aa [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for(int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            {
                System.out.print("  "+aa[i][j]);
            }
            System.out.println("");

        }


    }
}
