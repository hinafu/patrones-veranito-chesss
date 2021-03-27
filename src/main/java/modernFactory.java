/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class modernFactory {

    public static ChessGamePiece createPieceModern(String piece, ChessGameBoard board, int row, int col, int color) {

        switch (piece) {
            case "KingModerno":
                return new King(board, row, col, color);
            case "QueenModerno":
                return new Queen(board, row, col, color);
            case "KnightModerno":
                return new Knight(board, row, col, color);
            case "PawnModerno":
                return new Pawn(board, row, col, color);
            case "BishopModerno":
                return new Bishop(board, row, col, color);
            case "RookModerno":
                return new Rook(board, row, col, color);
            default:
                return null;
        }
   }

}
