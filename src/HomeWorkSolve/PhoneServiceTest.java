package HomeWorkSolve;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vasile Catana on 3/27/2017.
 */
public class PhoneServiceTest {

    private PhoneService phoneService;

    @Before
    public void setUp(){
        phoneService = new PhoneService();
    }

    @After
    public void tearDown(){
        phoneService = null;
    }

    @Test
    public void whenNetherland()
    {
        String result  = phoneService.phone(Country.NEDERLANDS);
        assertEquals("+33 ", result);
    }
    @Test
    public void whenFrance()
    {
        String result  = phoneService.phone(Country.FRANCE);
        assertEquals("+31 ", result);
    }
    @Test
    public void whenEngland()
    {
        String result  = phoneService.phone(Country.ENGLAND);
        assertEquals("+41 ", result);
    }
    @Test
    public void whenBelgium()
    {
        String result  = phoneService.phone(Country.BELGIUM);
        assertEquals("+32 ", result);
    }

}
