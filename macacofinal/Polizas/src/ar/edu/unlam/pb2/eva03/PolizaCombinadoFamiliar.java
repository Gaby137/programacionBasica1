package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;

public class PolizaCombinadoFamiliar extends Poliza implements SegurosDeVida, SegurosGenerales {
	private Vivienda vivienda;
	private Set<Persona> beneficiarios;

	public PolizaCombinadoFamiliar(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima, prima);
		this.beneficiarios = new HashSet<>();
	}

	@Override
	public void agregarBienAsegurado(Object o) {
		this.vivienda = (Vivienda) o;

	}

	@Override
	public void agregarBeneficiario(Persona persona, TipoDeBeneficiario tipo) {
		persona.setTipo(tipo);
		this.beneficiarios.add(persona);

	}

	@Override
	public Integer obtenerCantidadDeBeneficiarios() {
		// TODO Auto-generated method stub
		return this.beneficiarios.size();
	}

}
