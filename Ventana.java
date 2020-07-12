import javax.swing.*;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame implements ActionListener{

	JPanel panel;
	JButton btncontinuar;
	JButton btnVentanaPrueba;
	JLabel wellcome;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem itemPaciente;

	

	public Ventana(){

		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(133,137,136));

		btncontinuar = new JButton("Continuar");
		btncontinuar.setBounds(50,50,100,30);
		btnVentanaPrueba = new JButton("abrir VentanaPrueba");
		btnVentanaPrueba.setBounds(50,100,150,30);
		wellcome = new JLabel("Bienvenido");
		wellcome.setBounds(50,150,110,30);
		menuBar = new JMenuBar();
		menu = new JMenu("Administrar");
		itemPaciente = new JMenuItem("Paciente");
		
		panel.add(btncontinuar);
		panel.add(btnVentanaPrueba);
		panel.add(wellcome);

		menuBar.add(menu);
		menu.add(itemPaciente);
		this.setJMenuBar(menuBar);
		
		this.add(panel);
		this.setTitle("Mental Test Diagnostic Pro.");
		this.setSize(600,400);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		//Añadir los accionPerformed
		btncontinuar.addActionListener(this);
		btnVentanaPrueba.addActionListener(this);
		itemPaciente.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent event){
		if(event.getSource() == this.btncontinuar){
			System.out.println("btncontinuar pulsado");
		}else if(event.getSource()== this.btnVentanaPrueba){

			VentanaPrueba ventanaPrueba = new VentanaPrueba();
			
		}else if(event.getSource()== this.itemPaciente){
			System.out.println("itemPaciente precionado");
		}
	}
}