package ar.edu.unlam.pb2.smartwatch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

	public class DeportistaTest {

	@Test
	public void queSePuedaCalcularDistanciaEnMetros() {
		
		//preparacion 
		Deportista usuario = new Deportista();
		
		final Integer  PASOS_DE_PRUEBA=10;
		
		//valor esperado
		
		final Double RESULTADO_ESPERADO=6.87;
		
		
		//ejecucion 
		
		Double valorObtenido= usuario.distanciaRecorrida(PASOS_DE_PRUEBA);
		
		//validacion 
		
		assertEquals(RESULTADO_ESPERADO, valorObtenido,0.01);
		
		
	}

}
