/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.banditutorials.beveragebar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class CoffeeTest {
    
    public CoffeeTest() {
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
     * Test of getDescription method, of class Coffee.
     */
    @Test
    public void testGetDescription() {
        //System.out.println("getDescription");
        //Coffee instance = null;
        //String expResult = "";
        //String result = instance.getDescription();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        String expected = "a delicious cup of coffee, served hot.";
        Coffee coffee = new Coffee("Coffee");
        String actual = coffee.getDescription(); 
        assertEquals(actual, expected);
    }
    
}
