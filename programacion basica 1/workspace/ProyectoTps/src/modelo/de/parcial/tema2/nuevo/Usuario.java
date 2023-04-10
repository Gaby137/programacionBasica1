package modelo.de.parcial.tema2.nuevo;

public class Usuario {
	private String usuario;
	private String contrasena;
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;

	public Usuario() {

	}

	public Usuario(String usuario, String contrasena, String nombre, String apellido, int dni, int edad) {
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

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public boolean laContrasenaEsValida(String contrasena) {
		char[] vecContrasena = contrasena.toCharArray();
		boolean valida = false;
		int contadorNumerico = 0;
		for (int i = 0; i < vecContrasena.length; i++) {
			if (vecContrasena[i] >= 48 && vecContrasena[i] <= 57) {
				contadorNumerico++;
			}

		}

		if (contadorNumerico >= 1 && vecContrasena.length >= 8) {
			valida = true;
		}
		return valida;
	}

	public boolean esMayorDeEdad() {
		boolean esMayor = false;
		if (this.edad >= 18) {
			esMayor = true;
		}
		return esMayor;
	}

}
