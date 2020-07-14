import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//import javax.lang.Thread;


class Dedos extends JFrame implements ActionListener{
	 JPanel panel;
	

	 public Dedos(){
	
	 	panel = new JPanel();
	 	panel.setLayout(null);

	 

	 	this.add(panel);
	 	setLocation(400,250);
	 	this.setTitle("Dedos");
	 	this.setSize(500,400);
	 	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	 	this.setVisible(true);

	 	JOptionPane.showMessageDialog(null,"Estamos trabajando en ello....");
	 	try{
	 		Thread.sleep(1000);
		 	}catch(Exception e){
		 	
	 	}
	 	this.setVisible(false);
	 }

	 public void actionPerformed(ActionEvent event){
	 	
	 }


}