package ar.edu.unlam.pb1.trabajoPractico04;
import java.lang.Math;
public class Distancia {
	public static final byte DECAMETRO = '3';
	public static final byte HECTOMETRO = '2';
	public static final byte KILOMETRO = '1';
	private double valor;
	
	public Distancia (double valor) {
		this.valor=valor;
		
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setValor (double valor, byte unidad) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public double convertir (byte unidad) {
		double resultado=0.0;
		switch (unidad) {
		case KILOMETRO:
			resultado=this.valor/Math.pow(10, 3);
			break;
		case HECTOMETRO:
			resultado=this.valor/Math.pow(10, 2);
			break;
		case DECAMETRO:
			resultado=this.valor/10;
			break;
		}
		return resultado;
	}
	
}
