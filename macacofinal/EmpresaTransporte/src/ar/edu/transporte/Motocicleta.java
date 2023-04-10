package ar.edu.transporte;

public class Motocicleta extends Vehiculo {

	private Persona pasajero;

	public Motocicleta(String patente) {
		super(patente);
		this.pasajero = null;
	}

	public Persona getPasajero() {
		return pasajero;
	}

	public void setPasajero(Persona pasajero) {
		this.pasajero = pasajero;
	}

	@Override
	public Boolean agregarAcompaniante(Persona acompaniante) {
		Boolean agregado = false;
		if (this.pasajero == null) {
			this.pasajero = acompaniante;
			agregado = true;
		}
		return agregado;
	}

	@Override
	public Boolean asignarChofer(Persona chofer) {
		Boolean asignado = false;

		if (super.getChofer() == null && (!(this.pasajero == null))) {
			super.setChofer(chofer);
			asignado = true;
		}
		if (super.getChofer() == null && this.pasajero == null) {
			super.setChofer(chofer);
			asignado = true;
		}
		return asignado;
	}

	@Override
	public Boolean cambiarChofer(Persona chofer) throws NoSePuedeCambiarChoferException {
		Boolean cambiado = false;
		if ((!(super.getChofer() == null)) && this.pasajero == null) {
			super.setChofer(chofer);
			cambiado = true;
		} else {
			throw new NoSePuedeCambiarChoferException("no se puede cambiar chofer pq hay alguien en acompañante");
		}
		return cambiado;
	}

}
