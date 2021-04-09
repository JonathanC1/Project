package ec.edu.espe.mechanic.view;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sigma Programmers
 */
public class FrmCarTest {
    
    public FrmCarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of emptyFields method, of class FrmCar.
     */
    @Test
    public void testEmptyFields() {
        System.out.println("emptyFields");
        FrmCar instance = new FrmCar();
        instance.emptyFields();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FrmCar.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmCar.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
