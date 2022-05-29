package entidades;


public class ContaCorrente extends Conta {
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Banco banco, Cliente cliente) {
		super(banco, cliente);
		}
	
	@Override
	public void imprimirExtrato() {
	System.out.println("Extrato Conta Corrente");
	super.imprimirComuns();
		
	}
	
}
