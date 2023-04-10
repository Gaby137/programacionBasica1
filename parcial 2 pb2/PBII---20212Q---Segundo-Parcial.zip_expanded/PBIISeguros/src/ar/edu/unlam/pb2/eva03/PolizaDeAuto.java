package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends SegurosGenerales implements Poliza{
	private final Integer NUMERO_DE_POLIZA;
	private Persona asegurado;
	private final Double SUMA_ASEGURADA;
	private final Double PRIMA;
	private Auto auto;

	public PolizaDeAuto(Integer NUMERO_DE_POLIZA, Persona asegurado, Double SUMA_ASEGURADA, Double PRIMA) {
		super(NUMERO_DE_POLIZA, asegurado, PRIMA, 0);
		this.NUMERO_DE_POLIZA = 0;
		this.asegurado = asegurado;
		this.SUMA_ASEGURADA = SUMA_ASEGURADA;
		this.PRIMA = PRIMA;
	}

	public Persona getAsegurado() {
		return asegurado;
	}

	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}

	public Integer getNUMERO_DE_POLIZA() {
		return NUMERO_DE_POLIZA;
	}

	public Double getSUMA_ASEGURADA() {
		return SUMA_ASEGURADA;
	}

	public Double getPRIMA() {
		return PRIMA;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	@Override
	public Boolean agregarPoliza(PolizaDeAuto polizaDeAuto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
