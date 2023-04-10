package ar.edu.transporte;

import java.util.HashSet;
import java.util.Set;

public class Automovil extends Vehiculo {

	private static final int CANT_MAX_PASAJEROS_3 = 3;
	private Set<Persona> listaPasajeros;

	public Automovil(String patente) {
		super(patente);
		this.listaPasajeros = new HashSet<>();
	}

	public Set<Persona> getListaPasajeros() {
		return listaPasajeros;
	}

	public void setListaPasajeros(Set<Persona> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}

	@Override
	public Boolean agregarAcompaniante(Persona acompaniante) throws ExcedeElLimiteDeAcompaniantesException {
		Boolean agregado = false;
		if (this.listaPasajeros.size() < CANT_MAX_PASAJEROS_3) {
			this.listaPasajeros.add(acompaniante);
			agregado = true;
		} else {
			throw new ExcedeElLimiteDeAcompaniantesException("excede la cantidad maxima de pasajeros");
		}
		return agregado;
	}

	@Override
	public Boolean asignarChofer(Persona chofer) {
		Boolean asignado = false;
		if (super.getChofer() == null && (!(this.listaPasajeros == null))) {
			super.setChofer(chofer);
			asignado = true;
		}
		if (super.getChofer() == null && this.listaPasajeros == null) {
			super.setChofer(chofer);
			asignado = true;
		}
		return asignado;
	}

	@Override
	public Boolean cambiarChofer(Persona chofer) throws NoSePuedeCambiarChoferException {
		Boolean cambiado = false;
		if ((!(super.getChofer() == null)) && this.listaPasajeros == null) {
			super.setChofer(chofer);
			cambiado = true;
		} else {
			throw new NoSePuedeCambiarChoferException("no se puede cambiar chofer pq hay alguien en acompañante");
		}
		return cambiado;
	}

}
