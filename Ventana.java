import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.io.File;
import java.util.*;
import java.io.*;
import javax.imageio.*;


public class Ventana extends JFrame implements ActionListener{

	JPanel panel;
	JButton btncontinuar;
	JButton verDetalles;
	//JLabel wellcome;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem itemPaciente;
	JComboBox ciudades;
	JComboBox partesCuerpo;
	JComboBox genero;
	JTextField nombre;
	JTextField edad;
	JTextField correo;
	JLabel etnombre;
	JLabel etedad;
	JLabel etcorreo;
	JLabel etgenero;
	JLabel etciudad;
	JLabel etParte;
	JButton continuar;
	JTextArea detalles;
	ArrayList <String> contenido_1;

	
	

	public Ventana(){

		String fondo = "fondo.png";
		panel = new JPanelConFondo(fondo);
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);

		
		


		btncontinuar = new JButton("Continuar");
		btncontinuar.setBounds(750,500,150,60);
		ImageIcon imagencontinuar = new ImageIcon("btncontinuar.png");
	 	btncontinuar.setIcon(new ImageIcon(imagencontinuar.getImage().getScaledInstance(btncontinuar.getWidth(), btncontinuar.getHeight(), Image.SCALE_SMOOTH)));
	 	btncontinuar.setBackground(Color.WHITE);

		verDetalles = new JButton("Conocenos");
		verDetalles.setBounds(900,550,200,30);

		// wellcome = new JLabel("Bienvenido a Disigner of Anatomy");
		// wellcome.setBounds(250,50,800,50);
		// wellcome.setFont(new Font("cooper Black",0,40));
		menuBar = new JMenuBar();
		menu = new JMenu("Administrar");
		itemPaciente = new JMenuItem("Paciente");

		String [] partesDelCuerpo = {"Seleccionar...","Mano","Brazo","Dedos"};
		partesCuerpo = new JComboBox(partesDelCuerpo);
		partesCuerpo.setBounds(450,300,100,30);

		etParte = new JLabel("Parte del Cuerpo Faltante: ");
		etParte.setBounds(400,270,300,30);
		etParte.setFont(new Font("cooper Black",0,20));


		String url = "logobueno.png";
		JLabel logo = new JLabel(new ImageIcon(url));
		logo.setBounds(40,10,180,180);

		etnombre = new JLabel("Nombre: ");
		etnombre.setBounds(40,290,100,30);
		etnombre.setFont(new Font("Times New Roman",0,24));

		etedad = new JLabel("Edad: ");
		etedad.setBounds(40,335,100,30);
		etedad.setFont(new Font("Times New Roman",0,24));

		nombre = new JTextField();
		nombre.setBounds(130,290,150,30);
		edad = new JTextField();
		edad.setBounds(130,335,150,30);

		etgenero = new JLabel("Genero: ");
		etgenero.setBounds(40,375,100,30);
		etgenero.setFont(new Font("Times New Roman",0,24));

		String [] generos = {"Seleccionar...","Masculino","Femenino"};
		genero = new JComboBox(generos);
		genero.setBounds(130,375,100,30);
	
		etciudad = new JLabel("Cuidad: ");
		etciudad.setBounds(40,420,100,30);
		etciudad.setFont(new Font("Times New Roman",0,24));	

		String [] listaDeCiudades = {"Seleccionar...","Tijuana","Monterrey","Guadalajara"};
		ciudades = new JComboBox(listaDeCiudades);
		ciudades.setBounds(130,420,100,30);

		etcorreo = new JLabel("Correo: ");
		etcorreo.setBounds(40,465,100,30);
		etcorreo.setFont(new Font("Times New Roman",0,24));

		correo = new JTextField();
		correo.setBounds(130,465,150,30);


		/*String prueba = correo.getText();
		Archivo ar = new Archivo();
		ar.guardarTodo(prueba,"Archivo de Prueba");*/

		continuar = new JButton("Continuar");
		continuar.setBounds(130,510,90,40);


		panel.add(btncontinuar);
		panel.add(verDetalles);
		//panel.add(wellcome);
		panel.add(ciudades);
		panel.add(logo);
		panel.add(partesCuerpo);
		panel.add(nombre);
		panel.add(edad);
		panel.add(genero);
		panel.add(etnombre);
		panel.add(etedad);
		panel.add(etgenero);
		panel.add(etciudad);
		panel.add(etcorreo);
		panel.add(correo);
		panel.add(continuar);
		panel.add(etParte);

		menuBar.add(menu);
		menu.add(itemPaciente);
		this.setJMenuBar(menuBar);
		
		this.add(panel);
		this.setTitle("Desing Your Anatomy");
		this.setSize(1200,680);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		//Añadir los accionPerformed
		btncontinuar.addActionListener(this);
		verDetalles.addActionListener(this);
		itemPaciente.addActionListener(this);
		ciudades.addActionListener(this);
		partesCuerpo.addActionListener(this);
		genero.addActionListener(this);
		continuar.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent event){
		
		if(event.getSource() == this.btncontinuar){
			System.out.println("btncontinuar pulsado");

		}else if(event.getSource()== this.verDetalles){
	


		}else if(event.getSource()== this.itemPaciente){
			//System.out.println("itemPaciente precionado");
			VentanaPrueba vp = new VentanaPrueba();
				System.out.println("HOLA");


		}else if(event.getSource()== this.ciudades){
			
			
		}else if(event.getSource()== this.continuar){
			String datosUsuario = "Nombre: "+nombre.getText()+"\n"+ "Edad: "+edad.getText()+"\n" +"Genero: "
			+genero.getSelectedItem()+"\n"+"Ciudad: "+ciudades.getSelectedItem()+"\n"+ "Correo: "+correo.getText();
			
			String crear = "C:/Users/Hiram/Documents/java/Proyecto Poo 2do Sem//"+nombre.getText();
			File c = new File(crear);
			c.mkdirs();

			

			Archivo.guardarTodo(datosUsuario,"Datos.txt");

			if(genero.getSelectedItem().equals("Masculino")){
				 // System.out.println("Macho");

			}
			if(genero.getSelectedItem().equals("Femenino")){
				 	// System.out.println("Vieja");

				 }
			
			if(partesCuerpo.getSelectedItem().equals("Mano")){
				Mano mano = new Mano();
				// System.out.println("Mano");

			}else if (partesCuerpo.getSelectedItem().equals("Brazo")){
				Brazo brazo = new Brazo();
			}else if(partesCuerpo.getSelectedItem().equals("Dedos")){
				Dedos dedos = new Dedos();
			}

		}

	}
		

}