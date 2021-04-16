
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ricardo
 */
public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String usuario, String password) {
        try {

            if (usuario.matches("^[A-Za-z0-9_.]+[@][A-Za-z.]+$")) {
                System.out.println("valido");
            } else {
               JOptionPane.showMessageDialog(null, "email not valid");
                
           
            }

        } catch (Exception e) {
            System.out.println("eee" + e);

        }
    }

}
