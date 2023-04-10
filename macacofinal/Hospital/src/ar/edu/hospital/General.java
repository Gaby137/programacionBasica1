package ar.edu.hospital;

public class General extends Paciente {

	public General(Integer dni, String nombre) {
		super(dni, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean alimentar(Plato plato) {
		return true;
	}

}
