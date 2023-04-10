package ar.edu.banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private Integer dni;
	private String nombre;
	private List<Cuenta> listaDeCuentas;

	public Cliente(Integer dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.listaDeCuentas = new ArrayList<>();
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cuenta> getListaDeCuentas() {
		return listaDeCuentas;
	}

	public void setListaDeCuentas(List<Cuenta> listaDeCuentas) {
		this.listaDeCuentas = listaDeCuentas;
	}
}
