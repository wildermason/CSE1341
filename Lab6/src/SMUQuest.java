/*
Name: Wilder Mason
Student ID: 47322253
Date: November 10, 2017
Lab 6-Fall 2017
 */

import java.util.ArrayList; //imports ArrayList

public class SMUQuest
{
    private int winningAmount; //will represent the amount needed to win
    private Die theDie; //represents to dice
    private Campus theCampus; //Campus object
    private ArrayList<Player> players; //arraylist players
    public SMUQuest() //constructor. Initializes the PIVs
    {
        theDie = new Die();
        theCampus = new Campus();
        players = new ArrayList<Player>();
        winningAmount = 0;
    }
    public void setWinningAmount(int x) //sets the winning amount to value chosen by user.
    {
        winningAmount = x;
    }
    public int getWinningAmount() //returns to amount needed to win
    {
        return winningAmount;
    }
    public void addPlayer(String str, int x) //Adds a player in with starting money and their name and position
    {
        players.add( new Player(str, x, theCampus.getFirstPlace()));
    }
    public void playGame() //plays the game
    {
        while(true) //loop to continue game until winner
        {
            for(int i = 0; i < players.size(); i++) //will cycle though the players
            {
                players.get(i).takeTurn(theCampus, theDie); //has the player roll and get a new position

                System.out.printf("%s stopped and", players.get(i).getName());
                /*
                I got stuck here. Couldn't figure out how to finish this. I'm sorry
                I tried for hours, pretty much all day but couldn't figure it out.
                Guess this is my lab to drop at the end
                 */
            }
        }
    }
}
