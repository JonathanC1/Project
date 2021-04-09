package ec.edu.espe.mechanic.controller;

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
public class VerificationControllerTest {
    
    public VerificationControllerTest() {
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
     * Test of login method, of class VerificationController.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        Verification verification = null;
        String user = "";
        String password = "";
        VerificationController instance = new VerificationController();
        boolean expResult = false;
        boolean result = instance.login(verification, user, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
