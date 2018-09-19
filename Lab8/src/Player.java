/*
Name: Wilder Mason
Student ID: 47322253
Date: December 1, 2017
Lab 8-Fall 2017
 */

public class Player
{
    private String name; //will be the player's name
    private int money; //will be how muchmoney they have
    private Place location; //will be their location on the board

    public Player(String str, int x, Place pl) //constructor. Assigns PIVs to passed in values
    {
        name = str;
        money = x;
        location = pl;
    }
    public void setName(String str) //sets name to passed in string
    {
        name = str;
    }
    public void setMoney(int x) //sets money to passed in value
    {
        money = x;
    }
    public String getName() //returns the players name
    {
        return name;
    }
    public int getMoney() //returns how much money they have
    {
        return money;
    }
    public void updateMoney(int x) //calculates the new amount of money
    {
        money += x;
    }
    public void takeTurn(Campus c, Die d) //represents a turn. They role and move to new location
    {
        int roll = d.roll();  //Rolls the die
        Place p = c.getNextPlace(location, roll); //assigns a place "p" to the next place
        updateMoney(p.getValue()); //updates the players money
        location = p; //assigns the location to p
    }

    public String toString() //the toString for the class
    {
        String str = name + location + " and now has $" + money + "\n";
        return str;
    }
}
