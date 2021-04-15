/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class AuthenticationFilter implements Filter{

    @Override
    public void execute(String usuario,String password ) {
        try {
            System.out.println("Autenticando");
            if(usuario=="admin" && password =="admin"){
                System.out.println("ENTRO");
            }else{
                 Exception e = new Exception("Usuario o password incorrecto");
			         throw e;
            }
        
        } catch (Exception e) {
            System.out.println("eee"+e);
            
        }
    }

    @Override
    public void redirectFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
