package com.company;

import java.util.Scanner;

public class Calculate_Studens_Per {
    public static void main(String[] args) {
/* Method 1 */
        /*
        int ab = 50, bc = 60, cd = 70, de = 80, ef = 90, fg = 100;
        float per;
        System.out.println("Subject Marks :");
        System.out.println(ab);
        System.out.println(bc);
        System.out.println(cd);
        System.out.println(de);
        System.out.println(ef);
        System.out.println(fg);


        per = ((ab + bc + cd + de + ef + fg) * 100) / 600;
        System.out.println("Total Percentage is :" + per);
        */


        /*Method 2*/
/*
        int a[] = {1, 2, 3, 4, 5, 6};
        a[0] = 50;
        a[1] = 60;
        a[2] = 70;
        a[3] = 80;
        a[4] = 90;
        a[5] = 100;
        System.out.println("Enter Subject Marks:");
        for (int i = 0; i <= a.length; i++)
        {

            System.out.println(a[i]);

        }
        */

        /*Method 3 */

      /*Scanner sc= new Scanner(System.in);
      int mkrr[]=new int [5];
      int j;
      float sum=0,per;
      System.out.print("Enter Marks For 6 Subject :");
         for (j=0;j<5;j++)
         {
         mkrr[j]=sc.nextInt();
         sum=sum+mkrr[j];
         }
            per=((sum*100)/600);
         System.out.println("total per is "+per);*/


        /*Method 4 */
        Scanner s=new Scanner(System.in);

        System.out.print("Enter Marks Of Maths : ");
        double maths=s.nextDouble();

        System.out.print("Enter Marks Of Java : ");
        double java=s.nextDouble();

        System.out.print("Enter Marks Of SE : ");
        double se=s.nextDouble();

        System.out.print("Enter Marks Of CO : ");
        double co=s.nextDouble();

        System.out.print("Enter Marks Of OS : ");
        double os=s.nextDouble();

        System.out.print("Enter Marks Of WT : ");
        double wt=s.nextDouble();
        System.out.println("");

        double per;
        System.out.println("Subjects Marks");
        System.out.println("");
        System.out.println("Marks Of Maths : "+maths);
        System.out.println("Marks Of Java : "+java);
        System.out.println("Marks Of SE : "+se);
        System.out.println("Marks Of CO : "+co);
        System.out.println("Marks Of OS : "+os);
        System.out.println("Marks Of WT : "+wt);

        per=(((maths+java+se+co+os+wt)*100)/500);
        System.out.println("Toatal Percentage : "+per);
    }
}
