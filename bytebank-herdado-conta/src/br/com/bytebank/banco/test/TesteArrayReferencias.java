package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		//int[] idades = new int[5]
		
		Object[] referencias = new Object[5];
	
		ContaCorrente cc1 = new ContaCorrente(3131, 13);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(3131, 31);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		//System.out.println(cc2.getNumero());
		
//		System.out.println(contas[1].getNumero());
//		System.out.println(contas[0].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca)referencias[1]; //type cast
		System.out.println(ref.getNumero());
	}

}
