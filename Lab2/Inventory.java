/*
Author: Wilder Mason
Date: September 8, 2017
Lab 2-Fall 2017
*/
import java.util.Scanner; //Imports the Scanner class

public class Inventory //New public class named "Inventory"
{
    public static void main(String[] args) //"main method"
    {
        Scanner kb = new Scanner(System.in); //Creating a new scanner named "kb"
        System.out.println("Item 1"); //Saying this is info for Item 1
        System.out.print("Enter UPC:  "); //Asking for item 1 UPC
        int upc1 = kb.nextInt(); //Assigns variable "upc1" to the upc code of item 1
        System.out.print("Enter quantity:  "); //Asks for the quantity of item 1
        int quan1 = kb.nextInt(); // Assigns variable "quan1" to the quantity of item 1
        System.out.print("Enter cost:  $"); //Asks the cost of item 1
        double cost1 = kb.nextDouble(); //Assigns the variable "cost1" to the cost of item 1
        System.out.print("Enter price:  $"); //Asks for the price of item 1
        double price1 = kb.nextDouble(); //Assigns the variable "price1" to the price of item 1
        double profm1 = quan1*(price1-cost1); //Assigns the variable "profm1" to the profit in dollars of item 1
        double profp1 = (profm1 / (double)(quan1*cost1))*100;  //Assigns the variable "profp1" to the percent profit of item 1

        System.out.println("\nItem 2"); //Saying this is info for Item 2
        System.out.print("Enter UPC:  ");   //Asking for item 2 UPC
        int upc2 = kb.nextInt();   //Assigns variable "upc2" to the upc code of item 2
        System.out.print("Enter quantity:  ");   //Asks for the quantity of item 2
        int quan2 = kb.nextInt();  // Assigns variable "quan2" to the quantity of item 2
        System.out.print("Enter cost:  $");   //Asks the cost of item 2
        double cost2 = kb.nextDouble();  //Assigns the variable "cost2" to the cost of item 2
        System.out.print("Enter price:  $"); //Asks for the price of item 2
        double price2 = kb.nextDouble();  //Assigns the variable "price2" to the price of item 2
        double profm2 = quan2*(price2-cost2);  //Assigns the variable "profm2" to the profit in dollars of item 2
        double profp2 = (profm2 / (double)(quan2*cost2))*100;   //Assigns the variable "profp2" to the percent profit of item 2

        System.out.println("\nItem 3");  //Saying this is info for Item 3
        System.out.print("Enter UPC:  ");  //Asking for item 3 UPC
        int upc3 = kb.nextInt();  //Assigns variable "upc3 to the upc code of item 3
        System.out.print("Enter quantity:  ");  //Asks for the quantity of item 3
        int quan3 = kb.nextInt();  // Assigns variable "quan3" to the quantity of item 3
        System.out.print("Enter cost:  $");  //Asks the cost of item 3
        double cost3 = kb.nextDouble();  //Assigns the variable "cost3" to the cost of item 3
        System.out.print("Enter price:  $");   //Asks for the price of item 3
        double price3 = kb.nextDouble();   //Assigns the variable "price3" to the price of item 3
        double profm3 = quan3*(price3-cost3);   //Assigns the variable "profm3" to the profit in dollars of item 3
        double profp3 = (profm3 / (double)(quan3*cost3))*100;  //Assigns the variable "profp3" to the percent profit of item 3

        double proft = profm1 + profm2 + profm3;  //Calculating the total profit of all 3 items

        System.out.printf("%7s  %7s  %7s  %7s  %7s  %7s ", "UPC Code", "Quantity", "Cost", "Price", "$ Profit", "Profit %");  //Prints out the headers of the table
        System.out.printf("\n%8d   %7d   $%5.2f   $%5.2f  $ %6.2f   %5.2f%%", upc1, quan1, cost1, price1, profm1, profp1);  //prints out all the info for item 1 in a table like format
        System.out.printf("\n%8d   %7d   $%5.2f   $%5.2f  $ %6.2f   %5.2f%%", upc2, quan2, cost2, price2, profm2, profp2);  //prints out all the info for item 2 in a table like format
        System.out.printf("\n%8d   %7d   $%5.2f   $%5.2f  $ %6.2f   %5.2f%%", upc3, quan3, cost3, price3, profm3, profp3);  //prints out all the info for item 3 in a table like format
        System.out.printf("\nTotal potential profit: $%1.2f",proft); //prints out the total profit
    }
}