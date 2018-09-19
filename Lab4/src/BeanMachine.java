/*
 * Author: Wilder Mason
 * Student ID: 47322253
 * Date: October 10, 2017
 * Lab 4-Fall 2017
 */

import java.util.Scanner; //imports the Scanner class
import java.util.Random; //Imports the Random class

public class BeanMachine //New class "BeanMachine"
{
    public static void main(String[] args) //Main method
    {
        Scanner kb = new Scanner(System.in); //New Scanner named "kb" to read the user input
        System.out.print("Enter the number of balls to drop: "); //Asking for the numbers of balls to simulate in the machine
        int ballNumber = kb.nextInt(); //Assigns the int "ballNumber" to what the user enters for number of balls to drop
        System.out.print("Enter number of slots in the bean machine: "); //Asks for the number of slots in the machine
        int slotNumber = kb.nextInt(); //Assigns the int "slotNumber" to what the user chooses for the number of slots in the machine

        int[] slots = new int[slotNumber]; //Creates an int array named "slots" with a number of slots equal to the number the user chose. Keeps track of number of balls in each slot
        Random r = new Random(); //Creates a new random named r
        int currentSlot = 0; //Sets the current slot to 0, the first slot since arrays start at 0
        int iteration = 0; //Sets the iteration to 0.

        while(iteration != ballNumber) //While iterations is not equal to the number of balls to be dropped this will run
        {
            for(int i = 0; i < slotNumber-1; i++) //for loop that will print the path of the ball
            {
                int direction = r.nextInt(2); //Generates a random number from 0 to 1
                if(direction == 0) //If its 0, the ball will go left
                {
                    System.out.print("L"); //Prints out an L showing that the ball went left
                }
                if(direction == 1) //If its 1, ball goes right
                {
                    System.out.print("R"); //prints a R showing the ball went right
                    currentSlot += 1; //Increments current slot up by one because the ball went right
                }
            }
            slots[currentSlot] += 1; //Adds 1 to the element in the array that corresponds to the slot the ball is in.
            System.out.println(); //Skips to the next line once a ball has fully gone through the machine
            iteration++; //increments the iteration up on
            currentSlot = 0; //Sets current slot back to 0 for the next ball
        }
    }
}
