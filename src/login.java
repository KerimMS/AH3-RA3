import java.awt.Color;
import java.sql.*;
import java.util.ArrayList;
import java.awt.*;
import java.sql.Connection;
import java.util.List;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import javax.swing.*;
import java.awt.*;
public class login extends JFrame {
		// atributo
		
		JFrame inicio = new JFrame();
		JPanel p1 = new JPanel();
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JTextField t1 = new JTextField();
		JPasswordField t2 = new JPasswordField(); // para que no se mire la contreseña se usa password
		JButton b1 = new JButton();
		int oportunidades = 3;
		
		registro reg = new registro();
		
		// metodo imagen

		// metodo
		private void frame() {
			//setDefaultCloseOperation(EXIT_ON_CLOSE);
			//setSize(300, 300);
			//setLocationRelativeTo(null);
			//setVisible(true);
			//setMaximumSize(new Dimension(1000, 1000));
			//paneles();
		
			inicio.setTitle("login");
			inicio.setLocationRelativeTo(null);
			// otro metodo para definir el tamaño de la ventana, inicio.setSize(200,150);
			// x, y ancho, alto
			inicio.setBounds(500, 300, 500, 500);
			inicio.setVisible(true);
			p1.setBackground(Color.orange);
			// tamaño del frame
			p1.setBounds(500, 300, 500, 500);
			p1.setLayout(null);
			inicio.add(p1);

		}
		private void paneles() {
			p1.setLayout(null);
			p1.setSize(300, 300);
			
			p1.setBackground(Color.orange);
			this.getContentPane().add(p1);
			etiquetas();
			botones();
			
		}
	//etiquetas y jtextfiels
		private void etiquetas() {
			//etiquetas
			l1.setText("Usuario: ");
			l1.setFont(new Font("Sering", Font.PLAIN, 24));
			l1.setBounds(50, 100, 100, 80);
			l1.setVisible(true); // se agrega a veces
			p1.add(l1);

			l2.setText("Contraseña: ");
			l2.setFont(new Font("Sering", Font.PLAIN, 25));
			l2.setBounds(50, 230, 180, 80);
			l2.setVisible(true);
			p1.add(l2);

			// jtextflied
			t1.setBounds(200, 115, 200, 40);
			t2.setBounds(200, 255, 200, 40);
			
			p1.add(t1);
			p1.add(t2);
		}
		
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
				}  if (oportunidades == 0) {
					JOptionPane.showMessageDialog(null, "Cantidad de intentos agotados");
					System.exit(0);
				} else {
				
				}
		
			if (prueba.equals(true)) {
				interfaz_U menu = new interfaz_U();
			//menu.Frame(nombre);
				setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null, "Datos Incorrectos");
				oportunidades = oportunidades -1;
			}
				}
			
		public void ejecutar() {
			frame();
			etiquetas();
			botones();
			
		}

		public static void main(String[] args) {
			login p1 = new login();
			p1.ejecutar();

		}

	}
