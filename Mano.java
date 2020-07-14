import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

class Mano extends JFrame implements ActionListener{
	 JPanel panel;
	 JButton manoizq;
	 JButton manoder;
	 JButton continuar;
	 JComboBox lado;
	
	 JTextField longitud;
	 JTextField circunferencia;

	 JLabel medidaCodo;
	 JLabel medidaMuneca;
	 //JLabel escoge;
	 JTextField x;
	 ArrayList<String> contenido;
	 int valor =0;
	public static int derecho = 0;



	 public Mano(){
	 	
		
		try{
	 	Image img =ImageIO.read(new File("icon.png"));
		this.setIconImage(img);

		}
		catch(Exception e){System.out.println(e);}
		
	 	String fondo = "fondomano.png";
		panel = new JPanelConFondo(fondo);
	 	panel.setLayout(null);

	 	

	 	manoizq = new JButton();
	 	manoizq.setBounds(175,100,120,120);
	 	ImageIcon mano = new ImageIcon("manoizq.png");
	 	manoizq.setIcon(new ImageIcon(mano.getImage().getScaledInstance(manoizq.getWidth(), manoizq.getHeight(), Image.SCALE_SMOOTH)));
	 	manoizq.setBackground(Color.WHITE);

	 	manoder = new JButton();
	 	manoder.setBounds(375,100,120,120);
	 	ImageIcon manod = new ImageIcon("manoder.png");
	 	manoder.setIcon(new ImageIcon(manod.getImage().getScaledInstance(manoder.getWidth(), manoder.getHeight(), Image.SCALE_SMOOTH)));
	 	manoder.setBackground(Color.WHITE);


	 	/*String [] derechaIzq = {"Derecha","Izquierda"};
		lado = new JComboBox(derechaIzq);
		lado.setBounds(100,200,100,30);*/

	 	/*String url = "mano.jpg";
		JLabel imagenMano = new JLabel(new ImageIcon(url));
		imagenMano.setBounds(20,20,100,100);*/



		longitud = new JTextField();
		longitud.setBounds(30,375,150,30);

		circunferencia = new JTextField();
		circunferencia.setBounds(30,305,150,30);

		medidaCodo = new JLabel("Longitud del Codo a la Muneca");
		medidaCodo.setBounds(20,340,400,30);
		medidaCodo.setFont(new Font("Times New Roman",0,24));

		medidaMuneca = new JLabel("Circunferencia de la Muneca");
		medidaMuneca.setBounds(20,270,400,30);
		medidaMuneca.setFont(new Font("Times New Roman",0,24));

		// escoge = new JLabel("Seleccione Segun sus necesidades");
		// escoge.setBounds(182,5,400,30);
		// escoge.setFont(new Font("cooper Black",0,20));

		continuar = new JButton("continuar");
		continuar.setBounds(500,350,100,50);

		x = new JTextField();
		x.setBounds(175,100,0,0);



	 	panel.add(manoizq);
	 	panel.add(manoder);
	 	//panel.add(lado);
	 	//panel.add(imagenMano);
	 	
	 	panel.add(longitud);
	 	panel.add(medidaCodo);
	 	panel.add(medidaMuneca);
		panel.add(circunferencia);
		panel.add(continuar);
		//panel.add(escoge);
		panel.add(x);


	 	this.add(panel);
	 	setLocation(350,150);
	 	this.setTitle("Mano");
	 	this.setSize(700,500);
	 	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	 	this.setVisible(true);

	 	manoizq.addActionListener(this);
	 	manoder.addActionListener(this);
	 	continuar.addActionListener(this);

	 	
	 	

	 }

	 

	 public void actionPerformed(ActionEvent event){
	 	
	 	if(event.getSource()== this.manoizq){
	 		//System.out.println("manoizq precionado");
	 		x.setText("zurdo");
	 		valor = 1;
	 		derecho = 1;
		 }else if(event.getSource()== this.manoder){
		 	//System.out.println("manoider precionado");
		 	valor = 2;
		 	x.setText("Disestro");
		 	derecho = 2;
		 }else if(event.getSource() == this.continuar){
		 	//System.out.println("boton continuar");
		 	
		 	JOptionPane.showMessageDialog(null,"GUARDANDO.... Se cerrara la ventana.");

		 	String datosUsuario = "Circunferencia de la Muneca : "+circunferencia.getText()+"\n"+ "Longitud del Codo a la Muneca: "+longitud.getText()+"\n"+ "Orientacion: " + x.getText();
			Archivo.guardarTodo(datosUsuario,"Medidas.txt");

			//String comparacion = ;
			if(valor == 1){
				System.out.println("es zurdo");
				
			}else if(valor ==2){
				System.out.println("es diestro");
			}
			
		 	try{
		 		Thread.sleep(1200);
		 	}catch(Exception e){
		 	}

		 	VentanaPrueba vp = new VentanaPrueba();
		 	vp.setVisible(false);


		 	setVisible(false);
		 }

	}

	
	 
}