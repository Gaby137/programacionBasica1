package Clase_2021;

import java.util.Scanner;

public class PruebaMultiplicacion {

	public static void main(String[] args) {
		System.out.println("ingrese 2 valores");
	
	Scanner teclado = new Scanner(System.in);
	int nro1 = teclado.nextInt();
	int nro2 = teclado.nextInt();
	int acumulador=0;
	for (int i=0; i<nro2; i++) {
		acumulador = acumulador+nro1;
	}
	System.out.println(acumulador);
	}
}