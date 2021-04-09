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
public class WasherTest {
    
    public WasherTest() {
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
     * Test of toString method, of class Washer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Washer instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpecialits method, of class Washer.
     */
    @Test
    public void testGetSpecialits() {
        System.out.println("getSpecialits");
        Washer instance = null;
        String expResult = "";
        String result = instance.getSpecialits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpecialits method, of class Washer.
     */
    @Test
    public void testSetSpecialits() {
        System.out.println("setSpecialits");
        String specialits = "";
        Washer instance = null;
        instance.setSpecialits(specialits);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWaitTime method, of class Washer.
     */
    @Test
    public void testGetWaitTime() {
        System.out.println("getWaitTime");
        Washer instance = null;
        float expResult = 0.0F;
        float result = instance.getWaitTime();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWaitTime method, of class Washer.
     */
    @Test
    public void testSetWaitTime() {
        System.out.println("setWaitTime");
        float waitTime = 0.0F;
        Washer instance = null;
        instance.setWaitTime(waitTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
