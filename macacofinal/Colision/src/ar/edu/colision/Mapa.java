package ar.edu.colision;

import java.util.ArrayList;
import java.util.List;

public class Mapa {

	private String nombre;
	private List<Vehiculo> listaDeVehiculos;

	public Mapa(String nombre) {
		super();
		this.nombre = nombre;
		this.listaDeVehiculos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Vehiculo> getListaDeVehiculos() {
		return listaDeVehiculos;
	}

	public void setListaDeVehiculos(List<Vehiculo> listaDeVehiculos) {
		this.listaDeVehiculos = listaDeVehiculos;
	}

	public Integer getCantidadDeVehiculos() {
		return this.listaDeVehiculos.size();
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		this.listaDeVehiculos.add(vehiculo);

	}

	public Boolean hayCoalicion() throws ColitionException {
		Boolean colisiono = false;
		Vehiculo v1 = null;
		for (int i = 0; i < this.listaDeVehiculos.size(); i++) {
			for (int j = i + 1; j < this.listaDeVehiculos.size(); j++) {
				v1 = this.listaDeVehiculos.get(j);
				if (this.listaDeVehiculos.get(i).getLatitud().equals(v1.getLatitud())
						&& this.listaDeVehiculos.get(i).getLongitud().equals(v1.getLongitud())) {
					colisiono = true;
					throw new ColitionException("hubo colision");

				}
			}
		}
		return colisiono;
	}

}
