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
public class ClienteObserver extends JFrame implements ClientListener,ActionListener{
	 private JTextField textfield1;
 private JScrollPane scrollpane1;
 private JTextArea textarea1;
 private JButton boton1;
 
  public ClienteObserver(){
  setLayout(null);
  textfield1 = new JTextField();
  textfield1.setBounds(10,10,200,30);
  add(textfield1);
	
	boton1 = new JButton(">>");
  boton1.setBounds(220,10,50,30);
  add(boton1);
  boton1.addActionListener(this);
	

  textarea1 = new JTextArea();
  scrollpane1 = new JScrollPane(textarea1);
  scrollpane1.setBounds(10,60,200,180);
  add(scrollpane1);
 }

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			System.out.println("DE >>");
			String msj=textarea1.getText()+"\n \n De "+this.getTitle()+": "+textfield1.getText();
			onMessage(msj);
		}
	}
	
	private void formKeyReleased(java.awt.event.KeyEvent evt) {
			int code = evt.getKeyCode();
			char caracter = evt.getKeyChar();
	}
	
	@Override
    public void onMessage(String mensaje) {
        textarea1.setText(mensaje);
				System.out.println(this.getTitle());
    }
}
