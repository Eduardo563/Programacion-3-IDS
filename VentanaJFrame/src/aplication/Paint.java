package aplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import java.awt.GridLayout;

public class Paint extends JFrame {

	
	Border bordeSec = BorderFactory.createLineBorder(Color.GRAY, 3);
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paint frame = new Paint();
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
	public Paint() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1108, 745);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel herramientas = new JPanel();
		herramientas.setPreferredSize(new Dimension(1100,100));
		herramientas.setBackground(new Color(233, 231, 216));
		herramientas.setBorder(BorderFactory.createTitledBorder(bordeSec, "Herramientas"));
		contentPane.add(herramientas, BorderLayout.NORTH);
		herramientas.setLayout(null);
		
		JPanel subHerr = new JPanel();
		subHerr.setBounds(126, 0, 368, 89);
		subHerr.setBackground(new Color(233, 231, 216));
		subHerr.setBorder(BorderFactory.createMatteBorder(0, 2, 0, 2, new Color(207, 207, 207)));
		herramientas.add(subHerr);
		subHerr.setLayout(null);
		
		JLabel herram = new JLabel("Dibujo");
		herram.setForeground(new Color(87, 87, 87));
		herram.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		herram.setBounds(123, 64, 102, 25);
		subHerr.add(herram);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Paint.class.getResource("/aplication/pencil (1).png")));
		btnNewButton.setBounds(10, 11, 65, 52);
		subHerr.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Paint.class.getResource("/aplication/eraser (2).png")));
		btnNewButton_1.setBounds(100, 11, 65, 52);
		subHerr.add(btnNewButton_1);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setIcon(new ImageIcon(Paint.class.getResource("/aplication/pincel.png")));
		btnNewButton_6.setBounds(189, 11, 65, 52);
		subHerr.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setIcon(new ImageIcon(Paint.class.getResource("/aplication/relleno.png")));
		btnNewButton_7.setBounds(283, 11, 65, 52);
		subHerr.add(btnNewButton_7);
		
		JPanel tamaño = new JPanel();
		tamaño.setBounds(494, 0, 228, 89);
		tamaño.setBackground(new Color(233, 231, 216));
		herramientas.add(tamaño);
		tamaño.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Grosor\r\n");
		lblNewLabel.setForeground(new Color(87, 87, 87));
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		lblNewLabel.setBounds(86, 64, 60, 25);
		tamaño.add(lblNewLabel);
		
		JSlider slider = new JSlider();
		slider.setBounds(10, 27, 205, 26);
		tamaño.add(slider);
		
		JPanel formas = new JPanel();
		formas.setBorder(BorderFactory.createMatteBorder(0, 2, 0, 0, new Color(207, 207, 207)));
		formas.setBounds(723, 0, 367, 89);
		formas.setBackground(new Color(233, 231, 216));
		herramientas.add(formas);
		formas.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Formas");
		lblNewLabel_1.setForeground(new Color(87, 87, 87));
		lblNewLabel_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(152, 64, 76, 25);
		formas.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Paint.class.getResource("/aplication/circulo.png")));
		btnNewButton_2.setBounds(10, 11, 65, 51);
		formas.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(Paint.class.getResource("/aplication/rectangulo.png")));
		btnNewButton_3.setBounds(95, 11, 65, 51);
		formas.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(Paint.class.getResource("/aplication/triangle.png")));
		btnNewButton_4.setBounds(178, 11, 65, 51);
		formas.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(Paint.class.getResource("/aplication/line.png")));
		btnNewButton_5.setBounds(263, 11, 65, 51);
		formas.add(btnNewButton_5);
		
		JPanel colores = new JPanel();
		colores.setPreferredSize(new Dimension(130,740));
		colores.setBackground(new Color(233, 231, 216));
		colores.setBorder(BorderFactory.createTitledBorder(bordeSec, "Paleta de colores"));
		contentPane.add(colores, BorderLayout.WEST);
		colores.setLayout(null);
		
		JPanel seleCo = new JPanel();
		seleCo.setBounds(10, 47, 110, 232);
		colores.add(seleCo);
		seleCo.setLayout(new GridLayout(4, 2, 4, 4));
		seleCo.setBorder(new EmptyBorder(2,2,2,2));
		
		JButton negro = new JButton("");
		seleCo.add(negro);
		negro.setBorder(BorderFactory.createBevelBorder(0, Color.black, Color.gray));
		negro.setBackground(Color.black);
		
		JButton rojo = new JButton("");
		seleCo.add(rojo);
		rojo.setBorder(BorderFactory.createBevelBorder(0, Color.black, Color.gray));
		rojo.setBackground(Color.RED);
		
		JButton naranja = new JButton("");
		seleCo.add(naranja);
		naranja.setBorder(BorderFactory.createBevelBorder(0, Color.black, Color.gray));
		naranja.setBackground(Color.orange);
		
		JButton amarillo = new JButton("");
		seleCo.add(amarillo);
		amarillo.setBorder(BorderFactory.createBevelBorder(0, Color.black, Color.gray));
		amarillo.setBackground(Color.yellow);
		
		JButton verde = new JButton("");
		seleCo.add(verde);
		verde.setBorder(BorderFactory.createBevelBorder(0, Color.black, Color.gray));
		verde.setBackground(Color.green);
		
		JButton azul = new JButton("");
		seleCo.add(azul);
		azul.setBorder(BorderFactory.createBevelBorder(0, Color.black, Color.gray));
		azul.setBackground(Color.blue);
		
		JButton gris = new JButton("");
		seleCo.add(gris);
		gris.setBorder(BorderFactory.createBevelBorder(0, Color.black, Color.gray));
		gris.setBackground(Color.GRAY);
		
		JButton blanco = new JButton("");
		seleCo.add(blanco);
		blanco.setBorder(BorderFactory.createBevelBorder(0, Color.black, Color.gray));
		blanco.setBackground(Color.white);
		
		
		JButton personalizado = new JButton("");
		personalizado.setIcon(new ImageIcon(Paint.class.getResource("/aplication/rainbow (1).png")));
		personalizado.setBounds(31, 290, 65, 47);
		colores.add(personalizado);
		personalizado.setBorder(BorderFactory.createBevelBorder(0, Color.black, Color.gray));
		
		JButton btnNewButton_8 = new JButton("Limpiar todo");
		btnNewButton_8.setForeground(new Color(255, 255, 255));
		btnNewButton_8.setBounds(10, 502, 113, 41);
		colores.add(btnNewButton_8);
		btnNewButton_8.setBackground(new Color(239, 68, 54));
		btnNewButton_8.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		
		JPanel fondoLienzo = new JPanel();
		fondoLienzo.setBackground(new Color(192, 192, 192));
		contentPane.add(fondoLienzo, BorderLayout.CENTER);
		fondoLienzo.setLayout(null);
		
		JPanel lienzo = new JPanel();
		lienzo.setBounds(10, 11, 990, 729);
		lienzo.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		fondoLienzo.add(lienzo);
		lienzo.setLayout(null);
	}
}
