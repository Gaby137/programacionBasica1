package ar.edu.adminpuerta.presentacion;

import ar.edu.adminpuerta.dominio.Cerradura;
import ar.edu.adminpuerta.dominio.Puerta;
public class AdministracionPuertas {
	public static void main(String[] args) {
		
		System.out.println("hola mundo");
		int 		x		=10;
		int 		y		=20;
		
		Cerradura miCerradura = new Cerradura(1234);
	
		System.out.println("la cerradura esta " + miCerradura.getEstado());
		Puerta entrada = new Puerta("blaco", miCerradura);
		Puerta fondo = new Puerta ("marron", 4321);
		
		
		fondo.abrir(7278);
		System.out.println("la cerradura esta " + miCerradura.getEstado());
	}

}
