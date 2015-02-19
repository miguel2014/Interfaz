package diapositivas;
import java.awt.Dimension;


import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class PrimerFrame {
	public void creaGUI(){
		JFrame ventana=new JFrame();
		ventana.setTitle("Hola mundo");
		ventana.setSize(300, 200);
		// Otra forma 
		//ventana.setSize(new Dimension(300,200));
		//Cerrar toda la app
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Establecemos la posicion
		ventana.setLocationRelativeTo(null);
		//Tamaño minimo
		ventana.setMinimumSize(new Dimension(100,100));
		//Hacemos que no se pueda redimensionar
		//ventana.setResizable(false);
		//Mostrar la ventana
		ventana.setVisible(true);
		
		//Creamos un boton
		JButton miBoton=new JButton();
		miBoton.setHorizontalAlignment(SwingConstants.LEFT);
		//Establecemos un texto al boton
		miBoton.setText("Pincha aca");
		//Añadimos a la ventana el boton
		ventana.getContentPane().add(miBoton);
		
		JButton hola = new JButton("Hola");
		hola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ventana.getContentPane().add(hola, BorderLayout.EAST);
		
		JButton btnNuevo = new JButton("Nuevo");
		ventana.getContentPane().add(btnNuevo, BorderLayout.SOUTH);
		
		JButton btnHola = new JButton("hola");
		ventana.getContentPane().add(btnHola, BorderLayout.WEST);
		
		JButton arriba = new JButton("arriba");
		ventana.getContentPane().add(arriba, BorderLayout.NORTH);
		
	}
	
	public static void main(String[] args) {
		PrimerFrame app=new PrimerFrame();
		app.creaGUI();
	}
}
