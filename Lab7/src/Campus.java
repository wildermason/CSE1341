/*
Name: Wilder Mason
Date: November 13, 2017
Lab 7-Fall 2017
*/
import java.util.ArrayList; //imports ArrayList
import java.util.Scanner; //imports Scanner
import java.io.File; //imports file
public class Campus //new class campus
{
    private ArrayList<Place> places; //new ArrayList of type Place named places

    public Campus() //constructor
    {
        places = new ArrayList<Place>(15); //places will have 15 objects
        createPlaces(); //runs the createPlaces  method
    }
    public void createPlaces() //Fills the arraylist with all the location information
    {
        try
        {
            File f = new File("places.txt");
            Scanner input = new Scanner(f);
            while(input.hasNext()) //While there is still something in the file it will continue to read it
            {
                String str = input.nextLine(); //str is the next line of the file
                String[] arr = str.split(","); //splits the string into an array based on where the commas are
                Integer value = Integer.parseInt(arr[2]); //convers the string number in the array to a int
                Place p = new Place(arr[0], arr[1], value); //constructs a new place object
                places.add(p); //adds the place object to the places arraylist
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public Place getFirstPlace() //returns the first place
    {
        return places.get(0);
    }
    public Place getNextPlace(Place pl, int x) //Finds the next place that the player will move to
    {
        int newPosition; //new int new position
        if((places.indexOf(pl) + x) < 15) //If they dont pass the start again on this turn, this executes
        {
            newPosition = (places.indexOf(pl)) + x; //NewPosition is equal to current position + value of roll
        }
        else //If they do pass start, this executes
        {
            newPosition = x - (15-(places.indexOf(pl))); //calculates where they will be located now
        }
        return places.get(Math.abs(newPosition)); //returns new location from arraylist places at index newPosition
    }
}

