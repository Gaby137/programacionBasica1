package ar.edu.unlam.pb2.eva03;

public class PolizaAccidentesPersonales extends SegurosDeVida {

	public PolizaAccidentesPersonales(Integer NUMERO_DE_POLIZA, Persona asegurado, Double SUMA_ASEGURADA,
			Double PRIMA) {
		super(NUMERO_DE_POLIZA, asegurado, PRIMA, 0);
	}

}
