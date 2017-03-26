package HomeWorkSolve;

import java.util.HashMap;

/**
 * Created by Vasile Catana on 3/27/2017.
 */
public class PrefixContext {
    private HashMap<Country,IPhoneStrategy> prefix = new HashMap<>();

    public PrefixContext()
    {
        prefix.put(Country.BELGIUM,new BelgiumPrefix());
        prefix.put(Country.ENGLAND,new EnglandPrefix());
        prefix.put(Country.NEDERLANDS,new NetherlandPrefix());
        prefix.put(Country.FRANCE,new FrancePrefix());
    }

    public String doExecute(Country country)
    {
        return prefix.get(country).Phone();
    }

}
