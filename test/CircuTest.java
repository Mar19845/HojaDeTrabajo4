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
public class CircuTest {
    
    public CircuTest() {
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
     * Test of add method, of class Circu.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object item = null;
        Circu instance = new Circu();
        instance.add(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class Circu.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        Circu instance = new Circu();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class Circu.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        Circu instance = new Circu();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class Circu.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        Circu instance = new Circu();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class Circu.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        Circu instance = new Circu();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Circu.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Circu instance = new Circu();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Circu.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Circu instance = new Circu();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
