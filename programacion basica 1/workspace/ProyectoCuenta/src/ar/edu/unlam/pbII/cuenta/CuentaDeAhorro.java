package ar.edu.unlam.pbII.cuenta;

public class CuentaDeAhorro extends Cuenta {
	private int contDeExtraccion;

	public CuentaDeAhorro(Integer cbu, Double saldo) {
		super(cbu, saldo);
		setTipoCuenta(TipoCuenta.CAJA_AHORRO);
		this.contDeExtraccion = 0;
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
			this.contDeExtraccion++;
			if (this.contDeExtraccion > 5) {
				setSaldo(getSaldo() - 6);
			}
		}
		return sePudoExtraer;
	}

}
