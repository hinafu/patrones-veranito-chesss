
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Carloss
 */
public class Dispatcher {
		AdminPanel panel;

    public Dispatcher(){
        panel = new AdminPanel();
    }

    public void dispatch( String request ){
			if( request.equalsIgnoreCase("admin") ) {
				AdminPanel panelAdmin = new AdminPanel();
				panelAdmin.setTitle("Login Administrador ");
				panelAdmin.setBounds(450,350,400,300);
				panelAdmin.setVisible(true);
				panelAdmin.setResizable(false);
				
				
				
      }else{
				JOptionPane.showMessageDialog(null, "ERROR");
			}

    }
}
