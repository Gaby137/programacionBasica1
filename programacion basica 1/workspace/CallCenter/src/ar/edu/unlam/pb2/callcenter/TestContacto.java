package ar.edu.unlam.pb2.callcenter;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestContacto {

	@Test
	public void test() {
		//Preparacion
		
		// Datos de entrada
		String nombreYApellido = "Matias Tonello", celular = "+54 9 22 2345 2345", email = "MatiasTonello@unlam.com.ar", direccion = "calle 123", localidad = "Haedo", provincia = "Buenos Aires";
		Integer codigoPostal = 1765;
		// valores esperados
		
		//Ejecucion
		Contacto nuevoContacto = new Contacto(nombreYApellido, celular, email, direccion, codigoPostal, localidad, provincia);
		//Validacion
		assertEquals("MatiasTonello@unlam.com.ar",nuevoContacto.getEmail());
		
	}

}
