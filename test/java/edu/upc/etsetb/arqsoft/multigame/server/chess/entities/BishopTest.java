/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.multigame.server.chess.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lokix
 */
public class BishopTest {
    
    private Bishop instance;
    
    public BishopTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("[BISHOP TEST SUITE]: Bishops tests would start now ...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("[BISHOP TEST SUITE]: Bishops tests have finished.");
    }
    
    @Before
    public void setUp() {
        System.out.println("[BISHOP TEST SUITE]: Creating new Bishop ...");
        this.instance = new Bishop(ChessColor.BLACK);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class Bishop.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ChessColor color = null;
        Bishop expResult = null;
        Bishop result = Bishop.getInstance(color);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isMovementFromPiece method, of class Bishop.
     */
    @Test
    public void testIsMovementFromPiece() {
        System.out.println("isMovementFromPiece");
        int rO = 0;
        int cO = 0;
        int rD = 0;
        int cD = 0;
        Bishop instance = null;
        instance.isMovementFromPiece(rO, cO, rD, cD);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testConstructorAndGetColorOK() throws Exception {
        System.out.println("BISHOP TEST SUITE]: Testing constructor and getColor(): OK");
        Assert.assertEquals(ChessColor.BLACK,this.instance.getColor()) ;
    }
    
    
}
