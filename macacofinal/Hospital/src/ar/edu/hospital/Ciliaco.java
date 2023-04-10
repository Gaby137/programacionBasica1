package ar.edu.hospital;

public class Ciliaco extends Paciente {

	public Ciliaco(Integer dni, String nombre) {
		super(dni, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean alimentar(Plato plato) {
		Boolean alimentar = true;
		for (Ingrediente ingrediente : plato.getListaDeIngredientes()) {
			if (ingrediente.getNombre().equals("trigo") || ingrediente.getNombre().equals("avena")
					|| ingrediente.getNombre().equals("cebada") || ingrediente.getNombre().equals("centeno")) {
				alimentar = false;
			}
		}
		return alimentar;
	}

}
