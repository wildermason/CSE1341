/*
Name: Wilder Mason
Student ID: 47322253
Date: November 10, 2017
Lab 6-Fall 2017
*/

import java.util.Random;

public class Die //new class Die
{
    private int value; //will be the value of the die

    public Die() //constructor
    {
        value = 1; //assigns value to default value of 1
    }
    public int roll() //simulates rolling a dice
    {
        Random r = new Random(); //new Random named r
        return r.nextInt(6)+1; //returns a random number from 1 to 6
    }
    public void setValue(int x) //sets the value of value
    {
        value = x;
    }
    public int getValue() //returns the value of value
    {
        return value;
    }

    public String toString() //To string method for this class
    {
        return "Die with value: " + value;
    }
}
