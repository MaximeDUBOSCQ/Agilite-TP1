

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
        univers1 = new Univers("Marvel sa mere");
        superHer1.setUnivers(univers1);
        superHer1.toString();
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
    public void Test1()
    {
        SuperHeros superHer1 = new SuperHeros("SpiderMan", "Tisses des toiles");
    }

    @Test
    public void Test2()
    {
        assertEquals("Spider Man", superHer1.getNom());
    }

    @Test
    public void d()
    {
        assertEquals("Spider Man", superHer1.getNom());
    }
}



