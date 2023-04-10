package ar.edu.colection;

public class Usuario implements DarServicioDeUsuario {
	private String nombre;
	private Integer edad;

	public Usuario(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public void darAltaDeUsuario(Usuario a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modificarUnUsuario(String nombre) {
		this.nombre = nombre;
	}

}
