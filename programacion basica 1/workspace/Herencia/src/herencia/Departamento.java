package herencia;

public class Departamento {
	private Integer cantidadEmpleados;
	private String nombre;
	private Empleado director;
	
	public Departamento(String departamento2) {
		this.cantidadEmpleados=0;
		this.nombre=departamento2;
		this.director= new Empleado();
	}
	
	public Departamento(Integer cantidadEmpleados, String nombre, Empleado director) {
		
		this.cantidadEmpleados = cantidadEmpleados;
		this.nombre = nombre;
		this.director = director;
	}

	public Integer getCantidadEmpleados() {
		return cantidadEmpleados;
	}

	public void setCantidadEmpleados(Integer cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empleado getDirector() {
		return director;
	}

	public void setDirector(Empleado director) {
		this.director = director;
	}
	
	

}
