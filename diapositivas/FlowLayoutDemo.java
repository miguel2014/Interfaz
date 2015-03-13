package diapositivas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlowLayoutDemo {
	private JFrame ventana;
	
	public FlowLayoutDemo(String titulo) {
		ventana=new JFrame(titulo);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(300, 100);
		ventana.setVisible(true);
		
		FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER,50,140);
		ventana.setLayout(flowLayout);
		
		JPanel panelcentral=new JPanel();
		
		JButton boton1=new JButton("Boton1");
		JButton boton2=new JButton("Boton2");
		JButton boton3=new JButton("Boton3");
		JTextField textField=new JTextField(40);
		JLabel etiqueta=new JLabel("Etiqueta");
		
		panelcentral.add(boton1);
		panelcentral.add(boton2);
		panelcentral.add(boton3);
		panelcentral.add(textField);
		panelcentral.add(etiqueta);
		ventana.add(panelcentral,BorderLayout.CENTER);
		
	} 
	public static void main(String[] args) {
		new FlowLayoutDemo("Hola");
	}
}
