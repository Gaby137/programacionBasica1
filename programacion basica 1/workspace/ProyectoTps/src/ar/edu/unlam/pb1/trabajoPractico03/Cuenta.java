package ar.edu.unlam.pb1.trabajoPractico03;

public class Cuenta {
	private String titular;
	private double saldo;
	
	public Cuenta (String titular) {
		this.titular=titular;
		this.saldo=0;
	}
	public Cuenta (String titular, double saldoInicial) {
		this.titular= titular;
		this.saldo= saldoInicial;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public String toString() {
		return "titular:  "+this.titular+ "saldo:  "+this.saldo;
	}
	public void depositar (double cantidad) {
		if (cantidad>0)
			this.saldo+=cantidad;
	}
	public void retirar (double cantidad) {
		if (this.saldo>=cantidad)
			this.saldo-=cantidad;
	}
}
