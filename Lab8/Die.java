/*
Name: Wilder Mason
Date: December 1, 2017
Lab 7-Fall 2017
*/

import java.util.Random;

public class Die
{
    private int value;

    public Die()
    {
        value = 1;
    }
    public int roll()
    {
        Random r = new Random();
        return r.nextInt(6)+1;
    }
    public void setValue(int x)
    {
        value = x;
    }
    public int getValue()
    {
        return value;
    }

    public String toString()
    {
        return "Die with value: " + value;
    }
}
