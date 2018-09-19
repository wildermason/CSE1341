/*
Name: Wilder Mason
Date: December 1, 2017
Lab 8-Fall 2017
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Campus
{
    private ArrayList<Place> places;

    public Campus()
    {
        places = new ArrayList<Place>(15);
        createPlaces();
    }
    public void createPlaces()
    {
        try
        {
            File f = new File("places.txt");
            Scanner input = new Scanner(f);
            while(input.hasNext())
            {
                String str = input.nextLine();
                String[] arr = str.split(",");
                Integer value = Integer.parseInt(arr[2]);
                Place p = new Place(arr[0], arr[1], value);
                places.add(p);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public Place getFirstPlace()
    {
        return places.get(0);
    }
    public Place getNextPlace(Place pl, int x)
    {
        int newPosition;
        if((places.indexOf(pl) + x) < 15)
        {
            newPosition = (places.indexOf(pl)) + x;
        }
        else
        {
            newPosition = x - (15-(places.indexOf(pl)));
        }
        return places.get(Math.abs(newPosition));
    }
}

