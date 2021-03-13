package principal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class IsEnemy {
	 private int pieceColor;

    public IsEnemy(int pieceColor) {
        this.pieceColor = pieceColor;
    }
	
	 // ----------------------------------------------------------
    /**
     * Determines if the row and column contains an enemy piece. This is defined
     * in GamePiece and not ChessGameBoard because different pieces have
     * different enemies depending on their colors.
     *
     * @param row
     *            row of the GamePiece
     * @param col
     *            column of the GamePiece
     * @param board
     *            the board to check
     * @return true if it is an enemy piece, false if not
     */
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
