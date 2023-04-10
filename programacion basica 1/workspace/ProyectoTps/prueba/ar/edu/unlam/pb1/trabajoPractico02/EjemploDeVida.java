package ar.edu.unlam.pb1.trabajoPractico02;

public class EjemploDeVida {

	public static void main(String[] args) {
		Persona objeto1 = new Persona("sofia", "mujer", 123456789, 0.5, 1.0);
		
		System.out.println(objeto1.toString());
		
//		a. Defin� un objeto Persona a trav�s de una variable llamada sofia.
//		b. Instancia dicho objeto. Record� que el constructor de la clase Persona espera que
//		le pases los siguientes par�metros:
//		i. Nombre (Asignale el valor �Sof�a�).
//		ii. Genero (Asignale el valor �Mujer�).
//		iii. Dni (Asignale el valor 38432153).
//		iv. Peso (Asginale el valor 2.8).
//		v. Altura (Asignale el valor 0.50)
		Persona sofia = new Persona ("sofia", "mujer", 38432153, 2.8, 0.50);
//		c. Imprim� por pantalla el contenido de la variable sofia (System.out.println(sofia))
//		�Qu� se observa?
		System.out.println(sofia);
		// ar.edu.unlam.pb1.trabajoPractico02.Persona@3fee733d 
		// Se observa el tipo de dato y su direccion en mem
		// pero si se sobre escribe el toString imprime los datos q yo le diga
		
//		d. Imprim� por pantalla el peso y la altura
		System.out.println("altura: "+sofia.getAltura());
		System.out.println("peso: "+sofia.getPeso());
//		e. Enviale los siguientes mensajes al objeto sofia:
//		i. alimentar. Pasale el valor 1.0 por par�metro (Es la cantidad de kilos de
//		comida).
		sofia.alimentar(1.0);
//		ii. crecer. Pasale el valor 0.5 por par�metro (Es la cantidad de metros que
//		crece en altura).
		sofia.crecer(0.5);
//		iii. cumplirAnos.
		sofia.cumplirAnos();
//		f. Repet� el punto d. �Qu� diferencias encontr�s con respecto a la primera
		System.out.println("altura: "+sofia.getAltura());
		System.out.println("peso: "+sofia.getPeso());
	}
}
