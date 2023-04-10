package ar.edu.panini;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaPanini {

	@Test
	public void queSePuedaCrearUnaFigurita() {
		//instanciacion
		Figurita f1 = new Figurita(1, "A", "Argentina", "Messi", 10, 9999.0);
		
		//ejecucion
		
		
		//verificacion
		
		
	}
	@Test
	public void queSePuedaCrearUnAdministrador() {
		//instanciacion
		Usuario admin = new Administrador(1, "pepe");		
		//ejecucion
		
		
		//verificacion
		
		
	}
	@Test
	public void queSePuedaCrearUnUsuarioFinal() {
		//instanciacion
		Usuario userFinal = new Final(1, "pepe");		
		//ejecucion
		
		
		//verificacion
		
		
	}
	@Test
	public void queUnAdministradorPuedaAgregarUnaFigurita() throws CodigoExistente {
		//instanciacion
		Usuario admin = new Administrador(1, "pepe");	
		Figurita f1 = new Figurita(1, "A", "Argentina", "Messi", 10, 9999.0);
		//ejecucion
		
		admin.agregarFigurita(f1);
		//verificacion
		assertEquals(1, ((Administrador) admin).getListaDeAltaDeFiguritas().size());
		
	}
	@Test
	public void queUnUsuarioFinalPuedaAgregarUnaFigurita() throws CodigoExistente {
		//instanciacion
		Usuario userFinal = new Final(1, "pepe");	
		Figurita f1 = new Figurita(1, "A", "Argentina", "Messi", 10, 9999.0);
		//ejecucion
		
		userFinal.agregarFigurita(f1);
		//verificacion
		assertEquals(1, ((Final) userFinal).getStock().size());
		
	}
	@Test
	public void queLasFiguritasAgregadasDeFormaDesordenadaQuedenOrdenadas() throws CodigoExistente {
		//instanciacion
		Usuario admin = new Final(1, "pepe");	
		Figurita f1 = new Figurita(1, "A", "Argentina", "Messi", 10, 9999.0);
		//ejecucion
		
		admin.agregarFigurita(f1);
		//verificacion
		assertEquals(1, ((Final) admin).getStock().size());
		
	}
	@Test (expected = CodigoExistente.class)
	public void queUnAdministradorNoPuedaAgregarUnaFiguritaExistente() throws CodigoExistente {
		//instanciacion
		Usuario admin = new Administrador(1, "pepe");	
		Figurita f1 = new Figurita(1, "A", "Argentina", "Messi", 10, 9999.0);
		Figurita f2 = new Figurita(1, "A", "Argentina", "Messi", 10, 9999.9);
		//ejecucion
		
		admin.agregarFigurita(f1);
		admin.agregarFigurita(f2);
		//verificacion
		assertEquals(1, ((Administrador) admin).getListaDeAltaDeFiguritas().size());
		
	}
	
	@Test
	public void queUnUsuarioFinalSiPuedaAgregarFiguritasExistentes() throws CodigoExistente {
		//instanciacion
		Usuario userFinal = new Final(1, "pepe");	
		Figurita f1 = new Figurita(1, "A", "Argentina", "Messi", 10, 9999.0);
		Figurita f2 = new Figurita(1, "A", "Argentina", "Messi", 10, 9999.9);
		//ejecucion
		
		userFinal.agregarFigurita(f1);
		userFinal.agregarFigurita(f2);
		//verificacion
		assertEquals(2, ((Final) userFinal).getStock().size());
		
	}
	@Test
	public void queUnUsuarioFinalPuedaPegarUnaFigurita() throws CodigoExistente, FiguritaRepetida {
		//instanciacion
		Usuario userFinal = new Final(1, "pepe");	
		Figurita f1 = new Figurita(1, "A", "Argentina", "Messi", 10, 9999.0);
		Figurita f2 = new Figurita(1, "A", "Argentina", "Messi", 10, 9999.9);
		//ejecucion
		
		userFinal.agregarFigurita(f1);
		userFinal.agregarFigurita(f2);
		
		((Final) userFinal).pegarFigurita(f1);
		//verificacion
		assertEquals(1, ((Final) userFinal).getStock().size());
		assertEquals(1, ((Final) userFinal).getAlbum().size());
		
	}
	@Test(expected = FiguritaRepetida.class)
	public void queUnUsuarioFinalNoPuedaPegarUnaFiguritaRepetida() throws CodigoExistente, FiguritaRepetida {
		//instanciacion
		Usuario userFinal = new Final(1, "pepe");	
		Figurita f1 = new Figurita(1, "A", "Argentina", "Messi", 10, 9999.0);
		Figurita f2 = new Figurita(1, "A", "Argentina", "Messi", 10, 9999.9);
		//ejecucion
		
		userFinal.agregarFigurita(f1);
		userFinal.agregarFigurita(f2);
		
		((Final) userFinal).pegarFigurita(f1);
		((Final) userFinal).pegarFigurita(f2);
		//verificacion
		assertEquals(1, ((Final) userFinal).getStock().size());
		assertEquals(1, ((Final) userFinal).getAlbum().size());
		
	}
	@Test
	public void queSePuedaRealizarElIntercambioDeFiguritasEntreDosUsuariosFinales() throws CodigoExistente, FiguritaRepetida, FiguritaNoDisponible {
		//instanciacion
		Panini panini = new Panini("panini");
		Usuario userFinal = new Final(1, "pepe");	
		Usuario userFinal2 = new Final(2, "pepe");	
		Figurita f1 = new Figurita(1, "A", "Argentina", "Messi", 10, 9999.0);
		Figurita f2 = new Figurita(1, "A", "Argentina", "Messi", 10, 9999.9);
		//ejecucion
		panini.agregarUsuario(userFinal);
		panini.agregarUsuario(userFinal2);
		userFinal.agregarFigurita(f1);

		
		//verificacion
		assertTrue(panini.intercambioDeFiguritas((Final)userFinal, f1, (Final)userFinal2));
		
	}
	@Test(expected = FiguritaNoDisponible.class)
	public void queNoSePuedaIntercambiarUnaFiguritaDeUnUsuarioQueNoLaTenga() throws CodigoExistente, FiguritaRepetida, FiguritaNoDisponible {
		//instanciacion
		Panini panini = new Panini("panini");
		Usuario userFinal = new Final(1, "pepe");	
		Usuario userFinal2 = new Final(2, "pepe");	
		Figurita f1 = new Figurita(1, "A", "Argentina", "Messi", 10, 9999.0);
		Figurita f2 = new Figurita(1, "A", "Argentina", "Messi", 10, 9999.9);
		//ejecucion
		panini.agregarUsuario(userFinal);
		panini.agregarUsuario(userFinal2);
		

		
		//verificacion
		panini.intercambioDeFiguritas((Final)userFinal, f1, (Final)userFinal2);
		
	}
	@Test(expected = FiguritaNoDisponible.class)
	public void queNoSePuedaIntercambiarUnaFiguritaDeUnUsuarioQueYaLaHayaPegado() throws CodigoExistente, FiguritaRepetida, FiguritaNoDisponible {
		//instanciacion
		Panini panini = new Panini("panini");
		Usuario userFinal = new Final(1, "pepe");	
		Usuario userFinal2 = new Final(2, "pepe");	
		Figurita f1 = new Figurita(1, "A", "Argentina", "Messi", 10, 9999.0);
		//ejecucion
		panini.agregarUsuario(userFinal);
		panini.agregarUsuario(userFinal2);
		userFinal.agregarFigurita(f1);
		
		((Final) userFinal).pegarFigurita(f1);

		
		//verificacion
		panini.intercambioDeFiguritas((Final)userFinal, f1, (Final)userFinal2);
		
	}
	
}
