package aplication;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SuperMarioWorld extends JFrame{
	
	//Colores a utilizar 
	Color cielo = new Color(6, 100, 191);
	Color nubes = new Color(238, 244, 255);
	Color sombraNube = new Color(176, 220, 230);
	Color cerro = new Color(198, 227, 231);
	Color sombraCerro = new Color(121, 172, 186);
	Color cerroAzul = new Color(118, 178, 215);
	Color sombraAzul = new Color(26, 91, 128);
	Color tierra = new 	Color(205, 159, 91);
	Color sombraTierra = new Color(124, 96, 30);
	Color bloque = new Color(251, 223, 43);
	Color sombraBloque = new Color(212, 168, 59);
	Color piedra = new Color(204, 200, 210);
	Color sombraPiedra = new Color(115, 113, 115);
	Color pasto = new Color(13, 198, 17);
	Color sombraPasto = new Color(36, 104, 59);
	
	public SuperMarioWorld() {
		this.setTitle("Mario Bros 3");
		this.setSize(1200, 800);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}

	
	public void paint (Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		
		//Dibujar el piso, cielo y pasto 
		g2.setColor(cielo);
		g2.fillRect(0, 0, 1200, 800);
		
		g2.setColor(tierra);
		g2.fillRect(0,680,1200,120);
		
		g2.setColor(sombraTierra);
		g2.fillRect(0, 680, 1200, 10);
		
		g2.setColor(pasto);
		g2.fillRect(0, 660, 1200, 20);
		
		g2.setColor(Color.black);
		g2.fillRect(0, 680, 1200, 4);
		
		g2.fillRect(0, 656, 1200, 4);
		
		g2.setColor(sombraPasto);
		g2.fillRect(0,673,1200,7);
		
		//dibujar las nubes y cerros
		dibujarNube(g2,800,200,nubes,sombraNube);
		dibujarNube(g2,350,445,nubes,sombraNube);
		dibujarNube(g2,200,515,nubes,sombraNube);
		dibujarNube(g2,400,586,nubes,sombraNube);
		
		dibujarCerro(g2,30,151,160,250,cerro,sombraCerro);
		dibujarCerro(g2,540,151,160,250,cerro,sombraCerro);
		dibujarCerro(g2,780,70,241,250,cerro,sombraCerro);
		dibujarNube(g2,680,390,nubes,sombraNube);
		dibujarCerro(g2,830,271,40,290,cerroAzul,sombraAzul);
		dibujarCerro(g2,540,460,-149,290,cerroAzul,sombraAzul);
	
		dibujarNube(g2,-130,250,nubes,sombraNube);
		dibujarNube(g2,280,300,nubes,sombraNube);
		dibujarCerro(g2,-100,460,-149,290,cerroAzul,sombraAzul);
		
		//Hacer los ovalos de los cerros
		g2.setColor(nubes);
		g2.fillOval(180, 180, 30, 60);
		g2.fillOval(180, 350, 30, 60);
		g2.fillOval(80, 400, 30, 60);
		
		g2.fillOval(680, 190, 30, 60);
		g2.fillOval(580, 230, 30, 60);
		g2.fillOval(580, 400, 30, 60);
		
		g2.fillOval(900, 100, 30, 60);
		g2.fillOval(840, 190, 30, 60);
		g2.fillOval(580, 400, 30, 60);
		
		g2.setColor(new Color(198, 228, 228));
		g2.fillOval(900, 350, 30, 60);
		g2.fillOval(980, 500, 30, 60);
		
		//Dibujar las nubes detras del tubo derecho
		dibujarNube(g2,950,586,nubes,sombraNube);
		dibujarNube(g2,1100,400,nubes,sombraNube);
		
		//Dibujar tubo
		g2.setStroke(new BasicStroke(4));
		g2.setColor(Color.black);
		g2.drawRect(630, 515, 130, 140);
		g2.drawRect(620, 465, 150, 50);
		
		g2.setColor(new Color(75, 72, 121));
		g2.fillRect(622, 467, 5, 46);
		g2.setColor(new Color(80, 75, 157));
		g2.fillRect(627, 467, 3, 46);
		g2.setColor(new Color(104, 103, 161));
		g2.fillRect(630, 467, 5, 186);
		g2.setColor(new Color(113, 111, 179));
		g2.fillRect(635, 467, 13, 186);
		g2.setColor(new Color(113, 110, 183));
		g2.fillRect(648, 467, 8, 186);
		g2.setColor(new Color(181, 183, 229));
		g2.fillRect(656, 467, 5, 186);
		g2.setColor(new Color(236, 243, 254));
		g2.fillRect(657, 467, 20, 186);
		g2.setColor(new Color(137, 132, 207));
		g2.fillRect(677, 467, 30, 186);
		g2.setColor(new Color(110, 107, 183));
		g2.fillRect(701, 467, 12, 186);
		g2.setColor(new Color(96, 95, 165));
		g2.fillRect(709, 467, 10, 186);
		g2.setColor(new Color(89, 91, 159));
		g2.fillRect(720, 467, 8, 186);
		g2.setColor(new Color(76, 73, 147));
		g2.fillRect(728, 467, 10, 186);
		g2.setColor(new Color(78, 75, 131));
		g2.fillRect(738, 467, 30, 50);
		g2.fillRect(728, 467, 30, 186);
		g2.setColor(new Color(65, 60, 100));
		g2.setColor(Color.black);
		g2.drawRect(630, 515, 130, 140);
		g2.drawRect(620, 465, 150, 50);
		
		//Dibujar tubo derecho
		g2.setStroke(new BasicStroke(4));
		g2.setColor(Color.black);
		g2.drawRect(1140, 515, 130, 140);
		g2.drawRect(1130, 465, 150, 50);
		
		g2.setColor(new Color(75, 72, 121));
		g2.fillRect(1132, 467, 5, 46);
		g2.setColor(new Color(80, 75, 157));
		g2.fillRect(1137, 467, 3, 46);
		g2.setColor(new Color(104, 103, 161));
		g2.fillRect(1140, 467, 5, 186);
		g2.setColor(new Color(113, 111, 179));
		g2.fillRect(1145, 467, 13, 186);
		g2.setColor(new Color(113, 110, 183));
		g2.fillRect(1158, 467, 8, 186);
		g2.setColor(new Color(181, 183, 229));
		g2.fillRect(1166, 467, 5, 186);
		g2.setColor(new Color(236, 243, 254));
		g2.fillRect(1167, 467, 20, 186);
		g2.setColor(new Color(137, 132, 207));
		g2.fillRect(1187, 467, 30, 186);
		g2.setColor(new Color(110, 107, 183));
		g2.fillRect(1211, 467, 12, 186);
		g2.setColor(new Color(96, 95, 165));
		g2.fillRect(1219, 467, 10, 186);
		g2.setColor(new Color(89, 91, 159));
		g2.fillRect(1230, 467, 8, 186);
		g2.setColor(new Color(76, 73, 147));
		g2.fillRect(1238, 467, 10, 186);
		g2.setColor(new Color(78, 75, 131));
		g2.fillRect(1248, 467, 30, 50);
		g2.fillRect(1238, 467, 30, 186);
		g2.setColor(new Color(65, 60, 100));
		g2.setColor(Color.black);
		g2.drawRect(1140, 515, 130, 140);
		g2.drawRect(1130, 465, 150, 50);
		
		//Dibujar bloques
		dibujarBloque(g2,1050,585,piedra, sombraPiedra,false);
		dibujarBloque(g2,1050,513,piedra, sombraPiedra,false);
		dibujarBloque(g2,1050,441,piedra, sombraPiedra,false);
		dibujarBloque(g2,1050,369,piedra, sombraPiedra,false);
		dibujarBloque(g2,1122,369,bloque, sombraBloque,true);
		
		//dibujar la imagen de mario
		ImageIcon mario = new ImageIcon(getClass().getResource("marioW.png"));
		g2.drawImage(mario.getImage() , 615, 500,-120,170, null);
		//Dibujar la imagen de la planta voladora
		ImageIcon planta = new ImageIcon(getClass().getResource("pirañaVoladora.png"));
		g2.drawImage(planta.getImage() , 630, 255,150,150, null);
		
	}
	
	public void dibujarCerro(Graphics2D g2, int x, int y, int alto,int largo, Color cerro, Color sombra) {
		g2.setColor(sombra);
		g2.fillArc(x, y, largo, 230, 0, 180);
		g2.fillRect(x, y+115, largo, alto+230);
		g2.setColor(cerro);
		g2.fillArc(x, y, largo-30, 230,0,180);
		g2.fillRect(x, y+115, largo-30, alto+230);
		/* La prueba del cerro para hacer la funcion
		g2.setColor(cerro);
		g2.fillArc(100, 200, 250, 230, 0, 180);
		g2.fillRect(100, 315, 250, 360);
		 */
	}
	
	public void dibujarNube(Graphics2D g2,int x, int y, Color nube, Color sombra) {
		g2.setColor(sombra);
		g2.fillArc(x, y, 70, 70, 90, 180);
		g2.fillRect(x+35, y, 270, 70);
		g2.fillArc(x+270, y, 70, 70, 90, -180);
		g2.setColor(nube);
		g2.fillArc(x, y, 70, 60, 90, 180);
		g2.fillRect(x+35,y,270,60);
		g2.fillArc(x+270, y, 70, 60, 90, -180);
		
		/* La prueba de la nube para hacer la funcion general
		g2.setColor(sombraNube);
		g2.fillArc(400, 400, 70, 70, 90, 180);
		g2.fillRect(435,400,270,70);
		g2.fillArc(670, 400, 70, 70, 90, -180);
		g2.setColor(nubes);
		g2.fillArc(400, 400, 70, 60, 90, 180);
		g2.fillRect(435,400,270,60);
		g2.fillArc(670, 400, 70, 60, 90, -180);
		 */
	}
	
	public void dibujarBloque(Graphics2D g2,int x, int y, Color bloque, Color sombra,boolean puntos) {
		g2.setColor(Color.black);
		g2.fillRoundRect(x, y, 72, 72,10,10);
		g2.setColor(sombra);
		g2.fillRoundRect(x+4, y+4, 65, 65,10,10);
		g2.setColor(bloque);
		g2.fillRoundRect(x+6, y+6, 56, 56,10,10);
		g2.setColor(Color.black);
		if (puntos) {
			g2.setColor(Color.black);
			g2.fillOval(x+20, y+25, 7, 16);
			g2.fillOval(x+40, y+25, 7, 16);
		}
		
	}
	
	
	
	
	
	
	
	
}
