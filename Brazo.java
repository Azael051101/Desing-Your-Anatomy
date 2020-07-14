import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;


class Brazo extends JFrame implements ActionListener{
	 JPanel panel;
	 JButton btnConfirmar;
	 JButton brazoIzq;
	 JButton brazoDer;
	 JComboBox color;
	 int valor =0;
	 JTextField x;
	 JLabel etcolor;

	 public static int derecho = 0;
	

	 public Brazo(){

		try{
	 	Image img =ImageIO.read(new File("icon.png"));
		this.setIconImage(img);

		}
		catch(Exception e){System.out.println(e);}
		
	 	String fondo = "fondoMano.png";
		panel = new JPanelConFondo(fondo);
	 	panel.setLayout(null);

	 	btnConfirmar = new JButton("Confirmar");
	 	btnConfirmar.setBounds(500,350,100,50);

	 	etcolor = new JLabel("Seleccione el Color: ");
		etcolor.setBounds(130,290,200,30);
		etcolor.setFont(new Font("Times New Roman",0,24));

		brazoIzq = new JButton();
	 	brazoIzq.setBounds(175,100,120,120);
	 	ImageIcon brazo = new ImageIcon("brazoIzq.png");
	 	brazoIzq.setIcon(new ImageIcon(brazo.getImage().getScaledInstance(brazoIzq.getWidth(), brazoIzq.getHeight(), Image.SCALE_SMOOTH)));
	 	brazoIzq.setBackground(Color.WHITE);

	 	brazoDer = new JButton();
	 	brazoDer.setBounds(375,100,120,120);
	 	ImageIcon brazoI = new ImageIcon("brazoDer.png");
	 	brazoDer.setIcon(new ImageIcon(brazoI.getImage().getScaledInstance(brazoDer.getWidth(), brazoDer.getHeight(), Image.SCALE_SMOOTH)));
	 	brazoDer.setBackground(null);

	 	String [] colores = {"Seleccionar...","Azul","Amarillo","Rojo","Rosa","Verde","Morado","Gris","Naranja","Blanco"};
		color = new JComboBox(colores);
		color.setBounds(130,330,100,30);

		x = new JTextField();
		x.setBounds(175,100,0,0);


	 	panel.add(btnConfirmar);
	 	panel.add(brazoIzq);
	 	panel.add(brazoDer);
	 	panel.add(color);
	 	panel.add(x);
	 	panel.add(etcolor);


	 	this.add(panel);
	 	setLocation(400,100);
	 	this.setTitle("Brazo");
	 	this.setSize(700,500);
	 	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	 	this.setVisible(true);

	 	btnConfirmar.addActionListener(this);
	 	brazoDer.addActionListener(this);
	 	brazoIzq.addActionListener(this);
	 	color.addActionListener(this);

	 }

	 public void actionPerformed(ActionEvent event){

		if(event.getSource()== this.brazoIzq){
	 		//System.out.println("brazoIzq precionado");
	 		x.setText("Zurdo");
	 		valor = 1;
	 		derecho = 2;
		 }else if(event.getSource()== this.brazoDer){
		 	//System.out.println("brazoDer precionado");
		 	x.setText("Derecho");
		 	valor = 2;
		 	derecho = 1;
		 }else if(event.getSource()== this.btnConfirmar){
	 		System.out.println("btnConfirmar precionado");
	 		JOptionPane.showMessageDialog(null,"GUARDANDO.... Se cerrara la ventana.");
	 		String datosUsuario = "Brazo: " + x.getText() +"\n"+ "Color: " + color.getSelectedItem();
	 		Archivo.guardarTodo(datosUsuario,"Medidas.txt");



	 		try{
		 		Thread.sleep(1200);
		 	}catch(Exception e){
		 	}VentanaPrueba vP = new VentanaPrueba();
		 	vP.setVisible(false);
		 	setVisible(false);

	 	}
	 }
}