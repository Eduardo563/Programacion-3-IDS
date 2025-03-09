package aplication;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SuperMarioBros3 extends JFrame{

	Color cielo = new Color(178, 238, 254);
	Color verdePilar = new Color(81, 217, 110);
	Color verdeSombra = new Color(43, 119, 46);
	Color azulPilar = new Color(132, 191, 255);
	Color azulSombra = new Color(35, 142, 220);
	Color rosaPilar = new Color(255, 195, 184);
	Color rosaSombra = new Color(239, 155, 114);
	Color bloque = new Color(251, 146, 93);
	Color pisoRosa = new Color(247, 205, 179);
	Color tornillos = new Color(188, 197, 210);
	Color base = new Color(230, 151, 115);
	Image marioImg;
	public SuperMarioBros3() {
		this.setTitle("Mario Bros 3");
		this.setSize(1200, 650);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
	}
	
	public void paint (Graphics g) {
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		//Pintar cielo
		g2.setColor(cielo);
		g2.fillRect(0, 0, 1200, 800);
		
		//La base del piso
		g2.setColor(base);
		g2.fillRect(0, 580, 1200, 70);
		
		//Piso
		g2.setColor(pisoRosa);
		g2.fillRect(0,540,1200,40);	
		
		//Rayas de separacion del piso
		g2.setStroke(new BasicStroke(3));
		g2.setColor(new Color(99, 50, 28));
		g2.drawLine(0, 580, 1200, 580);
		g2.setColor(new Color(63, 60, 59));
		g2.drawLine(0, 540, 1200, 540);
		
		//Dibujar los rectangulos de colores y los tornillos
		dibujarRect(g2,370,242,200,300,azulSombra,azulPilar);
		dibujarTorni(g2,380,250,28,tornillos);
		dibujarTorni(g2,530,250,28,tornillos);
		dibujarTorni(g2,530,505,28,tornillos);
		dibujarRect(g2,230,350,200,190,rosaSombra,rosaPilar);
		dibujarTorni(g2,240,358,28,tornillos);
		dibujarTorni(g2,390,358,28,tornillos);
		dibujarTorni(g2,240,505,28,tornillos);
		dibujarTorni(g2,390,505,28,tornillos);
		dibujarRect(g2,1050,350,200,190,verdeSombra,verdePilar);
		dibujarTorni(g2,1060,358,28,tornillos);
		dibujarTorni(g2,1060,505,28,tornillos);
		
		//Dibujar el tubo de planta pirhanna
		g2.setStroke(new BasicStroke(4));
		g2.setColor(Color.black);
		g2.drawRect(820, 400, 130, 140);
		g2.drawRect(810, 350, 150, 50);
		
		g2.setColor(new Color(35, 152, 48));
		g2.fillRect(812, 352, 5, 46);
		g2.setColor(new Color(81, 211, 83));
		g2.fillRect(817, 352, 3, 46);
		g2.setColor(new Color(67, 178, 86));
		g2.fillRect(820, 352, 5, 186);
		g2.setColor(new Color(90, 213, 107));
		g2.fillRect(825, 352, 13, 186);
		g2.setColor(new Color(22, 128, 16));
		g2.fillRect(838, 352, 8, 186);
		g2.setColor(new Color(77, 190, 81));
		g2.fillRect(846, 352, 5, 186);
		g2.setColor(new Color(25, 136, 22));
		g2.fillRect(851, 352, 40, 186);
		g2.setColor(new Color(99, 202, 99));
		g2.fillRect(891, 352, 10, 186);
		g2.setColor(new Color(25, 136, 22));
		g2.fillRect(901, 352, 8, 186);
		g2.setColor(Color.black);
		g2.fillRect(909, 352, 5, 186);
		g2.setColor(new Color(36, 117, 30));
		g2.fillRect(914, 352, 8, 186);
		g2.setColor(Color.black);
		g2.fillRect(922, 352, 4, 186);
		g2.setColor(new Color(36, 117, 30));
		g2.fillRect(926, 352, 5, 186);
		g2.setColor(Color.black);
		g2.fillRect(931, 352, 14, 186);
		g2.setColor(new Color(36, 117, 30));
		g2.fillRect(945, 352, 4, 186);
		g2.setColor(new Color(17, 35, 14));
		g2.fillRect(949, 352, 5, 46);
		g2.setColor(Color.black);
		g2.fillRect(954, 352, 5, 46);
		g2.drawRect(820, 400, 130, 140);
		
		//Dibujar y poner bloques
		bloque(g2,220,90,bloque);
		bloque(g2,291,90,bloque);
		bloque(g2,80,240,bloque);
		bloque(g2,1100,140,bloque);
		
		//dibujar arbusto
		g2.setColor(new Color(91, 215, 110));
		g2.fillArc(89, 464, 69, 149, 0, 180);
		g2.setColor(Color.black);
		g2.drawArc(90, 465, 70, 150, 0, 145);
		g2.setColor(new Color(91, 215, 110));
		g2.fillArc(40, 480, 75, 117, 0, 180);
		g2.setColor(Color.black);
		g2.drawArc(40, 480, 70, 90, 20, 180);
		
		
		
		ImageIcon mario = new ImageIcon(getClass().getResource("mario tanooki.png"));
		g2.drawImage(mario.getImage() , 500, 390,150,150, null);
		
		ImageIcon planta = new ImageIcon(getClass().getResource("planta Piraña.png"));
		g2.drawImage(planta.getImage(), 810, 180, 130, 170, null);	
		
		ImageIcon fuego = new ImageIcon(getClass().getResource("fire piraña.png"));
		g2.drawImage(fuego.getImage(), 680, 320, 50, 50, null);	
		
		//Dibujar lineas
		
		g2.drawLine(10, 580, 143, 790);
		g2.drawLine(50, 580, 273, 790);
		g2.drawLine(90, 580, 403, 790);
		g2.drawLine(140, 580, 533, 790);
	}
	
	public void dibujarRect(Graphics2D g2, int x, int y, int ancho, int alto, Color sombra, Color pilar) {
		//Sombra negra
		g2.setColor(Color.black);
		g2.fillRoundRect(x,y+20,ancho+20,alto-20,10,20);
		//Borde del rectangulo
		g2.setColor(Color.black);
		g2.fillRoundRect(x, y, ancho, alto, 10, 20);
		//Sombra azul del rectnagulo
		g2.setColor(sombra);
		g2.fillRoundRect(x+5, y+3, ancho-8, alto-6, 10, 20);
		//Pilar rectangulo
		g2.setColor(pilar);
		g2.fillRoundRect(x+5, y+3, ancho-18, alto-12, 10, 20);
	}
	
	/* Como se hizo el primer bloque azul para despues hacer la funcion 
	//Borde del rectangulo
	g2.setColor(Color.black);
	g2.fillRoundRect(330, 242, 250, 300, 10, 20);
	//Sombra azul del rectnagulo
	g2.setColor(azulSombra);
	g2.fillRoundRect(335, 245, 242, 294, 10, 20);
	//Pilar rectangulo
	g2.setColor(azulPilar);
	g2.fillRoundRect(335, 245, 230, 294, 10, 20);
	*/
	
	public void dibujarTorni (Graphics2D g2,int x, int y, int tamaño, Color torni) {
		g2.setColor(Color.black);
		g2.fillOval(x, y, tamaño, tamaño);
		g2.setColor(torni);
		g2.fillOval(x + 3, y + 3, tamaño-6, tamaño-6);
		g2.setColor(Color.black);
		g2.drawLine(x+6, y+22, x+22, y+5);
	}
	public void bloque(Graphics2D g2, int x, int y, Color bloque) {
		g2.setColor(Color.black);
		g2.fillRect(x, y, 72, 72);
		g2.setColor(rosaPilar);
		g2.fillRect(x+4, y+4, 65, 65);
		g2.setColor(bloque);
		g2.fillRect(x+6, y+6, 63, 63);
		g2.setColor(Color.black);
		g2.fillOval(x+6, y+6, 5, 5);
		g2.fillOval(x+59, y+6, 5, 5);
		g2.fillOval(x+6, y+58, 5, 5);
		g2.fillOval(x+59, y+58, 5, 5);
		
	}
}



