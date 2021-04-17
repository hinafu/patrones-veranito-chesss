/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author Carloss
 */
public class AdminAuth extends JFrame implements ActionListener{
	
	private JTextField textfield1;
	private JTextField textfield2;
	private JButton boton1;
 
  public AdminAuth(){
	 setLayout(null);
		textfield1 = new JTextField();
		textfield1.setBounds(60,10,150,30);
		add(textfield1);
		
		textfield2 = new JTextField();
		textfield2.setBounds(60,50,150,30);
		add(textfield2);

		boton1 = new JButton("INGRESAR");
		boton1.setBounds(80,110,100,30);
		add(boton1);
		boton1.addActionListener(this);
 }
	
	 public void actionPerformed(ActionEvent e){
			if(e.getSource() == boton1){
				this.setVisible( false );
				
				FrontController frontController = new FrontController();
				frontController.dispatchRequest("Admin",textfield1.getText(),textfield2.getText());
				

			}
 }
}
