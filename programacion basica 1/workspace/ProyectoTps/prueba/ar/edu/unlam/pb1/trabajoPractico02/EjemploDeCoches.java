package ar.edu.unlam.pb1.trabajoPractico02;

public class EjemploDeCoches {
	
	public static void main (String[] args) {
		
		System.out.println(Coche.CERO_KM);
		
		System.out.println(Coche.ANO_ACTUAL);
	
		System.out.println("cantidad de coches: "+Coche.getCantidadCoches());
		
		Coche objeto2 = new Coche("voswagen", "hola", 50000);
		System.out.println(objeto2);
		System.out.println("cantidad de coches: "+Coche.getCantidadCoches());
		
		Coche objeto3 = new Coche("pato", "pata", 100, 1999, 60000);
		System.out.println(objeto3);
		System.out.println("cantidad de coches: "+Coche.getCantidadCoches());
		System.out.println("antiguedad del objeto 3: "+objeto3.calcularAntiguedad());
	}

}
