/*
Name: Wilder Mason
Date: December 1, 2017
Lab 8-Fall 2017
*/
import javax.swing.JFrame;

public class GUILauncher
{
    public static void main(String[] args)
    {
        GUISMUQuest theGame = new GUISMUQuest();
        theGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theGame.setSize(650,500);
        theGame.setVisible(true);
    }
}