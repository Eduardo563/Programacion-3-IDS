package aplication;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

public class PrimerVentana {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimerVentana window = new PrimerVentana();
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
	public PrimerVentana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(135, 214, 48));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		JPanel PanelPrincipal = new JPanel();
		PanelPrincipal.setBounds(0, 0, 877, 780);
		PanelPrincipal.setBackground(new Color(135, 214, 48));
		frame.getContentPane().add(PanelPrincipal);
		PanelPrincipal.setLayout(null);
		
		//Panel para colocar el titulo de Registro de Usuario
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 877, 69);
		PanelPrincipal.add(panel_1);
		panel_1.setBackground(new Color(135, 214, 48));
		panel_1.setLayout(null);
		
		JLabel RegistroUsu = new JLabel("Registro Usuarios");
		RegistroUsu.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 20));
		RegistroUsu.setForeground(new Color(237, 56, 56));
		RegistroUsu.setBounds(25, 11, 205, 41);
		panel_1.add(RegistroUsu);
		
		
		//Panel general de la distribucion de los 4 cuadrantes
		JPanel distribucion = new JPanel();
		distribucion.setBackground(new Color(135, 214, 48));
		distribucion.setBounds(0, 68, 877, 712);
		PanelPrincipal.add(distribucion);
		distribucion.setLayout(new GridLayout(2, 2, 20, 20));
		
		//Primer panel con los datos generales
		JPanel DatosGenerales = new JPanel();
		DatosGenerales.setBackground(new Color(84, 185, 218));
		DatosGenerales.setLayout(null);
		distribucion.add(DatosGenerales);
		
		JLabel titulo = new JLabel("Datos Generales");
		titulo.setFont(new Font("Consolas", Font.BOLD, 18));
		titulo.setBounds(10, 0, 200, 34);
		DatosGenerales.add(titulo);
		
		JPanel camposDG = new JPanel();
		camposDG.setBackground(new Color(84, 185, 218));
		camposDG.setBounds(10, 45, 208, 185);
		camposDG.setLayout(new GridLayout(4,1,10,10));
		DatosGenerales.add(camposDG);
		
		JLabel nombre = new JLabel("Nombre: ");
		nombre.setFont(new Font("Consolas", Font.PLAIN, 16));
		nombre.setHorizontalAlignment(JLabel.RIGHT);
		nombre.setBounds(32, 32, 97, 19);
		camposDG.add(nombre);
		
		JLabel ApellidoP = new JLabel("Apellido Paterno:");
		ApellidoP.setFont(new Font("Consolas", Font.PLAIN, 15));
		ApellidoP.setHorizontalAlignment(JLabel.RIGHT);
		ApellidoP.setBounds(32, 62, 154, 19);
		camposDG.add(ApellidoP);
		
		JLabel apellidoM = new JLabel("Apellido Materno:");
		apellidoM.setFont(new Font("Consolas", Font.PLAIN, 15));
		apellidoM.setHorizontalAlignment(JLabel.RIGHT);
		apellidoM.setBounds(32, 106, 154, 19);
		camposDG.add(apellidoM);
		
		JLabel FechaNa = new JLabel("Fecha de Nacimiento:");
		FechaNa.setHorizontalAlignment(JLabel.RIGHT);
		FechaNa.setFont(new Font("Consolas", Font.PLAIN, 15));
		FechaNa.setBounds(32, 164, 267, 14);
		camposDG.add(FechaNa);
		
		JLabel sexo = new JLabel("Sexo:");
		sexo.setFont(new Font("Consolas", Font.PLAIN, 15));
		sexo.setHorizontalAlignment(JLabel.CENTER);
		sexo.setBounds(35, 256, 154, 19);
		DatosGenerales.add(sexo);
		
		//Grupo de botones para indicar el sexo del usuario
		ButtonGroup selecMF = new ButtonGroup();
		JRadioButton hombre = new JRadioButton("Masculino");
		hombre.setBackground(new Color(84, 185, 218));
		hombre.setBounds(284, 237, 103, 27);
		hombre.setFont(new Font("Consolas", Font.PLAIN, 15));
		selecMF.add(hombre);
		DatosGenerales.add(hombre);
		JRadioButton mujer = new JRadioButton("Femenino");
		mujer.setBackground(new Color(84, 185, 218));
		mujer.setBounds(284, 273, 123, 27);
		mujer.setFont(new Font("Consolas", Font.PLAIN, 15));
		selecMF.add(mujer);
		DatosGenerales.add(mujer);
		
		JLabel nacionalidad = new JLabel("Nacionalidad:");
		nacionalidad.setFont(new Font("Consolas", Font.PLAIN, 15));
		nacionalidad.setHorizontalAlignment(JLabel.CENTER);
		nacionalidad.setBounds(35, 315, 154, 19);
		DatosGenerales.add(nacionalidad);
		
		String lista [] = {"México","Perú","Guatemala","Colombia","Argentina","Brasil","Venezuela","Costa Rica"};
		JComboBox desplegado = new JComboBox(lista);
		desplegado.setSize(168, 33);
		desplegado.setLocation(255, 307);
		DatosGenerales.add(desplegado);
		
		JPanel rellenoDG = new JPanel();
		rellenoDG.setBackground(new Color(84, 185, 218));
		rellenoDG.setBounds(255, 45, 168, 185);
		rellenoDG.setLayout(new GridLayout(4,1,10,10));
		DatosGenerales.add(rellenoDG);
		
		JTextField nombreR = new JTextField();
		nombreR.setFont(new Font("Consolas", Font.PLAIN, 16));
		nombreR.setBounds(32, 32, 97, 19);
		rellenoDG.add(nombreR);
		
		JTextField ApellidoPR = new JTextField();
		ApellidoPR.setFont(new Font("Consolas", Font.PLAIN, 15));
		ApellidoPR.setBounds(32, 62, 154, 19);
		rellenoDG.add(ApellidoPR);
		
		JTextField apellidoMR = new JTextField();
		apellidoMR.setFont(new Font("Consolas", Font.PLAIN, 15));
		apellidoMR.setBounds(32, 106, 154, 19);
		rellenoDG.add(apellidoMR);
		
		JTextField FechaNaR = new JTextField();
		FechaNaR.setFont(new Font("Consolas", Font.PLAIN, 15));
		FechaNaR.setBounds(32, 164, 267, 14);
		rellenoDG.add(FechaNaR);
		
		
		
		JPanel perfil = new JPanel();
		perfil.setBackground(new Color(218, 151, 84));
		perfil.setLayout(null);
		distribucion.add(perfil);
		
		
		
		JLabel opcionesP = new JLabel("Perfil del usuario");
		opcionesP.setBounds(10, 11, 205, 31);
		opcionesP.setFont(new Font("Consolas", Font.BOLD, 18));
		perfil.add(opcionesP);
		
		ImageIcon redi = new ImageIcon(getClass().getResource("man.png"));
		Image redimension= redi.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon fotoP = new ImageIcon(redimension);
		JLabel foto = new JLabel(fotoP);
		foto.setBounds(76, 40, 293, 227);
		perfil.add(foto);
		
		JCheckBox mostrar = new JCheckBox("Mostrar Foto de Perfil");
		mostrar.setBackground(new Color(218, 151, 84));
		mostrar.setFont(new Font("Consolas", Font.PLAIN, 15));
		mostrar.setBounds(92, 274, 264, 27);
		perfil.add(mostrar);
		
		JCheckBox fechaMostrar = new JCheckBox("Mostrar Fecha de nacimiento");
		fechaMostrar.setBackground(new Color(218, 151, 84));
		fechaMostrar.setFont(new Font("Consolas", Font.PLAIN, 15));
		fechaMostrar.setBounds(92, 304, 264, 27);
		perfil.add(fechaMostrar);
		
		
		//Panel de botones de accion adicionales
		JPanel opcionesAd = new JPanel();
		opcionesAd.setBackground(new Color(218, 84, 84));
		opcionesAd.setLayout(null);
		distribucion.add(opcionesAd);
		
		JLabel datos = new JLabel("Datos Adicionales");
		datos.setBounds(10, 11, 176, 31);
		datos.setFont(new Font("Consolas", Font.BOLD, 18));
		opcionesAd.add(datos);
		
		//Panel y etiquetas indicando los datos adicionales
		JPanel etiquetas = new JPanel(new FlowLayout());
		etiquetas.setBackground(new Color(218, 84, 84));
		etiquetas.setBounds(52, 65, 326, 31);
		opcionesAd.add(etiquetas);
		
		JLabel descripcion = new JLabel("Descripcion:");
		descripcion.setBounds(38, 69, 103, 52);
		descripcion.setFont(new Font("Consolas", Font.PLAIN, 15));
		etiquetas.add(descripcion);
		
		JLabel preferencias = new JLabel("Preferencias:");
		preferencias.setFont(new Font("Consolas", Font.PLAIN, 15));
		preferencias.setBounds(50, 164, 154, 14);
		etiquetas.add(preferencias);
		
		//Panel para colocar las areas de texto y lista
		JPanel areas = new JPanel();
		areas.setBackground(new Color(218, 84, 84));
		areas.setLayout(null);
		areas.setBounds(37, 122, 357, 191);
		opcionesAd.add(areas);
		
		//Lista de seleccion de preferencias
		String [] prefS={"Cantar","Escuchar musica","Leer","Deportes","Otro"};
		JList<String> actividades = new JList<>(prefS);
		JScrollPane scrollPane = new JScrollPane(actividades);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(186,27,149,74);
		areas.add(scrollPane);
		
		
		JTextArea areaD = new JTextArea(4,20);
		JScrollPane scrollPane2 = new JScrollPane(areaD);
		scrollPane2.setBounds(10,27,154,89);
		areas.add(scrollPane2);
		
		
		
		//Panel para tener el espacio en el GridLayout para acomodar los botones
		JPanel botonesFondo = new JPanel();
		botonesFondo.setBackground(new Color(84, 185, 218));
		botonesFondo.setLayout(null);
		distribucion.add(botonesFondo);
		
		//Panel donde se acomodaron los botones y se centraron
		JPanel botones = new JPanel();
		botones.setBackground(new Color(84, 185, 218));
		botones.setBounds(120, 69, 206, 222);
		botones.setLayout(new GridLayout(3,1,10,10));
		botonesFondo.add(botones,JPanel.CENTER_ALIGNMENT);
		
		JButton nuevo = new JButton("Nuevo");
		nuevo.setBackground(new Color(84, 68, 68));
		ImageIcon carpeta = new ImageIcon(getClass().getResource("add-folder.png"));
		nuevo.setFont(new Font("Consolas", Font.PLAIN, 15));
		nuevo.setIcon(carpeta);
		nuevo.setHorizontalAlignment(JButton.CENTER);
		botones.add(nuevo,BorderLayout.NORTH);
		
		JButton guardar = new JButton("Guardar");
		guardar.setBackground(new Color(84, 68, 68));
		ImageIcon disquete = new ImageIcon(getClass().getResource("diskette.png"));
		guardar.setIcon(disquete);
		guardar.setFont(new Font("Consolas", Font.PLAIN, 15));
		guardar.setHorizontalAlignment(JButton.CENTER);
		botones.add(guardar,BorderLayout.CENTER);
		
		JButton salir = new JButton("Salir");
		salir.setBackground(new Color(84, 68, 68));
		ImageIcon cerrar = new ImageIcon(getClass().getResource("button.png"));
		salir.setIcon(cerrar);
		salir.setFont(new Font("Consolas", Font.PLAIN, 15));
		salir.setHorizontalAlignment(JButton.CENTER);
		botones.add(salir,BorderLayout.SOUTH);
		
		
		
		
		
		
		
		
		
		frame.setBounds(100, 100, 891, 817);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
