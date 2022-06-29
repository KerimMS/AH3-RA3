
import java.awt.Color;

import javax.swing.*;


public class vista_Dusuarios {
	//crear botones de salir 
		//hacer que el boton agrear usuario solo lo usen usuario con primer numero 0 o 1
 JFrame principal = new JFrame();
 //JTabbedPane pestañas = new JTabbedPane(); 
 
 interfaz_U iu = new  intefaz_U();
 b_agregar ba = new b_agregar();
 
 private void valor_inicial() throws ClassNotFoundException {
		
		//Frame datos
		principal.setTitle("Hoteles GT - Usuarios");
		principal.setLocationRelativeTo(null);
		principal.setBounds(500, 150, 900, 700);
		principal.setVisible(true);
		JButton cerrar = new JButton("Cerrar Sesion");
		cerrar.setBackground(Color.red);
		cerrar.setForeground(Color.white);
		cerrar.setBounds(700, 630, 150, 20);	
		
		// Funcion cerrar
		ActionListener funcion_cerrar = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				vista_Dusuarios log = new vista_Dusuarios ();
				
				log.ejecutar();
				principal.setVisible(false);
				
				

			}
		};

		// Acción del evento
		cerrar.addActionListener(funcion_cerrar);
		
		principal.add(cerrar);
	 
	 //colores paneles
     vista_Dusuarios.setBackground(Color.DARK_GRAY);
     
     
     vista_Dusuarios.setLayout(null);
	
     
     //paneles agregados
	 pestañas.addTab("Usuarios", vista_Dusuario);

				
 }
 public void ejecutar() throws ClassNotFoundException {
		valor_inicial(); 
 }
}
