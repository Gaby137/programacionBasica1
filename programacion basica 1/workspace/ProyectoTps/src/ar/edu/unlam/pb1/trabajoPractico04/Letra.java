package ar.edu.unlam.pb1.trabajoPractico04;
import java.lang.Math;
public class Letra {
	private char vocal;
	public Letra (char letra) {
		this.vocal=letra;
		}


	public boolean esVocal () {
		switch (this.vocal){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			return true;
		default:
			return false;
		}
	}
}
