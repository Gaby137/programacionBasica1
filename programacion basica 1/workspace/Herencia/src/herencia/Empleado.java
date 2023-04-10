package herencia;

import java.util.Date;

//herencia es un nvo tipo de dato q responde a la pregunta es un ... 
//composicion esta compuesto por...
//agregacion 
public class Empleado {
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private Double salario;
	private Departamento departamento;
	
	public Empleado(String nombre2, String apellido2, Date fechaNacimiento2, Double salario2, String departamento2) {
		super();
		this.nombre = nombre2;
		this.apellido = apellido2;
		this.fechaNacimiento = fechaNacimiento2;
		this.salario = salario2;
		this.departamento = new Departamento(departamento2);
	}
	
	public Empleado(String nombre, String apellido, Date fechaNacimiento, Double salario, Departamento departamento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.salario = salario;
		this.departamento = departamento;
	}

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Double calcularSueldo() {
		return this.salario;
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	
	
}
