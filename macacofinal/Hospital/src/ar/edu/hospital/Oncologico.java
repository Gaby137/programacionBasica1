package ar.edu.hospital;

public class Oncologico extends Paciente {
	private Tipo_Tratamiento tipo;

	public Oncologico(Integer dni, String nombre, Tipo_Tratamiento tipo) {
		super(dni, nombre);
		this.tipo = tipo;
	}

	@Override
	public Boolean alimentar(Plato plato) {
		Boolean alimentar = true;
		if (this.tipo.equals(Tipo_Tratamiento.QUIMIOTERAPIA) || this.tipo.equals(Tipo_Tratamiento.RAPIDOTERAPIA)) {
			if (plato.getElaboracion().equals(Tipo_Elaboracion.SIN_COCCION)) {
				alimentar = false;
			}
		}
		return alimentar;
	}

}
