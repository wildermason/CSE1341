/*
Author: Wilder Mason
Student ID: 4732253
Date: September 7, 2017
Lab 2-Fall 2017
*/
import java.util.Scanner; //Imports the scanner class

public class Circle //public method named "Circle"
{
    public static void main(String[] args) //main method
    {
        Scanner kb = new Scanner(System.in); //New Scanner named "kb"
        System.out.printf("\nWhat is the radius of the circle?  "); //asking the radius of the circle
        double rad = kb.nextDouble(); //Assigning the double "rad" to the next double entered and represents the radius
        double area = Math.PI * Math.pow(rad, 2); //Calculating the area of the circle by using pi multiplied by the square of the radius
        double circ = Math.PI * rad * 2; //Calculating the circumference and assigning it to "circ"
        System.out.printf("The area of the circle is %2.2f\n",area); //Printing out the area rounded to 2 decimal places
        System.out.printf("The circumfrence of the circle is %2.2f",circ); //Printing out the circumference rounded to 2 decimal places
        System.out.println();  //adding some space

        System.out.printf("\nEnter the circumfrence of the circle?  "); //Asking for the circumference of the circle
        double circ2 = kb.nextDouble(); //The new circumference is assigned to "circ2"
        double dia = circ2 / Math.PI; //Calculating the diameter and assigning it to "dia"
        System.out.printf("The diameter of the circle is %2.2f",dia); //Printing out the diameter rounded to 2 decimal places
    }
}
