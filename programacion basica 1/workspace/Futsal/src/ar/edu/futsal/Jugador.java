package ar.edu.futsal;

public class Jugador {

	private String nombre;
	private String apellido;
	private Double precio;
	private Integer edad;

	public Jugador(String nombre, String apellido, Double precio, Integer edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.precio = precio;
		this.edad = edad;
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

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
