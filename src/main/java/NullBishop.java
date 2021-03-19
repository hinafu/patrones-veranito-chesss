
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Carloss
 */
public class NullBishop extends ChessGamePiece{

	public NullBishop(ChessGameBoard board, int row, int col, int pieceColor) {
		super(board, row, col, pieceColor);
	}

	@Override
	protected ArrayList<String> calculatePossibleMoves(ChessGameBoard board) {
		throw new UnsupportedOperationException("no soportado"); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public ImageIcon createImageByPieceType() {
		throw new UnsupportedOperationException("NO SOportado"); //To change body of generated methods, choose Tools | Templates.
	}
	
}
