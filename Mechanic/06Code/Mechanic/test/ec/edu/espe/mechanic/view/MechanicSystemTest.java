/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.view;

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
public class MechanicSystemTest {
    
    public MechanicSystemTest() {
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
     * Test of main method, of class MechanicSystem.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MechanicSystem.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuAdministrative method, of class MechanicSystem.
     */
    @Test
    public void testMenuAdministrative() {
        System.out.println("menuAdministrative");
        MechanicSystem.menuAdministrative();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuMechanic method, of class MechanicSystem.
     */
    @Test
    public void testMenuMechanic() {
        System.out.println("menuMechanic");
        MechanicSystem.menuMechanic();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuLaundrier method, of class MechanicSystem.
     */
    @Test
    public void testMenuLaundrier() {
        System.out.println("menuLaundrier");
        MechanicSystem.menuLaundrier();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
