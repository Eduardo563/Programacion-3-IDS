package aplication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.random.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BotonMulti extends JFrame {

	public BotonMulti(String title) {

		this.setTitle(title);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 600);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.green);
		this.add(botonM());
	}
	
	public JPanel botonM() {
		JPanel botonMulti = new JPanel();
		botonMulti.setLayout(null);
		botonMulti.setBounds(0,0,500,600);
		botonMulti.setBackground(new Color(114, 244, 181));
		

		JButton boton = new JButton("Presioname");
		boton.setBounds(200,500,130,50);
		boton.setBackground(new Color(227,227,227));
		botonMulti.add(boton);
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Random aleatorio = new Random();
				JButton boton2 = new JButton("Hola"+aleatorio.nextDouble());
				boton2.setSize(aleatorio.nextInt(100), aleatorio.nextInt(100));
				boton2.setLocation(aleatorio.nextInt(500),aleatorio.nextInt(600));
				boton2.setBackground(new Color(aleatorio.nextInt(255),aleatorio.nextInt(255),aleatorio.nextInt(255)));
				botonMulti.add(boton2);
				botonMulti.repaint();
				
				boton2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						int eleccion =JOptionPane.showConfirmDialog(null,boton2.getText()+"\nDesea eliminar el boton?","Confrimacion de borrado",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
						if(eleccion == JOptionPane.YES_OPTION) {
							botonMulti.remove(boton2);
							botonMulti.repaint();
						}
					}
					
				});
				
			}
			
		});
		
		
		return botonMulti;
	}

}
