import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
// -------------------------------------------------------------------------
/**
 * The panel that represents the Chess game board. Contains a few methods that
 * allow other classes to access the physical board.
 *
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class ChessGameBoard extends JPanel{
		private static ChessGameBoard instance;
    private BoardSquare[][] chessCells;
    private BoardListener   listener;
    // ----------------------------------------------------------
    /**
     * Returns the entire board.
     *
     * @return BoardSquare[][] the chess board
     */
    public BoardSquare[][] getCells(){
        return chessCells;
    }
    /**
     * Checks to make sure row and column are valid indices.
     * @param row the row to check
     * @param col the column to check
     * @return boolean true if they are valid, false otherwise
     */
    private boolean validateCoordinates( int row, int col ){
        return chessCells.length > 0 && chessCells[0].length > 0 &&
            row < chessCells.length && col < chessCells[0].length
            && row >= 0 && col >= 0;
    }
    // ----------------------------------------------------------
    /**
     * Gets the BoardSquare at row 'row' and column 'col'.
     * @param row the row to look at
     * @param col the column to look at
     * @return BoardSquare the square found, or null if it does not exist
     */
    public BoardSquare getCell( int row, int col ){
        if ( validateCoordinates( row, col ) ){
            return chessCells[row][col];
        }
        return null;
    }
		
		private void setCell(int row, int col, BoardSquare square) {
			this.chessCells[row][col] = square;
		}
    // ----------------------------------------------------------
    /**
     * Clears the cell at 'row', 'col'.
     * @param row the row to look at
     * @param col the column to look at
     */
    public void clearCell(int row, int col){
        if ( validateCoordinates( row, col ) ){
            this.getCell(row, col).clearSquare();
        }
        else
        {
            throw new IllegalStateException( "Row " + row + " and column" +
            		" " + col + " are invalid, or the board has not been" +
            				"initialized. This square cannot be cleared." );
        }
    }
		public ArrayList<ChessGamePiece> getAllPieces(int color) {
			ArrayList<ChessGamePiece> pieces = new ArrayList<ChessGamePiece>();
			for ( int i = 0; i < 8; i++ ){
					for ( int j = 0; j < 8; j++ ){
							ChessGamePiece piece = this.getPiece(i, j);
							if (this.isThereAPiece(piece) && piece.getColorOfPiece() == color) {
								pieces.add(piece);
							}
					}
			}
			return pieces;
		}
		
		public ChessGamePiece getPiece(int row, int col) {
			return this.getCell(row, col).getPieceOnSquare();
		}
		
		public boolean isThereAPiece(ChessGamePiece piece) {
			return piece != null;
		}
    // ----------------------------------------------------------
    /**
     * Create a new ChessGameBoard object.
     */
    private ChessGameBoard(){
        this.setLayout( new GridLayout( 8, 8, 1, 1 ) );
        listener = new BoardListener();
        chessCells = new BoardSquare[8][8];
        initializeBoard();
    }
		
		public static ChessGameBoard getInstance() {
			if (instance == null) {
				instance = new ChessGameBoard();
			}
			return instance;
		}
    // ----------------------------------------------------------
    /**
     * Clears the board of all items, including any pieces left over in the
     * graveyard, and all old game logs.
     * @param addAfterReset if true, the board will add the BoardSquares
     * back to the board, if false it will simply reset everything and leave
     * the board blank.
     */
    public void resetBoard ( boolean addAfterReset ){
        chessCells = new BoardSquare[8][8];
        this.removeAll();
        if ( getParent() instanceof ChessPanel ){
						this.clearGraveyards();
						this.clearLog();
        }
        for ( int i = 0; i < chessCells.length; i++ ){
            for ( int j = 0; j < chessCells[0].length; j++ ){
								this.setCell(i, j, new BoardSquare( i, j, null ));
								this.paintBoard(i, j);
                if ( addAfterReset ){
										this.getCell(i, j).addMouseListener(listener);
										this.add(this.getCell(i, j));
                }
            }
        }
        repaint();
        //revalidate();
        // only the combination of these two calls work...*shrug*
    }
		
		private void clearGraveyards() {
			( (ChessPanel)getParent() ).getGraveyard( 1 ).clearGraveyard();
      ( (ChessPanel)getParent() ).getGraveyard( 2 ).clearGraveyard();
		}
		
		private void clearLog() {
			( (ChessPanel)getParent() ).getGameLog().clearLog();
		}
		
    /**
     * (Re)initializes this ChessGameBoard to its default layout with all 32
     * pieces added.
     */
    public void initializeBoard(){
        resetBoard( false );
        for ( int i = 0; i < chessCells.length; i++ ){
            for ( int j = 0; j < chessCells[0].length; j++ ){
                ChessGamePiece pieceToAdd;
                if ( i == 1 ) // black pawns
                {
                    pieceToAdd = new Pawn( this, i, j, ChessGamePiece.BLACK );
                }
                else if ( i == 6 ) // white pawns
                {
                    pieceToAdd = new Pawn( this, i, j, ChessGamePiece.WHITE );
                }
                else if ( i == 0 || i == 7 ) // main rows
                {
                    int colNum =
                        i == 0 ? ChessGamePiece.BLACK : ChessGamePiece.WHITE;
                    if ( j == 0 || j == 7 ){
                        pieceToAdd = new Rook( this, i, j, colNum );
                    }
                    else if ( j == 1 || j == 6 ){
                        pieceToAdd = new Knight( this, i, j, colNum );
                    }
                    else if ( j == 2 || j == 5 ){
                        pieceToAdd = new Bishop( this, i, j, colNum );
                    }
                    else if ( j == 3 ){
                        pieceToAdd = new King( this, i, j, colNum );
                    }
                    else
                    {
                        pieceToAdd = new Queen( this, i, j, colNum );
                    }
                }
                else
                {
                    pieceToAdd = null;
                }
								this.setCell(i, j, new BoardSquare( i, j, pieceToAdd ));
								this.paintBoard(i, j);
								this.getCell(i, j).addMouseListener( listener );
								this.add(this.getCell(i, j));
            }
        }
    }
    // ----------------------------------------------------------
    /**
     * Clears the colors on the board.
     */
    public void clearColorsOnBoard(){
        for ( int i = 0; i < chessCells.length; i++ ){
            for ( int j = 0; j < chessCells[0].length; j++ ){
								this.paintBoard(i, j);
            }
        }
    }
		
		public void paintCell(int row, int col, Color color) {
			this.getCell(row, col).setBackground( color );
		}
		
		public void paintBoard(int row, int col) {
			if ( ( row + col ) % 2 == 0 ){
					this.paintCell(row, col, Color.WHITE);
			}
			else
			{
					this.paintCell(row, col, Color.BLACK);
			}
		}
		
    /**
     * Listens for clicks on BoardSquares.
     *
     * @author Ben Katz (bakatz)
     * @author Danielle Bushrow (dbushrow)
     * @author Myles David (davidmm2)
     * @version 2010.11.16
     */
    private class BoardListener
        extends MouseAdapter
    {
        /**
         * Do an action when the left mouse button is clicked.
         *
         * @param e
         *            the event from the listener
         */
        public void mouseClicked( MouseEvent e ){
            if ( e.getButton() == MouseEvent.BUTTON1 &&
                getParent() instanceof ChessPanel ){
                ( (ChessPanel)getParent() ).getGameEngine()
                    .determineActionFromSquareClick( e );
            }
        }
    }
}
