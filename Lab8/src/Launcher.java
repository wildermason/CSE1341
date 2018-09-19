/*
Name: Wilder Mason
Date: December 1, 2017
Lab 8-Fall 2017
 */

import java.util.Scanner;

public class Launcher
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        SMUQuest game = new SMUQuest();
        System.out.print("How much is needed to win? $");
        int amt = input.nextInt();
        game.setWinningAmount(amt);
        System.out.print("How many players? ");
        int playerCount = input.nextInt();
        for(int i = 1; i <= playerCount; i++)
        {
            System.out.printf("Player #%d name: ",i);
            String name = input.next();
            game.addPlayer(name, 0);
        }
        game.playGame();
    }
}
