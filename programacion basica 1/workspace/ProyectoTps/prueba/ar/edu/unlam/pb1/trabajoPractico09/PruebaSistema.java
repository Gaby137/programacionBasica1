package ar.edu.unlam.pb1.trabajoPractico09;

import java.util.Scanner;

public class PruebaSistema {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Sistema s1=null;
		int op=0;
		
		do {
			op = menu(teclado);
			switch (op) {
			case 1:
					System.out.println("nombre del sistema: ");
					String nombreSistema = teclado.next();
					s1= new Sistema(nombreSistema);
				break;
			case 2:
					System.out.println("Nick: ");
					String usuario=teclado.next();
					System.out.println("Nombre: "); 
					String nombre=teclado.next();
					System.out.println("Apellido: ");
					String apellido=teclado.next();
					System.out.println("Dni: ");
					int dni = teclado.nextInt();
					System.out.println("Edad: ");
					int edad = teclado.nextInt();
					
					Usuario u= new Usuario(usuario, nombre, apellido,dni,edad);
					
					if (s1.agregarUsuario(u)) {
						System.out.println("Se agrego exitosamente!");
						System.out.println(u);
					}else {
						System.out.println("No se puede agregar mas usuarios");
						
					}
					
				break;
			case 3: 
				System.out.println("ingrese su nick");
				String nick = teclado.next();
				System.out.println("ingrese su contraseña");
				String contra = teclado.next();
				if (s1.login(nick, contra)) {
					System.out.println("se logueo exitosamente");
				}else {
					System.out.println("No se logueo correctamente");
				}
				
			default:
				break;
			}
		}while(op !=4);
		
		
		
	}
	
	public static int menu(Scanner teclado) {
		int op =0;
		System.out.println("---MENU---");
		System.out.println("1- Ingresar el nombre del Sistema");
		System.out.println("2- Agregar usuarios al Sistema");
		System.out.println("3- Loguearse en el Sistema");
		System.out.println("4- Salir");
		System.out.println("ingrese la opcion: ");
		op = teclado.nextInt();
		
		return op;
	}

}
