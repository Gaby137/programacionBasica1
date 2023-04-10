package ar.edu.wea;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.Test;

public class TestArchivo {

	@Test
	public void queCreeUnaUnidaDR() {
		UnidadAlmacenamiento u1;
		u1 = new DiscoRigidos('c', 1000.0);
		try {
			u1.agregarArchivo(new Archivo("wea", "jpg", 100.0));
			u1.agregarArchivo(new Archivo("wea2", "jp", 100.0));
			u1.agregarArchivo(new Archivo("wea3", "a", 100.0));
		} catch (CapacidadExcedidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(3, u1.getArchivos().size(), 0);
	}
	// los mismo per qye te cree un DVD

	@Test
	public void obtenerListaDeArchivosTipoJpgOrdenadosPorNombre() throws CapacidadExcedidaException {

		DVD u1 = new DVD('c', 1000.0);
		u1.abrir();
		u1.agregarArchivo(new Archivo("v", "jpg", 100.0));
		u1.agregarArchivo(new Archivo("a", "jpg", 100.0));
		u1.agregarArchivo(new Archivo("a", "xls", 100.0));
		u1.agregarArchivo(new Archivo("z", "doc", 100.0));

		Set<Archivo> l = u1.obtenerListaDeArchivosTipoJpgOrdenadosPorNombre();

		System.out.println(l);
		assertEquals(2, l.size(), 0);
	}
	// un test que lista con una sola unidad granada fileSyste
	//

}
