
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
public class FrontController {
	private Dispatcher dispatcher;

   public FrontController () {
      dispatcher = new Dispatcher ();
   }

  boolean isAuthenticUser (String user,String contraseña) {
		 
		 if(user.equalsIgnoreCase("admin") && contraseña.equalsIgnoreCase("admin")){
			 return true;
		 }else{
			 return false;
		 }   
   }

   private void trackRequest (String request) {
		 JOptionPane.showMessageDialog(null, "Vista Solicitada: " + request);
   }

   public void dispatchRequest (String request,String usuario,String contraseña) {

      if(isAuthenticUser(usuario,contraseña)){
          dispatcher.dispatch(request);
      }else{
					JOptionPane.showMessageDialog(null, "Error,verifique los campos :/");
					AdminAuth Administrador = new AdminAuth();
					Administrador.setTitle("Login Administrador ");
					Administrador.setBounds(450,350,300,300);
					Administrador.setVisible(true);
					Administrador.setResizable(false);
			}
         
    }	
}
