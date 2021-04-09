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
import java.awt.event.*;
import java.util.ArrayList;
//import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ServerObserver2 extends JFrame implements ActionListener,KeyListener{
 
private ArrayList<ClienteObserver> nList = new ArrayList<>();
private JTextField textfield1;
// private JScrollPane scrollpane1;
// private JTextArea textarea1;
private JButton boton1;

 String texto = "";

 public ServerObserver2(){
  setLayout(null);
  textfield1 = new JTextField();
  textfield1.setBounds(10,10,100,30);
  add(textfield1);

  boton1 = new JButton("Generar");
  boton1.setBounds(150,10,100,30);
  add(boton1);
  boton1.addActionListener(this);


//  textarea1 = new JTextArea();
//  scrollpane1 = new JScrollPane(textarea1);
//  scrollpane1.setBounds(10,50,400,300);
//  add(scrollpane1);
 }

 public void actionPerformed(ActionEvent e){
	 addKeyListener(this);
  if(e.getSource() == boton1){

		this.setVisible(false);
		int numberClient =Integer.parseInt(textfield1.getText());
		for(int i=0; i<numberClient; i++){
						ClienteObserver Cliente = new ClienteObserver();
						Cliente.setTitle("Observador "+(i+1));
						Cliente.setBounds(0,0,300,300);
						Cliente.setVisible(true);
						Cliente.setResizable(false);
						Cliente.setLocation(i+1000,i+30);
            nList.add(Cliente);    
        }
			
			ChessPanel chessP=new ChessPanel().getInstanciar();
				
				
				JFrame frame = new JFrame( "YetAnotherChessGame 1.0 " );
				frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				frame.getContentPane().add(chessP);
				frame.pack();
				frame.setVisible( true );
				this.setVisible(false);
				
			ChessGameLog gameEngine=chessP.getGameLog();
//				System.out.println(gameEngine.getLastLog());
				
				
				ChessGameEngine ChessGE=chessP.getGameEngine();
//				System.out.println(ChessGE.mostrar());
				
			for(ClienteObserver clientList: nList){
            clientList.onMessage(gameEngine.getLastLog()+"\n \n"+ChessGE.mostrar());
//				clientList.onMessage("HOLA A TODOS");
      }	

		}
 }

    
		@Override
	public void keyTyped(KeyEvent e) {
	   System.out.println("keyTyped");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed");
	}
	@Override
	public void keyReleased(KeyEvent e) {
	System.out.println("keyReleased");
	}
}