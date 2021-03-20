/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carloss
 */
public class PieceFactory {

	
	public static ChessGamePiece crear(String piece, ChessGameBoard board,int row,int col,int color){
		switch(piece){
			case "Bishop":
				return new Bishop(board,row,col,color);
				
			case "King":
				return new King(board,row,col,color);
			
			case "Knight":
				return new Knight(board,row,col,color);
				
			case "Pawn":
				return new Pawn(board,row,col,color);
				
			case "Queen":
				return new Queen(board,row,col,color);
				
			case "Rook":
				return new Rook(board,row,col,color);
				
			default:
				return null;
		}
			
//		ChessGamePiece nuevo=null; 
//		return null;
	}
}
