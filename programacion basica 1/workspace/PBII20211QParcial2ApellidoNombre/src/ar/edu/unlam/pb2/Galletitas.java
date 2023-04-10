package ar.edu.unlam.pb2;

public class Galletitas extends Comestible {

	public Galletitas(int cod, String descripcion, String f1, String f2, String marca, Double precio) {
		super.setCodigo(cod);
		super.setDescripcion(descripcion);
		super.setFechaDeElaboracion(f1);
		super.setFechaDeVencimiento(f2);
		super.setMarca(marca);
		super.setPrecio(precio);
	}

}
