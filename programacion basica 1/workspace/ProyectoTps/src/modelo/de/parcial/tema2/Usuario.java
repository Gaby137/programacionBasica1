package modelo.de.parcial.tema2;

public class Usuario {
	private String usuario;
	private Password contrasena;
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	
	
	public Usuario(String usuario, Password contrasena, String nombre, String apellido, int dni, int edad) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public Password getContrasena() {
		return contrasena;
	}


	public void setContrasena(Password contrasena) {
		this.contrasena = contrasena;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean laContraseñaEsValida(String contrasenia) {
		return  this.contrasena.esFuerte(contrasenia);
	}
	public boolean esMayorDeEdad () {
		boolean esMayor=false;
		if (this.edad>18) {
			esMayor=true;
		}
		return esMayor;
	}
	
}
