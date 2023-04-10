package ar.edu.unlam.pb2.eva03;

public class SegurosGenerales {
	public final Integer numeroDePoliza ;
	private Auto auto;
	private Persona asegurado;
	private Double premio;
	private int contBeneficiarios;
	
	

	public SegurosGenerales(Integer numeroDePoliza, Persona asegurado, Double premio,
			int contBeneficiarios) {
		super();
		this.numeroDePoliza = numeroDePoliza;
		this.auto = auto;
		this.asegurado = asegurado;
		this.premio = premio;
		this.contBeneficiarios = contBeneficiarios;
	}

	public Boolean agregarBeneficiario(Persona hijo, TipoDeBeneficiario hijo2) {
		Boolean agregado = false;
		contBeneficiarios++;
		return agregado;
		
		
	}

	public int obtenerCantidadDeBeneficiarios() {
		
		return contBeneficiarios;
	}
	
	
	public void agregarBienAsegurado(Auto auto) {
		// TODO Auto-generated method stub
		
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Persona getAsegurado() {
		return asegurado;
	}

	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}

	public Double getPremio() {
		return premio;
	}

	public void setPremio(Double premio) {
		this.premio = premio;
	}

	public Integer getNumeroDePoliza() {
		return numeroDePoliza;
	}
	
}
