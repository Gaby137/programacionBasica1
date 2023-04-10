package ar.edu.unlam.pb1.trabajoPractico02;
import java.lang.Math;
public class Calculadora {
	private double operador1;
	private double operador2;

	
	
	
	
	public Calculadora() {
	}
	public Calculadora(double operador1, double operador2) {
		this.operador1=operador1;
		this.operador2=operador2;
	}
	public double sumar() {
		return this.operador1+this.operador2;
	}
	public double sumar(double operador1, double operador2) {
		this.operador1=operador1;
		this.operador2=operador2;
		return this.operador1+this.operador2;
	}
	public double restar() {
		return this.operador1-this.operador2;
	}
	public double restar(double operador1, double operador2) {
		return operador1-operador2;
	}
	public double multiplicar() {
		return this.operador1*this.operador2;
	}
	public double multiplicar(double operador1, double operador2) {
		return operador1*operador2;
	}
	public double dividir() {
		double resultado= 0;
		if (this.operador2!=0) {
			resultado= this.operador1/this.operador2;
		}
		return resultado;
	}
	public double dividir(double operador1, double operador2) {
		double resultado= 0;
		if (operador2!=0) {
			resultado= operador1/operador2;
		}
		return resultado;
		//falta validar el operador 2 distinto de 0
	}
	public double getOperador1() {
		return operador1;
	}
	public void setOperador1(double operador1) {
		this.operador1 = operador1;
	}
	public double getOperador2() {
		return operador2;
	}
	public void setOperador2(double operador2) {
		this.operador2 = operador2;
	}
	public String toString() {
		return "operador1: "+this.operador1+"\noperador2: "+this.operador2;
	}
	
	/*7- Ya lo hemos mencionado, y lo repetiremos incansablemente. La reutilización del código es
	una de las características que más nos preocupan a los programadores. Hagamos nuestra
	primera reutilización. Queremos tener una herramienta que nos permita calcular el área
	de un círculo. ¿Qué clase re-utilizarías de las que ya hicimos? Hacelo, pero aprovecha la
	ventaja de tener el valor exacto de PI en una constante almacenada en la clase Math
	(Math.PI)*/
	public double calcularAreaCirculo(double radio) {
		double area = Math.PI*Math.pow(radio, 2);
		return area;
	}
//	TP3*1- Incorpora el método esPositivo() a la clase Calculadora desarrollada en el trabajo práctico
//	n° 2. 	
	public static boolean esPositivo (int num) {
		if (num>=0) 
			return true;
		else 
			return false;
	}
	
	
	public int potencia(int base, int pot) {
		int result=base;
		
		for (int i=0; i<pot-1; i++) {
			result = result*base;
		}	
		
		return result;
	}
	
	public int sumatoria (int limite) {
		int sumador=0;
		for (int i=0; i<=limite; i++) {
			sumador=sumador+i;
		}
		return sumador;
	}
	
	public int sumatoria (int limiteInferior, int limiteSuperior) {
		int sumador1=0;
		if (limiteInferior<limiteSuperior && limiteSuperior>limiteInferior) {
		for (int i=limiteInferior; i<=limiteSuperior; i++) {
			sumador1=sumador1+i;
		}
		}else {
			sumador1=0;
		}
			
		return sumador1;
	}
	
	public int productoria (int limite) {
		int sumador2=1;
		for (int i=1; i<=limite; i++) {
			sumador2=sumador2*i;
		}
		return sumador2;
	}

	public int productoria (int limiteInferior, int limiteSuperior) {
		int productor=limiteInferior;
		if (limiteInferior<limiteSuperior && limiteSuperior>limiteInferior) {
			for (int i=limiteInferior+1; i<=limiteSuperior; i++) {
				productor=productor*i;
			}
		}else {
			productor=0;
		}
			
		return productor;
	}
	
	public int contarDivisores (int numero) {
		int contador=0;
		for (int i=1; i<=numero; i++) {
			if (numero%i==0) {
				contador++;
			}
		}
		return contador;
	}
	
//	public int factorial (int numero) {
//		
//	}
	
}

