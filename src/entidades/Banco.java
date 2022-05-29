package entidades;

import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> conta;
	private List<Cliente> cliente;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Conta> getConta() {
		return conta;
	}
	
	public void setConta(List<Conta> conta) {
		this.conta = conta;
	}
	
	public List<Cliente> getCliente() {
		return cliente;
	}
	
	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}
	
	
	
}
