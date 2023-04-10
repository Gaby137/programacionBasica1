package ar.edu.unlam.pb2.estacionamiento;

public class Estacionamiento {
	private Auto [] autos;
	public Estacionamiento(Integer cantidadDeAutosMaximos) {
		this.autos = new Auto [cantidadDeAutosMaximos];
	}

	public Integer obtenerCantidadDeAutosEstacionados() {
		Integer cantidadDeAutos=0;
		for (int i = 0; i < autos.length; i++) {
			if (autos[i]!=null) {
				cantidadDeAutos++;
			}
		}
		return 0;
	}

}
