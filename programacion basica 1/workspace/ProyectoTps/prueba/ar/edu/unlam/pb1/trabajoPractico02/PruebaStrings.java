package ar.edu.unlam.pb1.trabajoPractico02;
import java.lang.Math;
public class PruebaStrings {

	public static void main(String[] args) {
		String cadena1 = "  holA leo matioli  ";
		char valor1 = cadena1.charAt(1);
		System.out.println(valor1);
		
		int largocadena = cadena1.length();
		System.out.println(largocadena);
		
		String cadenaminuscula = cadena1.toLowerCase();
		System.out.println(cadenaminuscula);
		
		String cadenamayuscula = cadena1.toUpperCase();
		System.out.println(cadenamayuscula);
		
		String cadenasinespacio = cadena1.trim();
		System.out.println(cadenasinespacio);
		
		String minuscula = "java es case sensitives";
		int largominuscula = minuscula.length();
		System.out.println(largominuscula);
		
		String mayuscula = minuscula.toUpperCase();
		System.out.println(mayuscula);
		System.out.println(mayuscula+".");
		
		
		double resultado = Math.pow(2, 3);
		
		System.out.println(resultado);
		//de 0 a 9
		double aleatorio = Math.random()*9;
		System.out.println(aleatorio);
		// de 1 a 9
		double aleatorio1 = Math.random()*9+1;
		System.out.println(aleatorio1);
		
		double raiz = Math.sqrt(25);
		System.out.println(raiz);
	}

}
