package aplication;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
//Clase personalizada para redondear las esquinas de un boton y personalizar su color, borde,etc.
public class botonPersonalizado extends JButton {

	
	public int radio;
	public String texto;
	public Color colorFondo;
	public Color colorBorde;
	
	public botonPersonalizado(String texto) {
		super(texto);
		this.radio = 15;
        this.colorFondo = new Color(200, 200, 200);
        this.setBorder(BorderFactory.createEmptyBorder());
        
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
		
	}
	
	public int getRadio() {
		return radio;
	}
	
	public void setRadio(int radio) {
		this.radio = radio;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Color getColorFondo() {
		return colorFondo;
	}

	public void setColorFondo(Color colorFondo) {
		this.colorFondo = colorFondo;
	}

	public Color getColorBorde() {
		return colorBorde;
	}

	public void setColorBorde(Color colorBorde) {
		this.colorBorde = colorBorde;
	}


	public void paintComponent(Graphics g) {
		
		
		Graphics2D boton = (Graphics2D)g;
		
		boton.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		boton.setColor(colorFondo);
        boton.fillRoundRect(0, 0, getWidth(), getHeight(), radio, radio);
        boton.setColor(colorBorde);
        boton.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radio, radio);
        super.paintComponent(g);
	}
	

}
