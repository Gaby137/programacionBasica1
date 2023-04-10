package ar.edu.unlam.pb1.trabajoPractico04;

public class Temperatura {
	public static final byte CELCIUS = 0;
	public static final byte FARENGEIS = 1;
	public static final byte KEVIN= 2;
	
	private final double UNIDAD_DE_CONVERSION_FARENGEIS = 0.556;
	private final double UNIDAD_DE_CONVERSION_KEVIN = 273;
	private final double MINIMA_TEMPERATURA_VALIDA = -UNIDAD_DE_CONVERSION_KEVIN;
	
	private double valor;
	
	public Temperatura () {
		
	this.valor = 0.0;
	}
	public Temperatura(double valor) {
		this.valor = valor;
	}
	public double convertir (byte unidad) {
		double resultado = 0;

		switch (unidad) {
		case Temperatura.FARENGEIS: 
			resultado = this.valor*UNIDAD_DE_CONVERSION_FARENGEIS;
			break;
		case Temperatura.KEVIN:
			resultado = this.valor*UNIDAD_DE_CONVERSION_KEVIN;
			break;
		case Temperatura.CELCIUS:
			resultado = this.valor;
			break;
		}
		return resultado;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor, byte unidad) {
		
		this.valor = valor;
	}
}
