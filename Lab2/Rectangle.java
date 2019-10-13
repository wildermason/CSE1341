/*
Author: Wilder Mason
Date: September 7, 2017
Lab 2-Fall 2017
*/
import java.util.Scanner; //Imports the Scanner class to read keyboard input

public class Rectangle //public class named "Rectangle"
{
    public static void main(String[] args) //Main method
    {
        Scanner kb = new Scanner(System.in); //Initializes a new scanner named "kb"
        System.out.print("What is the length of the rectangle?  "); //asks the length of the rectangle
        int len = kb.nextInt(); //New variable named "len" to represent the length of the rectangle and assigned to the next integer input
        System.out.printf("What is the width of the rectangle?  "); // asks the width of the rectangle
        int wid = kb.nextInt(); //New variable named "wid" to represent the width of the rectangle and assigned to the next integer input
        int area = len * wid; //New variable named "area" assigned to the product of wid and len(width and length)
        int peri = 2*(wid+len); //New variable named "peri" assigned to the calculation for the perimeter of a rectangle
        System.out.printf("The area of the rectangle is %d, and the perimeter is %d.",area ,peri ); //prints out the area and perimiter in an easy to read form
        System.out.println(); //adds an extra blank line just for a more visually appealing approach between this program and the next line in command prompt
    }
}