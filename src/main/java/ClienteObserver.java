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
public class ClienteObserver extends JFrame implements Observador{
	private JTextField textfield1;
 private JScrollPane scrollpane1;
 private JTextArea textarea1;
 private JButton boton1;
 
  public ClienteObserver(){
  setLayout(null);


  textarea1 = new JTextArea();
  scrollpane1 = new JScrollPane(textarea1);
  scrollpane1.setBounds(10,60,200,180);
  add(scrollpane1);
 }

	@Override
    public void notificar(String mensaje) {
        textarea1.setText(mensaje);
    }
}
