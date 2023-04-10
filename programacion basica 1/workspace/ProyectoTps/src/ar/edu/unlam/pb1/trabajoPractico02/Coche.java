package ar.edu.unlam.pb1.trabajoPractico02;

public class Coche {
	public static final int CERO_KM = 0;
	public static final int ANO_ACTUAL = 2021;
	public static int cantidadCoches = 0;
	private String marca;
	private String modelo;
	private int kilometrosActuales;
	private int anioDeFabricacion;
	private double precio;
	
	public Coche() {
		cantidadCoches++;
	}
	
	public Coche (String marca, String modelo, double precio){
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio; 
		this.kilometrosActuales = CERO_KM;
		this.anioDeFabricacion = ANO_ACTUAL;
		cantidadCoches++;
	}
	
	public Coche (String marca, String modelo, int kilometrosActuales, int anioDeFabricacion, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.kilometrosActuales = kilometrosActuales;
		this.anioDeFabricacion = anioDeFabricacion;
		this.precio = precio;
		cantidadCoches++;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setmarca (String marca) {
		this.marca = marca;
	}
	public String getmodelo() {
		return modelo;
	}
	public void setmodelo (String modelo) {
		this.modelo = modelo;
	}
	public int getkilometrosActuales() {
		return kilometrosActuales;
	}
	public void setkilometrosActuales (int kilometrosActuales) {
		this.kilometrosActuales = kilometrosActuales;
	}
	public int getanioDeFabricacion() {
		return anioDeFabricacion;
	}
	public void setanioDeFabricacion (int anioDeFabricacion) {
		this.anioDeFabricacion = anioDeFabricacion;
	}
	public double getprecio() {
		return precio;
	}
	public void setprecio (double precio) {
		this.precio = precio;
	}
	
	public String toString() {
		return "marca: "+this.marca+" modelo: "+this.modelo+" kilometros: "+this.kilometrosActuales+" año de fabricacion: "+this.anioDeFabricacion+ " precio: "+this.precio;
	}
	
	public static int getCantidadCoches() {
		return cantidadCoches;
	}
	public void setKilometrosActuales(int kilometros) {
		this.kilometrosActuales += kilometros;
	}
	public int calcularAntiguedad() {
		return ANO_ACTUAL-this.anioDeFabricacion;
	}
	
}