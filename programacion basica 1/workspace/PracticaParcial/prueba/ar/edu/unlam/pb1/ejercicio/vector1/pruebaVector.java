package ar.edu.unlam.pb1.ejercicio.vector1;

import java.util.Scanner;

public class pruebaVector {

	public static void main(String[] args) {
		Registro wea = new Registro();
		int opcion = 0;
		do {
			opcion = seleccionarOpcion();
			switch (opcion) {
			case 1:
				agregarPersona(wea);
				break;
			case 2:
				ordenarPorDni(wea);
				break;
			case 3:
				ordenarPorApellido(wea);
				break;
			case 4:
				mostrarElMenor(wea);
				break;
			case 5:
				mostrarElMayor(wea);
				break;
			default:
				System.out.println("Opción Invalida");
				break;
			}
		} while (opcion != 9);
	}
		
		
	private static void mostrarElMayor(Registro wea) {
		int dni= wea.mayor();
		Persona p1 = wea.buscarPorDni(dni);
		if (p1 != null) {
			System.out.println(p1.getDni()+" "+p1.getApellido()+" "+p1.getNombre()+" "+p1.getEdad());
		}else {
			System.out.println("No hay mayor");
		}
		
	}


	private static void mostrarElMenor(Registro wea) {
		int dni= wea.menor();
		Persona p1 = wea.buscarPorDni(dni);
		if (p1 != null) {
			System.out.println(p1.getDni()+" "+p1.getApellido()+" "+p1.getNombre()+" "+p1.getEdad());
		}else {
			System.out.println("No hay menor");
		}
		
	}


	private static int seleccionarOpcion() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada = 0;
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Agregar personas");
		System.out.println("2 - Lista ordenada por Dni");
		System.out.println("3 - Lista ordenada por Apellido");
		System.out.println("4 - Mostrar el menor");
		System.out.println("5 - Mostrar el mayor");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		opcionSeleccionada = teclado.nextInt();
		return opcionSeleccionada;
	}
	
	public static void agregarPersona(Registro wea) {
		Scanner teclado = new Scanner(System.in);
		String nombre, apellido;
		int dni, edad;
		System.out.println("Ingrese el nombre");
		nombre = teclado.next();
		System.out.println("Ingrese el apellido");
		apellido = teclado.next();
		System.out.println("Ingrese el dni");
		dni = teclado.nextInt();
		System.out.println("Ingrese la edad");
		edad = teclado.nextInt();
		Persona persona = new Persona(dni, nombre, apellido, edad);
		
		if (wea.agregarPersona(persona)) {
			System.out.println("Se registro exitosamente");
		} else {
			System.out.println("No se pudo agregar");
		}
		
	}
	
	private static void ordenarPorDni(Registro wea) {
		wea.ordenarPorDni();
		for (int i = 0; i < wea.getPersona().length; i++) {
			System.out.println(wea.getPersona()[i].getDni()+" "+wea.getPersona()[i].getNombre()+" "+wea.getPersona()[i].getApellido());
		}
	}

	private static void ordenarPorApellido(Registro wea) {
		wea.ordenarPorApellido();
		for (int i = 0; i < wea.getPersona().length; i++) {
			System.out.println(wea.getPersona()[i].getApellido()+" "+wea.getPersona()[i].getNombre()+" "+wea.getPersona()[i].getDni());
		}
	}
	

}
