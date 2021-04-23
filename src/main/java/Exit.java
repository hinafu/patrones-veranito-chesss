
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larrysbarretot
 */
public class Exit implements Order {
	private JMenuBar menu;
	
	public Exit(JMenuBar menu) {
		this.menu = menu;
	}
	
	@Override
	public void execute() {
		JOptionPane.showMessageDialog( menu.getParent(), "Thanks for leaving"
				+ ", quitter! >:(" );
		Component possibleFrame = menu;
		while ( possibleFrame != null && !( possibleFrame instanceof JFrame ) ){
				possibleFrame = possibleFrame.getParent();
		}
		JFrame frame = (JFrame)possibleFrame;
		frame.setVisible( false );
		frame.dispose();
	}

	@Override
	public String name() {
		return "Exit";
	}
	
}
