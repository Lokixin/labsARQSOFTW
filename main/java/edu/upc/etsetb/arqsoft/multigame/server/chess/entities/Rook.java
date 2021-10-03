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
public class Rook extends ChessPiece {

    protected Rook(ChessColor color) {
        super(color);
    }

    public static Rook getInstance​(ChessColor color) {
        return new Rook(color);
    }

    /**
     *
     * @param rO
     * @param cO
     * @param rD
     * @param cD
     * @throws NoPieceMovementException
     */
    @Override
    public void isMovementFromPiece(
            int rO,
            int cO,
            int rD,
            int cD
    ) throws NoPieceMovementException {

        if ((cD != cO) && (rD != rO)) {
            throw new NoPieceMovementException("Movement must be forward, backwards, left or right");
        }
    }
    
    @Override
    public  void isPathFree(
            int rO,
            int cO,
            int rD,
            int cD,
            ChessBoard board
    ) throws NoPathFreeException {
        
    }
}
