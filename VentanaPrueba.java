import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.awt.Color;
import java.io.*;
import javax.sound.midi.*;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URISyntaxException;



public class VentanaPrueba extends JFrame implements ActionListener{
	 JPanel panel;
	 JButton btnLink;
	 JTextArea detalles;
	 ArrayList <String> contenido_1;
	 ArrayList <String> contenido_2;



	 public VentanaPrueba(){


		String fondo = "fondoDatos.png";
		panel = new JPanelConFondo(fondo);
		panel.setLayout(null);


		try{
	 	Image img =ImageIO.read(new File("icon.png"));
		this.setIconImage(img);

		}
		catch(Exception e){System.out.println(e);}

	 	btnLink = new JButton("Obtener modelo");
	 	btnLink.setBounds(143,33,200,40);
	 	//Ventana vent = new Ventana();

	 	//Archivo.leerTodo(ventana.darNombre()+".txt");
	 	detalles = new JTextArea();
	 	detalles.setBounds(20,100,450,450);

	 	String nombre_archivo_leer ="";
				
			nombre_archivo_leer  = "Datos.txt";
			try{
				contenido_1 = Archivo.leerTodo(nombre_archivo_leer);
			}catch(Exception e){
			System.out.println("Error");
			System.out.println("Error.... Checale bien Pa'");
			}	
							
			String cadena = "";
		for (int i=0;i<contenido_1.size() ;i++ ) {
			cadena = cadena + contenido_1.get(i) +"\n";
		}
		//System.out.println(cadena);
		//lblTexto1.setText(cadena);
		try{
			detalles.setText(cadena);
		}
		catch(Exception e)
		{
			System.out.println("nada");
		}
		


		String nombre_archivoleer ="";
				
			nombre_archivoleer  = "Medidas.txt";
			try{
				contenido_2 = Archivo.leerTodo(nombre_archivoleer);
			}catch(Exception e){
			System.out.println("Error");
			System.out.println("Error.... Checale bien Pa'");
			}	
							
			String cadena2 = "";
		for (int i=0;i<contenido_2.size() ;i++ ) {
			cadena2 = cadena2 + contenido_2.get(i) +"\n";



		}
		//System.out.println(cadena);
		//lblTexto1.setText(cadena);
		try{
			detalles.setText(cadena + cadena2);
			
		}
		catch(Exception e)
		{
			System.out.println("nada");
		}


	 	panel.add(btnLink);
	 	panel.add(detalles);

	 	this.add(panel);
	 	setLocation(400,250);
	 	this.setTitle("Datos");
	 	this.setSize(500,400);
	 	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	 	this.setVisible(true);

	 	btnLink.addActionListener(this);

	 }

	 public void actionPerformed(ActionEvent event){
	 	if(event.getSource()== this.btnLink){
	 		System.out.println("btnLink precionado");

	
	 		if (java.awt.Desktop.isDesktopSupported()){
	 		java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

	 		if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
	 			try{
	 				java.net.URI link = new java.net.URI("https://www.google.com/");
	 				desktop.browse(link);
	 			}catch(URISyntaxException | IOException ex){}
	 			
	 		}
	 		
	 	}
	 
	 	
	 		
	 	}
	 }
}