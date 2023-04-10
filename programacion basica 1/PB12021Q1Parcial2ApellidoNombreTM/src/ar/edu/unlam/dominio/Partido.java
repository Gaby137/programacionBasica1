package ar.edu.unlam.dominio;

public class Partido {

	private int numeroPartido;
	private boolean iniciado;
	private Jugador[] equipoLocal;
	private Jugador[] equipoVisitante;
	private Jugador[] goles;
	private int posicionLocal;
	private int posicionVisitante;
	private int posicionGoles;
	private int LocalRegistrado;
	private int VisitanteRegistrado;

	public Partido(int numeroPartido, int cantidadDeJugadores, int cantidadDeGoles) {
		this.numeroPartido = numeroPartido;
		this.equipoLocal = new Jugador[cantidadDeJugadores];
		this.equipoVisitante = new Jugador[cantidadDeJugadores];
		this.goles = new Jugador[cantidadDeGoles];
		this.posicionLocal = 0;
		this.posicionVisitante = 0;
		this.posicionGoles = 0;
		this.LocalRegistrado = 0;
		this.VisitanteRegistrado = 0;
	}

	/**
	 * Agregar un jugador al array del equipo correspondiente según el tipo de
	 * equipo
	 * 
	 * @param jugador Jugador Jugador que se agregará al equipo correspondiente
	 * @return boolean Verdadero en caso de éxito
	 */
	public boolean agregarJugadorAEquipo(Jugador jugador, TipoEquipo tipoEquipo) {
		boolean agregado = false;
		switch (tipoEquipo) {
		case Local:
			if (posicionLocal < equipoLocal.length) {
				equipoLocal[posicionLocal] = jugador;
				posicionLocal++;
				agregado = true;
				LocalRegistrado++;
			}
			break;
		case Visitante:
			if (posicionVisitante < equipoVisitante.length) {
				equipoVisitante[posicionVisitante] = jugador;
				posicionVisitante++;
				agregado = true;
				VisitanteRegistrado++;
			}
			break;
		default:
			break;
		}
		return agregado;
	}

	/**
	 * Agrega un jugador al array de goles
	 * 
	 * @param jugador Jugador Jugador que se agregará al array de goles
	 * @return boolean Verdadero en caso de éxito
	 */
	public boolean registrarGolDeJugador(Jugador jugador) {
		boolean gool = false;
		
		if (posicionGoles < goles.length) {
			goles[posicionGoles] = jugador;
			posicionGoles++;
			gool = true;
		}

		return gool;
	}

	/**
	 * Busca un jugador por su DNI, debiendo indicar el equipo al que pertenece
	 * 
	 * @param dni        int DNI del jugador
	 * @param tipoEquipo TipoEquipo Tipo de equipo en el que se buscará el jugador
	 *                   (local o visitante)
	 * @return Jugador En caso de encontrarlo o null.
	 */
	public Jugador buscarJugadorPorDNIEnEquipo(int dni, TipoEquipo tipoEquipo) {
		Jugador jugadorDevuelto = null;
		switch (tipoEquipo) {
		case Local:
			for (int i = 0; i < posicionLocal; i++) {
				if (dni == equipoLocal[i].getDni()) {
					jugadorDevuelto = equipoLocal[i];
				}
			}
			break;
		case Visitante:
			for (int i = 0; i < posicionVisitante; i++) {
				if (dni == equipoVisitante[i].getDni()) {
					jugadorDevuelto = equipoVisitante[i];
				}
			}
			break;
		default:
			break;
		}
		return jugadorDevuelto;
	}

	/**
	 * Cambia el estado de la variable iniciado a verdadero
	 */
	public void iniciarPartido() {
		
		this.iniciado = true;
	}

	public int getLocalRegistrado() {
		return LocalRegistrado;
	}

	public int getVisitanteRegistrado() {
		return VisitanteRegistrado;
	}

	/**
	 * Cambia el estado de la variable iniciado a falso
	 */
	public void finalizarPartido() {
		this.iniciado = false;
	}

	/**
	 * Obtiene un array de jugadores que marcaron un gol, debiendo ser ordenados por
	 * DNI
	 * 
	 * @return Jugador[] En caso de existir goles o null.
	 */
	public Jugador[] obtenerGolesDeJugadoresOrdenadosPorDni() {
		Jugador[] listaOrdenada = goles;
		Jugador aux = null;
		for (int i = 1; i <= listaOrdenada.length; i++) {
			for (int j = 0; j < listaOrdenada.length - 1; j++) {
				if (listaOrdenada != null) {
					if (listaOrdenada[j].getDni() > listaOrdenada[j + 1].getDni()) {
						aux = listaOrdenada[j + 1];
						listaOrdenada[j + 1] = listaOrdenada[j];
						listaOrdenada[j] = aux;

					}
				}
			}
		}
		return listaOrdenada;
	}

	/**
	 * Devuelve un String con la descripción del equipo ganador: Local, Visitante o
	 * Empate
	 */
	public String obtenerEquipoGanador() {
		String resultado = "";
		int contLocal = 0;
		int contVisitante = 0;
		for (int i = 0; i < goles.length; i++) {
			if (goles[i].getTipoEquipo().equals(TipoEquipo.Local)) {
				contLocal++;
			}
			if (goles[i].getTipoEquipo().equals(TipoEquipo.Visitante)) {
				contVisitante++;
			}
		}

		if (contLocal > contVisitante) {
			resultado = "ganador equipo Local";
		} else {
			if (contLocal < contVisitante) {
				resultado = "ganador equipo visitante";
			} else {
				resultado = "empate";
			}

		}
		return resultado;
	}

	/*
	 * Devuelve el jugador mas joven querealizo un gol
	 */
	public Jugador obtenerJugadorMasJovenQueHizoUnGol() {
		Jugador menor = goles[0];
		for (int i = 0; i < goles.length; i++) {
			if (goles[i].getEdad() < menor.getEdad()) {
				menor = goles[i];
			}
		}
		return menor;
	}

	public boolean getIniciado() {
		return iniciado;
	}

	public void setIniciado(boolean iniciado) {
		this.iniciado = iniciado;
	}

}
