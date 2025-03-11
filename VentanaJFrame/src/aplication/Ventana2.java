package aplication;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class Ventana2 extends JFrame{

	Font Titulo = new Font("	SansSerif",Font.BOLD,30);
	Font Campos = new Font("Arial",Font.PLAIN,18);
	Font media = new Font("SansSerif",Font.ITALIC,15);
	
	
	Color bordeAcc = new Color(23, 133, 44);
	Color fondoVerdeOs = new Color(31, 104, 59);
	Color fondoAzulOs = new Color(35, 96, 120);

	public Ventana2(String title) {
		
		this.setTitle(title);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 600);
		this.setMinimumSize(new Dimension(400,400));
		this.setMaximumSize(new Dimension(900,700));
		this.setBackground(fondoAzulOs);
		
		//Para usar imagen en el icono de JFrame debe ser de tipo Image
		Image icono = new ImageIcon(getClass().getResource("iconoL.png")).getImage();
		this.setIconImage(icono);
	
		this.setLocationRelativeTo(null);	
		this.setResizable(true);
		//this.setLayout(null);
		//this.add(this.login());
		this.add(this.registro());
		//this.add(this.tabla());
		//this.add(this.interes());
		
		
		/*
		JMenuBar barra = new JMenuBar(); //Crea una barra de menú
		
		JMenu menu1 = new JMenu("Archivo");
		JMenu menu2 = new JMenu("Ayuda");
		JMenu menu3 = new JMenu("Mas Opciones");
		
		barra.add(menu1);
		barra.add(menu2);
		
		this.setJMenuBar(barra);
		
		JMenuItem abrir = new JMenuItem("Abrir");
		abrir.setIcon(new ImageIcon(getClass().getResource("open.png")));
		menu1.add(abrir);
		
		JMenuItem nuevo = new JMenuItem("Nuevo");
		nuevo.setIcon(new ImageIcon(getClass().getResource("agregar16.png")));
		menu1.add(nuevo);
		JMenuItem guardar = new JMenuItem("Guardar");
		guardar.setIcon(new ImageIcon(getClass().getResource("save.png")));
		menu1.add(guardar);
		JMenuItem cerrar = new JMenuItem("Cerrar");
		cerrar.setIcon(new ImageIcon(getClass().getResource("close.png")));
		menu1.add(cerrar);
		
		JMenuItem imprimir = new JMenuItem("Imprimir");
		JMenuItem exportar = new JMenuItem("Exportar");
		JMenuItem importar = new JMenuItem("Importar");
		menu3.add(imprimir);
		menu3.add(exportar);
		menu3.add(importar);
		menu1.add(menu3);
		
		JRadioButton help = new JRadioButton("Manual de Usuario");
		menu2.add(help);
		*/
		
		
		this.repaint();
		this.revalidate();
	}
	
	public JPanel login() {
		//Creacion del panel principal
		FondoLogin principal = new FondoLogin();
		principal.setLayout(null);
		principal.setLocation(0, 0);
		principal.setSize(1000, 700);
		principal.setVisible(true);
		
		
		//Creacion de panel para el login
		PanelRedondo login = new PanelRedondo();
		login.setLayout(null);
		login.setLocation(100, 80);
		login.setSize(800, 500);
		//login.setOpaque(true);
		login.setColorF(Color.WHITE);
		login.setVisible(true);
		principal.add(login);
		
		//Creacion de panel para las credenciales y botones
		JPanel credencial = new JPanel();
		credencial.setLayout(null);
		credencial.setLocation(5, 5);
		credencial.setSize(350, 480);
		credencial.setOpaque(true);
		credencial.setBackground(Color.white);
		credencial.setVisible(true);
		login.add(credencial);
		
		//Label para el texto iniciar sesion
		JLabel etiqueta1 = new JLabel("User Login");
		etiqueta1.setBounds(85, 70, 230, 35);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(Titulo);
		credencial.add(etiqueta1);
		
		//Label para el texto usuario o email
		JLabel etiqueta2 = new JLabel("Username or email");
		etiqueta2.setSize(200, 20);
		etiqueta2.setLocation(70,140);
		etiqueta2.setHorizontalAlignment(JLabel.LEFT);
		etiqueta2.setVerticalAlignment(JLabel.CENTER);
		etiqueta2.setFont(Campos);
		credencial.add(etiqueta2);
		
		//Icono de sobre para el ingreso de email
		ImageIcon sobre = new ImageIcon(getClass().getResource("sobreR.png"));
		Image redimensionS = sobre.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
		ImageIcon sobreR = new ImageIcon(redimensionS);
		JLabel iconoSobre = new JLabel(sobreR);
		iconoSobre.setLocation(40, 170);
		iconoSobre.setSize(30, 30);
		credencial.add(iconoSobre);
		
		
		//Campo de texto
		JTextField ingreso = new JTextField();
		ingreso.setSize(270,30);
		ingreso.setLocation(70, 170);
		ingreso.setBorder(BorderFactory.createLineBorder(Color.BLACK,2, rootPaneCheckingEnabled));
		credencial.add(ingreso);
		
		
		//Label indicando contraseña
		JLabel etiqueta3 = new JLabel("Password");
		etiqueta3.setSize(150, 20);
		etiqueta3.setLocation(70,220);
		etiqueta3.setHorizontalAlignment(JLabel.LEFT);
		etiqueta3.setVerticalAlignment(JLabel.CENTER);
		etiqueta3.setFont(Campos);
		credencial.add(etiqueta3);
		
		//Label con icono de candado
		ImageIcon candado = new ImageIcon(getClass().getResource("candado.png"));
		Image redimensionC = candado.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon candadoR = new ImageIcon(redimensionC);
		JLabel iconoCandado = new JLabel(candadoR);
		iconoCandado.setLocation(40, 250);
		iconoCandado.setSize(30, 30);
		credencial.add(iconoCandado);
		
		//Campo para ingresar contraseña
		JPasswordField contra = new JPasswordField();
		contra.setSize(270,30);
		contra.setLocation(70, 250);
		contra.setBorder(BorderFactory.createLineBorder(Color.BLACK,2, rootPaneCheckingEnabled));
		credencial.add(contra);
		
		//Casilla para marcar recordar el inicio de sesion
		JCheckBox marca = new JCheckBox("Remember");
		marca.setSize(120, 25);
		marca.setLocation(60,290);
		marca.setHorizontalAlignment(JLabel.LEFT);
		marca.setOpaque(false);
		marca.setFont(media);
		credencial.add(marca);
		
		//etiqueta para la opcion de olvidar contraseña
		JLabel olvidado = new JLabel("Forgot password");
		olvidado.setSize(155, 20);
		olvidado.setLocation(180, 292);
		olvidado.setHorizontalAlignment(JLabel.RIGHT);
		olvidado.setFont(media);
		credencial.add(olvidado);
		
		//boton de login con efecto hover y bordes redondeados
		botonPersonalizado iniciar = new botonPersonalizado("Login");
		iniciar.setRadio(25);
		iniciar.setSize(170, 45);
		iniciar.setLocation(120, 330);
		iniciar.setForeground(Color.white);
		iniciar.setFont(new Font("Arial",Font.BOLD,18));
		iniciar.setColorFondo(new Color(46, 174, 91));
		iniciar.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
		        iniciar.setColorFondo(fondoVerdeOs);
		    }
			public void mouseExited(MouseEvent e) {
		        iniciar.setColorFondo(new Color(46, 174, 91));
		    }
		});
		iniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Funciona");
				if (ingreso.getText().equals("")) {
					ingreso.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
				}
				else {
					ingreso.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
				}
				if (contra.getPassword().length<6 || contra.getPassword().equals("")) {
					contra.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
				}
				else
					contra.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
			}
			
		});
		credencial.add(iniciar);
		
		//Boton de SignUp con efecto hover y bordes redondos
		botonPersonalizado crear = new botonPersonalizado("SignUp");
		crear.setRadio(25);
		crear.setSize(170, 45);
		crear.setLocation(120, 390);
		crear.setForeground(Color.WHITE);
		crear.setFont(new Font("Arial",Font.BOLD,18));
		crear.setColorFondo(new Color(47, 115, 176));
		crear.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
		        crear.setColorFondo(fondoAzulOs);
		    }
			public void mouseExited(MouseEvent e) {
		        crear.setColorFondo(new Color(47, 115, 176));
		    }
		});
		credencial.add(crear);
		
		//Colocar imagen y redimensionarla para estar al lado derecho del panel
		ImageIcon imagen= new ImageIcon(getClass().getResource("vaca.jpg"));
		Image redimension= imagen.getImage().getScaledInstance(390, 480, Image.SCALE_SMOOTH);
		ImageIcon nuevaImagen = new ImageIcon(redimension);
		LabelRedondo icono = new LabelRedondo(nuevaImagen,30);
		icono.setLayout(null);
		icono.setBounds(400, 10, 390, 480);
		login.add(icono);
		
		
		return principal;
	}
	
	public JPanel registro() {

		
		//Creacion del panel
		JPanel registro = new JPanel();
		registro.setLayout(null);
		registro.setLocation(100,50);
		registro.setSize(800, 500);
		registro.setOpaque(true);
		registro.setBackground(new Color (227, 227, 227));
		registro.setVisible(true);
		
		//Label para el texto registro
		JLabel etiqueta1 = new JLabel("Registro");
		etiqueta1.setBounds(330, 30, 140, 35);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(Titulo);
		registro.add(etiqueta1);
		
		//Label para el texto usuario o email
		JLabel etiqueta2 = new JLabel("Nombre de usuario");
		etiqueta2.setSize(200, 20);
		etiqueta2.setLocation(330,90);
		etiqueta2.setHorizontalAlignment(JLabel.LEFT);
		etiqueta2.setVerticalAlignment(JLabel.CENTER);
		etiqueta2.setFont(Campos);
		registro.add(etiqueta2);
		
		//Campo de texto
		JTextField ingreso = new JTextField();
		ingreso.setSize(270,30);
		ingreso.setLocation(280, 120);
		ingreso.setBorder(BorderFactory.createLineBorder(Color.BLACK,2, rootPaneCheckingEnabled));
		registro.add(ingreso);
		
		
		JLabel bioEtiqueta = new JLabel("Bio");
		bioEtiqueta.setSize(150, 20);
		bioEtiqueta.setLocation(395, 160);
		bioEtiqueta.setFont(Campos);
		registro.add(bioEtiqueta);
		
		//Area de texto
		JTextArea bio = new JTextArea();
		bio.setSize(270, 50);
		bio.setLocation(280, 190);
		bio.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		registro.add(bio);
		
		
		//Label indicando preferencias
		JLabel etiqueta3 = new JLabel("Preferencias");
		etiqueta3.setSize(150, 20);
		etiqueta3.setLocation(360,250);
		etiqueta3.setHorizontalAlignment(JLabel.LEFT);
		etiqueta3.setVerticalAlignment(JLabel.CENTER);
		etiqueta3.setFont(Campos);
		registro.add(etiqueta3);
		
		
		
		//Casillas para marcar 
		JCheckBox P1 = new JCheckBox("Dulces");
		P1.setSize(80, 25);
		P1.setLocation(280,270);
		P1.setHorizontalAlignment(JLabel.LEFT);
		P1.setOpaque(false);
		P1.setFont(media);
		registro.add(P1);
		
		JCheckBox P2 = new JCheckBox("Salado");
		P2.setSize(80, 25);
		P2.setLocation(370,270);
		P2.setHorizontalAlignment(JLabel.LEFT);
		P2.setOpaque(false);
		P2.setFont(media);
		registro.add(P2);
		
		JCheckBox P3 = new JCheckBox("Saludable");
		P3.setSize(100, 25);
		P3.setLocation(470,270);
		P3.setHorizontalAlignment(JLabel.LEFT);
		P3.setOpaque(false);
		P3.setFont(media);
		registro.add(P3);
		
		
		JLabel terminos = new JLabel("Terminos");
		terminos.setSize(150, 20);
		terminos.setLocation(290, 300);
		terminos.setHorizontalAlignment(JLabel.RIGHT);
		terminos.setFont(media);
		registro.add(terminos);
		
		//Creacion de grupo de botones para uso de radioButton
		ButtonGroup terminosG = new ButtonGroup();
		
		JRadioButton terminosA = new JRadioButton("Acepto los terminos");
		terminosA.setLocation(250, 330);
		terminosA.setSize(160, 30);
		terminosA.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
		terminosA.setBorderPainted(true);
		registro.add(terminosA);
		
		JRadioButton terminosN = new JRadioButton(" No acepto los terminos");
		terminosN.setLocation(430, 330);
		terminosN.setSize(180, 30);
		terminosN.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		terminosN.setBorderPainted(true);
		registro.add(terminosN);
		
		terminosG.add(terminosA);
		terminosG.add(terminosN);
		
		//Creacion de lista para desplegar en un comboBox
		String lista [] = {"Camino Real","Puesta del Sol","Agua Escondida","Pedregal","Centro","Los Olivos"};
		JComboBox desplegado = new JComboBox(lista);
		desplegado.setSize(270, 20);
		desplegado.setLocation(280, 380);
		registro.add(desplegado);
		
		
		
		JButton crear = new JButton("Crear cuenta");
		crear.setSize(170, 30);
		crear.setLocation(330, 420);
		crear.setForeground(Color.WHITE);
		crear.setFont(new Font("Arial",Font.BOLD,16));
		crear.setBackground(new Color(46, 125, 187));
		crear.setBorder(BorderFactory.createLineBorder(new Color(18, 78, 124), 2, rootPaneCheckingEnabled));
		registro.add(crear);
		
		crear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (ingreso.getText().equals("")||ingreso.getText().trim().isEmpty() ) {
					ingreso.setBorder(BorderFactory.createLineBorder(Color.red, 5));
				}
				else {
					ingreso.setBorder(BorderFactory.createLineBorder(Color.green, 5));
				}
				if (bio.getText().length()>0 & bio.getText().length()<5) {
					bio.setBorder(BorderFactory.createLineBorder(Color.red, 5));
				}
				else {
					bio.setBorder(BorderFactory.createLineBorder(Color.green, 5));
				}
				if (!terminosA.isSelected()) {
					terminosA.setBorder(BorderFactory.createLineBorder(Color.red, 5));
				}
				else {
					terminosA.setBorder(BorderFactory.createLineBorder(Color.green, 5));
				}
				
			}
			
		});
		
		
		return registro;
		
	}

	public JPanel tabla() {

		
		//Creacion del panel
		JPanel tabla = new JPanel();
		tabla.setLayout(null);
		tabla.setLocation(0, 0);
		tabla.setSize(800, 500);
		tabla.setOpaque(true);
		tabla.setBackground(new Color (164, 164, 163));
		tabla.setVisible(true);
		
		//Label para el texto tabla
		JLabel etiqueta1 = new JLabel("Usuarios");
		etiqueta1.setBounds(330, 30, 140, 35);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(Titulo);
		etiqueta1.setBackground(Color.ORANGE);
		etiqueta1.setOpaque(true);
		tabla.add(etiqueta1);
		
		JLabel nUsuarios = new JLabel("Total de usuarios");
		nUsuarios.setBounds(100, 80, 200, 40);
		nUsuarios.setHorizontalAlignment(JLabel.CENTER);
		nUsuarios.setFont(Titulo);
		tabla.add(nUsuarios);
		
		JLabel num = new JLabel("96");
		num.setBounds(100, 100, 200, 60);
		num.setHorizontalAlignment(JLabel.CENTER);
		num.setFont(Titulo);
		num.setBackground(Color.ORANGE);
		tabla.add(num);
		
		//Label para un recuadro con fondo
		JLabel fondo = new JLabel();
		fondo.setBounds(100, 70, 200, 80);
		fondo.setHorizontalAlignment(JLabel.CENTER);
		fondo.setFont(Titulo);
		fondo.setBackground(new Color(187, 174, 157));
		fondo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		fondo.setOpaque(true);
		tabla.add(fondo);
		
		JButton export = new JButton("Exportar");
		export.setBounds(500, 100, 100, 40);
		tabla.add(export);
		
		JButton añadir = new JButton("Añadir");
		añadir.setBounds(610, 100, 100, 40);
		tabla.add(añadir);
		
		
		//Arreglo de los titulos de la tabla
		String [] columName = {
				"Nombre",
				"Apellido",
				"Game",
				"Age",
				"Vegeterian"
		};
		
		Object [] [] data = {
				{"Kathy","Smith","Snowboarding",1995,true},
				{"John","Dou","Rowing",1997,true},
				{"Sue","Black","Knitting",2002,false},
				{"Jane","White","Speed Reading",2001,true},
				{"Sergio","Olachea","Basketball",2004,false},
				{"Kathy","Smith","Snowboarding",1995,true},
				{"John","Dou","Rowing",1997,true},
				{"Sue","Black","Knitting",2002,false},
				{"Jane","White","Speed Reading",2001,true},
				{"Sergio","Olachea","Basketball",2004,false},
				{"Kathy","Smith","Snowboarding",1995,true},
				{"John","Dou","Rowing",1997,true},
				{"Sue","Black","Knitting",2002,false},
				{"Jane","White","Speed Reading",2001,true},
				{"Sergio","Olachea","Basketball",2004,false},
				{"Kathy","Smith","Snowboarding",1995,true},
				{"John","Dou","Rowing",1997,true},
				{"Sue","Black","Knitting",2002,false},
				{"Jane","White","Speed Reading",2001,true},
				{"Sergio","Olachea","Basketball",2004,false},
				{"Kathy","Smith","Snowboarding",1995,true},
				{"John","Dou","Rowing",1997,true},
				{"Sue","Black","Knitting",2002,false},
				{"Jane","White","Speed Reading",2001,true},
				{"Sergio","Olachea","Basketball",2004,false},
				{"Kathy","Smith","Snowboarding",1995,true},
				{"John","Dou","Rowing",1997,true},
				{"Sue","Black","Knitting",2002,false},
				{"Jane","White","Speed Reading",2001,true},
				{"Sergio","Olachea","Basketball",2004,false},
		};
		JTable tablaInfo = new JTable(data,columName);
		JScrollPane scrollPane = new JScrollPane(tablaInfo);
		scrollPane.setBounds(45,170,700,250);
		tabla.add(scrollPane);
		return tabla;
	}

	public JPanel interes() {
		JPanel interes = new JPanel(new BorderLayout(0,20));
		interes.setSize(400, 600);
		interes.setOpaque(true);
		interes.setVisible(true);
		interes.setBackground(Color.white);
		
		JLabel etiqueta1 = new JLabel("Interés");
		etiqueta1.setHorizontalAlignment(JLabel.LEFT);
		etiqueta1.setFont(Titulo);
		etiqueta1.setForeground(Color.red);
		interes.add(etiqueta1,BorderLayout.NORTH);
		
		JPanel calculoIn = new JPanel(new GridLayout(4,2,5,50));
		calculoIn.setBackground(new Color(126, 200, 134));
		calculoIn.setSize(380, 300);
		calculoIn.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(118, 133, 119),2), "Calcular interés"));
		interes.add(calculoIn,BorderLayout.CENTER);
		
		JLabel capital = new JLabel("Capital");
		capital.setHorizontalAlignment(JLabel.CENTER);
		capital.setFont(media);
		calculoIn.add(capital);
		JTextField campo = new JTextField("1500");
		calculoIn.add(campo);
		
		JLabel tiempo = new JLabel("Tiempo");
		tiempo.setHorizontalAlignment(JLabel.CENTER);
		tiempo.setFont(media);
		calculoIn.add(tiempo);
		JTextField campo1 = new JTextField("2");
		calculoIn.add(campo1);
		
		JLabel tasa = new JLabel("Tasa de Interes");
		tasa.setHorizontalAlignment(JLabel.CENTER);
		tasa.setFont(media);
		calculoIn.add(tasa);
		JTextField campo2 = new JTextField("0.1");
		calculoIn.add(campo2);
		
		JButton calcular = new JButton("Calcular");
		calcular.setFont(media);
		calculoIn.add(calcular);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setFont(media);
		calculoIn.add(cancelar);
		
		JPanel resultado = new JPanel(new GridLayout(2,2,10,20));
		resultado.setBorder(BorderFactory.createMatteBorder(20, 10, 20, 10, Color.white));
		resultado.setBackground(new Color(194, 73, 98));
		interes.add(resultado,BorderLayout.SOUTH);
		
		
		
		JLabel interesR = new JLabel("Interes:");
		interesR.setHorizontalAlignment(JLabel.CENTER);
		interesR.setFont(media);
		interesR.setForeground(Color.white);
		interesR.setBorder(BorderFactory.createMatteBorder(30, 5, 0, 10, new Color(194, 73, 98)));
		resultado.add(interesR);
		JTextField campo3 = new JTextField("315.000000000001");
		campo3.setBorder(BorderFactory.createMatteBorder(30, 5, 0, 10, new Color(194, 73, 98)));
		resultado.add(campo3);
		
		JLabel monto = new JLabel("Monto:");
		monto.setHorizontalAlignment(JLabel.CENTER);
		monto.setFont(media);
		monto.setForeground(Color.white);
		monto.setBorder(BorderFactory.createMatteBorder(5, 5, 20, 10, new Color(194, 73, 98)));
		resultado.add(monto);
		JTextField campo4 = new JTextField("1815.000000000002");
		campo4.setBorder(BorderFactory.createMatteBorder(5, 5, 20, 10, new Color(194, 73, 98)));
		resultado.add(campo4);
		
		return interes;
	}
	
	/*
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.RED);
		g2.clearRect(100, 100, 50, 50);
		
		g2.drawRect(50, 50, 300, 300);
		
		g2.fillRect(150, 150, 200, 200);
		
		
		g2.setColor(fondoVerdeOs);
		g2.fillRoundRect(300, 80, 170, 170, 30, 30);
		
		g2.setColor(bordeAcc);
		g2.setStroke(new BasicStroke(5));
		g2.drawLine(150, 100, 500, 500);
		
		g2.setColor(new Color(72, 24, 191));
		g2.drawOval(200, 400, 100, 100);
		
		g2.setColor(new Color(191, 24, 151));
		g2.fillOval(200, 450, 90, 90);
		
		g2.setColor(new Color(21, 148, 200));
		g2.drawArc(100, 300, 100, 100, 0, -180);
		g2.fillArc(100, 300, 100, 100, 0, 180);
		
		g2.setColor(new Color(218, 166, 28));
		g2.setFont(Campos);
		g2.drawString("Plumon Sharpie", 100, 100);
		
		g2.setColor(new Color (206, 204, 39));
		int [] xs = {100,100,400};
		int [] ys = {100,200,400};
		g2.drawPolygon(xs, ys, 3);
		
		int [] xs2 = {300,250,170};
		int [] ys2 = {300,200,150};
		g2.fillPolygon(xs2, ys2, 3);
		
	}*/
	
	
}
