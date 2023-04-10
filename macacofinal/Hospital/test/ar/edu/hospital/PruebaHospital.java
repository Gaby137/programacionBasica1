package ar.edu.hospital;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PruebaHospital {

	@Test
	public void unDiabeticoNoPuedaConsumirUnPlatoConAzucar() {
		// instanciacion
		Ingrediente i1 = new Ingrediente("azucar");
		Ingrediente i2 = new Ingrediente("huevo");
		Plato p1 = new Plato("a", Tipo_Elaboracion.FRITO);
		Paciente diabetico = new Diabetico1(1, "javier", Tipo_Diabetico.TIPO1);
		// ejecucion
		p1.agregarIngrediente(i1);
		p1.agregarIngrediente(i2);
		// comprobacion
		assertFalse(diabetico.alimentar(p1));
	}

	@Test
	public void unDiabeticoTipo2PuedaRecibirSuDosisDeInsulinaYElTipo1No() {
		// instanciacion
		Diabetico1 diabetico1 = new Diabetico1(1, "javier", Tipo_Diabetico.TIPO1);
		Diabetico1 diabetico2 = new Diabetico1(1, "javier", Tipo_Diabetico.TIPO2);
		// ejecucion

		// comprobacion
		assertFalse(diabetico1.darInsulina());
		assertTrue(diabetico2.darInsulina());
	}

	@Test
	public void unOncologicoQueEsteEnQuimioterapiaOQuimioterapiaNoPuedaConsumirAlgoCrudo() {
		// instanciacion

		Plato p1 = new Plato("a", Tipo_Elaboracion.SIN_COCCION);
		Paciente oncologico = new Oncologico(1, "javier", Tipo_Tratamiento.QUIMIOTERAPIA);
		Paciente oncologico2 = new Oncologico(1, "javier", Tipo_Tratamiento.RAPIDOTERAPIA);
		// ejecucion

		// comprobacion
		assertFalse(oncologico.alimentar(p1));
		assertFalse(oncologico2.alimentar(p1));
	}

	@Test
	public void unCeliacoNoPuedaConsumirUnPlatoQueTengaTrigoAvenaCebadaOCenteno() {
		// instanciacion
		Ingrediente i1 = new Ingrediente("centeno");
		Ingrediente i2 = new Ingrediente("huevo");
		Plato p1 = new Plato("a", Tipo_Elaboracion.FRITO);
		Paciente diabetico = new Ciliaco(1, "javier");
		// ejecucion
		p1.agregarIngrediente(i1);
		p1.agregarIngrediente(i2);
		// comprobacion
		assertFalse(diabetico.alimentar(p1));
	}

	@Test
	public void unHipertensoNoPuedaConsumirUnPlatoQueTengaSal() {
		// instanciacion
		Ingrediente i1 = new Ingrediente("sal");
		Ingrediente i2 = new Ingrediente("huevo");
		Plato p1 = new Plato("a", Tipo_Elaboracion.FRITO);
		Paciente diabetico = new Hipertenso(1, "javier");
		// ejecucion
		p1.agregarIngrediente(i1);
		p1.agregarIngrediente(i2);
		// comprobacion
		assertFalse(diabetico.alimentar(p1));
	}

	@Test
	public void unPacienteGeneralPuedaConsumirLoQueSea() {
		// instanciacion
		Ingrediente i1 = new Ingrediente("azucar");
		Ingrediente i2 = new Ingrediente("sal");
		Ingrediente i3 = new Ingrediente("trigo");
		Ingrediente i4 = new Ingrediente("avena");
		Ingrediente i5 = new Ingrediente("centeno");
		Plato p1 = new Plato("a", Tipo_Elaboracion.SIN_COCCION);
		Paciente diabetico = new General(1, "javier");
		// ejecucion
		p1.agregarIngrediente(i1);
		p1.agregarIngrediente(i2);
		p1.agregarIngrediente(i3);
		p1.agregarIngrediente(i4);
		p1.agregarIngrediente(i5);
		// comprobacion
		assertTrue(diabetico.alimentar(p1));
	}
}
