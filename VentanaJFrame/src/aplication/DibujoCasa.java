package aplication;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class DibujoCasa extends JFrame{

	
	Color azulCielo = new Color(46, 196, 226);
	Color amarilloPared = new Color(234, 189, 59);
	Color tierra = new Color(124, 98, 23);
	Color cemento = new Color(126, 122, 110);
	Color verdePasto = new Color(33, 170, 19);
	Color verdeOscuro = new Color(22, 110, 13);
	Color rayasCasa = new Color(137, 72, 6);
	Color ventana = new Color(189, 245, 244);
	public DibujoCasa() {

		this.setTitle("Casa Pintada");
		this.setSize(1000, 800);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		

		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(azulCielo);
		g2.fillRect(0, 0, 1000, 800);
		
		g2.setColor(cemento);
		g2.fillRect(0, 730, 1000, 70);
		
		g2.setColor(tierra);
		g2.fillRect(0, 680, 1000, 50);
		
		g2.setColor(verdePasto);
		g2.fillRect(0, 630, 1000, 50);
		
		g2.setColor(verdeOscuro);
		g2.fillRect(0, 600, 1000, 30);
		
		g2.setColor(new Color(113, 82, 32));
		g2.fillRect(0, 450, 1000, 70);
		
		g2.setColor(amarilloPared);
		g2.fillRect(200, 200, 600, 400);
		
		g2.setColor(cemento);
		g2.fillRect(150, 550, 700, 50);
		
		g2.setColor(rayasCasa);
		g2.setStroke(new BasicStroke(5));
		g2.drawLine(200, 250, 800, 250);
		g2.drawLine(200, 300, 800, 300);
		g2.drawLine(200, 350, 800, 350);
		g2.drawLine(200, 400, 800, 400);
		g2.drawLine(200, 450, 800, 450);
		g2.drawLine(200, 500, 800, 500);
		
		g2.setColor(Color.white);
		g2.fillRoundRect(250, 300, 150, 150, 10, 10);
		
		g2.setColor(ventana);
		g2.fillRoundRect(260, 310, 60, 60,10,10);
		g2.fillRoundRect(330, 310, 60, 60,10,10);
		g2.fillRoundRect(260, 380, 60, 60,10,10);
		g2.fillRoundRect(330, 380, 60, 60,10,10);
		
		g2.setColor(new Color(87, 52, 2));
		g2.fillRect(420, 250, 180, 300);
		
		g2.setColor(new Color(194, 142, 67));
		g2.fillRect(430, 260, 160, 290);
		
		g2.setColor(new Color(255, 196, 69));
		g2.fillOval(560, 420, 20, 20);
		
		g2.setColor(Color.white);
		g2.fillRoundRect(615, 300, 150, 150, 10, 10);
		
		
		g2.setColor(ventana);
		g2.fillRoundRect(625, 310, 60, 60,10,10);
		g2.fillRoundRect(625, 380, 60, 60,10,10);
		g2.fillRoundRect(695, 380, 60, 60,10,10);
		g2.fillRoundRect(695, 310, 60, 60,10,10);
		
		g2.setColor(Color.red);
		int [] xs = {170,500,830};
		int [] ys = {200,50,200};
		g2.fillPolygon(xs, ys, 3);
		
		g2.setColor(cemento);
		g2.fillRect(620, 70, 100, 120);
		
		g2.setColor(new Color(31, 28, 23));
		g2.fillRect(600, 70, 140, 30);
		
		g2.setColor(new Color(221, 128, 23));
		int [] xs2 = {170,200,200,185,170};
		int [] ys2 = {600,600,400,375,400};
	
		g2.fillPolygon(xs2, ys2, 5);
		
		int [] xs3 = {100,130,130,115,100};
		int [] ys3 = {600,600,400,375,400};
		g2.fillPolygon(xs3, ys3, 5);
		
		int [] xs4 = {30,60,60,45,30};
		int [] ys4 = {600,600,400,375,400};
		g2.fillPolygon(xs4, ys4, 5);
		
		int [] xs5 = {800,830,830,815,800};
		int [] ys5 = {600,600,400,375,400};
		g2.fillPolygon(xs5, ys5, 5);
		
		int [] xs6 = {880,910,910,895,880};
		int [] ys6 = {600,600,400,375,400};
		g2.fillPolygon(xs6, ys6, 5);
		
		int [] xs7 = {960,990,990,975,960};
		int [] ys7 = {600,600,400,375,400};
		g2.fillPolygon(xs7, ys7, 5);
	}
	
	
	
}
