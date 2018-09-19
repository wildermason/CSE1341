/*
Author: Wilder Mason
Student ID: 47322253
Date: September 29, 2017
Lab 3-Fall 2017
*/

import java.util.Scanner;

public class NaturalNumbers
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = kb.nextInt();
        int counter = 0;
        System.out.println("While loop:");
        while(counter <= num)
        {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println("\nFor loop:");
        for(int i = 0; i <= num; i++)
        {
            System.out.print(i + " ");
        }
    }
}