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

/**
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class TeaTest {

    public TeaTest() {
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
     * Test of getDescription method, of class Tea.
     */
    @Test
    public void testGetDescription() {
//        String expected = "a delicious cup of coffee, served hot.";
        boolean expected = true;
        Coffee coffee = new Coffee("Coffee");
        boolean actual = coffee.getDescription().contains("coffee");
        assertEquals(actual, expected);
    }

}
