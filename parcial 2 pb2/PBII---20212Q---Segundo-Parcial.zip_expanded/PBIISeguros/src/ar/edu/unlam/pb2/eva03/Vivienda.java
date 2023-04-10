package ar.edu.unlam.pb2.eva03;

public class Vivienda {
	private String direccion;
	private String ciudad;
	private String localidad;
	private String provincia;
	public Vivienda(String direccion, String ciudad, String localidad, String provincia) {
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.localidad = localidad;
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
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
}
