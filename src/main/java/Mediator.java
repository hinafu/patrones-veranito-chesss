/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author middl
 */
public class Mediator {	
	public ChessGamePiece getCorrectPiece(ChessGameBoard gb, int i, int j) {
		if ( i == 1 ) return new Pawn( gb, i, j, ChessGamePiece.BLACK ); // black pawns
		else if ( i == 6 ) return new Pawn( gb, i, j, ChessGamePiece.WHITE ); // white pawns
		else if ( i == 0 || i == 7 ) {
			int colNum = (i == 0) ? ChessGamePiece.BLACK : ChessGamePiece.WHITE;
			if ( j == 0 || j == 7 ) return new Rook( gb, i, j, colNum );
			else if ( j == 1 || j == 6 ) return new Knight( gb, i, j, colNum );
			else if ( j == 2 || j == 5 ) return new Bishop( gb, i, j, colNum );
			else if ( j == 3 ) return new King( gb, i, j, colNum );
			else return new Queen( gb, i, j, colNum );
		}
		else return null;
	}
}
