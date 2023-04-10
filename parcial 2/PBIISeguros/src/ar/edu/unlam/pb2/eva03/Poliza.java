package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public class Poliza implements Comparable<Poliza>{
	private Integer numeroDePoliza;
	private Persona asegurado;
	private Double sumaAsegurada;
	private Double prima;
	private Double premio;

	public Integer getNumeroDePoliza() {
		return numeroDePoliza;
	}
	public void setNumeroDePoliza(Integer nroPoliza) {
		this.numeroDePoliza = nroPoliza;
	}
	public Persona getAsegurado() {
		return asegurado;
	}
	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}
	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}
	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}
	public Double getPrima() {
		return prima;
	}
	public void setPrima(Double prima) {
		this.prima = prima;
	}
	public Double getPremio() {
		return premio;
	}
	public void setPremio(Double premio) {
		this.premio = premio;
	}
	
	@Override
	public int compareTo(Poliza o) {
		// TODO Auto-generated method stub
		return this.numeroDePoliza.compareTo(o.getNumeroDePoliza());
	}
	@Override
	public int hashCode() {
		return Objects.hash( numeroDePoliza);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Poliza)) {
			return false;
		}
		Poliza other = (Poliza) obj;
		return Objects.equals(numeroDePoliza, other.numeroDePoliza);
	}
	


	
}
