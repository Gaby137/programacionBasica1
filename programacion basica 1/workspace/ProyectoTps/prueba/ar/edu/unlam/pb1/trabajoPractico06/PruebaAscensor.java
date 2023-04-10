package ar.edu.unlam.pb1.trabajoPractico06;
import java.util.Scanner;
public class PruebaAscensor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Ascensor subito = new Ascensor();
		System.out.println("ingrese el peso: ");
		double peso = teclado.nextDouble();
		int op;
		
		do {
			op = menu(teclado);
			
			switch (op) {
				case 1:
						subito.abrirPuerta();
					break;
				case 2:
						subito.cerrarPuerta();
					break;
				case 3:
						subito.ingresar(null);
					break;
				case 4:
						subito.subir();
					break;
				case 5:
						subito.bajar();
					break;
				case 6:
						subito.salir(null);
					break;
				case 7:
						subito.irAlPiso(0);
					break;
				case 8:
					System.out.println("...");
				break;
				default:
				break;
			}
			
		} while (op!=8);
		
		
		
		
	}

	public static int menu(Scanner teclado) {
		int op;
		System.out.println("Panel de control Ascensor");
		System.out.println("1 - Abrir la puerta");
		System.out.println("2 - Cerrar la puerta");
		System.out.println("3 - Ingresar");
		System.out.println("4 - Subir");
		System.out.println("5 - Bajar");
		System.out.println("6 - Salir");
		System.out.println("7 - Ir al piso");
		System.out.println("8 - Salir del menu");
		
		System.out.println("Ingrese el opccion: ");
		
		op= teclado.nextInt();
		return op;
	}

}
