/*
Author: Wilder Mason
Student ID: 47322253
Date: October 9, 2017
Lab 4-Fall 2017
 */
import java.util.Scanner; //Imports the Scanner
import java.util.Random; //Imports the Random number genorator

public class Hangman //New class Hangman
{
    public static void main(String[] args) //Main Method
    {
        Scanner kb = new Scanner(System.in); //Creates a new Scanner object named "kb"
        String[] words = {"vowel", "soccer", "football", "computer", "dog", "laptop", "peruna", "xbox"}; //New string array that contains the possible word choices
        String newWord = getNewWord(words); //Chooses the word to be guessed using the getNewWord method
        String[] guessedWord = new String[newWord.length()]; //New string array that will hold the * marks
        int missed = 0; //Keeps track of how many misses the user has
        boolean execute = true; //While this is true, the while loop will run

        for(int i = 0; i < guessedWord.length; i++) //For loop that fills the guessedWord array with the appropriate amount of asterisks.
        {
            guessedWord[i] = "*";
        }

        System.out.print(" (Guess) Enter a letter in word " + String.join(" ", guessedWord) + " > "); //Asks for a letter and shows the asterisks

        while(execute=true) //While loop so the user can keep on playing until they want to stop
        {

            String pick = kb.next(); //New string "pick" which is the letter the user chooses each turn

            for(int j = 0; j < guessedWord.length; j++) //For loop that checks if the choice they made has already been guessed.
            {
                if(guessedWord[j].equals(pick)) //IGues through each element in array and if any of them equal the pick the user chose this will execute/
                {
                    System.out.println(pick + " is already in the word!"); //Lets them know they already guessed it
                }
            }

            for( int i = 0; i < newWord.length(); i++) //For loop to replace an asterisk with the correct letter if the letter they guessed was in the word.
            {
                if(newWord.substring(i, i+1).equals(pick))//Goes through the word and compares each substring of one letter to the array
                {
                    guessedWord[i] = pick; //replaces the asterisk in the array at the appropriate spot with the letter
                }
            }

            int correct = 0; //New int correct that will help tell if the user chose a letter not in word
            for(int k= 0; k < guessedWord.length; k++) //For loop that goes through the array to see if the choice is a letter in the word
            {
                if(guessedWord[k].equals(pick))
                {
                    correct++; //if it is, correct is incremented up one.
                }
            }

            if(correct == 0) //If correct stays at 0, this executes
            {
                System.out.println(pick + " is not in the word!"); //Tells the user that the letter they guessed isnt in the word
                missed++; //Adds one to their missed count
            }

            int check = 0; // Another Int to check if there are any asterisks left
            for(int h = 0; h < guessedWord.length; h++)
            {
                if (guessedWord[h].equals("*"))
                {
                    check++; //If there are any asterisks left in guessed word, check goes up by one.
                }
            }

            if(check == 0) //If it stays at 0, that means that the user guessed the whole word, this will ask them if they want to continue or not
            {
                System.out.printf("The word was %s. You missed %d times.", newWord, missed); //tells the user what the word was and how many misses they had
                System.out.print("\nDo you want to guess another word? Enter y or n > "); //Asks if they want to play again
                String quit = kb.next(); //New string quit that will hold the user's answer
                if(quit.equals("n")) //If they choose n, which means they want to quit, this will execute to end te program.
                {
                    check++;
                    execute=false;
                    break;
                }
                else //If they want to keep playing, this happens
                {
                    newWord = getNewWord(words); //A new word is chosen
                    guessedWord = new String[newWord.length()]; //guessedWord is now properly set to the length new word
                    for(int i = 0; i < guessedWord.length; i++) //Fills guessed word back up with asterisks
                    {
                        guessedWord[i] = "*";
                    }
                    missed = 0; //Resets their missed counter
                    System.out.print(" (Guess) Enter a letter in word "+  String.join(" ",  guessedWord) + " > "); //Begins the game again
                }
            }
            else // If check isnt 0, they need to keep playing
            {
                System.out.print(" (Guess) Enter a letter in word "+  String.join(" ",  guessedWord) + " > "); //continues the game
            }
        }
    }

    public static String getNewWord(String[] selection) //Method to chooses a new word
    {
        Random rand = new Random(); //new random "rand"
        return selection[rand.nextInt(selection.length)]; //returns a new randomly chosen word.
    }


}
