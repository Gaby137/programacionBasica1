package ar.edu.hospital;

public class Hipertenso extends Paciente {

	public Hipertenso(Integer dni, String nombre) {
		super(dni, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean alimentar(Plato plato) {
		Boolean alimentar = true;
		for (Ingrediente ingrediente : plato.getListaDeIngredientes()) {
			if (ingrediente.getNombre().equals("sal")) {
				alimentar = false;
			}
		}
		return alimentar;
	}

}
