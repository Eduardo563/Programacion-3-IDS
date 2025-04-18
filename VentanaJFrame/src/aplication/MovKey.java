package aplication;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import aplication.Paint.Figura;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MovKey implements KeyListener {

	private JFrame frame;
	int x=200, y=200;
	private Player player=null;
	private Player shadow=null;
	private Player titan= null;
	private boolean ganar=false;
	panelDibujo panelPrin;
	private ArrayList<Player> obstaculos = new ArrayList<Player>();
	private ArrayList<Player> camino = new ArrayList<Player>();
	private int segundos,lastPress;
	JLabel lblNewLabel;
	Timer cronometro,moveAut;
	int milisegundos=0;
	int minutos =0;
	ImageIcon bloqueGris = new ImageIcon(MovKey.class.getResource("/aplication/tileGrayPrin.png"));
	ImageIcon titanImg = new ImageIcon(MovKey.class.getResource("/aplication/bt titanSin.png"));
	ImageIcon piloto = new ImageIcon(MovKey.class.getResource("/aplication/jackPilot.png"));
	ImageIcon pilotoJack = new ImageIcon(MovKey.class.getResource("/aplication/jackCooperMegamanEsc.png"));
	ImageIcon tierra = new ImageIcon(MovKey.class.getResource("/aplication/tile_0049.png"));
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MovKey window = new MovKey();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MovKey() {
		initialize();
		crearLaberinto();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1300, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		
		panelPrin = new panelDibujo();
		frame.getContentPane().add(panelPrin, BorderLayout.CENTER);
		panelPrin.addKeyListener(this);
		panelPrin.setFocusable(true);
		
		//Se inicializan el jugador, su clon y el titan que es la meta del laberinto
		player = new Player(30,30,16,17,Color.green,pilotoJack);
		shadow = new Player(30,30,16,17,Color.green,pilotoJack);
		titan = new Player(1340,685,57,63,Color.green,titanImg);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(28, 61, 114));
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		lblNewLabel = new JLabel("0:00:00");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(28, 61, 114));
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(62, 124, 67));
		panel_2.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
		//Al presionar reiniciar hace que todos los metodos vuelvan a valores iniciales o los detiene directamente
			@Override
			public void actionPerformed(ActionEvent e) {
				ganar=false;
				reiniciarCrono();
				moveAut.stop();
				lblNewLabel.setText("0:00:00");
				player.x=30;
				player.y=30;
				shadow.x=30;
				shadow.y=30;
				panelPrin.requestFocus();
				panelPrin.repaint();
				
			}
			
		});
		//Construccion del timer para el cronometro y medir el tiempo
		cronometro = new Timer(100, new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            milisegundos += 100;
	            if (milisegundos == 1000) {
	                milisegundos = 0;
	                segundos++;
	                if (segundos == 60) {
	                    segundos = 0;
	                    minutos++;
	                }
	            }
	            String formatoCuenta = String.format("%02d:%02d:%02d", minutos, segundos, milisegundos/10);
	            lblNewLabel.setText(formatoCuenta);
	        }
	    });
		
		// Uso de un action listener y un timer para dar movimiento automatico al jugador
		ActionListener automatizacion = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				zonaSeg();
				update();
				panelPrin.repaint();
				
				
			}
			
		};
		moveAut = new Timer(1,automatizacion);
	}
	//Metodo para reiniciar el cronometro
	public void reiniciarCrono() {
		cronometro.stop();
		milisegundos=0;
		segundos=0;
		minutos=0;
		lblNewLabel.setText("0:00");
	}
	
	// Clase interna personalizada para crear el panel donde se hará el laberinto
	class panelDibujo extends JPanel{
		public panelDibujo() {
			this.setBackground(new Color(231, 212, 169));
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Graphics2D g2 = (Graphics2D) g;
			//Se usa este arreglo para generar las imagenes de tierra para los caminos que puede recorrer el jugador
			for (Player caminos : camino) {
				g2.drawImage(caminos.imagen.getImage(), caminos.x, caminos.y, caminos.w, caminos.h, this);
			}
			//Se dibuja al jugador
			g2.drawImage(player.imagen.getImage(), player.x, player.y, player.w, player.h, this);
			//Se dibuja al titan
			g2.drawImage(titan.imagen.getImage(), titan.x, titan.y, titan.w, titan.h, this);
			
			// Se usa este arreglo para generar las imagenes de los bloques que obstaculizan al jugador
			for (Player obs : obstaculos) {
				g2.drawImage(obs.imagen.getImage(), obs.x, obs.y, obs.w, obs.h, this);
			}
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (!ganar) {
			lastPress = e.getKeyCode();
			update();
			cronometro.start();
			moveAut.start();
			panelPrin.repaint();
		}
		
		System.out.println(e.getKeyCode());
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	//Metodo que permite que se mueva al jugador por el laberinto y verifica que no haya colisiones con las paredes
	public void update() {
		ganar();
		boolean m = true;
		
		shadow.x=player.x;
		shadow.y=player.y;
		
		
		if (lastPress==38) {
			player.y-=2;	
		}
		else if (lastPress==37) {	
			player.x-=2;
		}
		else if (lastPress==39) {
			player.x+=2;
		}
		else if (lastPress==40) {
			player.y+=2;
		}
		
		for (Player pared : obstaculos) {
			if(player.colision(pared)) {
				System.out.println("Colision detectada");
				m = false;
			}
		}
		if (m) {
			shadow.x=player.x;
			shadow.y=player.y;
		}
		else {
			player.x=shadow.x;
			player.y=shadow.y;
		}
		if (!m) {
			moveAut.stop();
		}
		
	}
	
	//Metodo para que el jugador se cambie de una lado a otro contrario cuando se pase de los limites del panel
	public void zonaSeg() {
		if (player.x+16 < 0) {
			player.x=panelPrin.getWidth()-16;
		}
		else if(player.x+16>panelPrin.getWidth()) {
			player.x=-20;
		}
		else if(player.y+16>panelPrin.getHeight()) {
			player.y=-20;
		}
		else if(player.y+16< 0) {
			player.y+=panelPrin.getHeight();
		}
		panelPrin.repaint();
	}
	
	//Metodo que contiene la verificacion en caso de un ganador y contiene los recursos para mostrar los OptinPane correspondientes
	public void ganar() {
		String [] opciones = {"SI", "SALIR"};
		ImageIcon btgif = new ImageIcon(MovKey.class.getResource("/aplication/bt enter.gif"));
		ImageIcon btPulgar = new ImageIcon(MovKey.class.getResource("/aplication/bt0 pulgarArriba.gif"));
		JLabel extraccion = new JLabel("Extraccion de Piloto");
		extraccion.setFont(new Font("Lucida Console",Font.PLAIN,18));
		extraccion.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel tiempo = new JLabel("Tiempo en llegar al titan:" +lblNewLabel.getText());
		tiempo.setHorizontalAlignment(SwingConstants.CENTER);
		tiempo.setFont(new Font("Lucida Console",Font.PLAIN,18));
		JLabel gif = new JLabel(btgif);
		
		//Se usa este panel para tener un mejor acomodo del gif y texto mostrado en el OptionPane siguiente
		JPanel ganadorMes = new JPanel();
		ganadorMes.setLayout(new BorderLayout());
		ganadorMes.add(extraccion,BorderLayout.NORTH);
		ganadorMes.add(gif,BorderLayout.CENTER);
		ganadorMes.add(tiempo,BorderLayout.SOUTH);
		
		if (player.colision(titan)) {
			cronometro.stop();
			moveAut.stop();
			ganar = true;
			JOptionPane.showMessageDialog(null, ganadorMes,"Encuentro con titan",JOptionPane.INFORMATION_MESSAGE);
			
			//Se toma el valor del OptionDialog para saber si se debe reiniciar el juego o cerrar el programa
			int confirmacion = JOptionPane.showOptionDialog(null, "Desea volver a jugar?","Laberinto Resuelto", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,btPulgar,opciones,opciones[0] );
			if (confirmacion ==0) {
				ganar=false;
				reiniciarCrono();
				moveAut.stop();
				lblNewLabel.setText("0:00:00");
				player.x=30;
				player.y=30;
				shadow.x=30;
				shadow.y=30;
				panelPrin.requestFocus();
				panelPrin.repaint();
			}
			else {
				System.exit(0);
			}
		}

	}
	
	//Clase personalizada de Player para crear al jugador, el titan y los obstaculos
	class  Player {
		
		int x, y, w, h;
		Color color;
		private ImageIcon imagen;
		
		
		Player(int x, int y, int w, int  h, Color color, ImageIcon imagen){
			this.x=x;
			this.y=y;
			this.w=w;
			this.h=h;
			this.color=color;
			this.imagen = imagen;
		}
		//Verifica si existe una colision
		public boolean colision(Player target) {
				return 	(this.x < target.x + target.w &&
	                this.x + this.w > target.x &&
	                this.y < target.y + target.h &&
	                this.y + this.h > target.y);
					
				
		}
	}
	//Este metodo contiene una matriz de 32 x 62 que representa el mapa del laberinto
	public void crearLaberinto() {
		//Son los valores que tiene cada celda
		int ancho = 24;
		int alto = 25;
		
		int[][] lab = {
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			  	{1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			  	{1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,1},
			    {1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,0,1},
			    {1,0,1,1,1,1,1,1,1,0,1,0,1,0,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,0,1,0,1,0,1,1},
			    {1,0,1,0,0,0,1,0,0,0,1,0,1,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,1},
			    {1,0,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,0,1,1,1,1},
			    {1,0,1,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,1,0,1,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,1},
			    {1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,1,1,1,1,1},
			    {1,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,0,1},
			    {1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1,0,1,0,1,1,1,0,1,0,1,1,1,1},
			    {1,0,0,0,1,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1},
			    {1,0,1,1,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1},
			    {1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1},
			    {1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1,1,0,1,1},
			    {1,0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,1,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,0,1},
			    {1,0,1,1,1,0,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,0,1,0,1,1},
			    {1,0,0,0,1,0,1,0,1,0,0,0,1,0,0,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1},
			    {1,0,1,1,1,0,1,0,1,0,1,1,1,1,1,0,1,0,1,0,1,0,1,1,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1},
			    {1,0,1,0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,1},
			    {1,1,1,0,1,1,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1,1},
			    {1,0,0,0,1,0,0,0,1,0,1,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,1,0,0,1},
			    {1,0,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1},
			    {1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1},
			    {1,0,1,0,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,0,1},
			    {1,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,1},
			    {1,0,1,1,1,1,1,1,1,0,1,0,1,0,1,1,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1,1,0,1,0,1,0,1,0,1,1,1,0,1,1},
			    {1,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,0,0,0,1},
			    {1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,0,0,0,0,1},
			    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1},
			    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
			};
		
		 for (int fila = 0; fila < lab.length; fila++) {
		        for (int col = 0; col < lab[fila].length; col++) {
		        	//Si es un obstaculo dibuja el bloque respectivo
		            if (lab[fila][col] == 1) {
		                int x = col * ancho;
		                int y = fila * alto;
		                obstaculos.add(new Player(x, y, ancho, alto, Color.orange,bloqueGris));
		               
		            }
		            //Si es un espacio vacio dibuja la imagen de tierra
		            if (lab[fila][col] == 0) {
		            	int x = col * ancho;
		                int y = fila * alto;
		                camino.add(new Player(x, y, ancho, alto, Color.orange,tierra));
		            }
		        }
		    }  
		 
	}
}
