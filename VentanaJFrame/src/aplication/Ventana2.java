package aplication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class Ventana2 extends JFrame{

	Font Titulo = new Font("	SansSerif",Font.BOLD,20);
	Font Campos = new Font("Arial",Font.PLAIN,18);
	Font media = new Font("SansSerif",Font.PLAIN,15);

	public Ventana2(String title) {
		
		this.setTitle(title);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 500);
		this.setMinimumSize(new Dimension(400,400));
		this.setMaximumSize(new Dimension(900,700));
	
		this.setLocationRelativeTo(null);	
		this.setResizable(true);
		this.setLayout(null);
		this.add(this.login());
		
		this.repaint();
	}
	
	public JPanel login() {
		//Creacion del panel
		JPanel login = new JPanel();
		login.setLayout(null);
		login.setLocation(0, 0);
		login.setSize(800, 500);
		login.setOpaque(true);
		login.setBackground(new Color (227, 227, 227));
		login.setVisible(true);
		
		//Label para el texto iniciar sesion
		JLabel etiqueta1 = new JLabel("Iniciar sesión");
		etiqueta1.setBounds(140, 70, 140, 35);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(Titulo);
		login.add(etiqueta1);
		
		//Label para el texto usuario o email
		JLabel etiqueta2 = new JLabel("Usuario o email");
		etiqueta2.setSize(200, 20);
		etiqueta2.setLocation(90,140);
		etiqueta2.setHorizontalAlignment(JLabel.LEFT);
		etiqueta2.setVerticalAlignment(JLabel.CENTER);
		etiqueta2.setFont(Campos);
		login.add(etiqueta2);
		
		//Campo de texto
		JTextField ingreso = new JTextField();
		ingreso.setSize(270,30);
		ingreso.setLocation(90, 170);
		ingreso.setBorder(BorderFactory.createLineBorder(Color.BLACK,2, rootPaneCheckingEnabled));
		login.add(ingreso);
		
		//Label indicando contraseña
		JLabel etiqueta3 = new JLabel("Contraseña");
		etiqueta3.setSize(150, 20);
		etiqueta3.setLocation(90,220);
		etiqueta3.setHorizontalAlignment(JLabel.LEFT);
		etiqueta3.setVerticalAlignment(JLabel.CENTER);
		etiqueta3.setFont(Campos);
		login.add(etiqueta3);
		
		//Campo para ingresar contraseña
		JPasswordField contra = new JPasswordField();
		contra.setSize(270,30);
		contra.setLocation(90, 250);
		contra.setBorder(BorderFactory.createLineBorder(Color.BLACK,2, rootPaneCheckingEnabled));
		login.add(contra);
		
		//Casilla para marcar 
		JCheckBox marca = new JCheckBox("Recuerdame");
		marca.setSize(120, 25);
		marca.setLocation(90,290);
		marca.setHorizontalAlignment(JLabel.LEFT);
		marca.setOpaque(false);
		marca.setFont(media);
		login.add(marca);
		
		
		JLabel olvidado = new JLabel("Olvidé mi contraseña");
		olvidado.setSize(150, 20);
		olvidado.setLocation(210, 292);
		olvidado.setHorizontalAlignment(JLabel.RIGHT);
		olvidado.setFont(media);
		login.add(olvidado);
		
		JButton iniciar = new JButton("Acceder");
		iniciar.setSize(170, 45);
		iniciar.setLocation(135, 330);
		iniciar.setForeground(Color.WHITE);
		iniciar.setFont(new Font("Arial",Font.BOLD,18));
		iniciar.setBackground(new Color(47, 184, 109));
		iniciar.setBorder(BorderFactory.createLineBorder(new Color(23, 133, 44), 2, rootPaneCheckingEnabled));
		login.add(iniciar);
		
		JButton crear = new JButton("Registrarse");
		crear.setSize(170, 45);
		crear.setLocation(135, 390);
		crear.setForeground(Color.WHITE);
		crear.setFont(new Font("Arial",Font.BOLD,18));
		crear.setBackground(new Color(46, 125, 187));
		crear.setBorder(BorderFactory.createLineBorder(new Color(18, 78, 124), 2, rootPaneCheckingEnabled));
		login.add(crear);
		
		//Colocar imagen y redimensionarla para estar al lado derecho del panel
		ImageIcon imagen= new ImageIcon(getClass().getResource("Imagen Login.jpg"));
		Image redimension= imagen.getImage().getScaledInstance(400, 600, Image.SCALE_SMOOTH);
		ImageIcon nuevaImagen = new ImageIcon(redimension);
		JLabel icono = new JLabel(nuevaImagen);
		icono.setBounds(400, 0, 400, 600);
		login.add(icono);
		
		
		return login;
	}

}
