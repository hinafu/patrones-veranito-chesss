/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class isEnemy {
    private int pieceColor;

    public isEnemy(int pieceColor) {
        this.pieceColor = pieceColor;
    }
   public boolean isEnemy( ChessGameBoard board, int row, int col ){
        if ( row > 7 || col > 7 || row < 0 || col < 0 ){
            return false;
        }
        ChessGamePiece enemyPiece =
            board.getCell( row, col ).getPieceOnSquare() == null
                ? null
                : board.getCell( row, col ).getPieceOnSquare();
        if ( enemyPiece == null
            || enemyPiece.getColorOfPiece() == ChessGamePiece.UNASSIGNED
            || enemyPiece.getColorOfPiece() == ChessGamePiece.UNASSIGNED ){
            return false;
        }
        if ( enemyPiece.getColorOfPiece() == ChessGamePiece.WHITE ){
            if ( enemyPiece.getColorOfPiece() == ChessGamePiece.BLACK ){
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            if ( enemyPiece.getColorOfPiece() == ChessGamePiece.WHITE ){
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
