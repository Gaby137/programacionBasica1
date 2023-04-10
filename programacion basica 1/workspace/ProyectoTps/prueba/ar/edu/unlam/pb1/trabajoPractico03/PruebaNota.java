package ar.edu.unlam.pb1.trabajoPractico03;

public class PruebaNota {

	public static void main(String[] args) {
		Nota alumno = new Nota(8);
		if (alumno.aprobado())
			System.out.println("es un capo");
		else {
			alumno.recuperar(5);
			System.out.println("la nueva notA:"+ alumno.getValor());
		}
//		a. Instancia la clase Nota con el valor 3
		Nota alumno2 = new Nota(3);
//		b. Evaluá dicho valor a través del método getValor()
		float notadelalumno2 = alumno2.getValor();
			if (notadelalumno2>=7)
				System.out.println("es un capoide");
			else
				System.out.println("a su re puta casa");
			
//		c. Al consultar el método aprobado, verifica que devuelva false
			if (alumno2.aprobado() == false)
				System.out.println("desaprobo el wn");
				
//		d. Instancia la clase Nota con el valor 7
		Nota alumno3 = new Nota (7);
//		e. Al consultar el método aprobado, verifica que el resultado es true
			if (alumno3.aprobado() == true)
				System.out.println("makina");
//		f. Instancia la clase Nota con el valor 2. Luego recuperá con el valor 8 y verifica que el
//		método aprobado devuelva true 
		Nota alumno4 = new Nota (2);
		alumno4.recuperar(8);
			if(alumno4.aprobado()== true)
				System.out.println("genio");
	
	}

}
