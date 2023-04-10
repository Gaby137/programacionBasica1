package ar.edu.unlam.pb1.trabajoPractico02;

public class PruebaUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario pepe = new Usuario();
		System.out.println(pepe.getUsuario());
		pepe.setUsuario("pepe1");
		System.out.println(pepe.getUsuario());
		pepe.setContrasenia("pepe123");
		System.out.println(pepe.getContrasenia());
		pepe.setEdad(45);
		System.out.println(pepe.getEdad());
	}

}
