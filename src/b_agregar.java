import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.sql.*;
import javax.swing.*;
public class b_agregar implements Serializable{
	JFrame nuevo_usuario = new JFrame(); 
	JLabel agregar = new JLabel();
	JPanel p1 = new JPanel();
	JPasswordField t2 = new JPasswordField();
	JButton b1 = new JButton();
	//agregar
	agregar.setText("Agregar usuario");
	agregar.setBounds(102,100,90,50);

	private void botones() {
		b1.setText("iniciar sesion");
		b1.setBounds(200,380,150,50);
		p1.add(b1);
		
		//funcionalidad
		ActionListener accion = new ActionListener() {
        
		@Override
		public void actionPerformed(ActionEvent e) {
			login();
			}
		};
		b1.addActionListener(accion);
	} 
	
	private void login() {
		Boolean prueba = false;
		int l = 0;
		String nombre = "";
		List<Usuarios> lista = reg.listarUsuarios();
		for (int i = 0; i < lista.size(); i ++) {
				l = l + 1;
				System.out.println(lista.get(i));
			}
			Object[][] object = new Object[l][3];
			
			for (int i = 0; i < lista.size(); i ++) {
			object[i][0] = lista.get(i).getCorreo();
			object[i][1] = lista.get(i).getContraseña();
	    	object[i][2] = lista.get(i).getNombre();
			}
			
			for(int i = 0; i < object.length; i++) {
				if (t1.getText().equals(object[i][0]) && t2.getText().equals(object[i][1]));
				prueba = true;
				nombre = (String)object[i][2].toString();
				break;
			}  
	
		if (prueba.equals(true)) {
			interfaz_U menu = new interfaz_U();
		//menu.Frame(nombre);
			setVisible(false);
		}
	}

private void agregar() {

	JFrame crear = new JFrame();
	JPanel p1 = new JPanel();
	p1.setLayout(null);

	// etiquetas
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	JLabel l4 = new JLabel();
	JLabel l5 = new JLabel();
	JLabel l6 = new JLabel();
	JLabel l7 = new JLabel();
	JLabel l8 = new JLabel();
	JLabel l9 = new JLabel();
	JLabel l10 = new JLabel();

	// cajas de texto
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();
	JTextField t4 = new JTextField();
	JTextField t5 = new JTextField();
	JTextField t6 = new JTextField();
	JTextField t7 = new JTextField();
	JTextField t8 = new JTextField();
	JTextField t9 = new JTextField();
	JTextField t10 = new JTextField();

	// Boton
	JButton b1 = new JButton();

	l1.setText("ID usuario:");
	l1.setFont(new Font("Serig", Font.PLAIN, 25));
	l1.setBounds(50, 80, 100, 80);
	l1.setVisible(true);
	p1.add(l1);

	l2.setText("Nombre:");
	l2.setFont(new Font("Serig", Font.PLAIN, 25));
	l2.setBounds(50, 180, 180, 80);
	l2.setVisible(true);
	p1.add(l2);

	l3.setText("Apellido:");
	l3.setFont(new Font("Serig", Font.PLAIN, 25));
	l3.setBounds(50, 280, 180, 80);
	l3.setVisible(true);
	p1.add(l3);

	l4.setText("Telefono:");
	l4.setFont(new Font("Serig", Font.PLAIN, 25));
	l4.setBounds(50, 380, 100, 80);
	l4.setVisible(true);
	p1.add(l4);

	l5.setText("Direccion:");
	l5.setFont(new Font("Serig", Font.PLAIN, 25));
	l5.setBounds(50, 480, 150, 80);
	l5.setVisible(true);
	p1.add(l5);
	
	l6.setText("Correo:");
	l6.setFont(new Font("Serig", Font.PLAIN, 25));
	l6.setBounds(50, 580, 100, 80);
	l6.setVisible(true);
	p1.add(l6);
	
	l7.setText("Fecha de nacimiento:");
	l7.setFont(new Font("Serig", Font.PLAIN, 25));
	l7.setBounds(50, 680, 100, 80);
	l7.setVisible(true);
	p1.add(l7);
	
	l8.setText("Rol_id:");
	l8.setFont(new Font("Serig", Font.PLAIN, 25));
	l8.setBounds(50, 780, 100, 80);
	l8.setVisible(true);
	p1.add(l8);
	
	l9.setText("Activo:");
	l9.setFont(new Font("Serig", Font.PLAIN, 25));
	l9.setBounds(50, 880, 100, 80);
	l9.setVisible(true);
	p1.add(l9);
	
	l10.setText("Contrasena:");
	l10.setFont(new Font("Serig", Font.PLAIN, 25));
	l10.setBounds(50, 880, 100, 80);
	l10.setVisible(true);
	p1.add(l10);

	crear.setTitle("Agregar");
	crear.setLocationRelativeTo(null);
	crear.setBounds(500, 150, 600, 700);
	crear.setVisible(true);
	p1.setBackground(Color.blue);
	crear.add(p1);

	// jtextfield
	t1.setBounds(250, 100, 100, 40);
	t2.setBounds(450, 200, 100, 40);
	t3.setBounds(250, 300, 100, 40);
	t4.setBounds(450, 400, 100, 40);
	t5.setBounds(250, 500, 100, 40);
	t6.setBounds(450, 600, 100, 40);
	t7.setBounds(250, 700, 100, 40);
	t8.setBounds(450, 800, 100, 40);
	t9.setBounds(250, 900, 100, 40);
	t10.setBounds(450, 1100, 100, 40);

	p1.add(t1);
	p1.add(t2);
	p1.add(t3);
	p1.add(t4);
	p1.add(t5);
	p1.add(t6);
	p1.add(t7);
	p1.add(t8);
	p1.add(t9);
	p1.add(t10);

	// boton
	b1.setText("Guardar");
	b1.setBounds(200, 970, 150, 60);
	p1.add(b1);

	// Funcionalidad
	ActionListener ingresar = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			registro s = new registro(Integer.parseInt(t1.getText()), t2.getText(), t3.getText(), t4.getText(),
					Integer.parseInt(t5.getText()));

			for (int i = 0; i < usuarios.length; i++) {
				if (usuarios[i][0] == null) {

					usuarios[i][0] = s.codigo;
					usuarios[i][1] = s.nombre;
					usuarios[i][2] = s.direccion;
					usuarios[i][3] = s.correo;
					usuarios[i][4] = s.telefono;

					// guardar
					try {
						ObjectOutputStream carga = new ObjectOutputStream(
								new FileOutputStream("tabla_sucursales.dat"));
						carga.writeObject(usuarios);
						carga.close();
					} catch (IOException j) {

					}

					crear.setVisible(false);

					break;

				}
			}

		}
	};

	// Acción del evento
	b1.addActionListener(ingresar);

}
}
	