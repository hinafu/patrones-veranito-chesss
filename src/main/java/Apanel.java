/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font; 

/**
 *
 * @author Carloss
 */
public class Apanel extends JFrame implements ActionListener{
	
	private JTextField textfield1;
	private JTextField textfield2;
//	private JButton boton1;
	
	private JLabel  label1 ;
	private JLabel  label2;
	private JButton boton1;
  private  JRadioButton jRadioButton1;
  private  JRadioButton jRadioButton2;
  private  JButton jButton;
  private  ButtonGroup G1;
  private  JLabel L1;
 
  public Apanel(){
	 setLayout(null);
		label1=new JLabel("Tiempo Estimado");
		label1.setBounds(10,20,150,30);
		add(label1);
		
//		Font fuente = new Font("Calibri", 3, 20);				
		label2=new JLabel("30min 25seg");
		label2.setBounds(150,20,150,30);
//		label2.setFont(fuente); 
//    label2.setForeground(Color.BLUE);
		add(label2);
		
		
		boton1 = new JButton("Reinicar Partida");
		boton1.setBounds(80,200,150,30);
		boton1.addActionListener(this);
		add(boton1);
 }
	public void show(){
		
	}
	 public void actionPerformed(ActionEvent e){
			if(e.getSource() == boton1){
				System.out.println("AdminAuth.actionPerformed()");
				
				FrontController frontController = new FrontController();
				frontController.dispatchRequest("Admin",textfield1.getText(),textfield2.getText());
				

			}
 }
}
