package ar.edu.central;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Alarma {

	private Integer id;
	private String codActiva;
	private Boolean activo;
	private String codConfig;
	private String nombre;
	private Set<Usuario> listaUsuariosValidos;
	private List<Acciones> listaAccionesRealizadas;
	private Set<Sensor> listaDeSensores;

	public Alarma(Integer id, String codActiva, String codConfig, String nombre) {
		super();
		this.id = id;
		this.codActiva = codActiva;
		this.codConfig = codConfig;
		this.nombre = nombre;
		this.listaUsuariosValidos = new HashSet<>();
		this.listaAccionesRealizadas = new ArrayList<>();
		this.listaDeSensores = new HashSet<>();
		this.activo = false;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodActiva() {
		return codActiva;
	}

	public void setCodActiva(String codActiva) {
		this.codActiva = codActiva;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Usuario> getListaUsuariosValidos() {
		return listaUsuariosValidos;
	}

	public void setListaUsuariosValidos(Set<Usuario> listaUsuariosValidos) {
		this.listaUsuariosValidos = listaUsuariosValidos;
	}

	public List<Acciones> getListaAccionesRealizadas() {
		return listaAccionesRealizadas;
	}

	public void setListaAccionesRealizadas(List<Acciones> listaAccionesRealizadas) {
		this.listaAccionesRealizadas = listaAccionesRealizadas;
	}

	public Set<Sensor> getListaDeSensores() {
		return listaDeSensores;
	}

	public void setListaDeSensores(Set<Sensor> listaDeSensores) {
		this.listaDeSensores = listaDeSensores;
	}

	public String getCodConfig() {
		return codConfig;
	}

	public void setCodConfig(String codConfig) {
		this.codConfig = codConfig;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alarma other = (Alarma) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Alarma [id=" + id + ", codActiva=" + codActiva + ", activo=" + activo + ", codConfig=" + codConfig
				+ ", nombre=" + nombre + ", listaUsuariosValidos=" + listaUsuariosValidos + ", listaAccionesRealizadas="
				+ listaAccionesRealizadas + ", listaDeSensores=" + listaDeSensores + "]";
	}
}
