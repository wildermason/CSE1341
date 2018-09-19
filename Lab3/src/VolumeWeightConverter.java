/*
Author: Wilder Mason
Student ID: 47322253
Date: September 29, 2017
Lab 3-Fall 2017
*/

import java.util.Scanner; //Imports scanner

public class VolumeWeightConverter //new calss named VolumeWeightConverter
{
    public static void main(String[] args) //main method
    {
        boolean stop = false; //new boolean variable named "stop" that will control when the while loop stops
        while(stop == false) //While loop that keeps the menu repeating until the exit option is chosen
        {
            Scanner kb = new Scanner(System.in); //new Scanner
            System.out.println("\nVOLUME AND WEIGHT CONVERTER\n"); //Name of the converter
            System.out.println("1. Gallons to Liters"); //Option 1. Will convert gallons to liters
            System.out.println("2. Liters to Gallons"); //option 2 Will convert liters to gallons
            System.out.println("3. Pounds to Kilograms"); //Option 3. Will convert pounds to kilograms
            System.out.println("4. Kilograms to Pounds"); //Option 4. Will convert kilograms to pounds
            System.out.println("\n0. Exit"); //option 0. Exits the program
            System.out.print("\nChoose: "); //Asks the user for their choice of conversion to run
            int choice = kb.nextInt(); //variable choice stores their choice
            if(choice == 1) //Executes if the user chooses option 1
            {
                System.out.print("Enter gallons: "); //Asks for number of gallons
                double gallons = kb.nextDouble();  //assigns that number of gallons to a double named "gallons"
                System.out.printf(" %.2f gallons = %.2f liters", gallons, gallonsToLiters(gallons)); //prints out the original number of gallons and the conversion, all rounded to 2 decimal places
            }
            else if(choice == 2) //Executes if the user chooses option 2
            {
                System.out.print("Enter liters: "); //Asks for number of liters to be converted
                double liters = kb.nextDouble(); //Stores that as a double named "liters"
                System.out.printf(" %.2f liters = %.2f gallons", liters, litersToGallons(liters)); //prints out the original number of liters and the conversion to gallons, rounded to 2 decimal places
            }
            else if(choice == 3) //Executes if the user chooses option 3
            {
                System.out.print("Enter pounds: "); //Asks for number of pounds to be converted
                double pounds = kb.nextDouble(); //Stores that as a double named "pounds"
                System.out.printf(" %.2f pounds = %.2f kilograms", pounds, poundsToKilograms(pounds)); //prints out the original number of pounds and the conversion to kilograms, rounded to 2 decimal places
            }
            else if(choice == 4) //Executes if the user chooses option 4
            {
                System.out.print("Enter kilograms: "); //Asks for number of kilograms to be converted
                double kilograms = kb.nextDouble(); //Stores that number as a double named "kilograms"
                System.out.printf(" %.2f kilograms = %.2f pounds", kilograms, kilogramsToPounds(kilograms)); //prints out the original number of ilograms and the conversion to pounds, rounded to 2 decimal places
            }
            else if(choice == 0) //Executes of the user chooses option 0, the exit option
            {
                stop = true; //assigns stop to true to break out of the while loop
                break; //breaks out of the if..else if..else loop
            }
            else //Executes if the user enters an invalid option
            {
                System.out.println("NOT A VALID CHOICE!"); //Tells the user that they chose an invalid option
            }
            System.out.println(); //adding some space
        }

    }

    public static double gallonsToLiters(double g) //method to convert gallons to liters. Takes on parameter and returns a double.
    {
        double gToL = g * 3.785; //Assigns gToL to the conversion for gallons to liters
        return gToL;  //returns gToL
    }

    public static double litersToGallons(double l) //method to convert liters to gallons. takes one parameter and returns a double
    {
        double lToG = l * 0.264; //Assigns lToG to the conversion of liters to gallons
        return lToG; //returns lToG
    }

    public static double poundsToKilograms(double p) //method to convert pounds to kilograms. Takes one parameter and returns a double
    {
        double pToK = p * 0.454; //assigns pToK to the conversion of pounds to kilograms
        return pToK; //returns pToK
    }

    public static double kilogramsToPounds(double k) //method to convert kilograms to pounds. Takes one pareter and returns a double
    {
        double kToP = k * 2.205; //Assigns kToP to the conversion of kilograms to pounds
        return kToP; //returns kToP
    }
}
