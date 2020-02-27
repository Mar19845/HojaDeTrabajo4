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
public class IcalculadoraTest {
    
    public IcalculadoraTest() {
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
     * Test of Sumar method, of class Icalculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        int operador1 = 0;
        int operador2 = 0;
        Icalculadora instance = new IcalculadoraImpl();
        int expResult = 0;
        int result = instance.Sumar(operador1, operador2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Restar method, of class Icalculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("Restar");
        int operador1 = 0;
        int operador2 = 0;
        Icalculadora instance = new IcalculadoraImpl();
        int expResult = 0;
        int result = instance.Restar(operador1, operador2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicar method, of class Icalculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        int operador1 = 0;
        int operador2 = 0;
        Icalculadora instance = new IcalculadoraImpl();
        int expResult = 0;
        int result = instance.Multiplicar(operador1, operador2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Dividir method, of class Icalculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        int operador1 = 0;
        int operador2 = 0;
        Icalculadora instance = new IcalculadoraImpl();
        int expResult = 0;
        int result = instance.Dividir(operador1, operador2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IcalculadoraImpl implements Icalculadora {

        public int Sumar(int operador1, int operador2) {
            return 0;
        }

        public int Restar(int operador1, int operador2) {
            return 0;
        }

        public int Multiplicar(int operador1, int operador2) {
            return 0;
        }

        public int Dividir(int operador1, int operador2) {
            return 0;
        }
    }
    
}
