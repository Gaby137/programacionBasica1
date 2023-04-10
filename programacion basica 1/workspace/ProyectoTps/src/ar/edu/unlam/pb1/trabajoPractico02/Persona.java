package ar.edu.unlam.pb1.trabajoPractico02;

public class Persona {
	private String nombre;
	private String genero;
	private long dni;
	private double peso;
	private double altura;
	private int edad;
	private boolean viva;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String genero, long dni, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
	}
	public Persona (double peso) {
		this.peso=peso;
	}
	
	public Persona (double peso, int edad) {
		this.peso=peso;
		this.edad=edad;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;

	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero (String genero) {
		this.genero = genero;

	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad (int edad) {
		this.edad = edad;

	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean isViva() {
		return viva;
	}

	public void setViva(boolean viva) {
		this.viva = viva;
	}
	
	public String toString() {
		return this.nombre + " " + this.dni;
	}
	
	public void alimentar(double kilos) {
		this.peso+=kilos;
	}
	public void crecer(double metros) {
		this.altura+=metros;
	}
	public void cumplirAnos() {
		this.edad++;
	}
	public double pesar() {
		return this.peso;
	}
	public double medir() {
		return this.altura;
	}
}
