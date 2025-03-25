package aplication;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class Puzzle15 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Font cuerpo = new Font("SansSerif",Font.PLAIN,18);
	Font negrita = new Font("SansSerif",Font.BOLD,22);
	
	Color botonC = new Color(238, 250, 246);
	Color botonBor = new Color(42, 214, 160);
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Puzzle15 frame = new Puzzle15();
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
	public Puzzle15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 712);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(40, 20, 20, 20));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		contentPane.setBackground(new Color(62, 162, 215));
		
		
		JPanel panelArriba = new JPanel();
		contentPane.add(panelArriba, BorderLayout.NORTH);
		panelArriba.setBackground(new Color(62, 162, 215));
		
		
		JPanel panelizq = new JPanel();
		contentPane.add(panelizq, BorderLayout.WEST);
		panelizq.setBackground(new Color(62, 162, 215));
		JLabel espacioIzq = new JLabel("          ");
		panelizq.add(espacioIzq);
		
		JPanel panelAbajo = new JPanel();
		contentPane.add(panelAbajo, BorderLayout.SOUTH);
		panelAbajo.setBackground(new Color(62, 162, 215));
		
		JPanel panelDer = new JPanel();
		contentPane.add(panelDer, BorderLayout.EAST);
		panelDer.setBackground(new Color(62, 162, 215));
		JLabel espacioDer = new JLabel("          ");
		panelDer.add(espacioDer);
		
		JPanel panelNum = new JPanel();
		panelNum.setBorder(new EmptyBorder(5,5,20,5));
		panelNum.setLayout(new GridLayout(4,4,8,8));
		contentPane.add(panelNum, BorderLayout.CENTER);
		panelNum.setBackground(new Color(62, 162, 215));
		
		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.setBackground(Color.white);
		reiniciar.setPreferredSize(new Dimension(200,50));
		reiniciar.setFont(negrita);
		reiniciar.setBorder(BorderFactory.createLineBorder(botonBor, 3, true));
		panelAbajo.add(reiniciar);
		
		//----------------------------Botones-----------------------------
		JButton b1 = new JButton("1");
		b1.setFont(negrita);
		b1.setBackground(botonC);
		b1.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		panelNum.add(b1);
		
		JButton b2 = new JButton("2");
		b2.setFont(negrita);
		b2.setBackground(botonC);
		b2.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		panelNum.add(b2);
		JButton b3 = new JButton("3");
		b3.setFont(negrita);
		b3.setBackground(botonC);
		b3.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		panelNum.add(b3);
		JButton b4 = new JButton("4");
		b4.setFont(negrita);
		b4.setBackground(botonC);
		b4.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		panelNum.add(b4);
		JButton b5 = new JButton("5");
		b5.setFont(negrita);
		b5.setBackground(botonC);
		b5.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		panelNum.add(b5);
		JButton b6 = new JButton("6");
		b6.setFont(negrita);
		b6.setBackground(botonC);
		b6.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		panelNum.add(b6);
		JButton b7 = new JButton("7");
		b7.setFont(negrita);
		b7.setBackground(botonC);
		b7.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		panelNum.add(b7);
		JButton b8 = new JButton("8");
		b8.setFont(negrita);
		b8.setBackground(botonC);
		b8.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		panelNum.add(b8);
		JButton b9 = new JButton("9");
		b9.setFont(negrita);
		b9.setBackground(botonC);
		b9.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		panelNum.add(b9);
		JButton b10 = new JButton("10");
		b10.setFont(negrita);
		b10.setBackground(botonC);
		b10.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		panelNum.add(b10);
		JButton b11 = new JButton("11");
		b11.setFont(negrita);
		b11.setBackground(botonC);
		b11.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		panelNum.add(b11);
		JButton b12 = new JButton("12");
		b12.setFont(negrita);
		b12.setBackground(botonC);
		b12.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		panelNum.add(b12);
		JButton b13 = new JButton("13");
		b13.setFont(negrita);
		b13.setBackground(botonC);
		b13.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		panelNum.add(b13);
		JButton b14 = new JButton("14");
		b14.setFont(negrita);
		b14.setBackground(botonC);
		b14.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		panelNum.add(b14);
		JButton b15 = new JButton("15");
		b15.setFont(negrita);
		b15.setBackground(botonC);
		b15.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		panelNum.add(b15);
		JButton b16 = new JButton("");
		b16.setBackground(botonC);
		panelNum.add(b16);
		
		
		
		
		
		
		
		
		
	}
	
}
