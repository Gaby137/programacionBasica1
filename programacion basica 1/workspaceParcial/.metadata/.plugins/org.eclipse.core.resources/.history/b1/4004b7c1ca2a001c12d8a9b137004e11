package ar.edu.unlam.adminSmartwatch;

import java.util.Scanner;

import ar.edu.unlam.pb2.smartwatch.deportista.Deportista;
import ar.edu.unlam.pb2.smartwatch.deportista.Disciplina;
import ar.edu.unlam.pb2.smartwatch.deportista.Runner;

public class InterfazSmartWatch {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Integer opcionDeseada = 0;
		Runner actual = new Runner();

		do {
			mostrarMenuInicial(teclado, actual);

			mostrarOpciones();
			opcionDeseada = teclado.nextInt();

			switch (opcionDeseada) {

			case 1:
				actual.setTipoDeDisciplina(Disciplina.CARRERA);
				break;
			case 2:
				actual.setTipoDeDisciplina(Disciplina.CICLISMO);
				break;
			case 3:
				actual.setTipoDeDisciplina(Disciplina.NATACION);
				break;
			case 4:
				actual.setTipoDeDisciplina(Disciplina.CAMINATA);
				break;
			default:
				break;

			}

		} while (opcionDeseada != 9);

	}

	private static void mostrarMenuInicial(Scanner teclado, Deportista actual) {
		System.out.println("Bienvenido a su SmartWatch\n");
		System.out.println("******Configure su SmartWatch*****");

		generarUsuario(teclado);

	}

	private static void generarUsuario(Scanner teclado) {
		String nombre;
		Integer edadActual;
		Double pesoActual, alturaActual;
		Deportista nuevo;
		System.out.println("*****************************");
		System.out.println("**Complete con sus datos: **");
		System.out.println(" Ingrese su nombre:");
		nombre = teclado.next();
		System.out.println("Ingrese su edad: ");
		edadActual = teclado.nextInt();
		System.out.println("Ingrese su peso actual: ");
		pesoActual = teclado.nextDouble();
		System.out.println("Ingrese su altura actual: ");
		alturaActual = teclado.nextDouble();

//		 nuevo = new Deportista(nombre,edadActual,pesoActual,alturaActual);

	}

	private static void mostrarOpciones() {

		System.out.println("* Hola *\n");
		System.out.println("*****************************");
		System.out.println("¿Que deporte va a realizar hoy?");
		System.out.println("1 - Running");
		System.out.println("2 - Ciclismo");
		System.out.println("3 - Natación");
		System.out.println("4 - Footing ");
		System.out.println("9 - Salir");
		System.out.println("*****************************");
		System.out.println("Ingrese una opcion");

	} /*****/ /***/

}
