package diapositivas;
import java.awt.Dimension;

import javax.swing.*;
public class MiSegundaVentana {
	private JFrame ventana;
	public MiSegundaVentana(){
		ventana=new JFrame();
		ventana.setTitle("Titulo de ventana");
		//ventana.setSize(300,200);
		ventana.setSize(new Dimension(300,200));
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ventana.setVisible(true);
	}
public static void main(String[] args) {
	MiSegundaVentana app= new MiSegundaVentana();
	
}
}
