/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carloss
 */
public class ProxyServer implements Server {
    RealServer srv;
    private int port;
    private String host;

    public ProxyServer(int port, String host){
            this.port=port;
            this.host=host;
            srv=null;
            System.out.println("Proxy iniciado...");
    }
		
    public void Accediendo(String usuario){
        if(!isRestricted(usuario)){
            if(srv == null) {
                srv = new RealServer(port,host);
            }
            srv.Accediendo(usuario);
        }else{
								System.out.println("No Puede Acceder a esta VERSION.");
								
        }
    }

    public boolean isRestricted(String usuario){
			return !usuario.equals("admin");
    }
		
}