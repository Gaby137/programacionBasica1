package ar.edu.unlam.pb2.smartwatch.sensor;

public class Brazada extends Sensor {
	public static final Double LONGITUD_DE_BRAZADA = 1D;
	private Integer contBrazada;

	public Brazada(Double frecuenciaCardiaca) {
		super(frecuenciaCardiaca);
		this.contBrazada = 0;
	}

	public void darUnaBrazada() {
		super.setPulso(true);
		this.contBrazada++;
		if (this.contBrazada == 60) {
			super.setCadencia(60D);
		}
	}

	@Override
	public Double calcularVelocidad() {
		Double resultado = 0.0;
		if (this.contBrazada > 0) {
			resultado = calcularCadencia() * LONGITUD_DE_BRAZADA;
		}
		return resultado;
	}


	public Integer getContBrazada() {
		return contBrazada;
	}

	public void setContBrazada(Integer contBrazada) {
		this.contBrazada = contBrazada;
	}
	

	@Override
	public void darUnPulsoDeGPS() {
		// TODO Auto-generated method stub

	}


}
