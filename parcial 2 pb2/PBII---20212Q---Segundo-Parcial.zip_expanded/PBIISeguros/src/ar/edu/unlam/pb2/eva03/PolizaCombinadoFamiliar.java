package ar.edu.unlam.pb2.eva03;

import java.util.Set;

public class PolizaCombinadoFamiliar extends SegurosGenerales{
	Set<TipoDeBeneficiario> beneficiarios;
	public PolizaCombinadoFamiliar(Integer nUMERO_DE_POLIZA, Persona asegurado, Double sUMA_ASEGURADA, Double pRIMA) {
		super(nUMERO_DE_POLIZA, asegurado, pRIMA, 0);
	}

	public Boolean agregarBeneficiario(Persona hijo, TipoDeBeneficiario hijo2) {
		Boolean agregado = false;
		
		return agregado;
	}

	public void agregarBienAsegurado(Vivienda casa) {
		// TODO Auto-generated method stub
		
	}



}
