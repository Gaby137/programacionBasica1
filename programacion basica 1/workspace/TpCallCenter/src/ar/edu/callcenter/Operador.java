package ar.edu.callcenter;

public class Operador {
	private static final int TAM = 3;
	private static int cont = 0;
	private Integer legajo;
	private String nombreYApellido;
	private Llamada[] llamadas;

	public Operador(Integer legajo, String nombreYApellido) {
		this.legajo = legajo;
		this.nombreYApellido = nombreYApellido;
		this.llamadas = new Llamada[TAM];
	}

	public boolean registrarLlamada(Contacto a) {
		boolean registrado = false;
		if (a.getEsCliente() == false) {
			a.setEsCliente(true);
			a.setDeseaSerLlamadoNuevamente(false);
			this.llamadas[cont] = new Llamada(a, "");
			registrado = true;
		} else {
			a.setDeseaSerLlamadoNuevamente(false);
			this.llamadas[cont] = new Llamada(a, "llamarlo en un futuro");

		}
		return registrado;
	}

}
