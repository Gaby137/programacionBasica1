package ar.edu.unlam.pbII.cuenta;

public class CuentaCorriente extends Cuenta {
	private Double descubierto;

	public CuentaCorriente(Integer cbu, Double saldo, Double descubierto) {
		super(cbu, saldo);
		setTipoCuenta(TipoCuenta.CUENTA_CORRIENTE);
		this.descubierto = descubierto;
	}

	@Override
	public TipoCuenta getTipoCuenta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean extraerDinero(Double monto) {
		Boolean sePudoExtraer = false;
		if (monto <= getSaldo()) {
			setSaldo(getSaldo() - monto);
			sePudoExtraer = true;
		}
		if (monto > getSaldo()) {
			double x = monto - getSaldo();
			double extra = x * 0.05;
			if ((monto + extra) < (getSaldo() + this.descubierto)) {
				setSaldo((getSaldo() + this.descubierto) - (monto + extra));
				sePudoExtraer = true;
			}
		}
		return sePudoExtraer;
	}

}
