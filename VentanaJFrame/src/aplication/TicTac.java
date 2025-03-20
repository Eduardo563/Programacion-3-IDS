package aplication;
 
 import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
 import java.awt.Font;
 
 import javax.swing.JFrame;
 import javax.swing.JOptionPane;
 import javax.swing.JPanel;
 import javax.swing.border.EmptyBorder;
 import java.awt.GridLayout;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
 
 public class TicTac extends JFrame {
 
 	private static final long serialVersionUID = 1L;
 	private JPanel contentPane;
 	
 	Font negrita = new Font("SansSerif",Font.BOLD,30);
 	
 	Boolean turno = true;
 	int contador =0;
 	
 	ImageIcon jugadorx = new ImageIcon(TicTac.class.getResource("/aplication/tache.png"));
	ImageIcon jugadoro = new ImageIcon(TicTac.class.getResource("/aplication/radio.png"));
	private JPanel Tictac;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JPanel puntos;
	private JPanel reinicio;
	private JLabel puntosX;
	private JLabel puntosO;
	private JButton reiniciar;
	int pX=0, pO=0;
 	/**
 	 * Launch the application.
 	 */
 	public static void main(String[] args) {
 		EventQueue.invokeLater(new Runnable() {
 			public void run() {
 				try {
 					TicTac frame = new TicTac();
 					frame.setVisible(true);
 				} catch (Exception e) {
 					e.printStackTrace();
 				}
 			}
 		});
 	}
 
 	/**
 	 * Create the frame.
 	 */
 	public TicTac() {
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		setBounds(100, 100, 532, 597);
 		contentPane = new JPanel();
 		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
 
 		setContentPane(contentPane);
 		contentPane.setLayout(new BorderLayout(0, 0));
 		
 		Tictac = new JPanel();
 		contentPane.add(Tictac);
 		Tictac.setLayout(new GridLayout(3, 3, 8, 8));
 		Tictac.setBackground(new Color(83, 200, 205));
 		Tictac.setBorder(new EmptyBorder(10,10,10,10));
 		
 		boton1 = new JButton("");
 		
 		boton1.setFont(new Font("SansSerif", Font.BOLD, 0));
 		boton1.setBackground(Color.WHITE);
 		Tictac.add(boton1);
 		boton1.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				
 				String jugador = "X";
 				if (turno) {
 					turno = false;
 					jugador="X";
 					boton1.setIcon(jugadorx);
 				}
 				else {
 					turno = true;
 					jugador="O";
 					boton1.setIcon(jugadoro);
 				}
 				
 				boton1.setText(jugador);
 				boton1.setEnabled(false);
 				verificacion();
 			}
 			
 		});
 		
 		boton2 = new JButton("");
 		boton2.setFont(new Font("SansSerif", Font.BOLD, 0));
 		boton2.setBackground(Color.WHITE);
 		Tictac.add(boton2);
 		boton2.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				String jugador = "X";
 				if (turno) {
 					turno = false;
 					jugador="X";
 					boton2.setIcon(jugadorx);
 				}
 				else {
 					turno = true;
 					jugador="O";
 					boton2.setIcon(jugadoro);
 				}
 				
 				boton2.setText(jugador);
 				boton2.setEnabled(false);
 				verificacion();
 			}
 			
 		});
 		
 		boton3 = new JButton("");
 		boton3.setFont(new Font("SansSerif", Font.BOLD, 0));
 		boton3.setBackground(Color.WHITE);
 		Tictac.add(boton3);
 		boton3.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				String jugador = "X";
 				if (turno) {
 					turno = false;
 					jugador="X";
 					boton3.setIcon(jugadorx);
 				}
 				else {
 					turno = true;
 					jugador="O";
 					boton3.setIcon(jugadoro);
 				}
 				
 				boton3.setText(jugador);
 				boton3.setEnabled(false);
 				verificacion();
 			}
 			
 		});
 		
 		boton4 = new JButton("");
 		boton4.setFont(new Font("SansSerif", Font.BOLD, 0));
 		boton4.setBackground(Color.WHITE);
 		Tictac.add(boton4);
 		boton4.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				String jugador = "X";
 				if (turno) {
 					turno = false;
 					jugador="X";
 					boton4.setIcon(jugadorx);
 				}
 				else {
 					turno = true;
 					jugador="O";
 					boton4.setIcon(jugadoro);
 				}
 				
 				boton4.setText(jugador);
 				boton4.setEnabled(false);
 				verificacion();
 			}
 			
 		});
 		
 		boton5 = new JButton("");
 		boton5.setFont(new Font("SansSerif", Font.BOLD, 0));
 		boton5.setBackground(Color.WHITE);
 		Tictac.add(boton5);
 		boton5.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				String jugador = "X";
 				if (turno) {
 					turno = false;
 					jugador="X";
 					boton5.setIcon(jugadorx);
 				}
 				else {
 					turno = true;
 					jugador="O";
 					boton5.setIcon(jugadoro);
 				}
 				
 				boton5.setText(jugador);
 				boton5.setEnabled(false);
 				verificacion();
 			}
 			
 		});
 		
 		boton6 = new JButton("");
 		boton6.setFont(new Font("SansSerif", Font.BOLD, 0));
 		boton6.setBackground(Color.WHITE);
 		Tictac.add(boton6);
 		boton6.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				String jugador = "X";
 				if (turno) {
 					turno = false;
 					jugador="X";
 					boton6.setIcon(jugadorx);
 				}
 				else {
 					turno = true;
 					jugador="O";
 					boton6.setIcon(jugadoro);
 				}
 				
 				boton6.setText(jugador);
 				boton6.setEnabled(false);
 				verificacion();
 			}
 			
 		});
 		
 		boton7 = new JButton("");
 		boton7.setFont(new Font("SansSerif", Font.BOLD, 0));
 		boton7.setBackground(Color.WHITE);
 		Tictac.add(boton7);
 		boton7.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				String jugador = "X";
 				if (turno) {
 					turno = false;
 					jugador="X";
 					boton7.setIcon(jugadorx);
 				}
 				else {
 					turno = true;
 					jugador="O";
 					boton7.setIcon(jugadoro);
 				}
 				
 				boton7.setText(jugador);
 				boton7.setEnabled(false);
 				verificacion();
 			}
 			
 		});
 		
 		boton8 = new JButton("");
 		boton8.setFont(new Font("SansSerif", Font.BOLD, 0));
 		boton8.setBackground(Color.WHITE);
 		Tictac.add(boton8);
 		boton8.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				String jugador = "X";
 				if (turno) {
 					turno = false;
 					jugador="X";
 					boton8.setIcon(jugadorx);
 				}
 				else {
 					turno = true;
 					jugador="O";
 					boton8.setIcon(jugadoro);
 				}
 				
 				boton8.setText(jugador);
 				boton8.setEnabled(false);
 				verificacion();
 			}
 			
 		});
 		
 		boton9 = new JButton("");
 		boton9.setFont(new Font("SansSerif", Font.BOLD, 0));
 		boton9.setBackground(Color.WHITE);
 		Tictac.add(boton9);
 		boton9.addActionListener(new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				String jugador = "X";
 				if (turno) {
 					turno = false;
 					jugador="X";
 					boton9.setIcon(jugadorx);
 				}
 				else {
 					turno = true;
 					jugador="O";
 					boton9.setIcon(jugadoro);
 				}
 				
 				boton9.setText(jugador);
 				boton9.setEnabled(false);
 				verificacion();
 			}
 			
 		});
 		
 		puntos = new JPanel();
 		puntos.setBackground(new Color(149, 207, 55));
 		contentPane.add(puntos, BorderLayout.NORTH);
 		
 		puntosX = new JLabel("Puntuacion X:"+pX+"\t\n");
 		puntosX.setFont(new Font("SansSerif", Font.BOLD, 20));
 		puntos.add(puntosX);
 		
 		puntosO = new JLabel("Puntuacion O:"+pO);
 		puntosO.setFont(new Font("SansSerif", Font.BOLD, 20));
 		puntos.add(puntosO);
 		
 		reinicio = new JPanel();
 		reinicio.setBackground(new Color(149, 207, 55));
 		contentPane.add(reinicio, BorderLayout.SOUTH);
 		
 		reiniciar = new JButton("Reiniciar");
 		reiniciar.setFont(negrita);
 		reiniciar.setBackground(new Color(58, 200, 120));
 		reiniciar.setPreferredSize(new Dimension(200,50));
 		reinicio.add(reiniciar);
 		reiniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reinicio();	
			}
 			
 		});
 	}
 	
 	
 	public void verificacion() {
 		contador++;
 		
 		
 		if ( !boton1.getText().isEmpty() && boton1.getText().equals(boton2.getText())
 			&& boton1.getText().equals(boton3.getText())){
 			if (boton1.getText().equals("X")) {
 				pX++;
 			}
 			else if(boton1.getText().equals("O")) {
 				pO++;
 			}
 			puntosX.setText("Puntuacion X: "+pX+"          ");
 	 		puntosO.setText("Puntuacion O: "+pO);
 	 		puntos.revalidate();
 	 		puntos.repaint();
 			System.out.println("Hola");
 			JOptionPane.showMessageDialog(null,"El jugador"+boton1.getText()+" a ganado");
 			deshabilitar();
 			
 			
 		}
 		else if (boton4.getText().equals(boton5.getText()) 
 				&& boton4.getText().equals(boton6.getText())
 				&& !boton4.getText().equals("")) 
 				{
	 			if (boton4.getText().equals("X")) {
	 				pX++;
	 			}
	 			else if(boton4.getText().equals("O")) {
	 				pO++;
	 			}
	 			puntosX.setText("Puntuacion X: "+pX+"          ");
	 	 		puntosO.setText("Puntuacion O: "+pO);
	 	 		puntos.revalidate();
	 	 		puntos.repaint();
	 			System.out.println("Hola");
	 			JOptionPane.showMessageDialog(null,"El jugador"+boton4.getText()+" a ganado");
	 			deshabilitar();
 			
 		}
 		else if (boton7.getText().equals(boton8.getText()) 
 				&& boton7.getText().equals(boton9.getText())
 				&& !boton7.getText().equals("")) 
 				{
 			if (boton7.getText().equals("X")) {
 				pX++;
 			}
 			else if(boton7.getText().equals("O")) {
 				pO++;
 			}
 			puntosX.setText("Puntuacion X: "+pX+"          ");
 	 		puntosO.setText("Puntuacion O: "+pO);
 	 		puntos.revalidate();
 	 		puntos.repaint();
 			System.out.println("Hola");
 			JOptionPane.showMessageDialog(null,"El jugador"+boton7.getText()+" a ganado");
 			deshabilitar();
 			
 		}
 		else if ( !boton1.getText().isEmpty() && boton1.getText().equals(boton4.getText())
 				&& boton1.getText().equals(boton7.getText())){
 				if (boton1.getText().equals("X")) {
	 				pX++;
	 			}
	 			else if(boton1.getText().equals("O")) {
	 				pO++;
	 			}
				puntosX.setText("Puntuacion X: "+pX+"          ");
		 		puntosO.setText("Puntuacion O: "+pO);
		 		puntos.revalidate();
		 		puntos.repaint();
 				System.out.println("Hola");
 				JOptionPane.showMessageDialog(null,"El jugador"+boton1.getText()+" a ganado");
 				deshabilitar();
 				
 			}
 		else if (boton2.getText().equals(boton5.getText()) 
 				&& boton2.getText().equals(boton8.getText())
 				&& !boton2.getText().equals("")) 
 				{
	 			if (boton2.getText().equals("X")) {
	 				pX++;
	 			}
	 			else if(boton2.getText().equals("O")) {
	 				pO++;
	 			}
	 			puntosX.setText("Puntuacion X: "+pX+"          ");
	 	 		puntosO.setText("Puntuacion O: "+pO);
	 	 		puntos.revalidate();
	 	 		puntos.repaint();
	 			System.out.println("Hola");
	 			JOptionPane.showMessageDialog(null,"El jugador"+boton2.getText()+" a ganado");
	 			deshabilitar();
	 			
 		}
 		else if (boton3.getText().equals(boton6.getText()) 
 				&& boton3.getText().equals(boton9.getText())
 				&& !boton3.getText().equals("")) 
 				{
	 			if (boton3.getText().equals("X")) {
	 				pX++;
	 			}
	 			else if(boton3.getText().equals("O")) {
	 				pO++;
	 			}
	 			puntosX.setText("Puntuacion X: "+pX+"          ");
	 	 		puntosO.setText("Puntuacion O: "+pO);
	 	 		puntos.revalidate();
	 	 		puntos.repaint();
	 			System.out.println("Hola");
	 			JOptionPane.showMessageDialog(null,"El jugador"+boton3.getText()+" a ganado");
	 			deshabilitar();
 			
 		}
 		else if ( !boton1.getText().isEmpty() && boton1.getText().equals(boton5.getText())
 				&& boton1.getText().equals(boton9.getText())){
 				if (boton1.getText().equals("X")) {
	 				pX++;
	 			}
	 			else if(boton1.getText().equals("O")) {
	 				pO++;
	 			}
				puntosX.setText("Puntuacion X: "+pX+"           ");
		 		puntosO.setText("Puntuacion O: "+pO);
		 		puntos.revalidate();
		 		puntos.repaint();
 				System.out.println("Hola");
 				JOptionPane.showMessageDialog(null,"El jugador"+boton1.getText()+" a ganado");
 				deshabilitar();

 			}
 		else if (boton3.getText().equals(boton5.getText()) 
 				&& boton3.getText().equals(boton7.getText())
 				&& !boton3.getText().equals("")) 
 				{
	 			if (boton3.getText().equals("X")) {
	 				pX++;
	 			}
	 			else if(boton3.getText().equals("O")) {
	 				pO++;
	 			}
	 			puntosX.setText("Puntuacion X: "+pX+"          ");
	 	 		puntosO.setText("Puntuacion O: "+pO);
	 	 		puntos.revalidate();
	 	 		puntos.repaint();
	 			System.out.println("Hola");
	 			JOptionPane.showMessageDialog(null,"El jugador"+boton2.getText()+" a ganado");
	 			deshabilitar();
 			
 		}
 		else if ( contador == 9) {
 			JOptionPane.showMessageDialog(null, "Es un empate");
 			deshabilitar();
 			
 		}
 		
 	}
 	public void reinicio() {
 		boton1.setText("");
 		boton2.setText("");
 		boton3.setText("");
 		boton4.setText("");
 		boton5.setText("");
 		boton6.setText("");
 		boton7.setText("");
 		boton8.setText("");
 		boton9.setText("");
 		boton1.setIcon(null);
 		boton2.setIcon(null);
 		boton3.setIcon(null);
 		boton4.setIcon(null);
 		boton5.setIcon(null);
 		boton6.setIcon(null);
 		boton7.setIcon(null);
 		boton8.setIcon(null);
 		boton9 .setIcon(null);
 		boton1.setEnabled(true);
 		boton2.setEnabled(true);
 		boton3.setEnabled(true);
 		boton4.setEnabled(true);
 		boton5.setEnabled(true);
 		boton6.setEnabled(true);
 		boton7.setEnabled(true);
 		boton8.setEnabled(true);
 		boton9.setEnabled(true);
 		contador=0;
 		
 	}	
	public void deshabilitar() {
		boton1.setEnabled(false);
		boton2.setEnabled(false);
		boton3.setEnabled(false);
		boton4.setEnabled(false);
		boton5.setEnabled(false);
		boton6.setEnabled(false);
		boton7.setEnabled(false);
		boton8.setEnabled(false);
		boton9.setEnabled(false);
	}
 		
 	
 
 }