import java.util.List;

public class Usuarios {

	private int usuario_id;
	private String nombre;
	private String apellido;
	private int telefono;
	private String direccion;
	private String correo_electronico;
	private String fecha_nacimiento;
	private int rol_id;
	private int activo;
	private String contrasena;
	
	public int getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo_electronico;
	}
	public void setCorreo(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}
	public String getFechaN() {
		return fecha_nacimiento;
	}
	public void setFechaN(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public int getRol_id() {
		return rol_id;
	}
	public void setRol_id(int rol_id) {
		this.rol_id = rol_id;
	}
	public int getActivo() {
		return activo;
	}
	public void setActivo(int activo) {
		this.activo = activo;
	}
	public String getContraseña() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


}
