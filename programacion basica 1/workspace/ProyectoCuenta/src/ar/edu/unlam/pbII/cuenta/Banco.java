package ar.edu.unlam.pbII.cuenta;

public class Banco {

	private Cliente[] clientes;
	private Cuenta[] cuentas;

	public Banco() {
		this.clientes = new Cliente[1000];
		this.cuentas = new Cuenta[5000];
	}

	public Boolean agregarCliente(Cliente cliente) {
		return true;
	}

	public Cuenta[] buscarCuentas(Cliente cliente) {
		Cuenta[] cuentasClientes = new Cuenta[100];
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] != null) {
				if (cuentas[i].getCliente().equals(cliente)) {
					cuentaCliente[cantidaddeCuentasEncontradas] = cuentas[i];
					cantidaddeCuentasEncontradas++;
				}
			}
		}
	}
}
