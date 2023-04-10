package ar.edu.unlam.pb2.eva03;


import java.util.HashSet;
import java.util.Set;

public class CompaniaDeSeguro{
	private String nombre;
	private Set<Poliza> listaPolizas;
	private Poliza poliza;
	private Boolean fueRobado;
	
	public CompaniaDeSeguro(String nombre) {
		this.nombre=nombre;
		
		this.listaPolizas= new HashSet<>();
	
	}
	public void agregarPoliza(Poliza poliza) {
		this.listaPolizas.add(poliza);
		
	}

	public Integer obtenerLaCantidadDePolizasEmitidas() {
		// TODO Auto-generated method stub
		return listaPolizas.size();
	}
	public void denunciarSiniestro(int i) {
		
		for (Poliza p : listaPolizas) {
			if (p.getNumeroDePoliza()==i) {
				poliza=p;
				this.fueRobado=true;
			}
		
		}
	}
	
	public Poliza getPoliza() {
		return poliza;
	}
	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
		
	}
	public Boolean fueRobado() {
		this.fueRobado= true;
		return true;
	}
	
	public Poliza getPoliza(int i) {
		Poliza encontrado= null;
		for (Poliza p : listaPolizas) {
			if (p.getNumeroDePoliza()==i) {
				encontrado=p;
			}
		
		}
		return encontrado;
	}


}
