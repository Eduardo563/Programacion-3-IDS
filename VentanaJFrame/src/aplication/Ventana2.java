package aplication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana2 extends JFrame{

	Font etiquetas = new Font("Serif",Font.BOLD,18);

	public Ventana2(String title) {
		
		this.setTitle(title);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setMinimumSize(new Dimension(500,500));
		this.setMaximumSize(new Dimension(600,600));
	
		this.setLocationRelativeTo(null);	
		this.setResizable(true);
		this.setLayout(null);
		this.add(this.login());
		
		this.repaint();
	}
	
	public JPanel login() {
		
		JPanel login = new JPanel();
		login.setLayout(null);
		login.setLocation(0, 0);
		login.setSize(500, 500);
		login.setOpaque(true);
		login.setBackground(new Color (229,114,126));
		login.setVisible(true);
		
		
		JLabel etiqueta1 = new JLabel("Bienvenido");
		etiqueta1.setBounds(180, 150, 140, 35);
		//etiqueta1.setSize(80, 30);
		//etiqueta1.setLocation(160, 200);
		etiqueta1.setBackground(Color.ORANGE);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(etiquetas);
		etiqueta1.setOpaque(true);
		
		login.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Otro dato");
		etiqueta2.setSize(100, 30);
		etiqueta2.setLocation(200,190);
		etiqueta2.setBackground(Color.WHITE);
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta2.setVerticalAlignment(JLabel.CENTER);
		etiqueta2.setOpaque(true);
		etiqueta2.setFont(etiquetas);
		
		login.add(etiqueta2);
		
		return login;
	}

}
