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
public class SimpleETest {
    
    public SimpleETest() {
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
     * Test of add method, of class SimpleE.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object item = null;
        SimpleE instance = new SimpleE();
        instance.add(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class SimpleE.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        SimpleE instance = new SimpleE();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class SimpleE.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        SimpleE instance = new SimpleE();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class SimpleE.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        SimpleE instance = new SimpleE();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class SimpleE.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        SimpleE instance = new SimpleE();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class SimpleE.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        SimpleE instance = new SimpleE();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class SimpleE.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        SimpleE instance = new SimpleE();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
