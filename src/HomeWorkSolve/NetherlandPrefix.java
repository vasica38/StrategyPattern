package HomeWorkSolve;

/**
 * Created by Vasile Catana on 3/27/2017.
 */
public class NetherlandPrefix implements IPhoneStrategy {
    String phone;
    NetherlandPrefix()
    {
        phone = "+33 ";
    }

    @Override
    public String Phone() {
        return phone;
    }
}
