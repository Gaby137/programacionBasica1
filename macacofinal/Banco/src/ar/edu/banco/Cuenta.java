package ar.edu.banco;

public abstract class Cuenta {

	private Long cbu;
	private Double saldo;

	public Cuenta(Long cbu) {
		super();
		this.cbu = cbu;
		this.saldo = 0.0;
	}

	public Long getCbu() {
		return cbu;
	}

	public void setCbu(Long cbu) {
		this.cbu = cbu;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void depositar(Double monto) {
		this.saldo += monto;
	}

	public abstract Boolean extraer(Double monto) throws SaldoInsuficienteException;
}
