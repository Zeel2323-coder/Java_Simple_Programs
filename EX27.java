package com.company;
class room{
    int rn;
    String ry;
    float roomArea;
    boolean acMachine;

    void setDATA(int rn,String ry,float area,boolean ac)
    {
        int roomn=rn;
        String roomy=ry;
        float roomArea=area;
        boolean acMachine=ac;
    }
    void Display()
    {
        System.out.println("The room no is "+ rn);
        System.out.println("The room type is "+ ry);
        System.out.println("The room area is "+ roomArea);
        String s = (acMachine) ? "yes" : "no";
        System.out.println("The room is "+ s);
    }
}

public class EX27
{
    public static void main(String[] args) {
        room room1 = new room();
        room1.setDATA(101,"Delux",240.0f,true);
        room1.Display();
    }
}
