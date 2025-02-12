package aplication;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana2 extends JFrame{

	public Ventana2(String title) {
		this.setTitle(title);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(380, 500);
	
		this.setLocationRelativeTo(null);	
		this.setResizable(false);
		this.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Bienvenido");
		etiqueta1.setSize(100, 100);
		etiqueta1.setLocation(0, 0);
		etiqueta1.setBackground(Color.ORANGE);
		etiqueta1.setOpaque(true);
		
		this.add(etiqueta1);
		
	}

}
