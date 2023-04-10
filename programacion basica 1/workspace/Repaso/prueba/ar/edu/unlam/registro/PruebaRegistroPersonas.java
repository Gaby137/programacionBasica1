package ar.edu.unlam.registro;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaRegistroPersonas {

	@Test
	public void QueSePuedaInstanciarUnaCiudad() {
		String PROVINCIA_ESPERADA = "Cordoba";
		String PROVINCIA_ESPERADA_2= "Buenos Aires";
		Provincia buenosAires = new Provincia("Buenos Aires");
		Ciudad cordobaCapital = new Ciudad(4001, "Cordoba Capital", "Cordoba");
		Ciudad castelar = new Ciudad (1705, "Castelar", buenosAires);
		
		assertEquals(PROVINCIA_ESPERADA, cordobaCapital.getProvincia().getNombre());
		
		buenosAires = null;
		
		assertEquals(PROVINCIA_ESPERADA_2, castelar.getProvincia().getNombre());
	}

	
	@Test
	public void verificarQueSePuedeObtenerElListadoDePersonasDeUnaProvincia() {
		
		//Preparacion
		Persona pablo = new Persona ("Pablo", "Carballo", "Cucha cucha", 200, 1707, "Ramos Mejia", "Buenos Aires");
		Persona walter = new Persona ("walter", )
	}
}
