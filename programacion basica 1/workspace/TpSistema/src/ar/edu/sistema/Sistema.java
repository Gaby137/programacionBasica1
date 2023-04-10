package ar.edu.sistema;

public class Sistema {
	private String nombreDelSistema;
	private int cantidadMaximaDeUsuarios;
	private Usuario[] listaDeUsuarios;
	private static int cont = 0;

	public Sistema(String nombreDelSistema, int cantidadMaximaDeUsuarios) {
		this.nombreDelSistema = nombreDelSistema;
		this.listaDeUsuarios = new Usuario[cantidadMaximaDeUsuarios];
	}

	public boolean ingresarUsuario(Usuario nuevoUsuario) {
		boolean ingresado = false;
		for (int i = 0; i < cont; i++) {
			if (nuevoUsuario.equals(listaDeUsuarios[i].getNombreDeUsuario())) {
				cont++;
				ingresado = true;
			}
		}
		return ingresado;
	}

	public void calcularLaCantidadDeUsuariosLogueados() {
	}

	public boolean loguearUsuario(String usuario, String contrasena) {
		boolean logueado = false;
		for (int i = 0; i < listaDeUsuarios.length; i++) {
			if (usuario.equals(listaDeUsuarios[i].getNombreDeUsuario())
					&& contrasena.equals(listaDeUsuarios[i].getContrasena())) {
				logueado = true;
			}
		}

		return logueado;
	}
}
