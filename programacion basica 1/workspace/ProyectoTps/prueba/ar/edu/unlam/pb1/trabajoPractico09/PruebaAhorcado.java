package ar.edu.unlam.pb1.trabajoPractico09;

import java.util.Scanner;

public class PruebaAhorcado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("--------------------------------------------------");
		System.out.println("Nombre del J1:");
		String name = teclado.next();
		
		System.out.println("Ingrese una palabra:");
		String palabrota = teclado.next();
		
		System.out.println("Nombre del J2:");
		String name2 = teclado.next();
		
		System.out.println("Ingrese una palabra:");
		String palabrota2 = teclado.next();
		System.out.println("--------------------------------------------------");
		
		Jugador j1 = new Jugador(name, palabrota);
		Jugador j2 = new Jugador(name2, palabrota2);
		
		Partida p1 = new Partida(j1, j2);
		
		do {
		
		
		System.out.println("-----------------TURNO :"+p1.getTurno().getNombre().toUpperCase()+"------------------");
		System.out.println(p1.getTurno());
		int op = menuJuego(teclado);
		switch (op) {
		case 1:
			System.out.println("Ingrese una letra:");
			char letra = teclado.next().charAt(0);
			p1.getJugador2().adivinarPalabra(letra);
			System.out.println(p1.getTurno());
			break;

		default:
			break;
		}
		
		
		} while (p1.getGanador()!=null && p1.getPerdedor()!=null);
	}

	public static int menuJuego(Scanner teclado) {
		int op =0;
		System.out.println("---MENU---");
		System.out.println("1-Ingrese letra:");
		System.out.println("2-Arriesgar palabra");	
		op = teclado.nextInt();
		
		return op;
	}

}
