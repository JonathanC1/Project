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
public class SparePartsTest {
    
    public SparePartsTest() {
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
     * Test of toString method, of class SpareParts.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SpareParts instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class SpareParts.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        SpareParts instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class SpareParts.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        SpareParts instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModel method, of class SpareParts.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        SpareParts instance = null;
        String expResult = "";
        String result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModel method, of class SpareParts.
     */
    @Test
    public void testSetModel() {
        System.out.println("setModel");
        String model = "";
        SpareParts instance = null;
        instance.setModel(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class SpareParts.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        SpareParts instance = null;
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class SpareParts.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        SpareParts instance = null;
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class SpareParts.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        SpareParts instance = null;
        float expResult = 0.0F;
        float result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class SpareParts.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        float price = 0.0F;
        SpareParts instance = null;
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class SpareParts.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        SpareParts instance = null;
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class SpareParts.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        SpareParts instance = null;
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
