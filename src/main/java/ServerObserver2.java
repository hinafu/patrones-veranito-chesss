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
import java.util.Timer;
import java.util.TimerTask;


public class ServerObserver2 extends JFrame implements ActionListener{
 
private ArrayList<ClienteObserver> nList = new ArrayList<>();
private JTextField textfield1;
private JButton boton1;

 String texto = "";
 ChessPanel chessP;
 Timer timer;
    
 public ServerObserver2(){
  setLayout(null);
  textfield1 = new JTextField();
  textfield1.setBounds(10,10,100,30);
  add(textfield1);

  boton1 = new JButton("Generar");
  boton1.setBounds(150,10,100,30);
  add(boton1);
  boton1.addActionListener(this);
	chessP=new ChessPanel().getInstanciar();
	timer = new Timer();
 }

 public void actionPerformed(ActionEvent e){
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
		
		JFrame frame = new JFrame( "YetAnotherChessGame 1.0 " );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.getContentPane().add(chessP);
		frame.pack();
		frame.setVisible( true );
		this.setVisible(false);

		timer.schedule(task, 10, 1000);
	}
 }
 

  TimerTask task = new TimerTask() {

        @Override
        public void run()
        {
            ChessGameLog gameEngine=chessP.getGameLog();
						ChessGameEngine ChessGE=chessP.getGameEngine();

						for(ClienteObserver clientList: nList){
									clientList.notificar(gameEngine.getLastLog()+"\n \n"+ChessGE.mostrar());
						}	
        }
   };

}