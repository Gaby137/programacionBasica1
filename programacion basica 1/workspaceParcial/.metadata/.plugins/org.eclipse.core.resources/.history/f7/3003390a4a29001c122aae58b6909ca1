package ar.edu.unlam.pb2.smartwatch.deportista;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unlam.pb2.smartwatch.sensor.Paso;
import ar.edu.unlam.pb2.smartwatch.sensor.Pedaleo;

public class DeportistaTest {

	@Test
	public void queSePuedaCalcularDistanciaEnMetros() {

		// preparacion
		Deportista usuario = new Deportista();

		final Integer PASOS_DE_PRUEBA = 10;

		Paso senorDePasos = new Paso(100.0);
		for (int i = 0; i < PASOS_DE_PRUEBA; i++) {
			senorDePasos.darPaso();
		}
		// valor esperado distancia en metros

		final Double RESULTADO_ESPERADO = 6.87;

		// ejecucion

		Double valorObtenido = usuario.distanciaRecorrida(senorDePasos.getCantPasos(), Paso.LONGITUD_DE_UN_PASO);

		// validacion

		assertEquals(RESULTADO_ESPERADO, valorObtenido, 0.01);

	}

	@Test
	public void queSePuedaInstanciarUnCiclista() {

		final String NOMBRE_ESPERADO = "Lance";
		final Integer EDAD_ESPERADA = 35;
		final Double PESO_ESPERADO = 75.80;
		final Double ALTURA_ESPERADA = 177.4;

		Ciclista ciclista = new Ciclista(NOMBRE_ESPERADO, EDAD_ESPERADA, PESO_ESPERADO, ALTURA_ESPERADA);

		assertEquals(NOMBRE_ESPERADO, ciclista.getNombre());
		assertEquals(EDAD_ESPERADA, ciclista.getEdadActual(), 0.0);
		assertEquals(PESO_ESPERADO, ciclista.getPesoActual(), 0.0);
		assertEquals(ALTURA_ESPERADA, ciclista.getAlturaActual(), 0.0);

	}

	@Test
	public void queSePuedaInstanciarUnNadador() {

		final String NOMBRE_ESPERADO = "Phelps";
		final Integer EDAD_ESPERADA = 30;
		final Double PESO_ESPERADO = 75.80;
		final Double ALTURA_ESPERADA = 177.4;

		Nadador nadador = new Nadador(NOMBRE_ESPERADO, EDAD_ESPERADA, PESO_ESPERADO, ALTURA_ESPERADA);

		assertEquals(NOMBRE_ESPERADO, nadador.getNombre());
		assertEquals(EDAD_ESPERADA, nadador.getEdadActual(), 0.0);
		assertEquals(PESO_ESPERADO, nadador.getPesoActual(), 0.0);
		assertEquals(ALTURA_ESPERADA, nadador.getAlturaActual(), 0.0);

	}

	@Test
	public void queSePuedaInstanciarUnRunner() {

		final String NOMBRE_ESPERADO = "Bolt";
		final Integer EDAD_ESPERADA = 35;
		final Double PESO_ESPERADO = 75.80;
		final Double ALTURA_ESPERADA = 177.4;

		Runner runner = new Runner(NOMBRE_ESPERADO, EDAD_ESPERADA, PESO_ESPERADO, ALTURA_ESPERADA);

		assertEquals(NOMBRE_ESPERADO, runner.getNombre());
		assertEquals(EDAD_ESPERADA, runner.getEdadActual(), 0.0);
		assertEquals(PESO_ESPERADO, runner.getPesoActual(), 0.0);
		assertEquals(ALTURA_ESPERADA, runner.getAlturaActual(), 0.0);

	}

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
	public void queSePuedaConocerLaDistanciaRecorridaDeUnCiclista() {
		final Integer PEDALEOS = 20;
		final Double PEDALEOS_KM = Pedaleo.LONGITUD_DE_PEDALEO_PROM / 1000;
		final Double VALOR_ESPERADO = 0.0178;

		Ciclista ciclista = new Ciclista("Lance", 35, 75.80, 177.4);

		Pedaleo p1 = new Pedaleo(100);

		for (int i = 0; i < PEDALEOS; i++) {
			p1.darUnPedaleo();
		}
		Double valorObtenido = ciclista.distanciaRecorrida(p1.getCantDePedaleo(), PEDALEOS_KM);

		assertEquals(VALOR_ESPERADO, valorObtenido);
	}

}
