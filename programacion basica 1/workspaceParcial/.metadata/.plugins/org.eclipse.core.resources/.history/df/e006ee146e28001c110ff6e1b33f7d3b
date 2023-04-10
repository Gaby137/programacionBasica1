package ar.edu.unlam.pb2.smartwatch.deportista;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.edu.unlam.pb2.smartwatch.sensor.Paso;

public class CorredorTest {

	/*
	 * Los deportistas que sean corredores, desean conocer en tiempo real la
	 * siguiente información: - Distancia recorrida (en kilómetros) - Tiempo
	 * transcurrido - Ritmo (minutos que se demora en completar un kilómetro) - Zona
	 * de frecuencia cardíaca actual (*) Obviamente para poder calcular la zona de
	 * frecuencia cardíaca, será necesario conocer los límites de cada zona para el
	 * corredor (ver detalle al pie).
	 */
	@Test
	public void comprobarLaDistanciaDelCorredor() {
		Deportista d1 = new Deportista("corredor", 18, 70.0, 1.70);

		Paso p1 = new Paso(170.0);
		for (int i = 0; i < 100; i++) {
			p1.darPaso();
		}

		Double resultadoEsperado = 0.0687;

		d1.distanciaRecorrida(p1.getCantPasos(), p1.LONGITUD_DE_UN_PASO);

		assertEquals(resultadoEsperado, d1.distanciaRecorrida(p1.getCantPasos(), p1.LONGITUD_DE_UN_PASO), 0.01);
	}

	@Test
	public void comprobarTiempoTranscurrido() {
		Deportista d2 = new Deportista("corredor", 18, 70.0, 1.70);

		Paso p2 = new Paso(170.0);
		for (int i = 0; i < 100; i++) {
			p2.darPaso();
		}

		Double tiempoEsperado = 100.0;
		assertEquals(tiempoEsperado, d2.tiempoTrascurrido(Double.parseDouble(p2.getTiempoSeg().toString())), 0.001);
	}

	@Test
	public void comprobarElRitmoAlCompletarUnKm() {
		Deportista d3 = new Deportista("corredor", 18, 70.0, 1.70);

		Paso p3 = new Paso(170.0);

		for (int i = 0; i < 1000; i++) {
			p3.darUnPulsoDeGPS();

		}
		Double resultadoEsperado = 1456.0407;

		assertEquals(resultadoEsperado, p3.getTiempoSeg(), 0.01);
	}
}
