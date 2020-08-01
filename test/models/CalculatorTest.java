/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mac
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass // like the constructor of the Calculator class
    public static void setUpClass() {
    }
    
    @AfterClass 
    public static void tearDownClass() {
    }
    
    @Before // any test 
    public void setUp() {
    }
    
    @After // after all the tests 
    public void tearDown() {
    }

    /**
     * Test of addTwoNums method, of class Calculator.
     */
    @Test
    public void xyz() {
        System.out.println("addTwoNums");
        int x = 0;
        int y = 0;
        Calculator instance = new Calculator();
        int expResult = -20;
        int result = instance.addTwoNums(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subtractTwoNums method, of class Calculator.
     */
    @Test
    public void testSubtractTwoNums() {
        System.out.println("subtractTwoNums");
        int x = 0;
        int y = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.subtractTwoNums(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
