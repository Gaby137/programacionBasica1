package ar.edu.unlam.pb2.smartwatch.deportista;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.smartwatch.sensor.Paso;

public class TestCaminador {
	
	@Test
	public void queSePuedaInstanciarUnCaminador() {

		final String NOMBRE_ESPERADO = "Powell";
		final Integer EDAD_ESPERADA = 35;
		final Double PESO_ESPERADO = 75.80;
		final Double ALTURA_ESPERADA = 177.4;

		Caminador caminador = new Caminador(NOMBRE_ESPERADO, EDAD_ESPERADA, PESO_ESPERADO, ALTURA_ESPERADA);

		assertEquals(NOMBRE_ESPERADO, caminador.getNombre());
		assertEquals(EDAD_ESPERADA, caminador.getEdadActual(), 0.0);
		assertEquals(PESO_ESPERADO, caminador.getPesoActual(), 0.0);
		assertEquals(ALTURA_ESPERADA, caminador.getAlturaActual(), 0.0);

	}

	@Test
	public void queSePuedaCalcularDistanciaEnMetrosNadador() {

		// preparacion
		Caminador usuario = new Caminador();
		Paso sensorDePasos = new Paso(100);
		
		final Integer PASOS_DE_PRUEBA = 1850;
		
		for (int i = 0; i < PASOS_DE_PRUEBA; i++) {
			sensorDePasos.darPaso();
		}
		// valor esperado

		final Double RESULTADO_ESPERADO = 1.27; //en KM 

		// ejecucion

		Double valorObtenido = usuario.distanciaRecorrida(sensorDePasos.getCantPasos(), Paso.LONGITUD_DE_UN_PASO);

		// validacion

		assertEquals(RESULTADO_ESPERADO, valorObtenido, 0.01);

	}
	
	@Test 
	public void queSePuedaCalcularTiempoTranscurridoNadador() {
		// preparacion
				Caminador usuario = new Caminador();

				final Integer PASOS_DE_PRUEBA = 4500;

				Paso sensorDePasos = new Paso(100);
				for (int i = 0; i < PASOS_DE_PRUEBA; i++) {
					sensorDePasos.darPaso();
				}
		// valor esperado distancia en metros

				final Double RESULTADO_ESPERADO =1.25;

		// ejecucion

				Double valorObtenido = usuario.tiempoTrascurrido(sensorDePasos.getCantPasos());

		// validacion

				assertEquals(RESULTADO_ESPERADO, valorObtenido, 0.01);
	}

}

