/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luciano
 */
public class ContaTest {
    
    private Conta conta;
    
    public ContaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        conta = new Conta();
        conta.deposito(500.00);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of saque method, of class Conta.
     */
    @Test
    public void testSaque() {
        
        boolean retorno = conta.saque(300.00);
        assertTrue(retorno);
    }
    
}
