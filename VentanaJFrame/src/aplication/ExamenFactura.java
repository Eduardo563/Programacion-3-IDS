package aplication;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class ExamenFactura extends JFrame {

	Font Titulo = new Font("SansSerif",Font.BOLD,18);
	Font Campos = new Font("Arial",Font.PLAIN,14);
	Font CamposB = new Font("Arial",Font.BOLD,14);
	Border lineaG = BorderFactory.createLineBorder(Color.gray,1);
	Color azulFranja = new Color(0, 102, 153);
	
	public ExamenFactura(String tittle) {
		
		this.setTitle(tittle);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 680);
		this.setLocationRelativeTo(null);	
		this.add(panelPrin());
		this.repaint();
	}
	
	public JPanel panelPrin() {
		JPanel panelPrin = new JPanel();
		panelPrin.setBackground(Color.white);
		panelPrin.setSize(500, 680);
		panelPrin.setLayout(null);
		
		JPanel franja = new JPanel();
		franja.setLayout(null);
		franja.setBackground(azulFranja);
		franja.setBounds(0, 0, 500, 70);
		panelPrin.add(franja);
		
		JLabel factura = new JLabel("Factura");
		factura.setFont(Titulo);
		factura.setForeground(Color.white);
		factura.setBounds(50,30,100,30);
		franja.add(factura);
		
		//--------------Crear el panel de datos del cliente--------------
		JPanel datosCl = new JPanel();
		datosCl.setLayout(null);
		datosCl.setBackground(Color.white);
		datosCl.setBounds(10, 80, 470, 120);
		datosCl.setBorder(BorderFactory.createTitledBorder(lineaG,"Datos del cliente"));
		panelPrin.add(datosCl);
		
		JLabel doc = new JLabel("Documento:");
		doc.setFont(Campos);
		doc.setHorizontalAlignment(JLabel.LEFT);
		doc.setBounds(15,20,80,20);
		datosCl.add(doc);
		
		JTextField docT = new JTextField("123456");
		docT.setFont(Campos);
		docT.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		docT.setBounds(100, 20, 90, 20);
		datosCl.add(docT);
		
		JLabel nombre = new JLabel("Nombres:");
		nombre.setFont(Campos);
		nombre.setHorizontalAlignment(JLabel.LEFT);
		nombre.setBounds(215,20,80,20);
		datosCl.add(nombre);
		
		JTextField nombreT = new JTextField("John Doe");
		nombreT.setFont(Campos);
		nombreT.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		nombreT.setBounds(300, 20, 150, 20);
		datosCl.add(nombreT);
		
		JLabel direccion = new JLabel("Direccion:");
		direccion.setFont(Campos);
		direccion.setHorizontalAlignment(JLabel.LEFT);
		direccion.setBounds(15,80,80,20);
		datosCl.add(direccion);
		
		JTextField direcT = new JTextField("Calle 1 #123");
		direcT.setFont(Campos);
		direcT.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		direcT.setBounds(100, 80, 90, 20);
		datosCl.add(direcT);
		
		JLabel telefono = new JLabel("Teléfono:");
		telefono.setFont(Campos);
		telefono.setHorizontalAlignment(JLabel.LEFT);
		telefono.setBounds(215,80,80,20);
		datosCl.add(telefono);
		
		JTextField telefonoT = new JTextField("5554433");
		telefonoT.setFont(Campos);
		telefonoT.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		telefonoT.setBounds(300, 80, 150, 20);
		datosCl.add(telefonoT);
		
	//-------------------Crear panel para los datos de factura------------------
		JPanel datosF = new JPanel();
		datosF.setLayout(null);
		datosF.setBackground(Color.white);
		datosF.setBounds(10,210,470,80);
		datosF.setBorder(BorderFactory.createTitledBorder(lineaG,"Datos de factura"));
		panelPrin.add(datosF);
		
		JLabel numF = new JLabel("N° Factura:");
		numF.setFont(Campos);
		numF.setBounds(10,35,100,20);
		datosF.add(numF);
		
		JLabel num = new JLabel("1");
		num.setFont(Titulo);
		num.setBounds(150,35,30,20);
		datosF.add(num);
		
		JLabel fechaF = new JLabel("Fecha:");
		fechaF.setFont(Campos);
		fechaF.setBounds(200,35,80,20);
		datosF.add(fechaF);
		
		JLabel fecha = new JLabel("2021/50/21");
		fecha.setFont(Titulo);
		fecha.setBounds(290,35,100,20);
		datosF.add(fecha);
	//------------------Crear el panel para opciones de factura------------------
		JPanel opciones = new JPanel();
		opciones.setLayout(null);
		opciones.setBackground(Color.white);
		opciones.setBounds(10,300,470,30);
		opciones.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		panelPrin.add(opciones);
		
		JLabel lista = new JLabel("Ver listado de facturas");
		lista.setFont(Campos);
		lista.setIcon(new ImageIcon(getClass().getResource("list.png")));
		lista.setBounds(5,5,160,20);
		opciones.add(lista);
		
		JLabel añadir = new JLabel("Añadir");
		añadir.setFont(Campos);
		añadir.setIcon(new ImageIcon(getClass().getResource("plus.png")));
		añadir.setBounds(280,5,80,20);
		opciones.add(añadir);
		
		JLabel borrar = new JLabel("Eliminar");
		borrar.setFont(Campos);
		borrar.setIcon(new ImageIcon(getClass().getResource("x.png")));
		borrar.setBounds(370,5,100,20);
		opciones.add(borrar);
		
	//-------------------Crear el panel para la tabla de productos------------------
		JPanel mostrarTab = new JPanel();
		
		mostrarTab.setBounds(10,300,470,130);
		panelPrin.add(mostrarTab);
		
		//arreglo titulos de la tabla
		String [] columnName = {
				"Producto",
				"Cantidad",
				"Valor",
				"Subtotal"
		};
		//arreglo texto campos
		Object [][] datos = {
				{"Agua",2,500,1000.0},
				{"Cereal",5,1000,5000.0},
				{"Leche",2,300,600.00}
		};
		JTable tabla = new JTable(datos,columnName);
		JScrollPane barra = new JScrollPane(tabla);
		barra.setBounds(0,30,470,100);
		mostrarTab.add(barra);
		
	//-------------------Crear panel para los labels del final----------------------
		JPanel calculo = new JPanel();
		calculo.setLayout(null);
		calculo.setBackground(Color.white);
		calculo.setBounds(10,430,470,190);
		panelPrin.add(calculo);
		
		JLabel subtotal = new JLabel("Subtotal:");
		subtotal.setFont(Campos);
		subtotal.setBounds(5,10,60,20);
		calculo.add(subtotal);
		
		JLabel subNum = new JLabel("6600.0");
		subNum.setFont(CamposB);
		subNum.setBounds(120,10,60,20);
		calculo.add(subNum);
		
		JLabel descuento = new JLabel("% Descuento:");
		descuento.setFont(Campos);
		descuento.setBounds(5,40,100,20);
		calculo.add(descuento);
		
		JTextField descM = new JTextField("5");
		descM.setFont(CamposB);
		descM.setBorder(BorderFactory.createLineBorder(Color.gray,1));
		descM.setBounds(120,40,60,20);
		calculo.add(descM);
		
		JCheckBox check = new JCheckBox();
		check.setFont(CamposB);
		check.setBackground(Color.white);
		check.setBounds(200,40,20,20);
		calculo.add(check);
		
		JLabel iva = new JLabel("IVA 19%:");
		iva.setFont(Campos);
		iva.setBounds(5,70,60,20);
		calculo.add(iva);
		
		JLabel ivaNum = new JLabel("1254.0");
		ivaNum.setFont(CamposB);
		ivaNum.setBounds(120,70,60,20);
		calculo.add(ivaNum);
		
		JLabel total = new JLabel("Total Factura:");
		total.setFont(Campos);
		total.setBounds(5,100,100,20);
		calculo.add(total);
		
		JLabel totalNum = new JLabel("7524.0");
		totalNum.setFont(CamposB);
		totalNum.setBounds(120,100,60,20);
		calculo.add(totalNum);
		
		JLabel valorDes = new JLabel("Valor descontado: ");
		valorDes.setFont(Campos);
		valorDes.setBounds(240,40,130,20);
		calculo.add(valorDes);
		
		JLabel valorDN = new JLabel("330.0");
		valorDN.setFont(CamposB);
		valorDN.setBounds(370, 40, 50, 20);
		calculo.add(valorDN);
		
		//Agregar boton de finalizar factura
		JButton finalizar = new JButton ("Finalizar factura");
		finalizar.setBackground(new Color(227,227,227));
		finalizar.setBounds(280, 140, 150, 30);
		calculo.add(finalizar);
		
		//Agregar franja azul inferior
		JPanel franjaIn = new JPanel();
		franjaIn.setBackground(azulFranja);
		franjaIn.setBounds(0, 620, 500, 30);
		panelPrin.add(franjaIn);
		
		
		
		return panelPrin;
	}

}
