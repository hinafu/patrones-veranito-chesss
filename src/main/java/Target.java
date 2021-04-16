
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ricardo
 */
public class Target {

    public void execute(String usuario, String password) {

        if (usuario.matches("^[A-Za-z0-9_.]+[@][A-Za-z.]+$") && usuario.equalsIgnoreCase(usuario)&&
              password.equalsIgnoreCase("admin")) {
            JFrame frame = new JFrame("Bienvenido");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new ChessPanel());
            frame.pack();
            frame.setVisible(true);
        }

    }
}
