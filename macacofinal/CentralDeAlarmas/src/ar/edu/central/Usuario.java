package ar.edu.central;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario implements Administrable, Configurable, Activable {

	private Integer dni;
	private String nombre;

	public Usuario(Integer dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
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

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public Boolean agregarAlarma(Alarma alarma, CentralDeAlarma central) {

		return central.getListaAlarmas().add(alarma);
	}

	@Override
	public Boolean agregarUsuario(Usuario usuario, CentralDeAlarma central) {

		return central.getListaUsuariosCentral().add(usuario);
	}

	@Override
	public void agregarUsuarioAUnaAlarma(Integer dniUsuarioAAgregar, Integer idAlarma, String codigoConfiguracionAlarma,
			CentralDeAlarma central) throws CodigoAlarmaIncorrectoException {
		Usuario userEncontrado = null;
		for (Usuario user : central.getListaUsuariosCentral()) {
			if (dniUsuarioAAgregar.equals(user.getDni())) {
				userEncontrado = user;
			}
		}
		Alarma alarmaEncontrada = null;
		for (Alarma alarma : central.getListaAlarmas()) {
			if (idAlarma.equals(alarma.getId())) {
				if (codigoConfiguracionAlarma.equals(alarma.getCodConfig())) {
					alarmaEncontrada = alarma;
				} else {
					throw new CodigoAlarmaIncorrectoException("codigo incorrecto");
				}

			}

		}
		alarmaEncontrada.getListaUsuariosValidos().add(userEncontrado);

		alarmaEncontrada.getListaAccionesRealizadas()
				.add(new Acciones(alarmaEncontrada, userEncontrado, "dd/mm/aa", TipoDeOperacion.CONFIGURACION));

	}

	@Override
	public Boolean agregarSensorAAlarma(Integer idAlarma, String codigoConfiguracionAlarma, Sensor sensor,
			Integer idUsuarioConfigurador, CentralDeAlarma central) throws SensorDuplicadoException {
		Boolean agregado = false;
		Alarma alarmaEncontrada = null;

		for (Alarma alarma : central.getListaAlarmas()) {
			if (idAlarma.equals(alarma.getId()) && codigoConfiguracionAlarma.equals(alarma.getCodConfig())) {

				alarmaEncontrada = alarma;
			}
		}

		for (Usuario mono : alarmaEncontrada.getListaUsuariosValidos()) {
			if (idUsuarioConfigurador.equals(mono.getDni())) {
				if (!alarmaEncontrada.getListaDeSensores().contains(sensor)) {
					alarmaEncontrada.getListaDeSensores().add(sensor);
					alarmaEncontrada.getListaAccionesRealizadas()
							.add(new Acciones(alarmaEncontrada, mono, "dd/mm/aa", TipoDeOperacion.CONFIGURACION));
					agregado = true;

				} else {
					throw new SensorDuplicadoException("sensor duplicado");
				}
			}

		}

		return agregado;
	}

	@Override
	public Boolean activarDesactivarAlarma(Alarma alarma, String codigoActivacionAlarma) {
		Boolean activado = true;
		if (codigoActivacionAlarma.equals(alarma.getCodActiva())) {
			for (Sensor sensores : alarma.getListaDeSensores()) {
				if (sensores.getEstado().equals(false)) {
					activado = false;
				}
			}
		}
		if (activado) {
			alarma.setActivo(true);
		}

		return activado;
	}

	@Override
	public String toString() {
		return "Usuario [dni=" + dni + ", nombre=" + nombre + "]";
	}

	@Override
	public List<Acciones> obtenerListaDeConfigurables(Alarma a) {
		List<Acciones> ac = new ArrayList<>();
		for (Acciones accion : a.getListaAccionesRealizadas()) {
			if (accion.getTipo().equals(TipoDeOperacion.CONFIGURACION)) {
				ac.add(accion);
			}
		}
		return ac;
	}

}