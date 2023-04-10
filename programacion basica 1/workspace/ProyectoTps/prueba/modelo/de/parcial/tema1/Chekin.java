package modelo.de.parcial.tema1;

import java.util.Scanner;

public class Chekin {

	public static void main(String[] args) {
		System.out.println("Bienvenido ");
		int CantidadPasajero = 192;
		Vuelo vuelo = new Vuelo("Buenos Aires", "Bariloche", CantidadPasajero);
		int opcion = 0;
		do {
			opcion = seleccionarOpcion();
			switch (opcion) {
			case 1:
				registrarPasajero(vuelo);
				break;
			case 2:
				elegirAsiento(vuelo);
				break;
			case 3:
				listarPasajeros(vuelo);
				break;
			default:
				System.out.println("Opci�n Invalida");
				break;
			}
		} while (opcion != 9);
	}

	private static int seleccionarOpcion() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada = 0;
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Registrar pasajero");
		System.out.println("2 - Elegir Asiento");
		System.out.println("3 - Listar pasajeros");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		opcionSeleccionada = teclado.nextInt();
		return opcionSeleccionada;
	}

	public static void registrarPasajero(Vuelo vuelo) {
		/*
		 * Interfaz de usuario encargada de cargar un pasajero al vuelo. Debe ingresar
		 * los datos necesarios e informar por pantalla el resultado de la operaci�n
		 */
		Scanner teclado = new Scanner(System.in);
		String nombre, apellido;
		int dni;
		System.out.println("Ingrese el nombre");
		nombre = teclado.next();
		System.out.println("Ingrese el apellido");
		apellido = teclado.next();
		System.out.println("Ingrese el dni");
		dni = teclado.nextInt();
		Pasajero pasajeros = new Pasajero(dni, nombre, apellido);
		
		if (vuelo.agregarPasajero(pasajeros)) {
			System.out.println("Se registro exitosamente el pasajero");
		} else {
			System.out.println("No pudo registrarse");
		}
		
	}

	private static void elegirAsiento(Vuelo vuelo) {
		/*
		 * Interfaz de usuario encargada de gestionar la asignaci�n de asientos en el
		 * vuelo. Debe permitir el ingreso de los datos y mostrar por pantalla el
		 * resultado de la operaci�n
		 */
		Scanner teclado = new Scanner(System.in);
		int dni, fila, columna;
		Pasajero pasajeroASentar;
		System.out.println(vuelo);
		
		System.out.println("Ingrese el dni: ");
		dni = teclado.nextInt();
		
		
		if (vuelo.buscarPasajero(dni)!=null) {
			System.out.println("Ingrese la fila deseada: ");
			fila = teclado.nextInt()-1;
			System.out.println("Ingrese la columna deseada");
			columna = teclado.nextInt()-1;
			pasajeroASentar=vuelo.buscarPasajero(dni);
			if (vuelo.asignarAsiento(pasajeroASentar, fila, columna)) {
				System.out.println("Se asigno un asiento al pasajero");
				System.out.println(vuelo);
			}else {
				System.out.println("No esta disponible el lugar");
			}
		}else {
			System.out.println("El pasajero no existe");
		}
	}

	private static void listarPasajeros(Vuelo vuelo) {
		/*
		 * Se debe mostrar la lista de pasajeros registrados para �ste vuelo ordenados
		 * por DNI
		 */
		vuelo.ordenarListaDePasajerosPorDNI();
		for (int i = 0; i < vuelo.getPasajeros().length; i++) {
			System.out.println(vuelo.getPasajeros()[i].getDni()+" "+vuelo.getPasajeros()[i].getNombre()+" "+vuelo.getPasajeros()[i].getApellido());
		}
	}
}
