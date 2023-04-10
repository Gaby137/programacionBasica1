package ar.edu.unlam.pb1.parcial2;

public class EquipoDeFutbol {
	private static final int CANT_MAXIMA_JUGADORES = 5;
	private String nombre;
	private Jugador jugadores[];
	private int posicion;

	public EquipoDeFutbol(String nombre) {
		this.nombre = nombre;
		this.jugadores = new Jugador[CANT_MAXIMA_JUGADORES];
		this.posicion = 0;
	}

	/*
	 * La capacidad máxima de un equipo es 5. No se permiten jugadores repetidos (ya
	 * sea el número o nombre del jugador) Se retorna el resultado de la operación
	 */
	public boolean agregarJugador(Jugador nuevo) {
		boolean agregado = false;
		if (!jugadorRepetido(nuevo) && posicion < jugadores.length) {
			jugadores[posicion] = nuevo;
			posicion++;
			agregado = true;
		}
		return agregado;
	}

	public boolean jugadorRepetido(Jugador jugador) {
		boolean repetido = false;
		for (int i = 0; i < posicion; i++) {
			if (jugador.getNombre().equals(jugadores[i].getNombre())
					|| jugador.getNumero() == jugadores[i].getNumero()) {
				repetido = true;
			}
		}
		return repetido;
	}

	/*
	 * Permite buscar un jugador por su numero.
	 * 
	 */
	public Jugador buscar(int numero) {
		Jugador buscar = null;
		for (int i = 0; i < posicion; i++) {
			if (numero == jugadores[i].getNumero()) {
				buscar = jugadores[i];
			}
		}
		return buscar;
	}

	/*
	 * Permite buscar un jugador por su nombre.
	 * 
	 */
	public Jugador buscar(String nombre) {
		Jugador buscar = null;
		for (int i = 0; i < posicion; i++) {
			if (nombre.equals(jugadores[i].getNombre())) {
				buscar = jugadores[i];
			}
		}
		return buscar;
	}

	/*
	 * Calcula la edad promedio del equipo.
	 * 
	 */
	public double calcularLaEdadPromedioDelEquipo() {
		int sumatoria = 0;
		double promedio = 0;
		for (int i = 0; i < posicion; i++) {
			sumatoria += jugadores[i].getEdad();
		}
		promedio = sumatoria / posicion;
		return promedio;
	}

	/*
	 * Calcula el valor del equipo
	 * 
	 */
	public double calcularElValorDelEquipo() {
		int sumatoria = 0;
		double promedio = 0;
		for (int i = 0; i < posicion; i++) {
			sumatoria += jugadores[i].getPrecio();
		}
		promedio = sumatoria / posicion;
		return promedio;
	}

	public String toString() {
		return this.nombre;
	}

}
