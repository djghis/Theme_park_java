import behaviours.IReviewed;
import behaviours.IThingsToVisit;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IReviewed> thingsToVisit;
    private ArrayList<IReviewed> listOfReviews;

    public ThemePark(String name){
        this.name = name;
        this.thingsToVisit = new ArrayList<IReviewed>();
        this.listOfReviews = new ArrayList<>();
    }

    public void addThingsToVisit(IReviewed thingToVisit){
        thingsToVisit.add(thingToVisit);
    }

    public int countThingsToVisit(){
       return thingsToVisit.size();
    }

    public ArrayList getAllReviewed() {
        ArrayList<IReviewed> places;
        for (IReviewed place : thingsToVisit) {
            this.listOfReviews.add(place);
        }
        return listOfReviews;
    }

    public int countReviews(){
        return listOfReviews.size();
    }


}
