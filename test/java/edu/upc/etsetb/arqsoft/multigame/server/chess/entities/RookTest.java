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
public class RookTest {

    private Rook instance;

    public RookTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("[ROOK TEST SUITE]: ROOK tests would start now ...");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("[ROOK TEST SUITE]: ROOK tests have finished.");
    }

    @Before
    public void setUp() {
        System.out.println("[ROOK TEST SUITE]: Creating new ROOK ...");
        this.instance = Rook.getInstance(ChessColor.BLACK);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class Rook.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ChessColor color = ChessColor.BLACK;
     
        Rook result = Rook.getInstance(color);
        assertEquals(this.instance, result);
        
    }

    /**
     * Test of isMovementFromPiece method, of class Rook.
     */
    @Test
    public void testIsMovementFromPiece() {
        System.out.println("[ROOK TEST SUITE] testisMovementFromPiece()");
        int rO = 0;
        int cO = 0;
        int rD = 0;
        int cD = 0;
        
        System.out.println("Testing Forwards");
        this.instance.isMovementFromPiece(rO, cO, rD+3, cD);
        
        System.out.println("Testing Backwards");
        this.instance.isMovementFromPiece(rO, cO, rD-3, cD);
        
        System.out.println("Testing Right");
        this.instance.isMovementFromPiece(rO, cO, rD, cD+3);
        
        System.out.println("Testing Left");
        this.instance.isMovementFromPiece(rO, cO, rD, cD-3);
        
    }
    
    @Test (expected = NoPieceMovementException.class)
    public void testIsMovementFromPiecer2c3KO(){
         /**
         * Test if the method works for movements that are allowed (4 diagonals).
         * To pass the test, a NoPieceMovementException must be thrown.
         */
        System.out.println("[BISHOP TEST SUITE]: Testing negative "
                + "cases for: testisMovementFromPiece");
        
        int rO = 0;
        int cO = 0;
        int rD = 0;
        int cD = 0;
        
        System.out.println("[BISHOP TEST SUITE]: Testing non diagonal movement");
        this.instance.isMovementFromPiece(rO, cO, rD+3, cD+3);
    }
    
     /**
     * Test of getColor and Constructor methods.
     * @throws java.lang.Exception
     */
    
    @Test 
    public void testConstructorAndGetColorOK() throws Exception {
        System.out.println("[ROOK TEST SUITE]: Testing constructor and getColor()");
        Assert.assertEquals(ChessColor.BLACK, this.instance.getColor()) ;
    }
}
