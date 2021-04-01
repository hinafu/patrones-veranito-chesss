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

				 byte opcion=0;
				 
				 opcion=Byte.parseByte(JOptionPane.showInputDialog(
					"***Elija un Plan***\n"
				+ "1. Básico\n"
				+ "2. PRO\n"
				+ "3. SALIR\n\n\n"
				+ "ELIJA SU OPCION :)\n"));
				
				switch(opcion){
         case 1:
            JFrame frame = new JFrame( "YetAnotherChessGame 1.0  * Plan Basico" );
						frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
						frame.getContentPane().add( new ChessPanel().getInstanciar() );
						frame.pack();
						frame.setVisible( true );
            break;
         case 2:
            String User =JOptionPane.showInputDialog("Digite un Usuario");
						
						Server srv= new ProxyServer(3000, "https://Chess-veranito");
						srv.Accediendo(User); 
            break;
         default:
            JOptionPane.showMessageDialog(null, "Saliendo...");
            break;
            
      }
    }
}
