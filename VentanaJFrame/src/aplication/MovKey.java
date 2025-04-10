package aplication;

import java.awt.EventQueue;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import aplication.Paint.Figura;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;

public class MovKey implements KeyListener {

	private JFrame frame;
	int x=200, y=200;
	private Player player=null;
	private Player shadow=null;
	panelDibujo panelPrin;
	private ArrayList<Player> obstaculos = new ArrayList<Player>();
	private int segundos,lastPress;
	JLabel lblNewLabel;
	Timer cronometro,moveAut;
	int milisegundos=0;
	int minutos =0;
	

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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 953, 538);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelPrin = new panelDibujo();
		frame.getContentPane().add(panelPrin, BorderLayout.CENTER);
		panelPrin.addKeyListener(this);
		panelPrin.setFocusable(true);
		
		player = new Player(200,200,40,40,Color.green);
		shadow = new Player(200,200,40,40,Color.green);
		obstaculos.add(new Player(150,350,220,30,Color.orange));
		obstaculos.add(new Player(150,100,220,30,Color.orange));
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		lblNewLabel = new JLabel("0:00");
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		JButton btnNewButton = new JButton("Reiniciar");
		panel_2.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reiniciarCrono();
				moveAut.stop();
				player.x=200;
				player.y=200;
				shadow.x=200;
				shadow.y=200;
				panelPrin.requestFocus();
				panelPrin.repaint();
				
			}
			
		});
		
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
	            lblNewLabel.setText(minutos + ":" + segundos + " :" + milisegundos);
	        }
	    });
		
		
		ActionListener automatizacion = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				zonaSeg();
				update();
				panelPrin.repaint();
				
				
			}
			
		};
		moveAut = new Timer(5,automatizacion);
	}
	
	public void reiniciarCrono() {
		cronometro.stop();
		milisegundos=0;
		segundos=0;
		minutos=0;
		lblNewLabel.setText("0:00");
	}
	
	
	class panelDibujo extends JPanel{
		public panelDibujo() {
			this.setBackground(Color.black);
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Graphics2D g2 = (Graphics2D) g;
			
			g2.setColor(Color.green);
			g2.fillRect(player.x, player.y, 40, 40);
			
			for (Player obs : obstaculos) {
				g2.setColor(obs.color);
				g2.fillRect(obs.x, obs.y, obs.w, obs.h);
				
			}
			
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		cronometro.start();
		moveAut.start();
		lastPress = e.getKeyCode();
		update();
		System.out.println(e.getKeyCode());
		panelPrin.repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void update() {
		boolean m = true;
		
		shadow.x=player.x;
		shadow.y=player.y;
		
		
		if (lastPress==38) {
			player.y-=3;	
		}
		else if (lastPress==37) {	
			player.x-=3;
		}
		else if (lastPress==39) {
			player.x+=3;
		}
		else if (lastPress==40) {
			player.y+=3;
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
	
	public void zonaSeg() {
		if (player.x+40 < 0) {
			player.x=panelPrin.getWidth()-40;
		}
		else if(player.x+40>panelPrin.getWidth()) {
			player.x=-20;
		}
		else if(player.y+40>panelPrin.getHeight()) {
			player.y=-20;
		}
		else if(player.y+40 < 0) {
			player.y+=panelPrin.getHeight();
		}
		panelPrin.repaint();
	}
	
	class  Player {
		
		int x, y, w, h;
		Color color;
		
		
		Player(int x, int y, int w, int  h, Color color){
			this.x=x;
			this.y=y;
			this.w=w;
			this.h=h;
			this.color=color;
		}
		
		public boolean colision(Player target) {
				return 	(this.x < target.x + target.w &&
	                this.x + this.w > target.x &&
	                this.y < target.y + target.h &&
	                this.y + this.h > target.y);
					
				
		}
	}
}
