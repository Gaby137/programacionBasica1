package ar.edu.central;

import java.util.List;

public interface Configurable {
	public List<Acciones> obtenerListaDeConfigurables(Alarma a);

	public void agregarUsuarioAUnaAlarma(Integer dniUsuarioAAgregar, Integer idAlarma, String codigoConfiguracionAlarma,
			CentralDeAlarma central) throws CodigoAlarmaIncorrectoException;

	public Boolean agregarSensorAAlarma(Integer idAlarma, String codigoConfiguracionAlarma, Sensor sensor,
			Integer idUsuarioConfigurador, CentralDeAlarma central) throws SensorDuplicadoException;
}
