package diapositivas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JTextField;

import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

public class GridBagLayoutDemo {

	private JFrame frame;
	private JTextField txtHasd;
	private JLabel lblDesplegable;
	private JLabel lblContrasea;
	private JPasswordField passwordField;
	private JTextField textField;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridBagLayoutDemo window = new GridBagLayoutDemo();
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
	public GridBagLayoutDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panelCentral=new JPanel();
		frame.add(panelCentral,BorderLayout.CENTER);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblAsdf = new JLabel("Nombre");
		GridBagConstraints gbc_lblAsdf = new GridBagConstraints();
		gbc_lblAsdf.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsdf.gridx = 0;
		gbc_lblAsdf.gridy = 0;
		frame.getContentPane().add(lblAsdf, gbc_lblAsdf);
		
		txtHasd = new JTextField();
		GridBagConstraints gbc_txtHasd = new GridBagConstraints();
		gbc_txtHasd.insets = new Insets(0, 0, 5, 0);
		gbc_txtHasd.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHasd.gridx = 1;
		gbc_txtHasd.gridy = 0;
		frame.getContentPane().add(txtHasd, gbc_txtHasd);
		txtHasd.setColumns(10);
		
		JLabel lblAsdf_1 = new JLabel("Apellidos");
		GridBagConstraints gbc_lblAsdf_1 = new GridBagConstraints();
		gbc_lblAsdf_1.anchor = GridBagConstraints.ABOVE_BASELINE_TRAILING;
		gbc_lblAsdf_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsdf_1.gridx = 0;
		gbc_lblAsdf_1.gridy = 1;
		frame.getContentPane().add(lblAsdf_1, gbc_lblAsdf_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		frame.getContentPane().add(textField, gbc_textField);
		
		lblContrasea = new JLabel("Contraseña");
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.anchor = GridBagConstraints.EAST;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 0;
		gbc_lblContrasea.gridy = 2;
		frame.getContentPane().add(lblContrasea, gbc_lblContrasea);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 2;
		frame.getContentPane().add(passwordField, gbc_passwordField);
		
		lblDesplegable = new JLabel("Desplegable");
		GridBagConstraints gbc_lblDesplegable = new GridBagConstraints();
		gbc_lblDesplegable.anchor = GridBagConstraints.EAST;
		gbc_lblDesplegable.insets = new Insets(0, 0, 5, 5);
		gbc_lblDesplegable.gridx = 0;
		gbc_lblDesplegable.gridy = 3;
		frame.getContentPane().add(lblDesplegable, gbc_lblDesplegable);
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		frame.getContentPane().add(comboBox, gbc_comboBox);
	}

}
