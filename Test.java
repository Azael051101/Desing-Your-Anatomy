import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

class Test{
	public static void main(String[] args) {
		
		Ventana ventana = new Ventana(); 

		try{
			Image img =ImageIO.read(new File("icon.png"));
			ventana.setIconImage(img);
	

		}
		catch(Exception e){System.out.println(e);}
		}
	
}