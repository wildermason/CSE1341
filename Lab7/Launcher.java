/*
Name: Wilder Mason
Date: November 13, 2017
Lab 7-Fall 2017
 */

import java.util.Scanner;

public class Launcher
{
    public static void main(String[] args) //main method
    {
        Scanner input = new Scanner(System.in); //new scanner named input
        SMUQuest game = new SMUQuest(); //new SMUQuest named game
        System.out.print("How much is needed to win? $"); //asks for money needed to win
        int amt = input.nextInt(); //amt will be the amount needed to win
        game.setWinningAmount(amt); //sets the winning amount to number entered by user
        System.out.print("How many players? "); //Asks for amount of players to add
        int playerCount = input.nextInt(); //Number of players
        for(int i = 1; i <= playerCount; i++) //for loop to add player to players arraylist
        {
            System.out.printf("Player #%d name: ",i); //Asks for name
            String name = input.next(); //name is next string entered
            game.addPlayer(name, 0); //adds to arraylist with name and starting money
        }
        game.playGame();//plays the game
    }
}
