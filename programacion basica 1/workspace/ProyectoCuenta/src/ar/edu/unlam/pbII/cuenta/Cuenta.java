package ar.edu.unlam.pbII.cuenta;

public abstract class Cuenta {

	private Integer cbu;
	private Double saldo;
	protected TipoCuenta tipoCuenta;

	public Cuenta(Integer cbu, Double saldo) {
		this.cbu = cbu;
		this.saldo = saldo;

	}

	public Integer getCbu() {
		return cbu;
	}

	public void setCbu(Integer cbu) {
		this.cbu = cbu;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void setTipoCuenta(TipoCuenta tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public abstract TipoCuenta getTipoCuenta();

	public abstract Boolean extraerDinero(Double monto);

	public Boolean depositarDinero(Double monto) {
		Boolean sePudoDepositar = false;
		if (monto >= 0) {
			this.saldo += monto;
			sePudoDepositar = true;
		}
		return sePudoDepositar;
	}

}
