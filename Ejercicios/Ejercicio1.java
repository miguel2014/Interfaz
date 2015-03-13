package Ejercicios;

import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class Ejercicio1 {
	private JFrame ventana;
	
	public Ejercicio1(String titulo) {
		ventana=new JFrame(titulo);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(500, 300);
		ventana.setVisible(true);
	
		ventana.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel nombre=new JLabel("Nombre");
		JLabel apellidos=new JLabel("Apellidos");
		JLabel localidad=new JLabel("Localidad");
		JLabel dia_nacimiento=new JLabel("Dia Nacimiento");
		
		JTextField textNombre = new JTextField();
		JTextField textApellidos = new JTextField();
		
		JComboBox localidadopciones = new JComboBox();
		localidadopciones.setModel(new DefaultComboBoxModel(new String[] {"Jaén", "Cordoba", "Sevilla ", "Granada", "Huelva", "Madrid"}));
		
		
		JButton enviar = new JButton("Enviar");
		JButton salir = new JButton("Salir");
		
		ventana.getContentPane().add(nombre);
		ventana.getContentPane().add(textNombre);
		ventana.getContentPane().add(apellidos);
		ventana.getContentPane().add(textApellidos);
		ventana.getContentPane().add(localidad);
		ventana.getContentPane().add(localidadopciones);
		ventana.getContentPane().add(dia_nacimiento);
		
		JPanel panel = new JPanel();
		ventana.getContentPane().add(panel);
		
		JComboBox Dia = new JComboBox();
		
		Integer[] array = null;
		
		for (int i = 1; i < 31; i++) {
			array[i]=new Integer(i);
		}
		Dia.setModel(new DefaultComboBoxModel<Integer>(array));
		panel.add(Dia);
		
		
		JComboBox Mes = new JComboBox();
		Mes.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		panel.add(Mes);
		
		JComboBox Year = new JComboBox();
		panel.add(Year);
		ventana.getContentPane().add(enviar);
		ventana.getContentPane().add(salir);
	}
	public static void main(String[] args) {
		Ejercicio1 e=new Ejercicio1("Titulo");
	}
}
