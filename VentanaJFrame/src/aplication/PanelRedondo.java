package aplication;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;

import javax.swing.JPanel;
//Clase personalizada heredada de JPanel para que el panel de login tenga bordes redondos
public class PanelRedondo extends JPanel {
	
	int radioB = 30;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D rPanel = (Graphics2D) g;
		
		rPanel.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		rPanel.setColor(getBackground());
		rPanel.fillRoundRect(0, 0, getWidth(), getHeight(), radioB, radioB);
		rPanel.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radioB, radioB);
	}

	public PanelRedondo() {
		this.setOpaque(false);
	}
	
	public void setColorF(Color color) {
		this.setBackground(color);
	}

	

}
