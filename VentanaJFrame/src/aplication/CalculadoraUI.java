package aplication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculadoraUI extends JFrame{

	Color fondo = new Color(42, 44, 42);
	Color botones = new Color(111, 113, 111);
	
	Font numeros = new Font("SansSerif",Font.BOLD,20);
	public CalculadoraUI(String tittle) {

		this.setTitle(tittle);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 700);
		this.setMinimumSize(new Dimension(400,600));
		this.setMaximumSize(new Dimension(600,700));
	
		this.setLocationRelativeTo(null);	
		this.setResizable(true);
		this.setLayout(null);
		this.add(calculadora());
		
	}

	public JPanel calculadora() {
		//Creacion del panel principal
		JPanel calcu = new JPanel();
		calcu.setLayout(null);
		calcu.setLocation(0, 0);
		calcu.setSize(400, 700);
		calcu.setOpaque(true);
		calcu.setBackground(fondo);
		calcu.setVisible(true);
		
		//Label donde se mostrara lo presionado
		JLabel display = new JLabel();
		display.setBounds(0, 0, 400, 100);
		display.setBackground(new Color(111, 113, 111));
		display.setOpaque(true);
		display.setHorizontalAlignment(JLabel.CENTER);
		calcu.add(display);
		
		
		//Creacion de un panel que contenga los numeros
		JPanel numeros= new JPanel(new GridLayout(6,3,10,10));
		numeros.setBackground(fondo);
		numeros.setSize(400, 500);
		numeros.setLocation(0, 110);
		numeros.setVisible(true);
		calcu.add(numeros);
		
		//Crear un arreglo con el texto de cada boton
		String []valores = {
				"CE","%","/",
				"*","-","+",
				"7","8","9",
				"4","5","6",
				"3","2","1",
				"0",".","="
		};
		//Arreglo para almacenar los botones
		JButton []botones = new JButton [18];
		//Ciclo para generar los botones y agregarlos al arreglo botones y al GridLayout
		for(int i=0;i<valores.length;i++) {
			botones[i] = new JButton(valores[i]);
			botones[i].setBackground(new Color(111, 113, 111));
			botones[i].setFont(new Font("SansSerif",Font.BOLD,20));
			botones[i].setForeground(Color.WHITE);
			numeros.add(botones[i]);
		}
		//Un ciclo para pintar de naranja los botones de operacion
		for(int i=0;i<6;i++) {
			botones[i].setBackground(new Color(222, 144, 45));
		}
		botones[17].setBackground(new Color(222, 144, 45));
		
			
		return calcu;
	}
}
