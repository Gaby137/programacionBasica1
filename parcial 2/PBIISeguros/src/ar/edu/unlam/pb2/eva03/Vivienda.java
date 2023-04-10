package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public class Vivienda {
	private String direccion;
	private String ciudad;
	private String partido;
	private String provincia;
	public Vivienda(String direccion, String ciudad, String partido, String provincia) {
		
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.partido = partido;
		this.provincia = provincia;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ciudad, direccion, partido, provincia);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vivienda other = (Vivienda) obj;
		return Objects.equals(ciudad, other.ciudad) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(partido, other.partido) && Objects.equals(provincia, other.provincia);
	}

	
}
