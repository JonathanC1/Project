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
public class VehicleTest {
    
    public VehicleTest() {
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
     * Test of toString method, of class Vehicle.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vehicle instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class Vehicle.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Vehicle instance = null;
        int expResult = 0;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYear method, of class Vehicle.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 0;
        Vehicle instance = null;
        instance.setYear(year);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegistration method, of class Vehicle.
     */
    @Test
    public void testGetRegistration() {
        System.out.println("getRegistration");
        Vehicle instance = null;
        String expResult = "";
        String result = instance.getRegistration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistration method, of class Vehicle.
     */
    @Test
    public void testSetRegistration() {
        System.out.println("setRegistration");
        String Registration = "";
        Vehicle instance = null;
        instance.setRegistration(Registration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlate method, of class Vehicle.
     */
    @Test
    public void testGetPlate() {
        System.out.println("getPlate");
        Vehicle instance = null;
        String expResult = "";
        String result = instance.getPlate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlate method, of class Vehicle.
     */
    @Test
    public void testSetPlate() {
        System.out.println("setPlate");
        String Plate = "";
        Vehicle instance = null;
        instance.setPlate(Plate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrademark method, of class Vehicle.
     */
    @Test
    public void testGetTrademark() {
        System.out.println("getTrademark");
        Vehicle instance = null;
        String expResult = "";
        String result = instance.getTrademark();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrademark method, of class Vehicle.
     */
    @Test
    public void testSetTrademark() {
        System.out.println("setTrademark");
        String trademark = "";
        Vehicle instance = null;
        instance.setTrademark(trademark);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModel method, of class Vehicle.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        Vehicle instance = null;
        String expResult = "";
        String result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModel method, of class Vehicle.
     */
    @Test
    public void testSetModel() {
        System.out.println("setModel");
        String model = "";
        Vehicle instance = null;
        instance.setModel(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMileage method, of class Vehicle.
     */
    @Test
    public void testGetMileage() {
        System.out.println("getMileage");
        Vehicle instance = null;
        float expResult = 0.0F;
        float result = instance.getMileage();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMileage method, of class Vehicle.
     */
    @Test
    public void testSetMileage() {
        System.out.println("setMileage");
        float mileage = 0.0F;
        Vehicle instance = null;
        instance.setMileage(mileage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
