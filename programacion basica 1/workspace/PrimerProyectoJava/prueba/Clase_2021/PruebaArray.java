package Clase_2021;
import java.util.Scanner;
public class PruebaArray {

	public static void main(String[] args) {
		int [] array = new int [10];
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Ingrese los valores "+i);
			array[i] = teclado.nextInt();
			
			
		}
		for (int i = 0; i <= array.length; i+=2) {
			System.out.println("las posiciones pares son: "+i);
		}

	}

}
