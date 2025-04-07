package aplication;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;

public class MovKey implements KeyListener {

	private JFrame frame;
	int x=200, y=200;
	panelDibujo panelPrin;

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
				x=200;
				y=200;
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
			g2.fillRect(x, y, 40, 40);
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode()==38) {
			y-=10;
		}
		else if (e.getKeyCode()==37) {
			x-=10;	
		}
		else if (e.getKeyCode()==39) {
			x+=10;
		}
		else if (e.getKeyCode()==40) {
			y+=10;
		}
		System.out.println(e.getKeyCode());
		panelPrin.repaint();
		zonaSeg();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void zonaSeg() {
		if (x < -20 ) {
			x=panelPrin.getWidth()-20;
		}
		else if(x>panelPrin.getWidth()-20) {
			x=-20;
		}
		else if(y>430) {
			y=-3;
		}
		else if(y<-20) {
			y=panelPrin.getHeight()-20;
		}
	}
}
