package Ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class EditorFicheros {

	private JFrame frame;
	private JFileChooser fileChooser;
	private JTextArea  textarea;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditorFicheros window = new EditorFicheros();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EditorFicheros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Editor de texto");
		//Instanciamos el objeto JfileChooser, inicialmente no es visible
		fileChooser=new JFileChooser();
		//Creamos la interfaz
		JPanel botonera=new JPanel();
		//Instanciamos el layout aunque no seria necesario ya que es el layout por defecto
		FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER,10,10);
		botonera.setLayout(flowLayout);
		
		
		JButton botonAbrir=new JButton("Abrir");
		botonAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Mostramos al usuario el ficlechooser.Pasamos frame ya que es un dialogo modal y bloquea el uso del frame
				int returnval=fileChooser.showOpenDialog(frame);
				//System.out.println(returnval);
				//Si le da a aceptar
				if (returnval==JFileChooser.APPROVE_OPTION){
					File fileSelected=fileChooser.getSelectedFile();
					addArchivo archivo=new addArchivo(fileSelected);
					textarea.setText(archivo.getArchivo());
				}
			}
		});
		JButton botonGuardar=new JButton("Guardar");
		botonGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int returnval=fileChooser.showSaveDialog(frame);
				if (returnval==JFileChooser.APPROVE_OPTION){
					File fileSelected=fileChooser.getSelectedFile();
					try (FileWriter out=new FileWriter(fileSelected);
							){
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}	
			}
		});
		JButton botonSalir=new JButton("Salir");
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		botonera.add(botonAbrir);
		botonera.add(botonGuardar);
		botonera.add(botonSalir);
		//insertamos la botonera en el norte del borderlayout
		frame.getContentPane().add(botonera,BorderLayout.NORTH);
		//Creamos contenedor JScrollPane con barras de scroll siempre
		JScrollPane scrollPane=new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		textarea=new JTextArea();
		scrollPane.setViewportView(textarea);
		//Insertamos el scrollPane en el frame
		frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
	}

}
