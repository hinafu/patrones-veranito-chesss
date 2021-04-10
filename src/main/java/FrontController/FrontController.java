/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontController;

/**
 *
 * @author Carloss
 */
public class FrontController {
	private Dispatcher dispatcher;

   public FrontController () {
      dispatcher = new Dispatcher ();
   }

   private boolean isAuthenticUser () {
      System.out.println ( "Verificando....");
      return true;
   }

   private void trackRequest (String request) {
      System.out.println ( "Page requested:" + request);
   }

   public void dispatchRequest (String request) {
      // Record every request trackRequest (request);
      // To authenticate the user if (isAuthenticUser ()) {
      
      if(isAuthenticUser()){
          dispatcher.dispatch(request);
      }
         
    }	
}
