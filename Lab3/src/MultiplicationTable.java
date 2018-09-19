/*
Author: Wilder Mason
Student ID: 47322253
Date: September 29, 2017
Lab 3-Fall 2017
*/

public class MultiplicationTable //New class MultiplicationTable
{
    public static void main(String[] args) //main method
    {
        System.out.print("     "); //Creating space for the header
        for(int h = 1; h <= 9; h++) //For loop for creating the header
        {
            System.out.printf("%3d", h); //Creates the header 1 through 9 with space in-between
        }

        System.out.println("\n---------------------------------"); //Divider Line
        for(int i = 1; i < 10; i++) //For loop for the table for the rows
        {
            System.out.printf("%3d |",i); //Makes the row labels
            for(int j = 1; j < 10; j++) //For loop for the columns
            {
                System.out.printf("%3d", i*j); //The values for the table equal to i*j
            }
            System.out.println(); //New line
        }
    }
}