/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.multigame.server.chess.entities;

/**
 *
 * @author lokix
 */
class NoPieceMovementException extends RuntimeException {
    public NoPieceMovementException(String message){
        super(message);
    }
    
    
    
}
