/*
Name: Wilder Mason
Date: December 1, 2017
Lab 8 - Fall 2017
*/
import java.util.ArrayList; //imports arraylist
import java.util.Scanner; //imports scanner
import java.io.PrintWriter; //imports printwriter

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
    public void removePlayers() //Will remove all players
    {
        players.clear(); //clears the arraylist
    }
    public void enterBonusRound(Player p) //bonus round method
    {
        Scanner kb = new Scanner(System.in); //new scanner
        System.out.print("Would you like to continue playing? (y/n): "); //asks if they want to keep playing
        LoadedDie loadedDie = new LoadedDie(); //new loaded die
        if(kb.next().equalsIgnoreCase("y")) //executes if yes
        {
            System.out.print("Which side would you like to set the loaded die to? This side will have a higher chance of being rolled! (1-6): \n"); //asks for the loaded side
            loadedDie.setLoadedSide(kb.nextInt()); //sets the loaded side
            while(true)
            {
                p.takeTurn(theCampus, theDie); //player takes a turn
                System.out.print(p); //prints out their next turn
                System.out.print("Would you like to play again? (y/n) "); //asks to play again
                if(kb.next().equalsIgnoreCase("n")) //If they dont want to keep playing, do this
                {
                    System.out.println("Your voucher is being created..."); //tells user voucher is being created
                    createVoucher(p); //created the voucher
                    break; //breaks out of the loop
                }
            }
        }
        else
        {
            System.out.println("Your voucher is being created...");
            createVoucher(p);
        }
        System.out.println("Your voucher has been created. Good bye!"); //tells user voucher has been created. Game ends after this
    }
    public void createVoucher(Player p) //method to create the voucher
    {
        try
        {
            PrintWriter pw = new PrintWriter("voucher.txt"); //new printwriter to create the voucher text file
            pw.printf("Pay to the order of %s\n", p.getName()); //prints out who the voucher is for on the file
            pw.printf("$%d", p.getMoney()); //prints the amount of money
            pw.close(); //stops the writer
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public void playGame() //plays the game
    {
        boolean noWinner = true; //boolean variable set to true to represent thats there isnt a winner
        int winnerNum = -1; //sets int winner num to -1 since it isnt a possible option and will be changed later
        while(noWinner) //executes while there isnt a winner
        {
            for(int i = 0; i < players.size(); i++) //for loop to alternate between players
            {
                Player p = players.get(i); //assigns p to the player
                p.takeTurn(theCampus, theDie); //player takes a turn
                System.out.print(p); //prints out the player and all info
                if(p.getMoney() >= winningAmount) //if a player has won, this executer
                {
                    winnerNum = i; //winnernum is assigned to i
                    String winner = p.getName(); //assigns the string winner to the winning player name
                    System.out.printf("GAME OVER! %s is the winner!\n", winner); //Prints out that the game is over and who won
                    noWinner = false; //Sets nowinner to false to stop the loop
                    break; //breaks out of the for loop
                }
            }
        }
        enterBonusRound(players.get(winnerNum)); //enters the bonus round
    }
    //added for GUI
    //have all players take a turn and return the result as a String
    public String playRound()
    {
        String s = "";
        for(int i = 0; i < players.size(); i++)
        {
            Player p = players.get(i);
            p.takeTurn(theCampus, theDie);
            s = s + p;
        }
        return s;
    }

    //added for GUI
    //return a boolean that indicates whether or not a player has won
    public boolean checkForWinner(int playerNum)
    {
        Player p = players.get(playerNum);
        if(p.getMoney() >= winningAmount)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
