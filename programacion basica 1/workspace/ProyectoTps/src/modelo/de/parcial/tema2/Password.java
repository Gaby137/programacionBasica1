package modelo.de.parcial.tema2;

public class Password {
	private final int CANT_MINIMO_DE_MAYUSCULAS = 2;
	private final int CANT_MINMO_DE_MINUSCULAS = 1;
	private final int CANT_MINIMO_DE_NUMEROS = 5;
	
	private String valor;
	

	
	
	public Password() {
		
	}
	
//	public String generarContrasenia(){
//		String palabra = ""; 
//		int topeM=(int)(Math.ceil(this.longitud*0.25D));
//		int topenro=(int)(Math.ceil(this.longitud*0.625D));
//		int topem=(int)(Math.ceil(this.longitud*0.125D));
//		
//		for (int i=0; i<this.longitud; i++){ 
//			
//			
//			if(i>=0 && i<topeM) {
//				int codigoAscii = (int)Math.floor(Math.random()*(65 - 90)+65); 
//				
//				palabra = palabra + (char)codigoAscii; 
//			}
//			if(i>=topeM && i<topem) {
//				int codigoAscii = (int)Math.floor(Math.random()*(97 - 122)+97); 
//				
//				palabra = palabra + (char)codigoAscii; 
//			}
//			if(i>topem && i<topenro) {
//				int codigoAscii = (int)Math.floor(Math.random()*(48 - 57)+48); 
//				
//				palabra = palabra + (char)codigoAscii; 
//			}
//			
//		         
//		} 		
//		return palabra; 
//	}
	
	public boolean esFuerte (String deseado) {
		final int INICIO_MAYUSCULAS = 65;
		final int FINAL_MAYUSCULAS = 90;
		final int INICIO_MINUSCULAS = 97;
		final int FINAL_MINUSCULAS = 122;
		final int INICIO_DE_NUMEROS = 48;
		final int FINAL_DE_NUMEROS = 57;
		
		int mayuscula=contarCantidadDeCaracteres(deseado, INICIO_MAYUSCULAS,FINAL_MAYUSCULAS);
		int minuscula=contarCantidadDeCaracteres(deseado, INICIO_MINUSCULAS, FINAL_MINUSCULAS);
		int numero=contarCantidadDeCaracteres(deseado, INICIO_DE_NUMEROS, FINAL_DE_NUMEROS);
		boolean esFortachon= false;
		
		
		if (mayuscula>=2 && minuscula>=1 && numero>=5) {
			esFortachon=true;
		}
		return esFortachon;
	}
	
	
	private int contarCantidadDeCaracteres(String deseada, int posicionAsciiInicial, int posicionAsciiFinal) {
		final int PRIMER_CARACTER_MAYUSCULA = posicionAsciiInicial;
		final int ULTIMO_CARACTER_MAYUSCULA = posicionAsciiFinal;
		int cantidadDeCaracteres = 0;
		
		for (int i = 0; i < deseada.length(); i++) {
			if (deseada.charAt(i)>=PRIMER_CARACTER_MAYUSCULA && deseada.charAt(i)<=ULTIMO_CARACTER_MAYUSCULA) {
				cantidadDeCaracteres++;
			}
			
		}
		
		return cantidadDeCaracteres;
	}
	
	public static boolean esMayuscula(char caracter) {
		boolean mayuscula=false;
		if (caracter>=65 && caracter<=90) {
			mayuscula=true;
		}
		return mayuscula;
	}
	
	public static boolean esMinuscula(char caracter) {
		boolean minuscula=false;
		if (caracter>=97 && caracter<=122) {
			minuscula=true;
		}
		return minuscula;
	}
	
	public static boolean esNumero(char caracter) {
		boolean numero=false;
		if (caracter>=48 && caracter<=57) {
			numero=true;
		}
		return numero;
	}
	
	

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		if (esFuerte(valor)) {
			this.valor = valor;
		}
		
	}
	
}