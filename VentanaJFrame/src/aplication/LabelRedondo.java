package aplication;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
//Clase personalizada para hacer que la imagen de un label sea redonda, en este caso la imagen de la vaca en el login
public class LabelRedondo extends JLabel {

	ImageIcon imagen;
	int radio;
	
	public LabelRedondo(ImageIcon imagen,int radio) {
		this.imagen=imagen;
		this.radio=radio;
	}

	public LabelRedondo(String text) {
		super(text);
		setOpaque(false);
	}

	public void paintComponent(Graphics g) {
		Graphics2D rLabel = (Graphics2D) g;
		
        rLabel.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        BufferedImage imagenR = new BufferedImage(getWidth(),getHeight(),BufferedImage.TYPE_INT_ARGB);
		Graphics2D imagR = imagenR.createGraphics();
        imagR.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  
        imagR.setClip(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), radio, radio));
        
        imagR.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), null);
        rLabel.drawImage(imagenR, 0, 0,this);
        super.paintComponent(g);    
	}
}
