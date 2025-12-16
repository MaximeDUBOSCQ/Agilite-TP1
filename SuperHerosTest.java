

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class SuperHerosTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SuperHerosTest
{
    private SuperHeros superHer1;
    private Univers univers1;

    /**
     * Default constructor for test class SuperHerosTest
     */
    public SuperHerosTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        superHer1 = new SuperHeros("Spider Man", "Tisse des toiles");
        univers1 = new Univers("Marvel");
        superHer1.setUnivers(univers1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }


    @Test
    public void testSpiderMan()
    {
        SuperHeros sh = new SuperHeros("Spider Man", "Tisses des toiles");
        sh.setNom("Batman");
        assertEquals("Batman", sh.getNom());
    }

    @Test
    public void testNomUnivers()
    {
        assertEquals("Marvel", univers1.getNom());
    }

}



