package aplication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculadoraUI extends JFrame{

	Color fondo = new Color(42, 44, 42);
	Color botones = new Color(111, 113, 111);
	
	
	public CalculadoraUI(String tittle) {

		this.setTitle(tittle);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(360, 420);
		//this.setMinimumSize(new Dimension(400,600));
		//this.setMaximumSize(new Dimension(600,700));
		this.setLocationRelativeTo(null);	
		this.setResizable(true);
		this.add(calculadora());
		
	}

	public JPanel calculadora() {
		//Creacion del panel principal
		JPanel calcu = new JPanel();
		calcu.setLayout(new BorderLayout());
		calcu.setSize(420, 700);
		calcu.setOpaque(true);
		calcu.setBackground(fondo);
		calcu.setVisible(true);
		
		//Label donde se mostrara lo presionado
		JLabel display = new JLabel("360");
		display.setFont(new Font("SansSerif",Font.BOLD,55));
		display.setBackground(new Color(111, 113, 111));
		display.setOpaque(true);
		display.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		display.setHorizontalAlignment(JLabel.RIGHT);
		calcu.add(display,BorderLayout.NORTH);
		
		
		//Creacion de un panel que contenga los numeros
		JPanel numeros= new JPanel(new GridLayout(5,4,5,5));
		numeros.setBackground(fondo);
		numeros.setVisible(true);
		calcu.add(numeros,BorderLayout.CENTER);
		
		//Crear un arreglo con el texto de cada boton
		String []valores = {
				"CE"," ","%","/",
				"7","8","9","x",
				"4","5","6","-",
				"1","2","3","+",
				"e","0",".","="
		};
		//Arreglo para almacenar los botones
		JButton []botones = new JButton [20];
		//Ciclo para generar los botones y agregarlos al arreglo botones y al GridLayout
		for(int i=0;i<valores.length;i++) {
			botones[i] = new JButton(valores[i]);
			botones[i].setBackground(new Color(111, 113, 111));
			botones[i].setFont(new Font("SansSerif",Font.BOLD,25));
			botones[i].setForeground(Color.WHITE);
			numeros.add(botones[i]);
		}
		//Un ciclo para pintar de naranja los botones de operacion
		for(int i=0;i<4;i++) {
			botones[i].setBackground(new Color(222, 144, 45));
		}
		botones[7].setBackground(new Color(222, 144, 45));
		botones[11].setBackground(new Color(222, 144, 45));
		botones[15].setBackground(new Color(222, 144, 45));
		botones[19].setBackground(new Color(222, 144, 45));
		
			
		return calcu;
	}
}
