package diapositivas;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutDemo window = new CardLayoutDemo();
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
	public CardLayoutDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Establecemos el layout del frame a BorderLayout
		BorderLayout milayout=new BorderLayout();
		frame.setLayout(milayout);
		//Creamos caja de botones
		JButton boton1=new JButton("Prime");
		JButton boton2=new JButton("Segundo");

		CardLayout cardlayout=new CardLayout();
		JPanel cards=new JPanel();
		boton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardlayout.next(cards);
			}
		});
		boton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardlayout.next(cards);
			}
		});
		JPanel panelNorte=new JPanel();
		BoxLayout boxlayout=new BoxLayout(panelNorte, BoxLayout.X_AXIS);
		panelNorte.add(boton1);
		panelNorte.add(boton2);
		frame.add(panelNorte,BorderLayout.NORTH);
		//frame.add(boton1,BorderLayout.NORTH);
		
		cards.setLayout(cardlayout);
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JLabel etiqueta=new JLabel("Hola");
		panel1.add(etiqueta);
		JLabel etiqueta2=new JLabel("aloH");
		panel2.add(etiqueta2);
		JPanel panel3=new JPanel();
		JLabel etiqueta3=new JLabel("Hola3");
		JButton botonPanel3=new JButton("Boton panel 3");
		botonPanel3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardlayout.previous(cards);
			}
		});
		panel3.add(botonPanel3);
		panel3.add(etiqueta3);
		cards.add(panel1);
		cards.add(panel2);	
		cards.add(panel3);	
		frame.add(cards, BorderLayout.CENTER);
		
		
	}
}

