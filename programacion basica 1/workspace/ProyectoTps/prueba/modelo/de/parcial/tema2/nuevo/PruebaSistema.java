package modelo.de.parcial.tema2.nuevo;

import java.util.Scanner;

public class PruebaSistema {

	public static void main(String[] args) {
		Sistema wea = new Sistema("sistem", 3);
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		do {
			opcion = seleccionarOpcion();
			switch (opcion) {
			case 1:
				ingresarUnUsuarioNuevo(teclado, wea);
				break;
			case 2:
				loguearUnUsuario(teclado, wea);
				break;
			case 3:
				System.out.println("cant de mayores:" + wea.calcularCantidadDeMayores());
				break;
			case 4:
				System.out.println("cant de menores" + wea.calcularCantidadDeUsuariosMenores());
				break;
			case 5:
				System.out.println("edad promedio" + wea.calcularEdadPromedio());
				break;
			case 6:
				mostrarListaOrdenada(wea);
				break;
			case 7:
				eliminar(teclado, wea);
				break;

			default:
				System.out.println("Fin");
				break;
			}
		} while (opcion != 9);

	}

	private static void eliminar(Scanner teclado, Sistema wea) {
		System.out.println("Ingrese el usuario que desea eliminar");
		String usuario = teclado.next();
		if (wea.eliminarUsuario(usuario)) {
			System.out.println("fue eliminado:" + usuario);
			for (int i = 0; i < wea.getUsuarios().length; i++) {
				if (wea.getUsuarios()[i] != null) {
					System.out.println(wea.getUsuarios()[i].getUsuario() + " " + wea.getUsuarios()[i].getEdad());
				}

			}
		} else {
			System.out.println("no se pudo eliminar");
		}
	}

	private static void mostrarListaOrdenada(Sistema wea) {
		Usuario[] listaOrdenada = wea.listarUsuarios();
		for (int i = 0; i < listaOrdenada.length; i++) {
			if (listaOrdenada[i] != null) {
				System.out.println(listaOrdenada[i].getUsuario() + '\n');
			}
		}

	}

	private static void loguearUnUsuario(Scanner teclado, Sistema wea) {
		String usuario, contrasena;
		System.out.println("---Login---");
		System.out.println("Ingrese el usuario: ");
		usuario = teclado.next();
		System.out.println("Ingrese la contraseña");
		contrasena = teclado.next();
		if (wea.loguearUsuario(usuario, contrasena)) {
			System.out.println("Bienvenido");
		} else {
			System.out.println("Usuario o contraseña invalida");
		}

	}

	private static void ingresarUnUsuarioNuevo(Scanner teclado, Sistema wea) {
		String nombre, apellido, usuario, contrasena;
		int dni, edad;
		Usuario contra = new Usuario();

		System.out.println("-----------Registrar un usuario----------");
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

		} while (!contra.laContrasenaEsValida(contrasena));

		Usuario nuevo = new Usuario(usuario, contrasena, nombre, apellido, dni, edad);
		if (wea.ingresarUsuario(nuevo)) {
			System.out.println("El registro fue exitoso");
		} else {
			System.out.println("No se pudo ingresar porque no hay espacio para nuevos usuarios");
		}

	}

	private static int seleccionarOpcion() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada = 0;
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Registrar usuario");
		System.out.println("2 - Loguearse");
		System.out.println("3 - Usuarios mayores de edad");
		System.out.println("4 - Usuarios menores de edad");
		System.out.println("5 - Edad promedio");
		System.out.println("6 - Listar usuarios");
		System.out.println("7 - Eliminar un usuario");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		opcionSeleccionada = teclado.nextInt();
		return opcionSeleccionada;
	}

}
