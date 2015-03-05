package diapositivas;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;
public class MiSegundaVentana {
	private JFrame ventana;
	public MiSegundaVentana(){
		ventana=new JFrame();
		ventana.setTitle("Titulo de ventana");
		//ventana.setSize(300,200);
		ventana.setSize(new Dimension(300,200));
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		BorderLayout miLayout=new BorderLayout(30,30);
		ventana.getContentPane().setLayout(miLayout);
		JLabel etiqueta=new JLabel("Mi etiqueta");
		ventana.getContentPane().add(etiqueta,BorderLayout.NORTH);
		JButton boton=new JButton("Aceptar");
		boton.setPreferredSize(new Dimension(100,300));
		ventana.getContentPane().add(boton,BorderLayout.WEST);
		JLabel etiqueta2=new JLabel("Otra etiqueta");
		ventana.getContentPane().add(etiqueta2,BorderLayout.SOUTH);
	}
public static void main(String[] args) {
	MiSegundaVentanaContenedores app= new MiSegundaVentanaContenedores();
	
}
}
