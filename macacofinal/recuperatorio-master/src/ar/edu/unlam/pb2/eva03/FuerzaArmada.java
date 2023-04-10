package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {
	private Integer capacidadDeDefensa;

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batalla;

	public FuerzaArmada() {
		super();
		this.convoy = new HashSet<>();
		this.batalla = new HashMap<>();
		this.capacidadDeDefensa = 0;
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		this.convoy.add(vehiculo);

	}

	public Integer getCapacidadDeDefensa() {
		return this.convoy.size();
	}

	public void setCapacidadDeDefensa(Integer capacidadDeDefensa) {
		this.capacidadDeDefensa = capacidadDeDefensa;
	}

	public Set<Vehiculo> getConvoy() {
		return convoy;
	}

	public void setConvoy(Set<Vehiculo> convoy) {
		this.convoy = convoy;
	}

	public Batalla getBatalla(String a) {
		return this.batalla.get(a);
	}

	public void setBatalla(Map<String, Batalla> batalla) {
		this.batalla = batalla;
	}

	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.batalla.put(nombre, new Batalla(latitud, longitud, tipo));

	}

	public boolean enviarALaBatalla(String nombreBatalla, Integer codigoVehiculo)
			throws VehiculoIncompatible, VehiculoInexistente {
		boolean enviado = false;

		Vehiculo encontrado = null;

		for (Vehiculo vehiculo : convoy) {
			if (vehiculo.getCodigo().equals(codigoVehiculo)) {
				encontrado = vehiculo;
			}
		}

		if (encontrado != null) {

			Batalla b1 = this.batalla.get(nombreBatalla);
			switch (b1.getTipo()) {
			case TERRESTRE:
				if (encontrado instanceof Terrestre || encontrado instanceof Anfibio) {
					b1.getVehiculosEnLaBatalla().add(encontrado);
					enviado = true;
				} else {
					throw new VehiculoIncompatible("vehiculo incompatible");
				}
				break;
			case NAVAL:
				if (encontrado instanceof Acuatico || encontrado instanceof HidroAvion || encontrado instanceof Volador
						|| encontrado instanceof Anfibio) {
					b1.getVehiculosEnLaBatalla().add(encontrado);
					enviado = true;
				} else {
					throw new VehiculoIncompatible("vehiculo incompatible");
				}
				break;

			default:
				break;
			}
		} else {
			throw new VehiculoInexistente("no se encontro el vehiculo");
		}

		return enviado;

	}
}
