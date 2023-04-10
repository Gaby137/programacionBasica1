package ar.edu.banco;

public class CuentaSueldo extends Cuenta {

	public CuentaSueldo(Long cbu) {
		super(cbu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean extraer(Double monto) throws SaldoInsuficienteException {
		Boolean extraido = false;
		if (monto <= super.getSaldo()) {
			super.setSaldo(super.getSaldo() - monto);
		} else {
			throw new SaldoInsuficienteException("saldo insuficiente");
		}
		return extraido;
	}

}
