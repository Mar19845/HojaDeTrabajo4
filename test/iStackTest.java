/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Quezada
 */
public class iStackTest {
    
    public iStackTest() {
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
     * Test of push method, of class iStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object p = null;
        iStack instance = new iStackImpl();
        instance.push(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class iStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        iStack instance = new iStackImpl();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class iStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        iStack instance = new iStackImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class iStackImpl implements iStack {

        public void push(E p) {
        }

        public E pop() {
            return null;
        }

        public boolean isEmpty() {
            return false;
        }
    }
    
}
