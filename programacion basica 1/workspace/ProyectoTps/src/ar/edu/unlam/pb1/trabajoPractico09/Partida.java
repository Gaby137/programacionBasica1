package ar.edu.unlam.pb1.trabajoPractico09;

public class Partida {
	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador turno;
	private Jugador ganador;
	private Jugador perdedor;
	
	public Partida(Jugador j1, Jugador j2) {
		this.jugador1=j1;
		this.jugador2=j2;
		this.turno=j1;
		this.ganador=null;
		this.perdedor=null;
	}

	public Jugador getJugador1() {
		return jugador1;
	}

	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}

	public Jugador getJugador2() {
		return jugador2;
	}

	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}

	public Jugador getTurno() {
		return turno;
	}

	public void setTurno(Jugador turno) {
		this.turno = turno;
	}

	public Jugador getGanador() {
		return ganador;
	}

	public void setGanador(Jugador ganador) {
		this.ganador = ganador;
	}

	public Jugador getPerdedor() {
		return perdedor;
	}

	public void setPerdedor(Jugador perdedor) {
		this.perdedor = perdedor;
	}
	
}
