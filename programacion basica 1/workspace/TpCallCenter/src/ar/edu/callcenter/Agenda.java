package ar.edu.callcenter;

public class Agenda {
	private Contacto[] lista;
	public static int cont = 0;
	private static final int TAM = 3;

	public Agenda() {
		super();
		this.lista = new Contacto[3];
	}

	public Boolean agregarContacto(Contacto a) {
		boolean ingresado = false;
		if (cont < TAM) {
			lista[cont] = a;
			cont++;
			ingresado = true;
		}
		return ingresado;
	}

	public Contacto[] getLista() {
		return lista;
	}

	public void setLista(Contacto[] lista) {
		this.lista = lista;
	}

	public int buscarAlCandidato() {
		int candidato = -1;
		int nroContactoAleatorio = (int) (Math.random() * (cont));
		System.out.println(nroContactoAleatorio);
		Contacto candidatoPosible = new Contacto();

		if (nroContactoAleatorio >= 0 && nroContactoAleatorio <= 2) {
			candidatoPosible = lista[nroContactoAleatorio];
			if (candidatoPosible.getEsCliente() == false && candidatoPosible.getDeseaSerLlamadoNuevamente() == true) {
				candidato = (int) nroContactoAleatorio;
			}
		}

		return candidato;
	}

//	public Contacto registrarLlamada() {
//		if (buscarAlCandidato().getEsCliente() == true) {
//
//		}
//
//		Contacto registrado = null;
//		return registrado;
//	}

}
