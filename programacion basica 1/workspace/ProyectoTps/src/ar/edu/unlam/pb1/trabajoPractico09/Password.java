package ar.edu.unlam.pb1.trabajoPractico09;

public class Password {
	private int longitud;
	private String contrasena;
	

	public Password() {
		this.longitud=8;
	}
	
	public Password(int longtitud) {
		this.longitud=longitud;
		this.contrasena=generarContrasenia();
	}
	
	public String generarContrasenia(){
		String palabra = ""; 
		int topeM=(int)(Math.ceil(this.longitud*0.25D));
		int topenro=(int)(Math.ceil(this.longitud*0.625D));
		int topem=(int)(Math.ceil(this.longitud*0.125D));
		
		for (int i=0; i<this.longitud; i++){ 
			
			
			if(i>=0 && i<topeM) {
				int codigoAscii = (int)Math.floor(Math.random()*(65 - 90)+65); 
				
				palabra = palabra + (char)codigoAscii; 
			}
			if(i>=topeM && i<topem) {
				int codigoAscii = (int)Math.floor(Math.random()*(97 - 122)+97); 
				
				palabra = palabra + (char)codigoAscii; 
			}
			if(i>topem && i<topenro) {
				int codigoAscii = (int)Math.floor(Math.random()*(48 - 57)+48); 
				
				palabra = palabra + (char)codigoAscii; 
			}
			
		         
		} 		
		return palabra; 
	}
	
	public boolean esFuerte () {
		int mayuscula=0;
		int minuscula=0;
		int numero=0;
		boolean esFortachon= false;
		char[] analizarContrasena = this.contrasena.toCharArray();
		for (int i = 0; i <analizarContrasena.length; i++) {
			if (esMayuscula(analizarContrasena[i])) {
				mayuscula++;
			}
			if (esMinuscula(analizarContrasena[i])) {
				minuscula++;
			}
			if (esNumero(analizarContrasena[i])) {
				numero++;
			}
		}
		if (mayuscula>=2 && minuscula>=1 && numero>=5) {
			esFortachon=true;
		}
		return esFortachon;
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
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
}