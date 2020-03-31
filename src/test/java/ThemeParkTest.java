import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.ParkingSpot;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    CandyflossStall candyflossStall;

    @Before
    public void before(){
        themePark = new ThemePark("G Land");
        dodgems = new Dodgems("Bump", 5);
        candyflossStall = new CandyflossStall("Sweet tooth", "Bob", ParkingSpot.A1, 6);

    }

    @Test
    public void hasThingsToVisit(){
        themePark.addThingsToVisit(dodgems);
        themePark.addThingsToVisit(candyflossStall);
        assertEquals(2, themePark.countThingsToVisit());
    }

    @Test
    public void hasReviewedAttractions(){
        themePark.getAllReviewed();
        assertEquals(2, themePark.countReviews() );
    }
}
