package herencia;

public class Empresa {
	private Empleado [] empleados;
	private String nombre;
	
	public Empresa () {
		
	}
	public Empresa(Empleado[] empleados, String nombre) {
		
		this.empleados = empleados;
		this.nombre = nombre;
	}
	public Empleado[] getEmpleados() {
		return empleados;
	}
	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
