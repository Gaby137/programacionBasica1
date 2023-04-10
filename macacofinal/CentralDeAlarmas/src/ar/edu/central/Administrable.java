package ar.edu.central;

public interface Administrable {
	public Boolean agregarAlarma(Alarma alarma, CentralDeAlarma central);

	public Boolean agregarUsuario(Usuario usuario, CentralDeAlarma central);

}
