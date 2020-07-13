import javax.swing.*;
import java.awt.event.*;

class Brazo extends JFrame implements ActionListener{
	 JPanel panel;
	 JButton btnPrueba;
	 JComboBox lado;

	 public Brazo(){

	 	panel = new JPanel();
	 	panel.setLayout(null);

	 	btnPrueba = new JButton("btnPrueba");
	 	btnPrueba.setBounds(50,50,100,30);

	 	String [] derechaIzq = {"Derecha","Izquierda"};
		lado = new JComboBox(derechaIzq);
		lado.setBounds(100,200,100,30);

	 	String url = "mano.jpg";
		JLabel imagenMano = new JLabel(new ImageIcon(url));
		imagenMano.setBounds(20,20,100,100);



	 	panel.add(btnPrueba);
	 	panel.add(lado);
	 	panel.add(imagenMano);

	 	this.add(panel);
	 	setLocation(400,250);
	 	this.setTitle("Brazo");
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