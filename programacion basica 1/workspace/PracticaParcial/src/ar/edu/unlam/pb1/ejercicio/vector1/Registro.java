package ar.edu.unlam.pb1.ejercicio.vector1;


public class Registro {
	private Persona personas[];
	private int i;
	
	
	public Registro (){
		this.personas= new Persona[3];
		this.i= 0;
	}

	public boolean agregarPersona(Persona persona) {
		boolean agregar = false;

		if (i < personas.length) {
			this.personas[i] = persona;
			i++;
			agregar = true;
		}

		return agregar;
	}
	
	public void ordenarPorDni() {
		Persona aux = null;
		for (int i = 1; i <= this.i; i++) {
			for (int j = 0; j < this.i-1; j++) {
				if (personas[j].getDni() > personas[j+1].getDni()) {
					aux = personas[j+1];
					personas[j+1] = personas [j];
					personas[j] = aux;
				}
			}
		}
		
	}
	public void ordenarPorApellido() {
		Persona aux = null;
		for (int i = 1; i <= this.i; i++) {
			for (int j = 0; j < this.i-1; j++) {
				if (personas[j].getApellido().compareTo(personas[j+1].getApellido()) > 0) {
					aux = personas[j+1];
					personas[j+1] = personas[j];
					personas[j] = aux;
				}
			}
		}
		
	}
	
	public int menor() {
		int dniMenor = personas[0].getDni();
		int menor = personas[0].getEdad();
		for (int i = 0; i < this.i; i++) {
			if (personas[i].getEdad() < menor) {
				menor = personas[i].getEdad();
				dniMenor = personas[i].getDni();
			}
		}
		return dniMenor;
	}
	
	public int mayor() {
		int dniMayor =personas[0].getDni();;
		int mayor = personas[0].getEdad();
		for (int i = 0; i < this.i; i++) {
			if (personas[i].getEdad() > mayor) {
				mayor = personas[i].getEdad();
				dniMayor = personas[i].getDni();
			}
		}
		return dniMayor;
	}
	
	public Persona[] getPersona() {
		/*
		 * Devuelve la lista de pasajeros
		 */
		
		return personas;
	}
	
	public Persona buscarPorDni(int dni) {
		Persona buscado=null;
		for (int i = 0; i < this.i; i++) {
			if (dni == personas[i].getDni()) {
				buscado = personas[i];
			}
		}
		return buscado;
	}
}
