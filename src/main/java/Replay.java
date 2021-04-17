
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larrysbarretot
 */
public class Replay {
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame( "YetAnotherChessGame 1.0" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().add( new ChessPanel() );
        frame.pack();
        frame.setVisible( true );
				ChessGameBoard board = ChessGameBoard.getInstance();
				IMovementPieceDAO movements = new MovementPieceDAO();
				List<MovementPieceDTO> replays = (ArrayList<MovementPieceDTO>) movements.getAll();
				for (int i = 0; i < replays.size(); i = i + 2) {
					ChessGamePiece piece = board.getCell(replays.get(i).getRow(), replays.get(i).getColumn()).getPieceOnSquare();
					board.clearCell(replays.get(i).getRow(), replays.get(i).getColumn());
					Thread.sleep(1000);
					piece.setPieceLocation(replays.get(i+1).getRow(), replays.get(i+1).getColumn());
					board.getCell( replays.get(i+1).getRow(), replays.get(i+1).getColumn() ).setPieceOnSquare( piece );
				}
	}
}
