package ar.edu.unlam.pb2.eva03;

public class SegurosDeVida extends SegurosGenerales{ 
	
	public SegurosDeVida(Integer numeroDePoliza, Persona asegurado, Double premio, int contBeneficiarios) {
		super(numeroDePoliza, asegurado, premio, contBeneficiarios);

	}




	private Integer premio;
	



	public void setPremio(Integer premio) {
		this.premio = premio;
	}


	
}
