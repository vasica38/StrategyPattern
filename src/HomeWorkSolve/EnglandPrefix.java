package HomeWorkSolve;

/**
 * Created by Vasile Catana on 3/27/2017.
 */
public class EnglandPrefix implements IPhoneStrategy {
    String phone;

    EnglandPrefix()
    {
        phone = "+41 ";
    }


    @Override
    public String Phone() {
        return phone;
    }
}
