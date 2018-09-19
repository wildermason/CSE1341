/*
Author: Wilder Mason
Date: September 29, 2017
Lab 3-Fall 2017
*/
public class CheckerBoard //new class named CheckerBoard
{
    public static void main(String[] args) //main method
    {
        for(int i = 0; i < 7; i++) //first for loop. controls the rows
        {
            for(int j = 0; j < 14; j++) //second for loop. Controls the columns
            {
                if(i%2 == j%2) //Execute if it is an even row and even column
                {
                    System.out.print("# "); //Prints a  # and a space
                }

            }
            System.out.println();//Prints a new line
            if(i%2==0)//If it is an even row, this executes
            {
                System.out.print(" "); //prints a space
            }
        }
    }
}
