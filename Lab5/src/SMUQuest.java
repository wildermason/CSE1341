/*
Author: Wilder Mason
Student ID: 47322253
Date: October 23, 2017
Lab 5-Fall 2017
*/

import java.util.Scanner; //Import the Scanner
import java.util.Random; //Inputs the Random

public class SMUQuest //Class called SMUQuest
{
    public static void main(String[] args) //Main method
    {
        String[] locDesc = {"admire the campus view down Bishop Boulevard.", "visit Perkins School of Theology.", "attend a concert at Meadows.", "watch a soccer game at Westcott Field.",
                "attend a class at Cox School of Business.", "watch a show at Mcfarlin Auditorium.", "study at Deadman Law Library.", "see the downtown skyline from Dallas Hall.", "do an experiment at Fondren Science.",
                "take a class at Simmons.", "get a snack at Hughes-Trigg Student Center.", "learn Java programming at Lyle.", "watch a basketball game at Moody.", "take a nap at residential commons.",
                "cheer for Mustang Football at Ford Stadium."}; //String array that holds the descriptions for all the locations on the map
        String player1; //New string player1 which will eventually store the name of player 1
        String player2; //New String player2 which will eventually store the name of player 2
        int p1Money = 500; //The money for player 1, which starts at $500
        int p2Money = 500; //The money for player 2, which starts at $500
        int winAmount; //This will store the amount of money needed to win
        int p1Loc = 0; //The location of player 1, starts at 0 (really 1 on the board)
        int p2Loc = 0; //The location of player 2, starts at 0 (really 2 on the board)
        int p1Roll; //Will hold the value of the dice roll by player 1
        int p2Roll; //Will hold the value of the dice roll by player 2

        Scanner kb = new Scanner(System.in); //new scanner named kb
        System.out.println("Welcome to SMUQuest!"); //Greets the players
        System.out.print("Player 1 name: "); //Asks for name of player 1
        player1 = kb.next(); //Assigns player1 to the name of player 1
        System.out.printf("%s has $%d.", player1, p1Money); //Print out the name of the player and their starting balance
        System.out.print("\nPlayer 2 name: "); //Asks for the name of player 2
        player2 = kb.next(); //Assigns player2 to the name of player 2
        System.out.printf("%s has $%d.", player2, p2Money); //Print out the name of the player and their starting balance
        System.out.print("\nHow much money is needed to win? $"); //Asks for the amount of money needed to win
        winAmount = kb.nextInt(); //Assigns winAmount to the amount the user choose

        while(p1Money <= winAmount && p2Money <= winAmount) //While loop to play the game until a player has with amount to win or more
        {
            p1Roll = rollDie(); //Assigns p1Roll to the value returned by rollDie()
            p1Loc = getDestination(p1Loc, p1Roll); //assigns p1Loc to the new location returned by the method
            p1Money += getMoneyAmount(p1Loc, p1Roll); //Assign p1Money to the amount returned by getMoneyAmount added to p1Money
            System.out.printf("%s rolled a %d and stopped to %s\n", player1, p1Roll, locDesc[p1Loc]); //Prints out what player 1 rolled and what they did at their location
            if(getMoneyAmount(p1Loc,p1Roll) > 0) //If they gained money at their new location, this executes
            {
                System.out.printf("\t%s collected $%d and now has $%d.\n", player1, getMoneyAmount(p1Loc,p1Roll), p1Money); //prints how much money player 1 collected and how much they now have
            }
            else //If they lost money, this executes
            {
                System.out.printf("\t%s lost $%d and now has $%d.\n", player1, Math.abs(getMoneyAmount(p1Loc, p1Roll)), p1Money); //prints how much money player 1 lost and how much they now have
            }

            p2Roll = rollDie(); //Assigns p2Roll to the value returned by rollDie()
            p2Loc = getDestination(p2Loc, p2Roll); //assigns p2Loc to the new location returned by the method
            p2Money += getMoneyAmount(p2Loc, p2Roll);  //Assign p2Money to the amount returned by getMoneyAmount added to p2Money
            System.out.printf("%s rolled a %d and stopped to %s\n", player2,p2Roll , locDesc[p2Loc]); //Prints out what player 1 rolled and what they did at their location
            if(getMoneyAmount(p2Loc, p2Roll) > 0) //If they gained money at their new location, this executes
            {
                System.out.printf("\t%s collected $%d and now has $%d.\n", player2, getMoneyAmount(p2Loc,p2Roll), p2Money); //prints how much money player 1 collected and how much they now have
            }
            else //If they lost money, this executes
            {
                System.out.printf("\t%s lost $%d and now has $%d.\n", player2, Math.abs(getMoneyAmount(p2Loc, p2Roll)), p2Money); //prints how much money player 1 lost and how much they now have
            }
        }
        if(p1Money >= winAmount) //If player 1 met or exceeded the win amount, this executes
        {
            System.out.printf("%S won! GAME OVER", player1); //Prints that Player 1 won and the game is over
        }
        if(p2Money >= winAmount) //If player 2 met or exceeded the win amount, this executes
        {
            System.out.printf("%S won! GAME OVER", player2); //Prints that Player 2 won and the game is over
        }
    }

    public static int rollDie() //Method that simulated rolling of die and returns value of roll
    {
        Random r = new Random(); //new Random r
        return  r.nextInt(6)+1; //returns a random number from 1 to 6
    }

    public static int getMoneyAmount(int destination, int roll) //This method returns the amount of money they gained or lost on their turn
    {
        int[] moneyValues = {0, 200, -100, -100, 200, -100, 200, 0, 200, 200, -100, 200, -100, 0, -100}; //Array that stores the money values for each location. Locations with 0 will have a variable amount that will change
        int money; //new variable money to store the amount of money to be returned
        if(moneyValues[destination] == 0) //If its a 0 value, this executes to calculate the amount to e returned
        {
            if(roll % 2 == 0) //If its an even space, this executes
            {
                money = 10 * roll; //money is assigned to 10 time the value of their roll
            }
            else //If its an odd space, this executes
            {
                money = 0 - (10 * roll); //Money is 10 times the value of their role but negative
            }
        }
        else //if its a set value, this executes
        {
            money = moneyValues[destination]; //money is assigned to predetermined value of that location
        }
        return money; //returns the value
    }

    public static int getDestination(int location, int roll) //Method to calculate the new position on the board
    {
        int newPosition; //Will store the new location to be returned
        if(location + roll < 15) // If the current location + the amount of spaces to move is less than 15, which i the number of spaces before looping back
        {
            newPosition = location + roll; //New position is just their current location plus the rol value
        }
        else //if they loop back, this executes
        {
            newPosition = 0 + roll - (15-location); //Calculates new position on the board
        }
        return newPosition; //returns their position
    }
}

