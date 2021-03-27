/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
/**
 *
 * @author Carloss
 */
public class SubjectProxy implements Subject {
	private final Subject _Admin;
//	private JFrame frame = new JFrame( "YetAnotherChessGame 1.0" );
  private boolean _connected = false;

  public SubjectProxy() {
    _Admin = new SubjectAdmin();
  }

  @Override
  public void doOperation(String username) {
    // Control de Acceso simple
    if (!username.isEmpty() && "admin".equals(username)) {
				JFrame frame = new JFrame( "YetAnotherChessGame 1.0" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().add( new ChessPanel().getInstanciar() );
        frame.pack();
        frame.setVisible( true );	
				System.out.println("Panel de Juego de Ajedrez");
				
      System.out.println("doOperacion proxied");
      if (_connected) {
        _Admin.doOperation(username);
				System.out.println("Ya esta logeado");
      } else {
        connectToRemote();
        _Admin.doOperation(username);
      }
				
    } else {
      System.out.println("Access Denied");
    }
  }

  private void connectToRemote() {
    System.out.println("Connecting to remote");
    _connected = true;
  }
}
