package trabajoPractico0.ejercicio05;

public class Vuelo {

public Vuelo(String origen, String destino, int cantidadPasajero) {
		
		/* 
		 * El constructor debe generar las acciones necesarias para garantizar el correcto funcionamiento de los objetos de la clase
		 */

	}

public boolean agregarPasajero(Pasajero pasajero) {

		/*
		 * Incorpora un nuevo pasajero a la lista de pasajeros del vuelo. Devuelve true si se pudo agregar o false si la capacidad del vuelo se encuentra completa.
		 */
		return false;
	
	}

	public boolean verificarDisponibilidadAsiento(int fila, int columna) {

		/*
		 * Verifica si el asiento indicado se encuentra disponible.
		 */
		return false;
	}

	public Pasajero buscarPasajero(int dni) {

		/*
		 * Busca un pasajero en la lista de pasajeros a partir del DNI. Si no lo encuentra devuelve null.
		 */
		return null;
	}

	
public boolean asignarAsiento(Pasajero pasajero, int fila, int columna) {

		/*
		 * Asigna el asiento al pasajero recibido por parámetro. Devuelve true si lo pudo asignar o false en caso que el asiento no se encuentre disponible.
		 */
		return false;
	}

	public void ordenarListaDePasajerosPorDNI() {		

		/*
		 * Ordena la lista de pasajeros por DNI.
		 */

	}
	
	public Pasajero[] getPasajeros() {

		/*
		 * Devuelve la lista de pasajeros
		 */
		return null;
	}
	
	public String toString() {
		/*
		 * Devuelve un mapa de los asientos del vuelo indicando por cada uno si se encuentra libre "L" u ocupado "O".
		 */
		return "";
	}

}
