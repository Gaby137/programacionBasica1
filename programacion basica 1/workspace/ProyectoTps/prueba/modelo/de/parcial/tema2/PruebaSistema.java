package modelo.de.parcial.tema2;

import java.util.Scanner;

public class PruebaSistema {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombreDelSistema = "";
		Sistema actual;
		int opcionIngresada = 0;
		final int CANTIDAD_MAXIMA_DE_USUARIOS = 100;

		System.out.println("Bienvenido al Sistema");
		System.out.println("ingrese el nombre del sistema: ");
		nombreDelSistema = teclado.next();
		actual = new Sistema(nombreDelSistema, CANTIDAD_MAXIMA_DE_USUARIOS);

		do {
			mostrarMenu(actual);
			opcionIngresada = teclado.nextInt();
			switch (opcionIngresada) {
			case 1:
				darDeAltaUnUsuario(teclado, actual);
				break;
			case 2:
				loguearse(teclado, actual);
				break;
			case 4:
				System.out.println("cant de mayores:" + actual.calcularCantidadDeMayores());
				break;
			case 3:
				System.out.println("cant de menores:" + actual.calcularCantidadDeUsuariosMenores());
				break;
			case 5:
				listarUsuariosOrdenados(actual);
				break;
			default:
				System.out.println("fin");
				break;
			}

		} while (opcionIngresada != 9);
	}
	
		
		 
		 
	private static void listarUsuariosOrdenados(Sistema actual) {
		Usuario ordenados[] = actual.listarUsuarios();
		System.out.println("La lista de usuarios es: ");
		for (int i = 0; i < ordenados.length; i++) {
			if (ordenados[i] != null) {
				System.out.println(ordenados[i].getUsuario() + '\n');
			}
		}

	}

	private static void darDeAltaUnUsuario(Scanner teclado, Sistema actual) {
		String nombre, apellido, usuario, contrasena;
		int dni, edad;
		Password password = new Password();
		Usuario nuevo;

		System.out.println("Alta de usuario");
		System.out.println("Ingresar el nombre: ");
		nombre = teclado.next();
		System.out.println("Ingresar el apellido: ");
		apellido = teclado.next();
		System.out.println("Ingresar el dni: ");
		dni = teclado.nextInt();
		System.out.println("Ingresar la edad: ");
		edad = teclado.nextInt();
		System.out.println("Ingresar el usuario: ");
		usuario = teclado.next();
		do {
			System.out.println("Ingresar la contrasena");
			contrasena = teclado.next();
		} while (!password.esFuerte(contrasena));
		password.setValor(contrasena);

		nuevo = new Usuario(usuario, password, nombre, apellido, dni, edad);
		if (actual.ingresarUsuarios(nuevo)) {
			System.out.println("El alta fue exitoso");
		} else {
			System.out.println("No se pudo ingresar porque no hay espacio para nuevos usuarios");
		}
	}

	private static void mostrarMenu(Sistema actual) {
		System.out.println("Bienvenido a " + actual.getNombre());
		System.out.println("1 - Dar de alta un usuario");
		System.out.println("2 - Loguearse");
		System.out.println("3 - Mostrar la cantidad de menores");
		System.out.println("4 - Mostrar la cantidad de mayores");
		System.out.println("5 - Listar usuario");
		System.out.println("9 - Salir");
		System.out.println("Ingrese la opcion deseada");
	}

	private static void loguearse(Scanner teclado, Sistema actual) {
			String usuario, contrasena;
			System.out.println("---Login---");
			System.out.println("Ingrese el usuario: ");
			usuario = teclado.next();
			System.out.println("Ingrese la contraseña");
			contrasena = teclado.next();
			if (actual.loguearUsuario(usuario, contrasena)) {
				System.out.println("Bienvenido");
			} else {
				System.out.println("Usuario o contraseña invalida");
			}
		}

}
