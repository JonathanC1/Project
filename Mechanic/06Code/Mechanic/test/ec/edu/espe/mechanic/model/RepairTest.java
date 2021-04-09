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
public class RepairTest {
    
    public RepairTest() {
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
     * Test of toString method, of class Repair.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Repair instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Repair.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Repair instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Repair.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Repair instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiagnostic method, of class Repair.
     */
    @Test
    public void testGetDiagnostic() {
        System.out.println("getDiagnostic");
        Repair instance = null;
        String expResult = "";
        String result = instance.getDiagnostic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiagnostic method, of class Repair.
     */
    @Test
    public void testSetDiagnostic() {
        System.out.println("setDiagnostic");
        String diagnostic = "";
        Repair instance = null;
        instance.setDiagnostic(diagnostic);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFault method, of class Repair.
     */
    @Test
    public void testGetFault() {
        System.out.println("getFault");
        Repair instance = null;
        String expResult = "";
        String result = instance.getFault();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFault method, of class Repair.
     */
    @Test
    public void testSetFault() {
        System.out.println("setFault");
        String fault = "";
        Repair instance = null;
        instance.setFault(fault);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRepair method, of class Repair.
     */
    @Test
    public void testIsRepair() {
        System.out.println("isRepair");
        Repair instance = null;
        boolean expResult = false;
        boolean result = instance.isRepair();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRepair method, of class Repair.
     */
    @Test
    public void testSetRepair() {
        System.out.println("setRepair");
        boolean repair = false;
        Repair instance = null;
        instance.setRepair(repair);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
