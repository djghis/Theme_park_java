import behaviours.IThingsToVisit;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IThingsToVisit> thingsToVisit;

    public ThemePark(String name){
        this.name = name;
        this.thingsToVisit = new ArrayList<IThingsToVisit>();
    }

    public void addThingsToVisit(IThingsToVisit thingToVisit){
        thingsToVisit.add(thingToVisit);
    }

    public int countThingsToVisit(){
       return thingsToVisit.size();
    }
}
