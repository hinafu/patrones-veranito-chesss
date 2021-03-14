package principal;

import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
// -------------------------------------------------------------------------
/**
 * Represents a King game piece.
 *
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class King
    extends ChessGamePiece{
<<<<<<< Updated upstream:src/main/java/principal/King.java
    	protected Map<Integer, String> icons_map;
=======
		 private static King kingInstance;
>>>>>>> Stashed changes:src/main/java/King.java

    // ----------------------------------------------------------
    /**
     * Create a new King object.
     *
     * @param board
     *            the board to create the king on
     * @param row
     *            the row to create the king on
     * @param col
     *            the column to create the king on
     * @param color
     *            either GamePiece.WHITE, BLACK, or UNASSIGNED
     */
    private King( ChessGameBoard board, int row, int col, int color ){
        super( board, row, col, color, false );
    }
		
		
			public static King getKingInstance(ChessGameBoard board,int row, int col, int color){
			if(kingInstance==null){
				kingInstance = new King(board,row, col, color);
			}
			return kingInstance;
		}
		
		
    /**
     * Calculates the possible moves for this piece. These are ALL the possible
     * moves, including illegal (but at the same time valid) moves.
     *
     * @param board
     *            the game board to calculate moves on
     * @return ArrayList<String> the moves
     */
    @Override
    protected ArrayList<String> calculatePossibleMoves( ChessGameBoard board ){
        ArrayList<String> northEastMoves = calculateNorthEastMoves( board, 1 );
        ArrayList<String> northWestMoves = calculateNorthWestMoves( board, 1 );
        ArrayList<String> southEastMoves = calculateSouthEastMoves( board, 1 );
        ArrayList<String> southWestMoves = calculateSouthWestMoves( board, 1 );
        ArrayList<String> northMoves = calculateNorthMoves( board, 1 );
        ArrayList<String> southMoves = calculateSouthMoves( board, 1 );
        ArrayList<String> eastMoves = calculateEastMoves( board, 1 );
        ArrayList<String> westMoves = calculateWestMoves( board, 1 );
        ArrayList<String> allMoves = new ArrayList<String>();
        allMoves.addAll( northEastMoves );
        allMoves.addAll( northWestMoves );
        allMoves.addAll( southWestMoves );
        allMoves.addAll( southEastMoves );
        allMoves.addAll( northMoves );
        allMoves.addAll( southMoves );
        allMoves.addAll( westMoves );
        allMoves.addAll( eastMoves );
        return allMoves;
    }
    /**
     * Determines if this King is checked.
     *
     * @param board
     *            the board to check on
     * @return true if checked, false if not checked
     */
    public boolean isChecked( ChessGameBoard board ){
        return getCurrentAttackers( board ).size() > 0;
    }
    /**
     * Creates an icon for this piece depending on the piece's color.
     *
     * @return ImageIcon the ImageIcon representation of this piece.
     */
    @Override
    public ImageIcon createImageByPieceType(){
<<<<<<< Updated upstream:src/main/java/King.java
       		icons_map = new HashMap<Integer, String>();

		icons_map.put(-1, "chessImages/default-Unassigned.gif" );
		icons_map.put(ChessGamePiece.BLACK,"chessImages/BlackKing.gif");
		icons_map.put(ChessGamePiece.WHITE, "chessImages/WhiteKing.gif");
		
		return new ImageIcon(getClass().getResource(this.icons_map.get(getColorOfPiece())));
=======
        if ( getColorOfPiece() == ChessGamePiece.WHITE ){
            return new ImageIcon(
                "chessImages/WhiteKing.gif"
            );            
        }
        else if ( getColorOfPiece() == ChessGamePiece.BLACK ){
            return new ImageIcon(
                "chessImages/BlackKing.gif"
            );            
        }
        else
        {
            return new ImageIcon(
                "chessImages/default-Unassigned.gif"
            );            
        }
>>>>>>> Stashed changes:src/main/java/principal/King.java
    }
}
