package diapositivas;

import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;

public class MiSegundaVentanaContenedores {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiSegundaVentanaContenedores window = new MiSegundaVentanaContenedores();
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
	public MiSegundaVentanaContenedores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Purisa", Font.PLAIN, 12));
		frame.setTitle("MiVentana");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BoxLayout miBoxLayout=new BoxLayout(frame.getContentPane(),BoxLayout.X_AXIS);
		frame.setLayout(miBoxLayout);
		frame.add(Box.createHorizontalStrut(25));
		JButton boton1= new JButton("Boton");
		frame.add(boton1);
		frame.add(Box.createHorizontalGlue());
		JButton boton2= new JButton("Boton");
		frame.add(boton2);
		frame.add(Box.createHorizontalGlue());
		JButton boton3= new JButton("Boton");
		frame.add(boton3);
		frame.add(Box.createHorizontalStrut(25));
		
		
	}
}
