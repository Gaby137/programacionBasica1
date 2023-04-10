package Clase_2021;

import java.util.Iterator;
import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {
//		System.out.println("ingrese algun valor");
		
		Scanner teclado = new Scanner(System.in);
		
//		System.out.println("ingrese numero");
//		
//		double i = teclado.nextDouble();
//		
//		System.out.println("los numeros son: "+ i);
		double acumulador = 0;
		for (int i=0; i<10;i++) {
			System.out.println("ingrese numero");
			
			double nro = teclado.nextDouble();
			System.out.println("los numeros son: "+ nro);
			acumulador+=nro;
		}
		System.out.println(acumulador);

	}

}
