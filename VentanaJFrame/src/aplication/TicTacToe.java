package aplication;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TicTacToe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	Font negrita = new Font("SansSerif",Font.BOLD,30);
	
	Boolean turno = true;
	
	
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;
	JButton boton5;
	JButton boton6;
	JButton boton7;
	JButton boton8;
	JButton boton9;
	int contador =0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe frame = new TicTacToe();
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
	public TicTacToe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
		
		boton1 = new JButton("");
		contentPane.add(boton1);
		boton1.setFont(negrita);
		boton1.setBackground(Color.white);
		boton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String jugador = "X";
				if (turno) {
					turno = false;
					jugador="X";
				}
				else {
					turno = true;
					jugador="O";
				}
				
				boton1.setText(jugador);
				boton1.setEnabled(false);
				verificacion();
			}
			
		});
		
		boton2 = new JButton("");
		contentPane.add(boton2);
		boton2.setFont(negrita);
		boton2.setBackground(Color.white);
		boton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String jugador = "X";
				if (turno) {
					turno = false;
					jugador="X";
				}
				else {
					turno = true;
					jugador="O";
				}
				
				boton2.setText(jugador);
				boton2.setEnabled(false);
				verificacion();
			}
			
		});
		
		
		boton3 = new JButton("");
		contentPane.add(boton3);
		boton3.setFont(negrita);
		boton3.setBackground(Color.white);
		boton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String jugador = "X";
				if (turno) {
					turno = false;
					jugador="X";
				}
				else {
					turno = true;
					jugador="O";
				}
				
				boton3.setText(jugador);
				boton3.setEnabled(false);
				verificacion();
			}
			
		});
		
		boton4 = new JButton("");
		contentPane.add(boton4);
		boton4.setFont(negrita);
		boton4.setBackground(Color.white);
		boton4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String jugador = "X";
				if (turno) {
					turno = false;
					jugador="X";
				}
				else {
					turno = true;
					jugador="O";
				}
				
				boton4.setText(jugador);
				boton4.setEnabled(false);
				verificacion();
			}
			
		});
		
		boton5 = new JButton("" );
		contentPane.add(boton5);
		boton5.setFont(negrita);
		boton5.setBackground(Color.white);
		boton5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String jugador = "X";
				if (turno) {
					turno = false;
					jugador="X";
				}
				else {
					turno = true;
					jugador="O";
				}
				
				boton5.setText(jugador);
				boton5.setEnabled(false);
				verificacion();
			}
			
		});
		
		boton6 = new JButton("");
		contentPane.add(boton6);
		boton6.setFont(negrita);
		boton6.setBackground(Color.white);
		boton6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String jugador = "X";
				if (turno) {
					turno = false;
					jugador="X";
				}
				else {
					turno = true;
					jugador="O";
				}
				
				boton6.setText(jugador);
				boton6.setEnabled(false);
				verificacion();
			}
			
		});
		
		boton7 = new JButton( "");
		contentPane.add(boton7);
		boton7.setFont(negrita);
		boton7.setBackground(Color.white);
		boton7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String jugador = "X";
				if (turno) {
					turno = false;
					jugador="X";
				}
				else {
					turno = true;
					jugador="O";
				}
				
				boton7.setText(jugador);
				boton7.setEnabled(false);
				verificacion();
			}
			
		});
		
		boton8 = new JButton("" );
		contentPane.add(boton8);
		boton8.setFont(negrita);
		boton8.setBackground(Color.white);
		boton8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String jugador = "X";
				if (turno) {
					turno = false;
					jugador="X";
				}
				else {
					turno = true;
					jugador="O";
				}
				
				boton8.setText(jugador);
				boton8.setEnabled(false);
				verificacion();
			}
			
		});
		
		boton9 = new JButton("");
		contentPane.add(boton9);
		boton9.setFont(negrita);
		boton9.setBackground(Color.white);
		boton9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String jugador = "X";
				if (turno) {
					turno = false;
					jugador="X";
				}
				else {
					turno = true;
					jugador="O";
				}
				
				boton9.setText(jugador);
				boton9.setEnabled(false);
				verificacion();
			}
			
		});
	}
	
	
	public void verificacion() {
		contador++;
		if ( !boton1.getText().isEmpty() && boton1.getText().equals(boton2.getText())
			&& boton1.getText().equals(boton3.getText())){
			System.out.println("Hola");
			JOptionPane.showMessageDialog(null,"El jugador"+boton1.getText()+" a ganado");
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
		else if (boton4.getText().equals(boton5.getText()) 
				&& boton4.getText().equals(boton6.getText())
				&& !boton4.getText().equals("")) 
				{
			System.out.println("Hola");
			JOptionPane.showMessageDialog(null,"El jugador"+boton4.getText()+" a ganado");
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
		else if (boton7.getText().equals(boton8.getText()) 
				&& boton7.getText().equals(boton9.getText())
				&& !boton7.getText().equals("")) 
				{
			System.out.println("Hola");
			JOptionPane.showMessageDialog(null,"El jugador"+boton7.getText()+" a ganado");
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
		else if ( !boton1.getText().isEmpty() && boton1.getText().equals(boton4.getText())
				&& boton1.getText().equals(boton7.getText())){
				System.out.println("Hola");
				JOptionPane.showMessageDialog(null,"El jugador"+boton1.getText()+" a ganado");
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
		else if (boton2.getText().equals(boton5.getText()) 
				&& boton2.getText().equals(boton8.getText())
				&& !boton2.getText().equals("")) 
				{
			System.out.println("Hola");
			JOptionPane.showMessageDialog(null,"El jugador"+boton2.getText()+" a ganado");
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
		else if (boton3.getText().equals(boton6.getText()) 
				&& boton3.getText().equals(boton9.getText())
				&& !boton3.getText().equals("")) 
				{
			System.out.println("Hola");
			JOptionPane.showMessageDialog(null,"El jugador"+boton3.getText()+" a ganado");
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
		else if ( !boton1.getText().isEmpty() && boton1.getText().equals(boton5.getText())
				&& boton1.getText().equals(boton9.getText())){
				System.out.println("Hola");
				JOptionPane.showMessageDialog(null,"El jugador"+boton1.getText()+" a ganado");
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
		else if (boton3.getText().equals(boton5.getText()) 
				&& boton3.getText().equals(boton7.getText())
				&& !boton3.getText().equals("")) 
				{
			System.out.println("Hola");
			JOptionPane.showMessageDialog(null,"El jugador"+boton2.getText()+" a ganado");
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
		else if ( contador == 9) {
			JOptionPane.showMessageDialog(null, "Es un empate");
		}
		
	}

}
