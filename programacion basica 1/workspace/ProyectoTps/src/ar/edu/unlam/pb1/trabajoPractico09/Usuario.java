package ar.edu.unlam.pb1.trabajoPractico09;

public class Usuario {
	private String usuario;
	private Password contrasenia;
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	
	public Usuario() {
		
	}
	public Usuario(String usuario, String nombre, String apellido, int dni, int edad) {
		this.usuario=usuario;
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.edad=edad;
		this.contrasenia = new Password(8);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Password getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(Password contrasenia) {
		this.contrasenia = contrasenia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String toString() {
		return "Usuario:"+this.usuario+
				"\nPass:"+this.contrasenia.getContrasena();
	}
}
