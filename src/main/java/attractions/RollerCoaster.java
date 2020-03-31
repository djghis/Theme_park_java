package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed, ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() <= 2.00){
            return defaultPrice();
        } else {
            return defaultPrice() * 2;
        }
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getHeight() >= 1.45 && visitor.getAge() > 12){
            return true;
        } else {
            return false;
        }
    }
}
