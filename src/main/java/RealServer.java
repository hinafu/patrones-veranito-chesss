/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carloss
 */
import javax.swing.*;


public class RealServer implements Server{ 
    private int port;
    private String host;
    
    public RealServer(int port, String host){
            this.port=port;
            this.host=host;
            System.out.println("Servidor iniciado...");
    }

    public void Accediendo(String usuario){
				System.out.println("Accediendo "+host+": USUARIO => "+usuario);
				JFrame frame = new JFrame( "YetAnotherChessGame 1.0  -- VERSION PRO" );
				frame.setBounds(0, 0, 600, 650);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().add( new ChessPanel().getInstanciar() );
        frame.pack();
        frame.setVisible( true );
    }

}