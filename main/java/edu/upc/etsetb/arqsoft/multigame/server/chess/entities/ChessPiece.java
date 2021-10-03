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
public abstract class ChessPiece {

    protected ChessColor color;

    protected ChessPiece(ChessColor color) {
        this.color = color;
    }

    public ChessColor getColor() {
        return this.color;
    }

    public abstract void isMovementFromPiece (
            int rO,
            int cO,
            int rD,
            int cD
    ) throws NoPieceMovementException;

    /**
     *
     * @param rO
     * @param cO
     * @param rD
     * @param cD
     * @param board
     * @throws NoPathFreeException
     */
    public abstract void isPathFree(
            int rO,
            int cO,
            int rD,
            int cD,
            ChessBoard board
    ) throws NoPathFreeException;
} 
