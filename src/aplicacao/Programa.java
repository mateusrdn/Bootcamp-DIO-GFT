package aplicacao;

import entidades.Banco;
import entidades.Cliente;
import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {	
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Mateus Rodrigues");
		
		Banco banco = new Banco();
		banco.setNome("Banco do Brasil");

		Conta cc = new ContaCorrente(banco, cliente);
		Conta cp = new ContaPoupanca(banco, cliente);
		
		cc.depositar(100);
		cc.transferir(50, cp);
	
		cc.imprimirExtrato();
		System.out.println();
		cp.imprimirExtrato();
	
	}

}
