package ar.edu.unlam.pb1.trabajoPractico09;

import java.util.Scanner;

public class punto1Prueba {

	public static void main(String[] args) {
		
		int[] vec = new int[5];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < vec.length; i++) {
			System.out.println("ingrese un numero");
			int wea = teclado.nextInt();
			vec[i]=wea;
		}
		for (int i = 0; i < vec.length; i++) {
			System.out.println("la posicion: "+i+ " : "+vec[i]);
		}

	}

}
