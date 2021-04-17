/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font; 
/**
 *
 * @author Carloss
 */
public class AdminPanel extends JFrame implements ActionListener{
	private JLabel  label1 ;
	private JLabel  label2;
	private JButton boton1;
  private  JRadioButton jRadioButton1;
  private  JRadioButton jRadioButton2;
  private  JButton jButton;
  private  ButtonGroup G1;
  private  JLabel L1;
//////		
  public AdminPanel(){
		setLayout(null);
		label1=new JLabel("Tiempo Estimado");
		label1.setBounds(10,20,150,30);
		add(label1);
		
		Font fuente = new Font("Calibri", 3, 20);				
		label2=new JLabel("30min 25seg");
		label2.setBounds(150,20,150,30);
		label2.setFont(fuente); 
    label2.setForeground(Color.BLUE);
		add(label2);
		

//*******************************************
// Setting layout as null of JFrame.
//        this.setLayout(null);
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jButton = new JButton("Registrar Ganador");
        G1 = new ButtonGroup();
        L1 = new JLabel("Ganador");
        jRadioButton1.setText("Jugador 1");
        jRadioButton2.setText("Jugador 2");
        jRadioButton1.setBounds(120, 60, 130, 50);
        jRadioButton2.setBounds(250, 60, 130, 50);
        jButton.setBounds(125, 150, 150, 30);
        L1.setBounds(20, 60, 150, 50);
        this.add(jRadioButton1);
        this.add(jRadioButton2);
        this.add(jButton);
        this.add(L1);
        G1.add(jRadioButton1);
        G1.add(jRadioButton2);
//				**************************
        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String qual = " ";
                if (jRadioButton1.isSelected()) {
                    qual = "Jugador 1";
                }
                else if (jRadioButton2.isSelected()) {
                    qual = "Jugador 2";
                }
                else {  
                    qual = "NO Button selected";
                }
                JOptionPane.showMessageDialog(AdminPanel.this, qual);
            }
        });
	
		boton1 = new JButton("Reinicar Partida");
		boton1.setBounds(125,200,150,30);
		boton1.addActionListener(this);
		add(boton1);
		
 }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1){		
			this.setVisible( false );
			
			JFrame frame = new JFrame( "YetAnotherChessGame 1.0 " );
			frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			frame.getContentPane().add(new ChessPanel().getInstanciar());
			frame.pack();
			frame.setVisible( true );
		}
		
	}
	
}
