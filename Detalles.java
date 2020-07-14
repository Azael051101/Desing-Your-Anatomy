import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.io.*;
import javax.imageio.*;
import java.awt.Color;
import java.awt.*;


class Detalles extends JFrame implements ActionListener{
	 JPanel panel;
	 JButton redes;
	 

	 public Detalles(){

	 	try{
	 	Image img =ImageIO.read(new File("icon.png"));
		this.setIconImage(img);

		}
		catch(Exception e){System.out.println(e);}
		

	 	String fondo = "fondoInfo.png";
	 	panel = new JPanelConFondo(fondo);
	 	panel.setLayout(null);

	 	redes = new JButton("RedesSociales");
	 	redes.setBounds(420,292,50,50);
	 	ImageIcon face = new ImageIcon("face.png");
	 	redes.setIcon(new ImageIcon(face.getImage().getScaledInstance(redes.getWidth(), redes.getHeight(), Image.SCALE_SMOOTH)));
	 	redes.setBackground(new Color(59,89,152));
	 	

	 	String url = "mano.jpg";
		JLabel imagenMano = new JLabel(new ImageIcon(url));
		imagenMano.setBounds(20,20,100,100);



	 	panel.add(redes);
	 	
	 	panel.add(imagenMano);

	 	this.add(panel);
	 	setLocation(450,150);
	 	this.setTitle("Conocenos");
	 	this.setSize(500,400);
	 	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	 	this.setVisible(true);
	 	this.setResizable(false);


	 	redes.addActionListener(this);
	 }

	 public void actionPerformed(ActionEvent event){
	 	if(event.getSource()== this.redes){
	 		if (java.awt.Desktop.isDesktopSupported()){
		 			java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

			 		if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
			 			try{
			 				java.net.URI link = new java.net.URI("https://www.facebook.com/todo3dandmore");
			 				desktop.browse(link);
			 			}catch(URISyntaxException | IOException ex){}
			 		}
			 }
			 this.setVisible(false);
	 	}
	 }
}