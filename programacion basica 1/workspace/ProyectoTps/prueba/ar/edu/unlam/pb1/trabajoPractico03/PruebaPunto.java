package ar.edu.unlam.pb1.trabajoPractico03;

public class PruebaPunto {

	public static void main(String[] args) {
	 Punto coordenada1 = new Punto(5, 5);
	 System.out.println(coordenada1);
	 coordenada1.setY(0);
	 coordenada1.setX(0);
	 System.out.println(coordenada1);

	 Punto coordenada2 = new Punto();
	 System.out.println("ordenada al origen: "+coordenada2);
	 
	 if (coordenada1.ejeX()) {
		System.out.println("buenardo"); 
	 }else
		System.out.println("malardo");
	 
	 
	 if (coordenada1.ejeY()) {
		 System.out.println("que capo");
	 }else
		 System.out.println("que mono");
	 
	 
	 if (coordenada1.ordenadaOrigen()) {
		 System.out.println("bien manito");
	 }else
		 System.out.println("ñao");
	}

}
