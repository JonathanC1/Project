/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucia
 */
public class BillTest {
    
    public BillTest() {
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
     * Test of totalPartsUsed method, of class Bill.
     */
    @Test
    public void testTotalPartsUsed() {
        System.out.println("totalPartsUsed");
        Bill instance = null;
        instance.totalPartsUsed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of totalAccessories method, of class Bill.
     */
    @Test
    public void testTotalAccessories() {
        System.out.println("totalAccessories");
        Bill instance = null;
        instance.totalAccessories();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Bill.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Bill instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClient method, of class Bill.
     */
    @Test
    public void testGetClient() {
        System.out.println("getClient");
        Bill instance = null;
        Customer expResult = null;
        Customer result = instance.getClient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClient method, of class Bill.
     */
    @Test
    public void testSetClient() {
        System.out.println("setClient");
        Customer client = null;
        Bill instance = null;
        instance.setClient(client);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfBill method, of class Bill.
     */
    @Test
    public void testGetNumberOfBill() {
        System.out.println("getNumberOfBill");
        Bill instance = null;
        int expResult = 0;
        int result = instance.getNumberOfBill();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfBill method, of class Bill.
     */
    @Test
    public void testSetNumberOfBill() {
        System.out.println("setNumberOfBill");
        int numberOfBill = 0;
        Bill instance = null;
        instance.setNumberOfBill(numberOfBill);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPriceOfWorkforce method, of class Bill.
     */
    @Test
    public void testGetPriceOfWorkforce() {
        System.out.println("getPriceOfWorkforce");
        Bill instance = null;
        float expResult = 0.0F;
        float result = instance.getPriceOfWorkforce();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPriceOfWorkforce method, of class Bill.
     */
    @Test
    public void testSetPriceOfWorkforce() {
        System.out.println("setPriceOfWorkforce");
        float priceOfWorkforce = 0.0F;
        Bill instance = null;
        instance.setPriceOfWorkforce(priceOfWorkforce);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiscount method, of class Bill.
     */
    @Test
    public void testGetDiscount() {
        System.out.println("getDiscount");
        Bill instance = null;
        float expResult = 0.0F;
        float result = instance.getDiscount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiscount method, of class Bill.
     */
    @Test
    public void testSetDiscount() {
        System.out.println("setDiscount");
        float discount = 0.0F;
        Bill instance = null;
        instance.setDiscount(discount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
