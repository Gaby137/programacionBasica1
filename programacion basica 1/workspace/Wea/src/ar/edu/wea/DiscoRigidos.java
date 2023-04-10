package ar.edu.wea;

import java.util.HashSet;

public class DiscoRigidos extends UnidadAlmacenamiento {
	private Boolean formatear;

	public DiscoRigidos(Character letra, Double capacidadMaxima) {

		super.setArchivos(new HashSet<>());
		super.setLetra(letra);
		super.setCapacidadMaxima(capacidadMaxima);
		super.setCantGrabada(0.0);
		this.formatear = false;
	}

	public Boolean getFormatear() {
		return formatear;
	}

	public void setFormatear(Boolean formatear) {
		this.formatear = formatear;
	}

}
