package diapositivas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class GridLayoutDemo {

	private JFrame frame;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JLabel Localidad;
	private JTextField textLocalidad;
	private JLabel Ciudad;
	private JComboBox comboBox;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutDemo window = new GridLayoutDemo();
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
	public GridLayoutDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 2, 20, 15));
		
		JLabel Nombre = new JLabel("Nombre");
		frame.getContentPane().add(Nombre);
		
		textNombre = new JTextField();
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel Apellidos = new JLabel("Apellidos");
		frame.getContentPane().add(Apellidos);
		
		textApellidos = new JTextField();
		frame.getContentPane().add(textApellidos);
		textApellidos.setColumns(10);
		
		Localidad = new JLabel("Localidad");
		frame.getContentPane().add(Localidad);
		
		textLocalidad = new JTextField();
		frame.getContentPane().add(textLocalidad);
		textLocalidad.setColumns(10);
		
		Ciudad = new JLabel("Ciudad");
		frame.getContentPane().add(Ciudad);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Jaén", "Cordoba", "Sevilla ", "Granada", "Huelva", "Madrid"}));
		frame.getContentPane().add(comboBox);
		
		btnNewButton = new JButton("New button");
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_1);
	}

}
