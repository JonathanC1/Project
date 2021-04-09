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
 * @author Sigma Programmers
 */
public class USTaxTest {
    
    public USTaxTest() {
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
     * Test of getlnstance method, of class USTax.
     */
    @Test
    public void testGetlnstance() {
        System.out.println("getlnstance");
        float value = 0.0F;
        USTax expResult = null;
        USTax result = USTax.getlnstance(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salesTotal method, of class USTax.
     */
    @Test
    public void testSalesTotal() {
        System.out.println("salesTotal");
        USTax usTax = null;
        USTax instance = null;
        float expResult = 0.0F;
        float result = instance.salesTotal(usTax);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class USTax.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        USTax instance = null;
        float expResult = 0.0F;
        float result = instance.getValue();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class USTax.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        float value = 0.0F;
        USTax instance = null;
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTax method, of class USTax.
     */
    @Test
    public void testGetTax() {
        System.out.println("getTax");
        USTax instance = null;
        float expResult = 0.0F;
        float result = instance.getTax();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTax method, of class USTax.
     */
    @Test
    public void testSetTax() {
        System.out.println("setTax");
        float tax = 0.0F;
        USTax instance = null;
        instance.setTax(tax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class USTax.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        USTax expResult = null;
        USTax result = USTax.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInstance method, of class USTax.
     */
    @Test
    public void testSetInstance() {
        System.out.println("setInstance");
        USTax aInstance = null;
        USTax.setInstance(aInstance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
