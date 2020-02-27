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
public class AbstractListaTest {
    
    public AbstractListaTest() {
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
     * Test of add method, of class AbstractLista.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object item = null;
        AbstractLista instance = new AbstractListaImpl();
        instance.add(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class AbstractLista.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        AbstractLista instance = new AbstractListaImpl();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class AbstractLista.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        AbstractLista instance = new AbstractListaImpl();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class AbstractLista.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        AbstractLista instance = new AbstractListaImpl();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class AbstractLista.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        AbstractLista instance = new AbstractListaImpl();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class AbstractLista.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        AbstractLista instance = new AbstractListaImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class AbstractLista.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        AbstractLista instance = new AbstractListaImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AbstractListaImpl extends AbstractLista {

        public void add(E item) {
        }

        public E getFirst() {
            return null;
        }

        public E getLast() {
            return null;
        }

        public E removeFirst() {
            return null;
        }

        public E removeLast() {
            return null;
        }

        public boolean isEmpty() {
            return false;
        }

        public int size() {
            return 0;
        }
    }
    
}
