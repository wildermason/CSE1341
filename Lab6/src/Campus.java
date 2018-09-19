/*
Name: Wilder Mason
Date: November 10, 2017
Lab 6-Fall 2017
*/
import java.util.ArrayList; //imports ArrayList
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
        places.add(new Place("Bishop Boulevard", "admire the campus view", 0 ));
        places.add(new Place("Perkins Theology School", "visit the chapel", 200 ));
        places.add(new Place("Meadows", "attend a concert", -100 ));
        places.add(new Place("Westcott Field", "cheer for the soccer team", -100 ));
        places.add(new Place("Cox School of Business", "take a class", 200 ));
        places.add(new Place("McFarlin Auditorium", "watch a show", -100 ));
        places.add(new Place("Dedman Law Library", "study", 200 ));
        places.add(new Place("Dallas Hall", "see the downtown skyline", 0 ));
        places.add(new Place("Fondren Science", "do an experiment", 200 ));
        places.add(new Place("Simmons", "take a class", 200 ));
        places.add(new Place("Hughes-Trigg Student Center", "get a snack", -100 ));
        places.add(new Place("Lyle", "learn java programming", 200 ));
        places.add(new Place("Moody", "watch a basketball game", -100 ));
        places.add(new Place("Residential Commons", "take a nap", 0 ));
        places.add(new Place("Ford Stadium", "cheer on Mustang Football", -100 ));
    }
    public Place getFirstPlace() //returns the first place
    {
        return places.get(0);
    }
    public Place getNextPlace(Place pl, int x) //Finds the next place that the player will move to
    {
        int newPosition; //new int new position
        if(places.indexOf(pl) + x < 15) //If they dont pass the start again on this turn, this executes
        {
            newPosition = places.indexOf(pl) + x; //NewPosition is equal to current position + value of roll
        }
        else //If they do pass start, this executes
        {
            newPosition = x - (15-places.indexOf(pl)); //calculates where they will be located now
        }
        return places.get(newPosition); //returns new location from arraylist places at index newPosition
    }
}
