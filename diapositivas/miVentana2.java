package diapositivas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;

public class miVentana2 {

	private JFrame frmMiventana;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					miVentana2 window = new miVentana2();
					window.frmMiventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public miVentana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMiventana = new JFrame();
		frmMiventana.setFont(new Font("Purisa", Font.PLAIN, 12));
		frmMiventana.setTitle("MiVentana");
		frmMiventana.setBounds(100, 100, 450, 300);
		frmMiventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
