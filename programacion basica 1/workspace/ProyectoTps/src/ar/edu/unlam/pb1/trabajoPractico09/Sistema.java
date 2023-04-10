package ar.edu.unlam.pb1.trabajoPractico09;

public class Sistema {
	private String nombre;
	private Usuario[] listadoUsuarios;
	public static final int TOPE=2;
	public static int posList=0;
	
	public Sistema(String nombre) {
		this.nombre=nombre;
		this.listadoUsuarios=new Usuario[TOPE];
	}
	
	public boolean login(String usuario, String contrasenia) {
		boolean login = false;
		for (int i = 0; i < listadoUsuarios.length; i++) {
			if (usuario.equals(listadoUsuarios[i].getUsuario()) && contrasenia.equals(listadoUsuarios[i].getContrasenia().getContrasena())) {
				login= true;
			} 
			
		}
		return login;
	}
	public boolean agregarUsuario(Usuario u) {
		boolean agregado=false;
		if (posList<TOPE) {
			this.listadoUsuarios[posList] = u;
			posList++;
			agregado=true;
		}
		return agregado;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Usuario[] getListadoUsuarios() {
		return listadoUsuarios;
	}
	public void setListadoUsuarios(Usuario[] listadoUsuarios) {
		this.listadoUsuarios = listadoUsuarios;
	}
}
