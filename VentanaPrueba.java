import javax.swing.*;
import java.awt.event.*;

class VentanaPrueba extends JFrame implements ActionListener{
	 JPanel panel;
	 JButton btnPrueba;

	 public VentanaPrueba(){

	 	panel = new JPanel();
	 	panel.setLayout(null);

	 	btnPrueba = new JButton("btnPrueba");
	 	btnPrueba.setBounds(50,50,100,30);

	 	panel.add(btnPrueba);

	 	this.add(panel);
	 	setLocation(400,250);
	 	this.setTitle("Primera Prueba");
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