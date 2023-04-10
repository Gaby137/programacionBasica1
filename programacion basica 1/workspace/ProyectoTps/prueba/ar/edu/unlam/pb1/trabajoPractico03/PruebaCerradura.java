package ar.edu.unlam.pb1.trabajoPractico03;

public class PruebaCerradura {

	public static void main(String[] args) {
		Cerradura uno = new Cerradura(7101, 3);
		
		if (uno.abrir(7101) == true) {
			System.out.println("acceso concedido");
		}else
			System.out.println("acceso denegado");
		
		if (uno.estaAbierta()==true) {
			System.out.println("la puerta esta abierta");
		}else
			System.out.println("la puerta esta cerrada");
	}
}