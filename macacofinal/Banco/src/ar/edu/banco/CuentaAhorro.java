package ar.edu.banco;

public class CuentaAhorro extends Cuenta {

	static final Integer MAXIMA_EXTRACCION = 5;

	public CuentaAhorro(Long cbu) {
		super(cbu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean extraer(Double monto) throws SaldoInsuficienteException {
		Boolean extraido = false;
		Integer cont = 0;
		if (monto <= super.getSaldo()) {
			if (cont <= MAXIMA_EXTRACCION) {
				super.setSaldo(super.getSaldo() - monto);
				cont++;
			} else {
				super.setSaldo(super.getSaldo() - monto - 6);
				cont++;
			}

		} else {
			throw new SaldoInsuficienteException("saldo insuficiente");
		}
		return extraido;
	}

	public static Integer getMaximaExtraccion() {
		return MAXIMA_EXTRACCION;
	}
}
