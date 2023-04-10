package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.List;

public class PolizaAccidentesPersonales extends SegurosDeVida {

	private List<Persona> listaPersonas;
	public PolizaAccidentesPersonales(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super.setNumeroDePoliza(numeroDePoliza);
		super.setAsegurado(asegurado);
		super.setSumaAsegurada(sumaAsegurada);
		super.setPrima(prima);
		this.listaPersonas = new ArrayList<>();
		super.setPremio(prima+=(prima*0.2));
	}
	
	
	@Override
	public void agregarBeneficiario(Persona p, TipoDeBeneficiario t) {
		p.setTipo(t);
		this.listaPersonas.add(p);
		
	}


	@Override
	public Integer obtenerCantidadDeBeneficiarios() {
		return listaPersonas.size();
		
	}

}
