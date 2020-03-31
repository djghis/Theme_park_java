package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(12, 1.10, 100.00);
        visitor2 = new Visitor(19, 2.10, 100.00);
        visitor3 = new Visitor(13, 1.35, 100.00);
        visitor4 = new Visitor(11, 1.46, 100.00);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void payTheRightPrice(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor1), 0.00);
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.00);
    }

    @Test
    public void isTallAndOldEnough(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor4));

    }
}
