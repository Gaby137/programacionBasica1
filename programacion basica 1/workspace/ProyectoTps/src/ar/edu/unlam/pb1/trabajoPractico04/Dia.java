package ar.edu.unlam.pb1.trabajoPractico04;

public class Dia {
	private char dia;

	public Dia (char semana) {
		this.dia=semana;
	}
	public String nombreDia() {
		String pelotudo="";
		switch (this.dia) {
		case '1':
			pelotudo="lunes";
			break;
		case '2':
			pelotudo="martes";
			break;
		case '3':
			pelotudo="miercoles";
			break;
		case '4':
			pelotudo="jueves";
			break;
		case '5':
			pelotudo="viernes";
			break;
		case '6':
			pelotudo="sabado";
			break;
		case '7':
			pelotudo="domingo";
			break;
		}
		return pelotudo;
	}
	
}
