package ar.edu.unlam.pb2.smartwatch.deportista;

public class Caminador extends Deportista {
	
	private Double distanciaEnKm;
	private Double tiempoEnHora;
	private Double tiempoTrasncurrido;

	public Caminador() {
		super();
	}

	public Caminador(String nombre, Integer edadActual, Double pesoActual, Double alturaActual) {
		super(nombre, edadActual, pesoActual, alturaActual);
		setTipoDeDisciplina(Disciplina.CAMINATA);
	}
	
	@Override
	
	public Double distanciaRecorrida(Integer cantidadMovimentos, Double longitud) {
		
		distanciaEnKm = cantidadMovimentos*longitud/1000;
		
		return distanciaEnKm;
		
	}
	
	

	@Override
	public Double tiempoTrascurrido(Integer cantidadMovimentos) {
		tiempoTrasncurrido= cantidadMovimentos/60D;
		tiempoEnHora= tiempoTrasncurrido/60D;
		
					return tiempoEnHora;
	}

	public Double getDistanciaEnKm() {
		return distanciaEnKm;
	}

	public void setDistanciaEnKm(Double distanciaEnKm) {
		this.distanciaEnKm = distanciaEnKm;
	}

	public Double getTiempoEnHora() {
		return tiempoEnHora;
	}

	public void setTiempoEnHora(Double tiempoEnHora) {
		this.tiempoEnHora = tiempoEnHora;
	}

	public Double getTiempoTrasncurrido() {
		return tiempoTrasncurrido;
	}

	public void setTiempoTrasncurrido(Double tiempoTrasncurrido) {
		this.tiempoTrasncurrido = tiempoTrasncurrido;
	}
	
	
	
	
	
	
	
	
	

}
