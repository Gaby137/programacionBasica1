package ar.edu.transporte;

import java.util.HashSet;
import java.util.Set;

public class Autobus extends Vehiculo {

	private Set<Persona> listaDePasajeros;

	public Autobus(String patente) {
		super(patente);
		this.listaDePasajeros = new HashSet<>();
	}

	public Set<Persona> getListaDePasajeros() {
		return listaDePasajeros;
	}

	public void setListaDePasajeros(Set<Persona> listaDePasajeros) {
		this.listaDePasajeros = listaDePasajeros;
	}

	@Override
	public Boolean agregarAcompaniante(Persona acompaniante) {
		Boolean agregado = false;
		if (this.listaDePasajeros.size() < 20) {
			this.listaDePasajeros.add(acompaniante);
			agregado = true;
		}
		return agregado;
	}

	@Override
	public Boolean asignarChofer(Persona chofer) {
		Boolean asignado = false;
		if (super.getChofer() == null && (!(this.listaDePasajeros == null))) {
			super.setChofer(chofer);
			asignado = true;
		}
		if (super.getChofer() == null && this.listaDePasajeros == null) {
			super.setChofer(chofer);
			asignado = true;
		}

		return asignado;
	}

	@Override
	public Boolean cambiarChofer(Persona chofer) throws NoSePuedeCambiarChoferException {
		Boolean cambiado = false;
		if ((!(super.getChofer() == null)) && this.listaDePasajeros == null) {
			super.setChofer(chofer);
			cambiado = true;
		} else {
			throw new NoSePuedeCambiarChoferException("no se puede cambiar chofer pq hay alguien en acompañante");
		}

		return cambiado;
	}

}
