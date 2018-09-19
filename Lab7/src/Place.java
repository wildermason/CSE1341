/*
Name: Wilder Mason
Student ID: 47322253
Date: November 13, 2017
Lab 7-Fall 2017
 */

public class Place
{
    private String name; //will store name of the place
    private String activity; //will store the action to be performed at location
    private int value; //will store the money value of location

    public Place(String str, String str2, int x) //constructor
    {
        name = str;
        activity = str2;
        value = x;
    }
    public void setValue(int x) //sets the value of value
    {
        value = x;
    }
    public void setName(String str) //Sets the name of the location
    {
        name = str;
    }
    public void setActivity(String str) //sets the activity
    {
        activity = str;
    }
    public int getValue() //returns the money value of the location
    {
        return value;
    }
    public String getName() //returns the name of location
    {
        return name;
    }
    public String getActivity() //returns the activity
    {
        return activity;
    }
    public int getPlaceValue(int x) //returns value of the location
    {
        return x ;
    }

    public String toString() //the toString method for this class
    {
        return " stopped at " + name + " to " + activity;
    }
}
