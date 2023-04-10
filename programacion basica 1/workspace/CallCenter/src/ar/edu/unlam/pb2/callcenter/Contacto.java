package ar.edu.unlam.pb2.callcenter;

public class Contacto {

	private String nombreYApellido;
	private String celular;
	private String email;
	private String direccion;
	private int codigoPostal;
	private String localidad;
	private String provincia;

	public Contacto(String nombreYApellido, String celular, String email, String direccion, int codigoPostal,
			String localidad, String provincia) {
		this.nombreYApellido = nombreYApellido   ;
		this.celular         = celular           ;
		this.email           = email             ;
		this.direccion       = direccion         ;
		this.codigoPostal    = codigoPostal      ;
		this.localidad       = localidad         ;
		this.provincia       = provincia         ;
		
	}

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
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
