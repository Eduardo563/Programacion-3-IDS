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
	
	Timer cronometro;

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
		JLabel lblNewLabel = new JLabel("0:00");
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		JButton btnNewButton = new JButton("Reiniciar");
		panel_2.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				player.x=200;
				player.y=200;
				panelPrin.requestFocus();
				panelPrin.repaint();
				
			}
			
		});
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
				g2.fillRect(obs.x, obs.y, obs.w-5, obs.h-5);
				
			}
			
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		zonaSeg();
		
		Boolean m = true;
		for (Player pared : obstaculos) {
			if(player.colision(pared)) {
				System.out.println("Colision detectada");
				m=false;
			}
		}
		
		
		if (e.getKeyCode()==38) {
			if (m) {
				player.y-=10;
				shadow.y=player.y;
				
			}
			else
				player.y=shadow.y+15;
		}
		else if (e.getKeyCode()==37) {
			if (m) {
				player.x-=10;
				shadow.x=player.x;
			}
			else
				player.x=shadow.x+15;
		}
		else if (e.getKeyCode()==39) {
			if (m) {
				player.x+=10;
				shadow.x=player.x;
			}
			else
				player.x=shadow.x-15;
		}
		else if (e.getKeyCode()==40) {
			if (m) {
				player.y+=10;
				shadow.y=player.y;
			}
			else
				player.y=shadow.y-15;
		}
		System.out.println(e.getKeyCode());
		panelPrin.repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void zonaSeg() {
		if (player.x < -20 ) {
			player.x=panelPrin.getWidth()-20;
		}
		else if(player.x>panelPrin.getWidth()-20) {
			player.x=-20;
		}
		else if(player.y>430) {
			player.y=-3;
		}
		else if(player.y<-20) {
			player.y=panelPrin.getHeight()-20;
		}
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
