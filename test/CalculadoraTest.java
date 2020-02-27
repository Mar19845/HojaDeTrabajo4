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
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of getCalculadora method, of class Calculadora.
     */
    @Test
    public void testGetCalculadora() {
        System.out.println("getCalculadora");
        Calculadora expResult = null;
        Calculadora result = Calculadora.getCalculadora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        int operador1 = 0;
        int operador2 = 0;
        Calculadora instance = null;
        int expResult = 0;
        int result = instance.Sumar(operador1, operador2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("Restar");
        int operador1 = 0;
        int operador2 = 0;
        Calculadora instance = null;
        int expResult = 0;
        int result = instance.Restar(operador1, operador2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        int operador1 = 0;
        int operador2 = 0;
        Calculadora instance = null;
        int expResult = 0;
        int result = instance.Multiplicar(operador1, operador2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        int operador1 = 0;
        int operador2 = 0;
        Calculadora instance = null;
        int expResult = 0;
        int result = instance.Dividir(operador1, operador2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
