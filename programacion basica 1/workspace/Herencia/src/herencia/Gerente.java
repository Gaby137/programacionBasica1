package herencia;

import java.util.Date;

public class Gerente extends Empleado {
	private Cochera cochera;

	public Gerente(String nombre, String apellido, Date fechaNacimiento, Double salario, String departamento, Cochera cochera) {
		super( nombre,  apellido,  fechaNacimiento,  salario,departamento);
		this.cochera = cochera;
	}
	public Gerente() {
		super();
	}
	
	
}
