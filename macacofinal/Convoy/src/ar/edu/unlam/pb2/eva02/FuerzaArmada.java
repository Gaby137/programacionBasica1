package ar.edu.unlam.pb2.eva02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	private Integer capacidadDeDefensa;

	public FuerzaArmada() {
		super();
		this.convoy = new HashSet<>();
		this.batallas = new HashMap<>();
	}

	public Set<Vehiculo> getConvoy() {
		return convoy;
	}

	public void setConvoy(Set<Vehiculo> convoy) {
		this.convoy = convoy;
	}

	public Map<String, Batalla> getBatallas() {
		return batallas;
	}

	public void setBatallas(Map<String, Batalla> batallas) {
		this.batallas = batallas;
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

	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.batallas.put(nombre, new Batalla(latitud, longitud, tipo));

	}

	public Batalla getBatalla(String nombreMap) {

		return this.batallas.get(nombreMap);
	}

	public Boolean enviarALaBatalla(String nombreMap, Integer codigoVehiculo)
			throws VehiculoIncompatible, VehiculoInexistente {
		Boolean enviado = false;
		Vehiculo v1 = null;
		for (Vehiculo vehiculo : this.convoy) {
			if (vehiculo.getCodigo().equals(codigoVehiculo)) {
				v1 = vehiculo;
			}
		}
		if (v1 != null) {
			switch (this.batallas.get(nombreMap).getTipo()) {
			case TERRESTRE:

				if (v1 instanceof Terrestre) {
					this.batallas.get(nombreMap).getVehiculosEnLaBatalla().add(v1);
					enviado = true;
				} else {
					throw new VehiculoIncompatible("vehiculo incompatible");
				}

				break;
			case NAVAL:

				if (v1 instanceof Acuatico || v1 instanceof Anfibio || v1 instanceof HidroAvion) {
					this.batallas.get(nombreMap).getVehiculosEnLaBatalla().add(v1);
					enviado = true;
				} else {
					throw new VehiculoIncompatible("vehiculo incompatible");
				}

				break;
			default:
				break;
			}
		} else {
			throw new VehiculoInexistente("vehiculo inexistente");
		}

		return enviado;
	}

}
