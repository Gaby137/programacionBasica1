package ar.edu.unlam.pb1.trabajoPractico06;
import java.util.Scanner;
public class PruebaEstadiscticasDePersonas {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		final int CANT_PERSONAS_ENCUESTADAS=3;
		final double BAJO_PESO=40;
		final double PESO_NORMAL=70;
		final double SOBRE_PESO=100;
		
		
		
	
		System.out.println("quiere realizar la encuesta?(S/N)");
		char opEncuesta = teclado.next().charAt(0);
		
		while (opEncuesta=='S' || opEncuesta=='s') {
			double acumDePeso = 0;
			int contBajoPeso=0;
			int contPesoNormal=0;
			int contSobrePeso=0;
			
			int edadBajoPeso=0;
			int edadSobrePeso=0;
			
			System.out.println("ingrese los datos de las personas: ");
			
			for (int i = 0; i < CANT_PERSONAS_ENCUESTADAS; i++) {
				
				System.out.println("ingrese el peso: ");
				double peso = teclado.nextDouble();
				
				System.out.println("ingrese la edad: ");
				int edad = teclado.nextInt();
				
				acumDePeso+=peso;
				
				if (peso<=BAJO_PESO) {
					contBajoPeso++;
					edadBajoPeso+=edad;
				}
				if (peso>BAJO_PESO && peso<=PESO_NORMAL) {
					contPesoNormal++;
				}
				if (peso>PESO_NORMAL && peso<=SOBRE_PESO) {
					contSobrePeso++;
					edadSobrePeso+=edad;
				}
			}
			double PromedioPesoBajo=0;
			PromedioPesoBajo=edadBajoPeso/contBajoPeso;
			double PromedioSobrePeso=0;
			PromedioSobrePeso=edadSobrePeso/contSobrePeso;
			double PromedioGeneral=0;
			PromedioGeneral=acumDePeso/CANT_PERSONAS_ENCUESTADAS;
			
//			System.out.println(contBajoPeso +"   "+contPesoNormal+"   "+contSobrePeso);
			char opMenu;
			do {
				System.out.println("---Menu---");
				System.out.println("a. El peso promedio                               ");
				System.out.println("b. Cantidad de personas con bajo peso             ");
				System.out.println("c. Cantidad de personas con peso normal           ");
				System.out.println("d. Cantidad de personas con sobre peso            ");
				System.out.println("e. Promedio de edad de las personas con bajo peso ");
				System.out.println("f. Promedio de edad de las personas con sobre peso");
				System.out.println("g. salir");
				
				System.out.println("ingrese una opcion");
				opMenu = teclado.next().charAt(0);
				
				switch (opMenu) {
				case 'a':
					System.out.println("El peso promedio es: "+PromedioGeneral);
					break;
				case 'b':
					System.out.println("La cantidad de las personas con bajo peso es: "+contBajoPeso);
					break;
				case 'c':
					System.out.println("La cantidad de las personas con peso normal es: "+contPesoNormal);
					break;
				case 'd':
					System.out.println("La cantidad de las personas con sobre peso es: "+contSobrePeso);
					break;
				case 'e':
					System.out.println("La edad promedio de las personas con bajo peso es: "+PromedioPesoBajo);
					break;
				case 'f':
					System.out.println("La edad promedio de las personas con sobre peso es: "+PromedioSobrePeso);
					break;
				
				}
				
				
				
			} while (opMenu != 'g');
			

			System.out.println("Quiere realizar la encuesta?(S/N)");
			opEncuesta = teclado.next().charAt(0);
		}

	}

}
