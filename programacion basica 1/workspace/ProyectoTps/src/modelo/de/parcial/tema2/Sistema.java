package modelo.de.parcial.tema2;

public class Sistema {
	private String nombre;
	private Usuario usuarios[];
	private int cantidadDeUsuariosRegistrados;
	
	public Sistema() {
		this.usuarios = new Usuario[100];
	}

	public Sistema(String nombre, int cantidadDeUsuarios) {
		super();
		this.nombre = nombre;
		this.usuarios = new Usuario[cantidadDeUsuarios];
		this.cantidadDeUsuariosRegistrados=0;
	}
	
	public boolean ingresarUsuarios(Usuario nuevo) {
		boolean sePudoIngresar = false;
		if (!elUsuarioExiste(nuevo) && cantidadDeUsuariosRegistrados < usuarios.length && nuevo.laContraseñaEsValida(nuevo.getContrasena().getValor())) {
			usuarios[cantidadDeUsuariosRegistrados++]=nuevo;
			sePudoIngresar=true;
		}
		return sePudoIngresar;
	}
	
	private boolean elUsuarioExiste (Usuario buscado) {
		boolean existe = false;
		for (int i = 0; i < cantidadDeUsuariosRegistrados; i++) {
			if (usuarios[i].getUsuario().equals(buscado.getUsuario())) {
				existe = true;
			}
		}
		return existe;
	}
	public int calcularCantidadDeUsuariosMenores() {
		int cantidadDeUsuariosMenores=0;
		
		for (int i = 0; i < cantidadDeUsuariosRegistrados; i++) {
			if (!usuarios[i].esMayorDeEdad()) {
				cantidadDeUsuariosMenores++;
			}
		
		}
		return cantidadDeUsuariosMenores;
	}
	public String getNombre() {
		return nombre;
	}

	public int calcularCantidadDeMayores() {
		int cantidadDeUsuariosMayores=0;
		
		for (int i = 0; i < cantidadDeUsuariosRegistrados; i++) {
			if (usuarios[i].esMayorDeEdad()) {
				cantidadDeUsuariosMayores++;
			}
		
		}
		return cantidadDeUsuariosMayores;
		
	}
	public float calcularEdadPromedio() {
		int acumuladorDeEdad=0;
		float promedio=0;
		
		for (int i = 0; i < cantidadDeUsuariosRegistrados; i++) {
			acumuladorDeEdad+=usuarios[i].getEdad();
		
		}
		return acumuladorDeEdad/cantidadDeUsuariosRegistrados;
	}

	public boolean loguearUsuario (String usuario, String contrasenia) {
		boolean sePuedeLoguear = false;
		for (int i = 0; i < cantidadDeUsuariosRegistrados; i++) {
			if (usuarios[i].getUsuario().equals(usuario) && usuarios[i].getContrasena().getValor().equals(contrasenia)) {
				sePuedeLoguear = true;	
			}
			
		}
		return sePuedeLoguear;
	}
	
	public Usuario[] listarUsuarios() {
		Usuario usuariosOrdenados[] = usuarios;
		Usuario auxiliar;
		for (int i = 1; i < cantidadDeUsuariosRegistrados; i++) {
			for (int j = 0; j < cantidadDeUsuariosRegistrados-1; j++) {
				if (usuariosOrdenados[j].getUsuario().compareTo(usuariosOrdenados[j+1].getUsuario()) < 0) {
					auxiliar = usuariosOrdenados[j+1];
					usuariosOrdenados[j+1] = usuariosOrdenados[j];
					usuariosOrdenados[j] = auxiliar;
				}
			}
		}
		
		return usuariosOrdenados;
	}
	
	 
}
