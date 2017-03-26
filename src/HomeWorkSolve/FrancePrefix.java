package HomeWorkSolve;

/**
 * Created by Vasile Catana on 3/27/2017.
 */
public class FrancePrefix implements IPhoneStrategy {
    String phone;
    FrancePrefix()
    {
        phone = "+31 ";
    }

    @Override
    public String Phone() {
        return phone;
    }
}
