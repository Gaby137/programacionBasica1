package herencia;

import java.util.Date;

public class Ingeniero extends Empleado {
	private Double porcentajeProductividad;
	
	
	public Ingeniero(String nombre2, String apellido2, Date fechaNacimiento2, Double salario2, String departamento2,
			Double porcentajeProductividad) {
		super(nombre2, apellido2, fechaNacimiento2, salario2, departamento2);
		this.porcentajeProductividad = porcentajeProductividad;
	}


	@Override
	public Double calcularSueldo() {
		return getSalario() + this.porcentajeProductividad;
 	}
	
}
