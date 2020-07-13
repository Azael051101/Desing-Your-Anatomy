import javax.swing.*;
import java.awt.event.*;
import javax.swing.JRadioButton;
import java.awt.*;


class Dedos extends JFrame implements ActionListener{
	 JPanel panel;
	 JButton btnPrueba;
	 JComboBox lado;
	 JLabel dedosFaltantes;
	 JRadioButton indice;
	 JRadioButton anular;
	 JRadioButton pulgar;
	 JRadioButton menique;
	 JRadioButton medio;

	 public Dedos(){

	 	panel = new JPanel();
	 	panel.setLayout(null);

	 	btnPrueba = new JButton("btnPrueba");
	 	btnPrueba.setBounds(50,50,100,30);

	 	indice = new JRadioButton("Indice",false);
		indice.setBounds(100,100,100,50);
		anular = new JRadioButton("Anular",false);
		anular.setBounds(100,100,100,50);
		menique = new JRadioButton("Anular",false);
		menique.setBounds(100,100,100,50);
		medio = new JRadioButton("Anular",false);
		medio.setBounds(100,100,100,50);
		pulgar = new JRadioButton("Anular",false);
		pulgar.setBounds(100,100,100,50);

	 	String [] derechaIzq = {"Derecha","Izquierda"};
		lado = new JComboBox(derechaIzq);
		lado.setBounds(100,200,100,30);

	 	String url = "mano.jpg";
		JLabel imagenMano = new JLabel(new ImageIcon(url));
		imagenMano.setBounds(20,20,100,100);

		JLabel dedosFaltantes = new JLabel("Dedos Faltantes");
		dedosFaltantes.setBounds(20,355,100,30);
		dedosFaltantes.setFont(new Font("cooper Black",0,20));





	 	panel.add(btnPrueba);
	 	panel.add(lado);
	 	panel.add(imagenMano);
	 	panel.add(indice);
	 	panel.add(pulgar);
	 	panel.add(anular);
	 	panel.add(menique);
	 	panel.add(medio);


	 	this.add(panel);
	 	setLocation(400,250);
	 	this.setTitle("Dedos");
	 	this.setSize(500,400);
	 	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	 	this.setVisible(true);

	 	btnPrueba.addActionListener(this);
	 }

	 public void actionPerformed(ActionEvent event){
	 	if(event.getSource()== this.btnPrueba){
	 		System.out.println("btnPrueba precionado");
	 	}
	 }
}