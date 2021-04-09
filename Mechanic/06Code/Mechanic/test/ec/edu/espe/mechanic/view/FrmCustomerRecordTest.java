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
public class FrmCustomerRecordTest {
    
    public FrmCustomerRecordTest() {
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
     * Test of emptyFields method, of class FrmCustomerRecord.
     */
    @Test
    public void testEmptyFields() {
        System.out.println("emptyFields");
        FrmCustomerRecord instance = new FrmCustomerRecord();
        instance.emptyFields();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FrmCustomerRecord.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmCustomerRecord.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
