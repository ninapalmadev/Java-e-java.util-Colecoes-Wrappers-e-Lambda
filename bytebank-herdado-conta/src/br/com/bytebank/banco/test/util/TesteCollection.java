package br.com.bytebank.banco.test.util;

import java.util.Collection;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;

public class TesteCollection {

	public static void main(String[] args) {
		
		//List<Conta> lista = new ArrayList<Conta>(); //usa array por baixo
		//List<Conta> lista = new LinkedList<Conta>(); //lista linkada
		Collection<Conta> lista = new Vector<Conta>(); 
		
		//outro código omitido
		//...
		//Conta ref = lista.get(0); //não compila
		//...
		
	}
}