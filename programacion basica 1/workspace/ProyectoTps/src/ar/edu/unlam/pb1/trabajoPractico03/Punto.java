package ar.edu.unlam.pb1.trabajoPractico03;

public class Punto {
	private int y;
	private int x;
	
	
	public Punto() {
	}
	public Punto(int y, int x) {	
		this.y=y;
		this.x=x;
	}
	
	public String toString () {
		return "y: "+this.y+", x: "+this.x;
		
	}
	
	public void setY (int y) {
		this.y=y;
	}
	public void setX (int x) {
		this.x=x;
	}

	public boolean ejeX (){
		if (this.y==0) {
			return true;
		} else
			return false;
		
	}
	public boolean ejeY (){
		if (this.x==0) {
			return true;
		} else
			return false;
		
	}
	
	public boolean ordenadaOrigen () {
		if (this.y==0 && this.x==0) {
			return true;
		} else
			return false;
	}	
	
	
}