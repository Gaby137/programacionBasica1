package ar.edu.unlam.pb1.parcial2;

public class PartidoDeFutbol {
	private EquipoDeFutbol local;
	private EquipoDeFutbol visitante;
	private Evento goles[];
	private Evento amonestados[];
	private Evento expulsados[];
	private int posicionGol;
	private int posicionAmonestados;
	private int posicionExpulsados;

	public PartidoDeFutbol(EquipoDeFutbol local, EquipoDeFutbol visitante) {
		this.local = local;
		this.visitante = visitante;
		this.posicionGol = 0;
		this.posicionAmonestados = 0;
		this.posicionExpulsados = 0;
		this.goles = new Evento[3];
		this.amonestados = new Evento[10];
		this.expulsados = new Evento[10];
	}

	/*
	 * Se debe marcar un nuevo Gol Dependiendo del autor (según al equipo que
	 * pertenezca) y del tipo (si es a favor o en contra) se sabrá a quien
	 * contabilizarlo
	 */
	public void marcar(Evento gol) {
		Jugador jugadorLocal = local.buscar(gol.getAutor().getNombre());
		Jugador jugadorVisitante = visitante.buscar(gol.getAutor().getNombre());

		if (jugadorLocal != null) {

			gol.setAutor(jugadorLocal);
			goles[posicionGol] = gol;
			posicionGol++;
		} else {
			if (jugadorVisitante != null) {
				gol.setAutor(jugadorVisitante);
				goles[posicionGol] = gol;
				posicionGol++;
			}
		}

	}

	/*
	 * Se registra un nuevo amonestado en el partido. Si el mismo ya poseía una
	 * amonestación previa, se lo debe expulsar. El método devuelve la cantidad de
	 * amonestaciones del jugador. Los valores posibles de retorno son: 1 - Si no
	 * tenía amonestación previa o 2 - Si ya poseía una amonestación previa y
	 * termina siendo expulsado
	 * 
	 */
	public int amonestar(Evento amonestado) {
		int contadorDeAmonestaciones = 0;
		if (!jugadorAmonestadoRepetido(amonestado.getAutor())) {
			amonestados[posicionAmonestados] = amonestado;
			posicionAmonestados++;
			contadorDeAmonestaciones = 1;
		} else {
			contadorDeAmonestaciones = 2;
			expulsar(amonestado);
		}

		return contadorDeAmonestaciones;
	}

	public boolean jugadorAmonestadoRepetido(Jugador jugador) {
		boolean repetido = false;
		for (int i = 0; i < posicionAmonestados; i++) {
			if (jugador.getNumero() == amonestados[i].getAutor().getNumero()) {
				repetido = true;
			}
		}
		return repetido;
	}

	/*
	 * Se registra un nuevo expulsado en el partido.
	 */
	public void expulsar(Evento expulsado) {
		expulsados[posicionExpulsados] = expulsado;
		posicionExpulsados++;
	}

	/*
	 * Se cuentan la cantidad de goles por equipo (Se debe considerar si el gol
	 * resultó a favor o en contra), y devuelve el equipo ganador (Si hubo un empate
	 * retorna null)
	 */
	public EquipoDeFutbol getGanador() {
		int contadorDeGolVisitante = 0;
		int contadorDeGolLocal = 0;
		EquipoDeFutbol resultado = null;

		for (int i = 0; i < posicionGol; i++) {
			Jugador jugadorLocal = local.buscar(goles[i].getAutor().getNombre());
			Jugador jugadorVisitante = visitante.buscar(goles[i].getAutor().getNombre());
			if (jugadorLocal != null) {
				if (goles[i].getTipo().equals(TipoDeEvento.GOL_A_FAVOR)) {
					contadorDeGolLocal++;
				} else {
					contadorDeGolVisitante++;
				}
			}
			if (jugadorVisitante != null) {
				if (goles[i].getTipo().equals(TipoDeEvento.GOL_A_FAVOR)) {
					contadorDeGolVisitante++;
				} else {
					contadorDeGolLocal++;
				}
			}
		}
		if (contadorDeGolLocal > contadorDeGolVisitante) {
			resultado = this.local;
		} else {
			if (contadorDeGolLocal < contadorDeGolVisitante) {
				resultado = this.visitante;
			}

		}

		return resultado;
	}

	/*
	 * El método toString debe describir el ESTADO del partido (Equipos que se
	 * enfrentan, los goles realizados, los amonestado y expulsados).
	 */
	public String toString() {
		String resultado = "";
		resultado += "Equipos que se enfrentan: " + this.local + " vs " + this.visitante + "\nlos goles realizados"
				+ cad(goles) + "\nlos amonestado:" + cad(amonestados) + "\nexpulsados" + cad(expulsados);
		return resultado;
	}

	public String cad(Evento[] vec) {
		String recorrer = "";
		for (int i = 0; i < vec.length; i++) {
			if (vec[i] != null) {
				recorrer += "\n" + vec[i];
			}

		}
		return recorrer;
	}

	public EquipoDeFutbol getLocal() {
		return local;
	}

	public EquipoDeFutbol getVisitante() {
		return visitante;
	}

}
