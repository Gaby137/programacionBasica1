package ar.edu.unlam.pb2.estacionamiento;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEstacionamiento {

	@Test
	public void queAlCrearUnEstacionamientoElMismoNoContengaNingunAuto() {
		
		//preparacion
		Integer cantidadDeAutosMaximos=5;
		Estacionamiento estacionamiento = new Estacionamiento(cantidadDeAutosMaximos);
		Integer valorEsperado=0;
		//Ejecucion
		Integer cantidadDeAutosEnElEstacionamiento=estacionamiento.obtenerCantidadDeAutosEstacionados();
	
		//comprobacion
		
			//em test da verde cuando la cantidadDeAutosEnElEstacionamiento sea 0
		assertEquals(valorEsperado,cantidadDeAutosEnElEstacionamiento);
		
	}
	@Test
	public void queSePuedaAgregarUnAutoAlEstacionamiento () {
		//preparacion
		Integer cantidadDeAutosMaximos=5;
		Estacionamiento estacionamiento = new Estacionamiento (cantidadDeAutosMaximos);
		Auto auto = new Auto();
		
		//Ejecucion
			Boolean valorObtenido =
	}

}
