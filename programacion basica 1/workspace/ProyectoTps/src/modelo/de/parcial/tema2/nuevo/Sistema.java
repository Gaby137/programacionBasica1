package modelo.de.parcial.tema2.nuevo;

public class Sistema {

	private String nombreDelSistema;
	private Usuario usuarios[];
	private int posicion;

	public Sistema(String nombreDelSistema, int cantidadDeUsuarios) {
		this.nombreDelSistema = nombreDelSistema;
		this.usuarios = new Usuario[cantidadDeUsuarios];
		this.posicion = 0;
	}

	public Usuario[] getUsuarios() {
		return usuarios;
	}

	public boolean ingresarUsuario(Usuario nuevoUsuario) {
		boolean ingreso = false;

		if (!usuarioRepetido(nuevoUsuario) && posicion < usuarios.length) {

			usuarios[posicion] = nuevoUsuario;
			posicion++;
			ingreso = true;

		}
		return ingreso;
	}

	public boolean usuarioRepetido(Usuario usuario) {
		boolean repetido = false;
		for (int i = 0; i < posicion; i++) {
			if (usuario.getUsuario() == usuarios[i].getUsuario()) {
				repetido = true;
			}
		}
		return repetido;
	}

	public int calcularCantidadDeUsuariosMenores() {
		int cantidadDeUsuariosMenores = 0;

		for (int i = 0; i < posicion; i++) {
			if (usuarios[i].getEdad() < 18) {
				cantidadDeUsuariosMenores++;
			}
		}
		return cantidadDeUsuariosMenores;
	}

	public int calcularCantidadDeMayores() {
		int cantidadDeUsuariosMayores = 0;

		for (int i = 0; i < posicion; i++) {
			if (usuarios[i].getEdad() >= 18) {
				cantidadDeUsuariosMayores++;
			}
		}
		return cantidadDeUsuariosMayores;
	}

	public int calcularEdadPromedio() {
		int contador = 0;
		for (int i = 0; i < posicion; i++) {
			contador += usuarios[i].getEdad();
		}
		return contador / posicion;
	}

	public boolean loguearUsuario(String usuario, String contrasena) {
		boolean logueado = false;
		for (int i = 0; i < posicion; i++) {
			if (usuario.equals(usuarios[i].getUsuario()) && contrasena.equals(usuarios[i].getContrasena())) {
				logueado = true;
			}
		}
		return logueado;
	}

	public Usuario[] listarUsuarios() {
		Usuario usuariosOrdenados[] = usuarios;
		Usuario auxiliar;
		for (int i = 1; i < posicion; i++) {
			for (int j = 0; j < posicion - 1; j++) {
				if (usuariosOrdenados[j].getUsuario().compareTo(usuariosOrdenados[j + 1].getUsuario()) > 0) {
					auxiliar = usuariosOrdenados[j + 1];
					usuariosOrdenados[j + 1] = usuariosOrdenados[j];
					usuariosOrdenados[j] = auxiliar;
				}
			}
		}
		return usuarios;
	}

	public boolean eliminarUsuario(String usuario) {
		boolean eliminado = false;

		for (int i = 0; i < posicion; i++) {
			if (usuario.equals(usuarios[i].getUsuario())) {
				usuarios[i] = null;
				this.posicion--;
				ordenarConNulls();
				eliminado = true;
			}
		}

		return eliminado;
	}

	public void ordenarConNulls() {
		Usuario aux = null;
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] == null && i + 1 < usuarios.length) {
				aux = usuarios[i + 1];
				usuarios[i] = aux;
				usuarios[i + 1] = null;

			}
		}
	}

}
