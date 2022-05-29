package entidades;

public abstract class Conta implements IntConta{ 
	
	private static final int AGENCIA_PADRAO = 001;
	private static int SEQUENCIAL = 1000;
	
	protected int agencia;
	protected int numero; 
	protected double saldo;
	protected Cliente cliente;
	protected Banco banco;
	
	public Conta() {
	}
	
	public Conta(Banco banco, Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.banco = banco;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;	
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
}
	
	protected void imprimirComuns() {
		System.out.println(this.banco.getNome());
		System.out.println(this.cliente.getNome());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero:  " + this.numero);
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	
		}
		
	
}