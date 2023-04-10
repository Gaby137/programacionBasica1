package ar.edu.unlam.pb1.trabajoPractico02;

import ar.edu.unlam.pb1.trabajoPractico03.Cuenta;

public class PruebaCuenta {

	public static void main(String[] args) {
		Cuenta persona1 = new Cuenta("pepe", 0); 	
		System.out.println(persona1);	
		persona1.depositar(100);
		System.out.println(persona1);
		persona1.retirar(99);
		System.out.println(persona1);
		
		Cuenta persona2 = new Cuenta("mono");
		System.out.println(persona2);

	}

}
