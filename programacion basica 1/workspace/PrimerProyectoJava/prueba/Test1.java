import paquete1.Alumno;
public class Test1 {

	public static void main(String[] args) {
		
		Alumno gaby = new Alumno();
		Alumno reyna = new Alumno(23);
		
		System.out.println("gaby dni: " + gaby.getDni());
		gaby.setDni(20);
		System.out.println("gaby dni nva: " + gaby.getDni());
	}

}
