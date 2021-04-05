/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.controller;

import com.mongodb.DBObject;
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
public class ValueVehicleTest {
    
    public ValueVehicleTest() {
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
     * Test of addVehicle method, of class ValueVehicle.
     */
    @Test
    public void testAddVehicle() {
        System.out.println("addVehicle");
        int year = 0;
        String Registration = "";
        String Plate = "";
        String trademark = "";
        String model = "";
        float mileage = 0.0F;
        ValueVehicle instance = new ValueVehicle();
        DBObject expResult = null;
        DBObject result = instance.addVehicle(year, Registration, Plate, trademark, model, mileage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
