
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class Target {
    public void execute(String usuario,String password){
      if(usuario.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
          JFrame frame = new JFrame( "Bienvenido" );
            frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            frame.getContentPane().add( new ChessPanel() );
            frame.pack();
            frame.setVisible( true );
      }
      }
}
