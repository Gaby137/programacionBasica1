package Clase_2021;
import java.util.Scanner;
public class IngrasoPorTecladoPrueba {

	public static void main(String[] args) {
		
		//pantalla
		System.out.println("ingrese algun valor");
		
		//teclado
		Scanner teclado = new Scanner(System.in);
		
		int numeroEntero = teclado.nextInt();
		
		System.out.println("el numero ingresado es: "+ numeroEntero);
		
		System.out.println("ingrese el salario");
		
		double salario = teclado.nextDouble();
		
		System.out.println("el salario es: "+ salario);
		
		System.out.println("ingrese el nombre: ");
		String nombre = teclado.next();
		System.out.println("el nombre es: "+ nombre);
		
		System.out.println("ingrese la nota: ");
		
		char nota = (teclado.next()).charAt(0);
		
		System.out.println("la nota es: "+ nota);
		
	}

}
