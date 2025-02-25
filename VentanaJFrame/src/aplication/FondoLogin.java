package aplication;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;

import javax.swing.JPanel;
//Clase personalizada de JPanel para crear un panel con un color de fondo degradado
public class FondoLogin extends JPanel {

	Color gAbajo = new Color(32, 102, 55);
	Color gArriba = new Color(116, 234, 200);
	
	protected void paintComponent(Graphics g){ 
		super.paintComponent(g);
		Graphics2D dLogin = (Graphics2D) g.create();
		
		GradientPaint degradado = new GradientPaint(0,0,gArriba, 0, getHeight(), gAbajo);
		dLogin.setPaint(degradado);
		dLogin.fillRect(0, 0, getWidth(), getHeight());
	}
	
	public FondoLogin() {
		this.setOpaque(true);
		this.setLayout(null);
	}

	

}
