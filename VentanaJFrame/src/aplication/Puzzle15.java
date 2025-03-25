package aplication;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

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
	Font negrita = new Font("SansSerif",Font.BOLD,30);
	
	Color botonC = new Color(238, 250, 246);
	Color botonBor = new Color(42, 214, 160);
	
	JButton [] conjunto = new JButton[16];
	Random aleatorio = new Random();
	
	ArrayList <Integer> numeros = new ArrayList<Integer>();
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
		reiniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				revolver();
				
			}
			
		});
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);
		numeros.add(11);
		numeros.add(12);
		numeros.add(13);
		numeros.add(14);
		numeros.add(15);
		numeros.add(0);
		Collections.shuffle(numeros);
		//----------------------------Botones-----------------------------
		JButton b1 = new JButton("1");
		b1.setFont(negrita);
		b1.setBackground(botonC);
		b1.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		conjunto[0]=b1;
		panelNum.add(b1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				intercambio((JButton)e.getSource());
			}
			
		});
		
		JButton b2 = new JButton("2");
		b2.setFont(negrita);
		b2.setBackground(botonC);
		b2.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		conjunto[1]=b2;
		panelNum.add(b2);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				intercambio((JButton)e.getSource());
			}
			
		});
		JButton b3 = new JButton("3");
		b3.setFont(negrita);
		b3.setBackground(botonC);
		b3.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		conjunto[2]=b3;
		panelNum.add(b3);
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				intercambio((JButton)e.getSource());
			}
			
		});
		JButton b4 = new JButton("4");
		b4.setFont(negrita);
		b4.setBackground(botonC);
		b4.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		conjunto[3]=b4;
		panelNum.add(b4);
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				intercambio((JButton)e.getSource());
			}
			
		});
		JButton b5 = new JButton("5");
		b5.setFont(negrita);
		b5.setBackground(botonC);
		b5.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		conjunto[4]=b5;
		panelNum.add(b5);
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				intercambio((JButton)e.getSource());
			}
			
		});
		JButton b6 = new JButton("6");
		b6.setFont(negrita);
		b6.setBackground(botonC);
		b6.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		conjunto[5]=b6;
		panelNum.add(b6);
		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				intercambio((JButton)e.getSource());
			}
			
		});
		JButton b7 = new JButton("7");
		b7.setFont(negrita);
		b7.setBackground(botonC);
		b7.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		conjunto[6]=b7;
		panelNum.add(b7);
		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				intercambio((JButton)e.getSource());
			}
			
		});
		JButton b8 = new JButton("8");
		b8.setFont(negrita);
		b8.setBackground(botonC);
		b8.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		conjunto[7]=b8;
		panelNum.add(b8);
		b8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				intercambio((JButton)e.getSource());
			}
			
		});
		JButton b9 = new JButton("9");
		b9.setFont(negrita);
		b9.setBackground(botonC);
		b9.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		conjunto[8]=b9;
		panelNum.add(b9);
		b9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				intercambio((JButton)e.getSource());
			}
			
		});
		JButton b10 = new JButton("10");
		b10.setFont(negrita);
		b10.setBackground(botonC);
		b10.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		conjunto[9]=b10;
		panelNum.add(b10);
		b10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				intercambio((JButton)e.getSource());
			}
			
		});
		JButton b11 = new JButton("11");
		b11.setFont(negrita);
		b11.setBackground(botonC);
		b11.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		conjunto[10]=b11;
		panelNum.add(b11);
		b11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				intercambio((JButton)e.getSource());
			}
			
		});
		JButton b12 = new JButton("12");
		b12.setFont(negrita);
		b12.setBackground(botonC);
		b12.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		conjunto[11]=b12;
		panelNum.add(b12);
		b12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				intercambio((JButton)e.getSource());
			}
			
		});
		JButton b13 = new JButton("13");
		b13.setFont(negrita);
		b13.setBackground(botonC);
		b13.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		conjunto[12]=b13;
		panelNum.add(b13);
		b13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				intercambio((JButton)e.getSource());
			}
			
		});
		JButton b14 = new JButton("14");
		b14.setFont(negrita);
		b14.setBackground(botonC);
		b14.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		conjunto[13]=b14;
		panelNum.add(b14);
		b14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				intercambio((JButton)e.getSource());
			}
			
		});
		JButton b15 = new JButton("15");
		b15.setFont(negrita);
		b15.setBackground(botonC);
		b15.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		conjunto[14]=b15;
		panelNum.add(b15);
		b15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				intercambio((JButton)e.getSource());
			}
			
		});
		JButton b16 = new JButton("");
		b16.setFont(negrita);
		b16.setBackground(botonC);
		b16.setBorder( BorderFactory.createLineBorder(botonBor, 5));
		conjunto[15]=b16;
		panelNum.add(b16);
		b16.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				intercambio((JButton)e.getSource());
			}
			
		});
		//Agregar los numeros revueltos en los botones
		b1.setText(numeros.get(1)+"");
		b2.setText(numeros.get(2)+"");
		b3.setText(numeros.get(3)+"");
		b4.setText(numeros.get(4)+"");
		b5.setText(numeros.get(5)+"");
		b6.setText(numeros.get(6)+"");
		b7.setText(numeros.get(7)+"");
		b8.setText(numeros.get(8)+"");
		b9.setText(numeros.get(9)+"");
		b10.setText(numeros.get(10)+"");
		b11.setText(numeros.get(11)+"");
		b12.setText(numeros.get(12)+"");
		b13.setText(numeros.get(13)+"");
		b14.setText(numeros.get(14)+"");
		b15.setText(numeros.get(15)+"");
		b16.setText(numeros.get(0)+"");
			
	}
	//Revolver los botones
	public void revolver() {
		Collections.shuffle(numeros);
		for(int i=0;i<16;i++) {
			int num = numeros.get(i);
			if (num == 0) {
				conjunto[i].setText("");
			}
			else {
				conjunto[i].setText(""+num);
			}	
		}
	}
	
	public void intercambio(JButton boton) {
		int posicion =0;
		for(int i=0;i<conjunto.length;i++) {
			if (conjunto[i].equals(boton)) {
				posicion = i;
			}
		}
		int y = posicion/4;
		int x = posicion%4;
		
		//checar izquierda
		if(x>0  && conjunto[posicion - 1].getText().equals("")) {
			conjunto[posicion - 1].setText(boton.getText());
			boton.setText("");
			return;
		}
		//checar derecha
		if (x<3 && conjunto[posicion + 1].getText().equals("")) {
			conjunto[posicion + 1].setText(boton.getText());
			boton.setText("");
			return;
		}
		//checar arriba
		if (y>0 && conjunto[posicion - 4].getText().equals("")) {
			conjunto[posicion - 4].setText(boton.getText());
			boton.setText("");
			return;
		}
		//checar abajo
		if (y<3 && conjunto[posicion + 4].getText().equals("")) {
			conjunto[posicion + 4].setText(boton.getText());
			boton.setText("");
			return;
		}
	}
}
