/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.multigame.server.chess.entities;
import edu.upc.etsetb.arqsoft.multigame.entitines.GameException;

/**
 *
 * @author lokix
 */
class NoPathFreeException extends GameException {
    public NoPathFreeException(String message){
        super(message);
    }
}
