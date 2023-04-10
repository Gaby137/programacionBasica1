package ar.edu.hospital;

public class Diabetico1 extends Paciente {

	private Boolean insulina;
	private Tipo_Diabetico tipo;

	public Diabetico1(Integer dni, String nombre, Tipo_Diabetico tipo) {
		super(dni, nombre);
		this.insulina = false;
		this.tipo = tipo;
	}

	@Override
	public Boolean alimentar(Plato plato) {
		Boolean alimentar = true;
		for (Ingrediente ingrediente : plato.getListaDeIngredientes()) {
			if (ingrediente.getNombre().equals("azucar")) {
				alimentar = false;
			}
		}
		return alimentar;
	}

	public Boolean darInsulina() {
		if (this.tipo.equals(Tipo_Diabetico.TIPO2)) {
			this.insulina = true;
			return true;
		}
		return false;
	}

	public Boolean getInsulina() {
		return insulina;
	}

	public void setInsulina(Boolean insulina) {
		this.insulina = insulina;
	}

	public Tipo_Diabetico getTipo() {
		return tipo;
	}

	public void setTipo(Tipo_Diabetico tipo) {
		this.tipo = tipo;
	}
}
