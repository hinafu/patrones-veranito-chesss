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
public class Dispatcher {
		private InfoView information;

    public Dispatcher(){
        information = new InfoView();
    }

    public void dispatch( String request ){
			if( request.equalsIgnoreCase("INFO") ) {
            information.show();
        }
//        if( request.equalsIgnoreCase("USER") ) {
//            userView.show();
//        }
//        else if( request.equalsIgnoreCase("ACCOUNT") ){
//            accountView.show();
//        }
//        else {
//            salaryView.show();
//        }
    }
}
