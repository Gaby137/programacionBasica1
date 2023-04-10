package ar.edu.central;

public class Acciones implements Comparable<Acciones> {

	private Integer id;
	private Alarma alarma;
	private Usuario usuario;
	private String fecha;
	private TipoDeOperacion tipo;
	static Integer CONT = 0;

	public Acciones(Alarma alarma, Usuario usuario, String fecha, TipoDeOperacion tipo) {
		super();
		this.id = CONT++;
		this.alarma = alarma;
		this.usuario = usuario;
		this.fecha = fecha;
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Alarma getAlarma() {
		return alarma;
	}

	public void setAlarma(Alarma alarma) {
		this.alarma = alarma;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public TipoDeOperacion getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeOperacion tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Acciones [id=" + id + ", alarma=" + alarma + ", usuario=" + usuario + ", fecha=" + fecha + ", tipo="
				+ tipo + "]";
	}

	@Override
	public int compareTo(Acciones o) {
		// TODO Auto-generated method stub
		return (int) (this.id - o.getId());
	}
}
