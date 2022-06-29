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

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import com.itextpdf.text.List;


public class interfaz_U implements Serializable {
	
	JButton modificar = new JButton();
	JButton eliminar = new JButton();
	JButton cancelar = new JButton();
	
	//tabla y complemento
	JTable tabla;
	JScrollPane sp;
	
	private void botones () {
	
			//boton modificar
			modificar.setText("Modificar");
			modificar.setBounds(550, 260, 130, 70);

			// Funcion modificar
			ActionListener funcion_actualizar = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					modificar();
				}
			};

			// Acción del evento
			modificar.addActionListener(funcion_actualizar);

			eliminar.setText("Eliminar");
			eliminar.setBounds(730, 260, 130, 70);

			// Funcion eliminar
			ActionListener funcion_eliminar = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					eliminar();

				}
			};

			// Acción del evento
			eliminar.addActionListener(funcion_eliminar);
}

private void tabla() throws ClassNotFoundException {
	//matrices para almacenar datos, lo bueno es que estas se pueden cargar despues
	ActionListener accion = new ActionListener() {
        
		@Override
		public void actionPerformed(ActionEvent e) {
			tabla();
			}
		};
		b1.addActionListener(accion);
	} 
	


			tabla = new JTable(o);
			sp = new JScrollPane(tabla);
			sp.setBounds(10, 10, 500, 600);

		}


		private void eliminar() {
			int posicion = tabla.getSelectedRow();

			if (posicion != -1) {

				for (int i = posicion; i < usuarios.length; i++) {

					if (i == 49) {
						usuarios[i][0] = null;
						usuarios[i][1] = null;
						usuarios[i][2] = null;
						usuarios[i][3] = null;
						usuarios[i][4] = null;
					}

					else if (usuarios[i][0] != null) {
						usuarios[i][0] = usuarios[i + 1][0];
						usuarios[i][1] = usuarios[i + 1][1];
						usuarios[i][2] = usuarios[i + 1][2];
						usuarios[i][3] = usuarios[i + 1][3];
						usuarios[i][4] = usuarios[i + 1][4];
					}
				}

				try {
					ObjectOutputStream tabla = new ObjectOutputStream(new FileOutputStream("tabla_usuarios"));
					tabla.writeObject(usuarios);
					tabla.close();
				} catch (IOException s) {
				}

			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar una Fila");
			}

			tabla.clearSelection();

		}

		private void modificar() {
			int seleccionar = tabla.getSelectedRow();
			if (seleccionar != -1) {

				JFrame crear = new JFrame("Modificar");
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

				crear.setTitle("Crear");
				crear.setLocationRelativeTo(null);
				crear.setBounds(500, 150, 600, 700);
				crear.setVisible(true);
				p1.setBackground(Color.cyan);
				crear.add(p1);

				// jtextfield
				t1.setBounds(250, 100, 200, 40);
				t2.setBounds(250, 200, 200, 40);
				t3.setBounds(250, 300, 200, 40);
				t4.setBounds(250, 400, 200, 40);
				t5.setBounds(250, 500, 200, 40);

				t1.setText(usuarios[seleccionar][0] + "");
				t2.setText(usuarios[seleccionar][1].toString());
				t3.setText((String) usuarios[seleccionar][2]);
				t4.setText(usuarios[seleccionar][3].toString());
				t5.setText(usuarios[seleccionar][4].toString());

				p1.add(t1);
				p1.add(t2);
				p1.add(t3);
				p1.add(t4);
				p1.add(t5);

				// boton
				b1.setText("Guardar");
				b1.setBounds(200, 570, 150, 60);
				p1.add(b1);

				// Funcionalidad
				ActionListener ingresar = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						usuarios objeto = new usuarios(Integer.parseInt(t1.getText()), t2.getText(), t3.getText(),
								t4.getText(), Integer.parseInt(t5.getText()));

						usuarios[seleccionar][0] = objeto.codigo;
						usuarios[seleccionar][1] = objeto.nombre;
						usuarios[seleccionar][2] = objeto.direccion;
						usuarios[seleccionar][3] = objeto.correo;
						usuarios[seleccionar][4] = objeto.telefono;

						// guardar
						try {
							ObjectOutputStream carga = new ObjectOutputStream(new FileOutputStream("tabla_sucursales.dat"));
							carga.writeObject(usuarios);
							carga.close();
						} catch (IOException j) {

						}

						crear.setVisible(false);
					}
				};

				// Acción del evento
				b1.addActionListener(ingresar);
			} else {
				JOptionPane.showMessageDialog(null, "Debe selecionar una Fila");
			}

		}

public void ejecutar() throws ClassNotFoundException {
	botones();
	tabla();
}

}
