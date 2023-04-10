package modelo.de.parcial.tema1;

public class PruebaVuelo {

	public static void main(String[] args) {
		Vuelo vuelo1 = new Vuelo("BsAs", "maiame", 7);
		
		vuelo1.agregarPasajero(new Pasajero(123, "pepe", "argento"));
		vuelo1.agregarPasajero(new Pasajero(321, "wea", "weas"));
		vuelo1.agregarPasajero(new Pasajero(254, "enzo", "jenry"));
		vuelo1.agregarPasajero(new Pasajero(856, "facundo", "perez"));
		vuelo1.agregarPasajero(new Pasajero(964, "javier", "lopez"));
		vuelo1.agregarPasajero(new Pasajero(931, "federico", "mendez"));
		vuelo1.agregarPasajero(new Pasajero(942, "weon", "aweonado"));
		
		System.out.println(vuelo1);
			
	}

}
