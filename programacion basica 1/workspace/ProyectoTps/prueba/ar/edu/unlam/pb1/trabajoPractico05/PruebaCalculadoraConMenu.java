package ar.edu.unlam.pb1.trabajoPractico05;
import java.util.Scanner;

import ar.edu.unlam.pb1.trabajoPractico02.Calculadora;
public class PruebaCalculadoraConMenu {

	public static void main(String[] args) {
		int op;
		do {
			System.out.println("---Menu---\n"+
					" 1-Potencia\n"+
					" 2-Sumatoria con limite\n"+
					" 3-Sumatoria con lim superior e inferior\n"+
					" 4-Productoria con limite\n"+
					" 5-Productoria con lim superior e inferior\n"+
					" 6-Contar divisores\n"+
					" 9-Salir");

					System.out.println("Eliga uno mi loco:");
					Scanner teclado = new Scanner(System.in);
					Calculadora cassio = new Calculadora();
					
					op = teclado.nextInt();
					switch (op) {
						case 1: {
								ingresoOpcionPotencia(teclado, cassio);
						break;
						}
						case 2: {
								ingresoOpcionSumatoriaLimite(teclado, cassio);
						break;
						}
						case 3: {
								ingresoOpcionSumatoriaInfSup(teclado, cassio);
						break;
						}
						case 4: {
								System.out.println("Ingrese el limite:");
								int lim = teclado.nextInt();
								int resultado = cassio.productoria(lim);
								System.out.println("El resultado es: "+resultado);
								
						break;
						
						}
						case 5: {
							System.out.println("Ingrese el limite superior");
							int superior = teclado.nextInt();
							System.out.println("Ingrese el limite inferior");
							int inferior = teclado.nextInt();
							
							int resultado = cassio.productoria(inferior, superior);
							System.out.println("El resultado es: "+resultado);
							
							
						break;
						}
						case 6: {
							System.out.println("Ingrese el numero:");
							int num = teclado.nextInt();
							int resultado = cassio.contarDivisores(num);
							System.out.println("Los divisores son: "+resultado);
						
						break;
						}
						default:{
							System.out.println("En construccion...");
						break;
						}
					} 
		} while (op!=9);

		
	}

	public static void ingresoOpcionSumatoriaInfSup(Scanner teclado, Calculadora cassio) {
		System.out.println("Ingrese el limite superior");
		int superior = teclado.nextInt();
		System.out.println("Ingrese el limite inferior");
		int inferior = teclado.nextInt();
		
		int resultado = cassio.sumatoria(inferior, superior);
		System.out.println("El resultado es: "+resultado);
	}

	public static void ingresoOpcionSumatoriaLimite(Scanner teclado, Calculadora cassio) {
		System.out.println("ingrese el limite:");
		int lim = teclado.nextInt(); 
		int resultado = cassio.sumatoria(lim);
		System.out.println("El resultado es: "+resultado);
	}

	public static void ingresoOpcionPotencia(Scanner teclado, Calculadora cassio) {
		System.out.println("Ingrese la base:");
		int base = teclado.nextInt();
		System.out.println("Ingrese la potencia:");
		int potencia = teclado.nextInt();
		
		int resultado = cassio.potencia(base, potencia);
		System.out.println("El resultado es: "+resultado);
	}

}
