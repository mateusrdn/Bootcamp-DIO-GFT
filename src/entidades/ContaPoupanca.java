package entidades;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Banco banco, Cliente cliente) {
		super(banco, cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Poupança");
		super.imprimirComuns();
	}
}

