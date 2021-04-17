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
				ChessPanel chessP=new ChessPanel().getInstanciar();				
				JFrame frame = new JFrame( "YetAnotherChessGame 1.0 " );
				frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				frame.getContentPane().add(chessP);
				frame.pack();
				frame.setVisible( true );
				
//				AdminPanel panelAdmin = new AdminPanel();
//				panelAdmin.setTitle("Login Administrador ");
//				panelAdmin.setBounds(0,0,400,300);
//				panelAdmin.setVisible(true);
//				panelAdmin.setResizable(false);
		}
}		
//			Administrador.setLocationRelativeTo(150,150);	
			
////			LoginAdmin admin=new LoginAdmin();
//System.out.println("className.methodName()");
//			admin.setTitle("Admin ");
//			admin.setBounds(0,0,300,300);
//			admin.setResizable(false);
//				admin.setLocationRelativeTo(null);	
//			admin.setVisible(true);
			
//			ServerObserver2 PatronObserver = new ServerObserver2();
//				PatronObserver.setBounds(0,0,400,150);
//				PatronObserver.setVisible(true);
//				PatronObserver.setResizable(false);
//				PatronObserver.setLocationRelativeTo(null);	

			


		

				
				
				
			//				ServerObserver2 PatronObserver = new ServerObserver2();
//				PatronObserver.setBounds(0,0,400,150);
//				PatronObserver.setVisible(true);
//				PatronObserver.setResizable(false);
//				PatronObserver.setLocationRelativeTo(null);	
				
				
				
				
			
//			  java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ServerObserver().setVisible(true);
//            }
//        });


				
								

				
//				 byte opcion=0;
//				 
//				 opcion=Byte.parseByte(JOptionPane.showInputDialog(
//					"***Elija una Version***\n"
//				+ "1. LIBRE \n"
//				+ "2. PRO\n"
//				+ "3. SALIR\n\n\n"
//				+ "ELIJA SU OPCION :)\n"));
//				
//				switch(opcion){
//         case 1:
//            JFrame frame = new JFrame( "YetAnotherChessGame 1.0  * VERSION LIBRE" );
//						frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
//						frame.getContentPane().add( new ChessPanel().getInstanciar() );
//						frame.pack();
//						frame.setVisible( true );
//            break;
//         case 2:
//            String User =JOptionPane.showInputDialog("Digite un Usuario");
//						
//						Server srv= new ProxyServer(3000, "https://Chess-veranito");
//						srv.Accediendo(User); 
//            break;
//         default:
//            JOptionPane.showMessageDialog(null, "Saliendo...");
//            break;
//            
//      }

