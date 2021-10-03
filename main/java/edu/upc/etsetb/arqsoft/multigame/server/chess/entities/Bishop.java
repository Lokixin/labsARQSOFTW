/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.multigame.server.chess.entities;

import java.util.Optional;

/**
 *
 * @author lokix
 */
public class Bishop extends ChessPiece {

    protected Bishop(ChessColor color) {
        super(color);
    }

    public static Bishop getInstance​(ChessColor color) {
        return new Bishop(color);
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

        if (Math.abs(cD - cO) != Math.abs(rD - rO)) {
            throw new NoPieceMovementException("Movement must be in diabonal");
        }
    }

    
    @Override
    public void isPathFree(
            int rO,
            int cO,
            int rD,
            int cD,
            ChessBoard board
    ) throws NoPathFreeException {
        
        int rowIncrement;
        rowIncrement = (rO < rD) ? 1 : -1;
        
        int colIncrement;
        colIncrement = (cO < cD) ? 1 : -1;
        
        for (int row = rO + rowIncrement; row <= rD; row += rowIncrement) {
            for (int col = cO + colIncrement; col <= cD; col += colIncrement) {
                Optional<ChessPiece>piece = board.getPiece(row, col);
                if (piece.isPresent()){
                    throw new NoPathFreeException("Piece found. Cannot move");
                }
            }
        }
    }
}
