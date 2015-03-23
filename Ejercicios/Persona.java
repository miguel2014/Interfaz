package Ejercicios;

public class Persona {
	//Atributos
	private String nombre;
	private String apellido;
	private String telefono;
	private String calle;
	public Persona(String nombre, String apellido, String telefono, String calle) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.calle = calle;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido
				+ ", telefono=" + telefono + ", calle=" + calle + "]";
	}


}
