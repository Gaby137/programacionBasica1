package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.Jugador;
import ar.edu.unlam.dominio.Partido;
import ar.edu.unlam.dominio.Puesto;
import ar.edu.unlam.dominio.TipoEquipo;

public class TestPartidoFutbol {

	private static final int CANT_JUGADORES_VALIDOS = 3;

	public static void main(String[] args) {
		/*
		 * TODO: Generar un menu que permita:
		 * 
		 * 1) Crear partido: Se debera solicitar el ingreso de datos por pantalla. 2)
		 * Agregar jugador equipo local: Se debera� solicitar el ingreso de datos por
		 * pantalla. 3) Agregar jugador equipo visitante: Se deberá solicitar el
		 * ingreso de datos por pantalla. 4) Iniciar el partido: Cambia el estado de la
		 * variable iniciado de la clase Partido No se puede inciar el partido si ambos
		 * equipos no tienen almenos 11 jugadores cada uno.
		 * 
		 * 5) Registar gol: Para registrar un gol, primero debe buscarse el jugador por
		 * su DNI, indicando su equipo (Local o Visitante). Debe existir el partido y
		 * estar iniciado. 6) Finalizar partido: Cambia el estado de la variable
		 * iniciado de la clase Partido.
		 * 
		 */
		Partido partido1 = null;
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		do {
			opcion = seleccionarOpcion();
			switch (opcion) {
			case 1:
				partido1 = crearPartido(teclado);
				break;
			case 2:
				agregarJugadorLocal(teclado, partido1);
				break;
			case 3:
				agregarJugadorVisitante(teclado, partido1);
				break;
			case 4:
				iniciarPartido(teclado, partido1);
				break;
			case 5:
				registrarGol(teclado, partido1);
				break;
			case 6:
				System.out.println(partido1.obtenerEquipoGanador());
				partido1.finalizarPartido();
				break;

			default:
				
				System.out.println("Fin");
				break;
			}
		} while (opcion != 9);

		/*************************************************************
		 * 
		 * Notas: - El menú finaliza, cuando el partido esté finalizado. - Una vez
		 * finalizado el partido, informar equipo ganador indicando: Local, Visitante o
		 * Empate y jugadores que marcaron gol ordenados por DNI (en caso de existir). -
		 * y tambien informar el jugador mas joven que hizo un gol
		 * 
		 * Puede crear todos los metodos y atributos que necesite
		 *************************************************************/
	}

	

	private static void registrarGol(Scanner teclado, Partido partido1) {
		int dniDelJugador, tipoDeEquipo;
		
		TipoEquipo t1 = null;
		if (partido1 != null && partido1.getIniciado() == true) {
			System.out.println("Ingrese dni del jugador");
			dniDelJugador = teclado.nextInt();
			System.out.println("Ingresa el equipo");
			System.out.println("1- local");
			System.out.println("2- visitante");
			tipoDeEquipo = teclado.nextInt();
			switch (tipoDeEquipo) {
			case 1:
				t1 = TipoEquipo.Local;
				break;
			case 2:
				t1 = TipoEquipo.Visitante;
				break;
			default:
				break;
			}
			Jugador devuelto =partido1.buscarJugadorPorDNIEnEquipo(dniDelJugador, t1);
			if (devuelto != null) {
				if(partido1.registrarGolDeJugador(devuelto)) {
					System.out.println("Se registro exitosamente el gol");
				}else {
					System.out.println("No se pudo registrar el gol");
				}
				
			}else {
				System.out.println("No existe el jugador");
			}
		}
		
	}

	private static void iniciarPartido(Scanner teclado, Partido partido1) {
		if (partido1.getLocalRegistrado() >= CANT_JUGADORES_VALIDOS && partido1.getVisitanteRegistrado() >= CANT_JUGADORES_VALIDOS) {
			partido1.iniciarPartido();
			System.out.println("---------------------Se inicio el partido-----------------------");
		}else
			System.out.println("no hay suficientes jugadores registrados");
	}

	private static void agregarJugadorVisitante(Scanner teclado, Partido partido1) {
//		String nombre, apellido;
//		int dni, edad, numeroCamiseta;
//		int puesto;
//
		System.out.println("-----------Registrar un jugador Visitante----------");
//		System.out.println("Ingresar el nombre: ");
//		nombre = teclado.next();
//		System.out.println("Ingresar el apellido: ");
//		apellido = teclado.next();
//		System.out.println("Ingresar el dni: ");
//		dni = teclado.nextInt();
//		System.out.println("Ingresar la edad: ");
//		edad = teclado.nextInt();
//		System.out.println("Ingresar el numero de camiseta: ");
//		numeroCamiseta = teclado.nextInt();
//		System.out.println("Ingrese el puesto");
//		System.out.println("1. " + Puesto.Arquero);
//		System.out.println("2. " + Puesto.Defensor);
//		System.out.println("3. " + Puesto.Delantero);
//		System.out.println("4. " + Puesto.Mediocampista);
//		puesto = teclado.nextInt();
//		Puesto p1 = null;
//		switch (puesto) {
//		case 1:
//			p1 = Puesto.Arquero;
//			break;
//		case 2:
//			p1 = Puesto.Defensor;
//			break;
//		case 3:
//			p1 = Puesto.Delantero;
//			break;
//		case 4:
//			p1 = Puesto.Mediocampista;
//			break;
//		default:
//			break;
//		}
//		Jugador jugadorNuevo = new Jugador(dni, nombre, apellido, numeroCamiseta, edad, TipoEquipo.Visitante, p1);
//		partido1.agregarJugadorAEquipo(jugadorNuevo, TipoEquipo.Visitante);
		Jugador jugadorNuevo1 = new Jugador(1, "n1", "p1", 1, 10, TipoEquipo.Visitante, Puesto.Arquero);
		partido1.agregarJugadorAEquipo(jugadorNuevo1, TipoEquipo.Visitante);
		Jugador jugadorNuevo2 = new  Jugador(2, "n1", "p1", 1, 11, TipoEquipo.Visitante, Puesto.Delantero);
		partido1.agregarJugadorAEquipo(jugadorNuevo2, TipoEquipo.Visitante);
		Jugador jugadorNuevo3 =new Jugador(3, "n1", "p1", 1, 15, TipoEquipo.Visitante, Puesto.Defensor);
		partido1.agregarJugadorAEquipo(jugadorNuevo3, TipoEquipo.Visitante);

	}

	private static void agregarJugadorLocal(Scanner teclado, Partido partido1) {
//		String nombre, apellido;
//		int dni, edad, numeroCamiseta;
//		int puesto;
//
		System.out.println("-----------Registrar un jugador Local----------");
//		System.out.println("Ingresar el nombre: ");
//		nombre = teclado.next();
//		System.out.println("Ingresar el apellido: ");
//		apellido = teclado.next();
//		System.out.println("Ingresar el dni: ");
//		dni = teclado.nextInt();
//		System.out.println("Ingresar la edad: ");
//		edad = teclado.nextInt();
//		System.out.println("Ingresar el numero de camiseta: ");
//		numeroCamiseta = teclado.nextInt();
//		System.out.println("Ingrese el puesto");
//		System.out.println("1. " + Puesto.Arquero);
//		System.out.println("2. " + Puesto.Defensor);
//		System.out.println("3. " + Puesto.Delantero);
//		System.out.println("4. " + Puesto.Mediocampista);
//		puesto = teclado.nextInt();
//		Puesto p1 = null;
//		switch (puesto) {
//		case 1:
//			p1 = Puesto.Arquero;
//			break;
//		case 2:
//			p1 = Puesto.Defensor;
//			break;
//		case 3:
//			p1 = Puesto.Delantero;
//			break;
//		case 4:
//			p1 = Puesto.Mediocampista;
//			break;
//		default:
//			break;
//		}
//		Jugador jugadorNuevo = new Jugador(dni, nombre, apellido, numeroCamiseta, edad, TipoEquipo.Local, p1);
//		partido1.agregarJugadorAEquipo(jugadorNuevo, TipoEquipo.Local);
//		Jugador jugadorNuevo2 = new Jugador(dni+1, nombre, apellido, numeroCamiseta, edad+3, TipoEquipo.Local, Puesto.Delantero);
//		partido1.agregarJugadorAEquipo(jugadorNuevo2, TipoEquipo.Local);
//		Jugador jugadorNuevo3 = new Jugador(dni+1, nombre, apellido, numeroCamiseta, edad+1, TipoEquipo.Local, Puesto.Mediocampista);
//		partido1.agregarJugadorAEquipo(jugadorNuevo3, TipoEquipo.Local);
		
		Jugador jugadorNuevo1 = new Jugador(10, "n1", "p1", 1, 10, TipoEquipo.Local, Puesto.Arquero);
		partido1.agregarJugadorAEquipo(jugadorNuevo1, TipoEquipo.Local);
		Jugador jugadorNuevo2 = new  Jugador(11, "n1", "p1", 1, 11, TipoEquipo.Local, Puesto.Delantero);
		partido1.agregarJugadorAEquipo(jugadorNuevo2, TipoEquipo.Local);
		Jugador jugadorNuevo3 =new Jugador(12, "n1", "p1", 1, 15, TipoEquipo.Local, Puesto.Defensor);
		partido1.agregarJugadorAEquipo(jugadorNuevo3, TipoEquipo.Local);
	}

	private static Partido crearPartido(Scanner teclado) {
		int partido, jugadores, goles;
		
//		System.out.println("Ingrese numero de partido");
//		partido = teclado.nextInt();
//		System.out.println("Ingrese la cantidad de jugadores");
//		jugadores = teclado.nextInt();
//		System.out.println("Ingrese la cantidad de goles");
//		goles = teclado.nextInt();
//
//		Partido partido1 = new Partido(partido, jugadores, goles);
		Partido partido1 = new Partido(1, 3, 3);

		return partido1;
	}

	private static int seleccionarOpcion() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada = 0;
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Crear partido");
		System.out.println("2 - Agregar jugador a equipo local");
		System.out.println("3 - Agregar jugador a equipo visitante");
		System.out.println("4 - Iniciar partido");
		System.out.println("5 - Registrar gol");
		System.out.println("6 - Finalizar partido");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		opcionSeleccionada = teclado.nextInt();
		return opcionSeleccionada;
	}

}
