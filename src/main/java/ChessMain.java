import javax.swing.*;
// -------------------------------------------------------------------------
/**
 * Shows the GUI for the Chess game.
 * 
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class ChessMain{
    // ----------------------------------------------------------
    /**
     * Creates the GUI for Chess.
     * 
     * @param args
     *            command line arguments, not used
     */
    public static void main( String[] args ){
        JFrame frame = new JFrame( "YetAnotherChessGame 1.0" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				
        frame.getContentPane().add( new ChessPanel().getInstancia() );
        frame.pack();
        frame.setVisible( true );		
				
				
//				
//				JFrame frame2 = new JFrame( "YetAnotherChessGame 2.0" );
//        frame2.setDefaultCloseOperation( frame2.EXIT_ON_CLOSE );
//				
//        frame2.getContentPane().add( new ChessPanel().getInstancia() );
//        frame2.pack();
//        frame2.setVisible( true );	
    }
}
