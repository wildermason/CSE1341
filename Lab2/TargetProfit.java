/*
Author: Wilder Mason
Date: September 7, 2017
Lab 2-Fall 2017
*/
import java.util.Scanner; //Imports the Scanner class to read keyboard input

public class TargetProfit //public class named "TargetProfit"
{
    public static void main(String[] args)  //main method
    {
        Scanner kb = new Scanner(System.in); //New scanner named "kb"
        System.out.println(); //Just making things look nice
        System.out.print("What is the profit margin target (in %)?  ");  //Asking for the target profit margin in percent
        double marg = kb.nextDouble(); // new double "marg" to represent the target profit margin entered by the user
        System.out.print("\nWhat is the cost of the product?  $"); //Asking the cost of the product
        double cost = kb.nextDouble(); //new double "cost" to represent the cost of the product
        double price = cost*(1 + (marg/100)); //new double "price" assigned to calculation for the target price
        System.out.printf("The target price is $%2.2f.",price); //Prints out the target price rounded to 2 decimal places
        System.out.println(); //Adding some separation
    }
}