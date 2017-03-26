package HomeWorkSolve;

/**
 * Created by Vasile Catana on 3/27/2017.
 */
public class PhoneService {

    public String phone(Country country)
    {
        PrefixContext context = new PrefixContext();
        return context.doExecute(country);
    }
}
