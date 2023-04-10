package ar.edu.panini;

import java.util.Objects;

public class Figurita {
	private Integer codigo;
	private String letraGrupoAlQuePertenece;
	private String seleccion;
	private String nombreDelJugador;
	private Integer nroJugador;
	private Double valorDelJugador;
	public Figurita(Integer codigo, String letraGrupoAlQuePertenece, String seleccion, String nombreDelJugador,
Integer nroJugador, Double valorDelJugador) {
		super();
		this.codigo = codigo;
		this.letraGrupoAlQuePertenece = letraGrupoAlQuePertenece;
		this.seleccion = seleccion;
		this.nombreDelJugador = nombreDelJugador;
		this.valorDelJugador = valorDelJugador;
		this.nroJugador = nroJugador;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public String getLetraGrupoAlQuePertenece() {
		return letraGrupoAlQuePertenece;
	}
	public void setLetraGrupoAlQuePertenece(String letraGrupoAlQuePertenece) {
		this.letraGrupoAlQuePertenece = letraGrupoAlQuePertenece;
	}
	public String getSeleccion() {
		return seleccion;
	}
	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
	}
	public String getNombreDelJugador() {
		return nombreDelJugador;
	}
	public void setNombreDelJugador(String nombreDelJugador) {
		this.nombreDelJugador = nombreDelJugador;
	}
	public Double getValorDelJugador() {
		return valorDelJugador;
	}
	public void setValorDelJugador(Double valorDelJugador) {
		this.valorDelJugador = valorDelJugador;
	}
	public Integer getNroJugador() {
		return nroJugador;
	}
	public void setNroJugador(Integer nroJugador) {
		this.nroJugador = nroJugador;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo, nroJugador, seleccion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figurita other = (Figurita) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(nroJugador, other.nroJugador)
				&& Objects.equals(seleccion, other.seleccion);
	}
	
	
}
