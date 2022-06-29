import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.awt.*;
import java.sql.Connection;
import java.util.List;
public class registro {
	
	PreparedStatement ps;
	ResultSet rs;
	Connection con;
	CBasedatos acceso = new CBasedatos();
	Usuarios pro = new Usuarios();
	
	public List listarUsuarios() {
		String sql = "select * from usuarios";
		List<Usuarios> listaprod = new ArrayList<>();
		try {
		con = acceso.Conectar();
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			Usuarios p = new Usuarios();
			p.setUsuario_id(rs.getInt(1));
			p.setNombre(rs.getString(2));
			p.setApellido(rs.getString(3));
			p.setTelefono(rs.getInt(4));
			p.setDireccion(rs.getString(5));
			p.setCorreo(rs.getString(6));
			p.setFechaN(rs.getString(7));
			p.setRol_id(rs.getInt(8));
			p.setActivo(rs.getInt(9));
			p.setContrasena(rs.getString(10));
			listaprod.add(p);
		}
	} catch (Exception e) {
			System.out.println(e);
	}
		return listaprod;
	}
	
	public void modificar(int usuario_id, String nombre, String apellido, int telefono, String direccion, String correo, String fecha_nacimiento, int rol_id, int activo, String contrasena) { 
	String sql = "update usuarios set nombre=?, apellido=?, telefono=?, direccion=?, correo_electronico=?, fecha_nacimiento=?, rol_id=?, activo=?, contrasenia=? where usuarios_id=?";
	try {
		con = acceso.Conectar();
		ps = con.prepareStatement(sql);
		
		ps.setString(1, nombre);
		ps.setString(2, apellido);
		ps.setInt(3, telefono);
		ps.setString(4, direccion);
		ps.setString(5, correo);
		ps.setString(6, fecha_nacimiento);
		ps.setInt(7, rol_id);
		ps.setInt(8, activo);
		ps.setString(9, contrasena);
		ps.setInt(10, usuario_id);
		ps.executeUpdate();
	} catch (Exception e) {
		System.out.println(e);
	}
	
	}

	public void agregar(int usuario_id, String nombre, String apellido, int telefono, String direccion, String correo, String fecha_nacimiento, int rol_id, int activo, String contrasena) {
		String sql = "insert into usuarios(usuario_id,nombre,apellido,telefono,direccion,correo_electronico,fecha_nacimiento,rol_id,activo,contrasenia)values(?,?,?,?,?,?,?,?,?,?)";
		try {
			con = acceso.Conectar();
			ps = con.prepareStatement(sql);
			ps.setInt(1, usuario_id);
			ps.setString(2, nombre);
			ps.setString(3, apellido);
			ps.setInt(4, telefono);
			ps.setString(5, direccion);
			ps.setString(6, correo);
			ps.setString(7, fecha_nacimiento); //AA-MM-DD
			ps.setInt(8, rol_id);
			ps.setInt(9, activo);
			ps.setString(10, contrasena);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}

	public void eliminar(int id) {
		String sql = "delete from usuarios where usuario_id=?";
		try {
			con = acceso.Conectar();
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			
		}
	}

	//public static void main(String[] args) {
		//registro rp = new registro();
		//List <Usuarios> lista = rp.listarUsuarios();
		//for (int i =0; i < lista.size(); i++) {
			//System.out.println(lista.get(i).getNombre());
		//}
	//}
}
