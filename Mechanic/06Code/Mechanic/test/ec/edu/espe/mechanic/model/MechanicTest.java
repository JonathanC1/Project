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
public class MechanicTest {
    
    public MechanicTest() {
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
     * Test of toString method, of class Mechanic.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Mechanic instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpecialty method, of class Mechanic.
     */
    @Test
    public void testGetSpecialty() {
        System.out.println("getSpecialty");
        Mechanic instance = null;
        String expResult = "";
        String result = instance.getSpecialty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpecialty method, of class Mechanic.
     */
    @Test
    public void testSetSpecialty() {
        System.out.println("setSpecialty");
        String specialty = "";
        Mechanic instance = null;
        instance.setSpecialty(specialty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
