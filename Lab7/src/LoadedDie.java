/*
Author: Wilder Mason
Student ID: 47322253
Date: October 30, 2017
Lab 7-Fall 2017
*/
import java.util.Random;

public class LoadedDie extends Die
{
    private int loadedSide;

    public LoadedDie() //constructor for loadedDie
    {
        loadedSide = roll();
    }
    public int roll() //roll method for the loaded die
    {
        Random r = new Random(); //new random
        boolean rand = r.nextBoolean(); //rand is assigned to a random boolean
        if(rand) //if its true, return the loaded side
        {
            return loadedSide;
        }
        else //if false
        {
            return r.nextInt(6)+1; //returns a random number from 1 to six
        }
    }
    public void setLoadedSide(int x) //sets the loaded side
    {
        loadedSide = x;
    }
    public int getLoadedSide() //returns the loaded side
    {
        return loadedSide;
    }
    public String toString() //to string method
    {
        return "loaded die side is: " + loadedSide;
    }
}
