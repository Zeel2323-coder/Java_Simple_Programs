package com.company;
class Color
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void main(String[] args)
    {
        System.out.println(ANSI_BLUE + "\t\t\t\t-----------------Menu---------------" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "\t\t\t\t|\t\t\t1.Team\t\t\t\t\t| \n  \t\t\t\t|\t\t\t2.Stadium\t\t\t\t|  \n   \t\t\t\t|\t\t\t3.Ticket Booking\t\t|    \n   \t\t\t\t|\t\t\t4.About Us\t\t\t\t|" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "\t\t\t\t------------------------------------\n" + ANSI_RESET);
    }
}