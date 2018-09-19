/*
Author: Wilder Mason
Student ID: 47322253
Date: September 29, 2017
Lab 3-Fall 2017
*/

import java.util.Scanner; //Importing the scanner class

public class SumAndAverage //Class header
{
    public static void main(String[] args) //Main method
    {
        System.out.println("1. Display the sum of the natural numbers from 1 to 100."); //User choice  1. The option to display sum of numbers from 1 to 100
        System.out.println("2. Display the average of the natural numbers from 1 to 100."); //User choice 2. The option to display the average of the numbers 1 to 100
        Scanner kb = new Scanner(System.in); //New scanner named kb
        System.out.println("Please select and option: 1 or 2"); //Asking for the user to input their choice
        int choice = kb.nextInt(); //Assigning int named choice  to the next input by the user, which will be their choice
        int sum = 0; //Assigning the variable "sum" to 0
        for(int i = 1; i <=100; i++) //For Loop to calculate the sum of the numbers from 1 to 100
        {
            sum += i;
        }
        double average = (double)sum/100; //Assigning the double "average" to the average of the numbers from 1 to 100

        if(choice == 1) //If the user chooses choice 1, this block will execute
        {
            System.out.println("The sum of the natural numbers from 1 to 100 is " + sum); //Displays the sum of the numbers 1 to 100 in an easy to read format
        }
        else if(choice == 2) //If the user chooses choice choice 2, this block will execute
        {
            System.out.println("The average of the natural numbers from 1 to 100 is " + average); //Displays the average of the numbers from 1 to 100 in an easy to read format
        }
        else //If the user cant read, this block will execute
        {
            System.out.println("You can't read!"); //Displays the user's incompetance in an easy to interpret format
        }
    }
}