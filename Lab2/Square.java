/*
Author: Wilder Mason
Date: September 7, 2017
Lab 2-Fall 2017
*/
import java.util.Scanner;

public class Square
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("What is the length of the square?  ");
        double len = Math.pow(kb.nextDouble(), 2);
        System.out.printf("The area of the square is %f", len);
        System.out.println();
    }
}
