package ar.edu.hospital;

public abstract class Paciente {

	private Integer dni;
	private String nombre;

	public Paciente(Integer dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract Boolean alimentar(Plato plato);
}
