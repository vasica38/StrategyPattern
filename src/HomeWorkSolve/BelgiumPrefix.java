package HomeWorkSolve;

/**
 * Created by Vasile Catana on 3/27/2017.
 */
public class BelgiumPrefix implements  IPhoneStrategy {

    String prefix ;

    BelgiumPrefix()
    {
        prefix  = "+32 ";
    }
    @Override
    public String Phone() {
        return prefix;
    }
}
