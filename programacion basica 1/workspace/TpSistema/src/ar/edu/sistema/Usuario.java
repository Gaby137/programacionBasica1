package ar.edu.sistema;

public class Usuario {
	private String nombreDeUsuario;
	private int contrasena;
	private int edad;

	public Usuario(String nombreDeUsuario, int contrasena, int edad) {
		super();
		this.nombreDeUsuario = nombreDeUsuario;
		this.contrasena = contrasena;
		this.edad = edad;
	}

	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}

	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}

	public int getContrasena() {
		return contrasena;
	}

	public void setContrasena(int contrasena) {
		this.contrasena = contrasena;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
