package ar.edu.futsal;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private List<Jugador> listaJugadores;
	private List<Evento> goles;
	private List<Evento> amonestado;
	private List<Evento> expulsados;

	public Equipo() {
		super();
		this.listaJugadores = new ArrayList<>();
		this.goles = new ArrayList<>();
		this.amonestado = new ArrayList<>();
		this.expulsados = new ArrayList<>();
	}

	public Boolean agregarJugador() {

	}

	public Double valorDelEquipo() {

	}

	public Double edadPromedio() {

	}

	public List<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(List<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	public List<Evento> getGoles() {
		return goles;
	}

	public void setGoles(List<Evento> goles) {
		this.goles = goles;
	}

	public List<Evento> getAmonestado() {
		return amonestado;
	}

	public void setAmonestado(List<Evento> amonestado) {
		this.amonestado = amonestado;
	}

	public List<Evento> getExpulsados() {
		return expulsados;
	}

	public void setExpulsados(List<Evento> expulsados) {
		this.expulsados = expulsados;
	}

}
