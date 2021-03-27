import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
// import java.awt.Color;
// -------------------------------------------------------------------------
/**
 * Represents a Queen game piece.
 *
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class Queen
    extends ChessGamePiece{
	
	
	private static Queen instancia;
	protected Map<Integer, String> icons_map;

	
    public Queen( ChessGameBoard board, int row, int col, int color ){
        super( board, row, col, color );
    }


    @Override
    protected ArrayList<String> calculatePossibleMoves( ChessGameBoard board ){
        ArrayList<String> northEastMoves = calculateNorthEastMoves( board, 8 );
        ArrayList<String> northWestMoves = calculateNorthWestMoves( board, 8 );
        ArrayList<String> southEastMoves = calculateSouthEastMoves( board, 8 );
        ArrayList<String> southWestMoves = calculateSouthWestMoves( board, 8 );
        ArrayList<String> northMoves = calculateNorthMoves( board, 8 );
        ArrayList<String> southMoves = calculateSouthMoves( board, 8 );
        ArrayList<String> eastMoves = calculateEastMoves( board, 8 );
        ArrayList<String> westMoves = calculateWestMoves( board, 8 );
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

	@Override
	public ImageIcon createImageByPieceType() {
		icons_map = new HashMap<Integer, String>();

		icons_map.put(-1, "chessImages/default-Unassigned.gif");
		icons_map.put(ChessGamePiece.BLACK, "chessImages/BlackQueen.gif");
		icons_map.put(ChessGamePiece.WHITE, "chessImages/WhiteQueen.gif");
		
		return new ImageIcon(getClass().getResource(this.icons_map.get(getColorOfPiece())));
	}

		
}
