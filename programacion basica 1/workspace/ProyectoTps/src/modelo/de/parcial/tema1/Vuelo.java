package modelo.de.parcial.tema1;

import modelo.de.parcial.tema2.Usuario;

public class Vuelo {
	private final int CANTIDAD_DE_FILAS = 32;
	private final int CANTIDAD_DE_ASIENTOS_POR_FILA = 6;
	private String origen;
	private String destino;
	private Pasajero[] pasajeros;
	private Pasajero[][] asientos;
	private int cantidadDePasajerosRegistrados;
	private int cantidadDeAsientosAsignados;	
	
	public Vuelo(String origen, String destino, int cantidadPasajero) {
		/*
		 * El constructor debe generar las acciones necesarias para garantizar el
		 * correcto funcionamiento de los objetos de la clase
		 */
		this.pasajeros = new Pasajero[cantidadPasajero];
		this.asientos = new Pasajero[CANTIDAD_DE_FILAS] [CANTIDAD_DE_ASIENTOS_POR_FILA];
		this.origen = origen;
		this.destino = destino;
		this.cantidadDePasajerosRegistrados = 0;
		this.cantidadDeAsientosAsignados = 0;
	}

	public boolean agregarPasajero(Pasajero pasajero) {
		/*
		 * Incorpora un nuevo pasajero a la lista de pasajeros del vuelo. Devuelve true
		 * si se pudo agregar o false si la capacidad del vuelo se encuentra completa.
		 */
		boolean incorporado = false;
		
		if (!pasajeroExiste(pasajero) && cantidadDePasajerosRegistrados < pasajeros.length) {
			pasajeros[cantidadDePasajerosRegistrados]=pasajero;
			cantidadDePasajerosRegistrados++;
			incorporado=true;
		}
		
	
		
		return incorporado;
	}
	
	private boolean pasajeroExiste (Pasajero buscado) {
		boolean existe = false;
		for (int i = 0; i < cantidadDePasajerosRegistrados; i++) {
			if (pasajeros[i].getDni()==buscado.getDni()) {
				existe = true;
			}
		}
		return existe;
	}

	
	public boolean verificarDisponibilidadAsiento(int fila, int columna) {
		/*
		 * Verifica si el asiento indicado se encuentra disponible.
		 */
		boolean disponible = false;
		if (asientos[fila][columna] == null) {
			disponible = true;
		}
		
		return disponible;
	}

	public Pasajero buscarPasajero(int dni) {
		/*
		 * Busca un pasajero en la lista de pasajeros a partir del DNI. Si no lo
		 * encuentra devuelve null.
		 */
		Pasajero buscado = null;
		for (int i = 0; i < cantidadDePasajerosRegistrados; i++) {
			if (dni==pasajeros[i].getDni()) {
				buscado = pasajeros[i];
			}
		}
		
		return buscado;
	}

	public boolean asignarAsiento(Pasajero pasajero, int fila, int columna) {
		/*
		 * Asigna el asiento al pasajero recibido por parámetro. Devuelve true si lo
		 * pudo asignar o false en caso que el asiento no se encuentre disponible.
		 */
		boolean asignado = false;
		if (asientos[fila][columna] == null) {
			asientos[fila][columna] = pasajero;
			asignado = true;
		}
		
		return asignado;
	}

	public void ordenarListaDePasajerosPorDNI() {
		/*
		 * Ordena la lista de pasajeros por DNI.
		 */
		Pasajero aux = null;
		for (int i = 1; i <= pasajeros.length; i++) {
			for (int j = 0; j < pasajeros.length-1; j++) {
				if (pasajeros[j].getDni() > pasajeros[j+1].getDni()) {
					aux = pasajeros[j+1];
					pasajeros[j+1] = pasajeros [j];
					pasajeros[j] = aux;
				}
			}
		}
	}

	public Pasajero[] getPasajeros() {
		/*
		 * Devuelve la lista de pasajeros
		 */
		
		return pasajeros;
	}

	/*
	 * Devuelve un mapa de los asientos del vuelo indicando por cada uno si se
	 * encuentra libre "L" u ocupado "O".
	 */
	public String toString() {
		
		String cad ="";
		for (int i = 0; i < CANTIDAD_DE_FILAS; i++) {
			for (int j = 0; j < CANTIDAD_DE_ASIENTOS_POR_FILA; j++) {
				if (asientos[i][j]!=null) {
					cad += "  O  ";
				}else {
					cad += "  L  ";
				}
			}
			cad +='\n';
		}
		return cad;
	}
}
