package ar.edu.callcenter;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ClienteTest {
	@Test
	public void realizarUnaLlamadaExitosa() {
		Agenda agenda = new Agenda();
		agenda.agregarContacto(new Contacto("nombreYApellido", "celular", "email", "direccion", 1122, "localidad",
				Provincia.BUENOS_AIRES));
		agenda.agregarContacto(new Contacto("nombreYApellido1", "celular1", "email1", "direccion1", 1122, "localidad1",
				Provincia.BUENOS_AIRES));
		agenda.agregarContacto(new Contacto("nombreYApellido2", "celular2", "email2", "direccion2", 1122, "localidad2",
				Provincia.BUENOS_AIRES));

		int contacto = agenda.buscarAlCandidato();

		assertTrue(agenda.getLista()[contacto].getDeseaSerLlamadoNuevamente());
		assertFalse(agenda.getLista()[contacto].getEsCliente());

	}

//	@Test
//	public void realizarUnaLlamadaFallida() {
//		Agenda agenda2 = new Agenda();
//		agenda2.agregarContacto(new Contacto("nombreYApellido", "celular", "email", "direccion", 1122, "localidad",
//				Provincia.BUENOS_AIRES, true, false));
//		agenda2.agregarContacto(new Contacto("nombreYApellido", "celular", "email", "direccion", 1122, "localidad",
//				Provincia.BUENOS_AIRES, true, false));
//		agenda2.agregarContacto(new Contacto("nombreYApellido", "celular", "email", "direccion", 1122, "localidad",
//				Provincia.BUENOS_AIRES, true, false));
//
//		Contacto contacto = agenda2.buscarAlCandidato();
//
//		assertEquals(null, contacto);
//
//	}

	@Test
	public void registrarLlamadaExistosa() {
		Agenda agenda3 = new Agenda();
		agenda3.agregarContacto(new Contacto("nombreYApellido", "celular", "email", "direccion", 1122, "localidad",
				Provincia.BUENOS_AIRES));
		agenda3.agregarContacto(new Contacto("nombreYApellido", "celular", "email", "direccion", 1122, "localidad",
				Provincia.BUENOS_AIRES));
		agenda3.agregarContacto(new Contacto("nombreYApellido", "celular", "email", "direccion", 1122, "localidad",
				Provincia.BUENOS_AIRES));

		int a = agenda3.buscarAlCandidato();
		Contacto candidato = new Contacto();
		if (a >= 0) {
			candidato = agenda3.getLista()[a];
		}

		Operador op1 = new Operador(1, "pepe");

		boolean seHizoElRegistro = op1.registrarLlamada(candidato);
		assertTrue(seHizoElRegistro);
	}

}
