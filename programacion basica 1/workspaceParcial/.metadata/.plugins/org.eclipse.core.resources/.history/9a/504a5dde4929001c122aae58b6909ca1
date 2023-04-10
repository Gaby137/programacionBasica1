package ar.edu.unlam.pb2.smartwatch.deportista;

public class Nadador extends Deportista {
	
	private Double distanciaEnMts;
	private Double tiempoTranscurrido; 
	private Double ritmoCalculado;
	
	public Nadador() {
		super();
	}

	public Nadador(String nombre, Integer edadActual, Double pesoActual, Double alturaActual) {
		super(nombre, edadActual, pesoActual, alturaActual);
		setTipoDeDisciplina(Disciplina.NATACION);
	}

	
	@Override
	public Double distanciaRecorrida(Integer cantidadMovimentos, Double longitud) {
		
		distanciaEnMts= cantidadMovimentos*longitud;
		
		return distanciaEnMts;
	}

	@Override
	public Double tiempoTrascurrido(Integer cantidadMovimentos) {
		
		tiempoTranscurrido= cantidadMovimentos/60D;
		
		return tiempoTranscurrido;
	}
	
	@Override
	public Double calcularElRitmo() {
	
		ritmoCalculado=distanciaEnMts/tiempoTranscurrido;
		
		return ritmoCalculado;
		
	}

	public Double getDistanciaEnMts() {
		return distanciaEnMts;
	}

	public void setDistanciaEnMts(Double distanciaEnMts) {
		this.distanciaEnMts = distanciaEnMts;
	}

	public Double getTiempoTranscurrido() {
		return tiempoTranscurrido;
	}

	public void setTiempoTranscurrido(Double tiempoTranscurrido) {
		this.tiempoTranscurrido = tiempoTranscurrido;
	}

	public Double getRitmoCalculado() {
		return ritmoCalculado;
	}

	public void setRitmoCalculado(Double ritmoCalculado) {
		this.ritmoCalculado = ritmoCalculado;
	}
}

