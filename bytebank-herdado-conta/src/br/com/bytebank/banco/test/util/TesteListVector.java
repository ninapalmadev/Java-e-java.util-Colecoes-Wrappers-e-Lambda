package br.com.bytebank.banco.test.util;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteListVector {

	public static void main(String[] args) {
		
	       //Generics
	    List<Conta> lista = new ArrayList<Conta>();
		
	    Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        System.out.println("Tamanho depois de add: " + lista.size());
        
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());
        
        lista.remove(0);
        
        System.out.println("Tamanho depois de remover: " + lista.size());
        
        Conta cc3 = new ContaCorrente(22, 33);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(22, 44);
        lista.add(cc4);
        
        Conta cc5 = new ContaCorrente(22, 55);
        lista.add(cc5);

        Conta cc6 = new ContaCorrente(22, 66);
        lista.add(cc6);
        
        System.out.println("Tamanho depois de add novamente: " + lista.size());
        
        for(int i = 0; i < lista.size(); i++) {
        	Object oRef = lista.get(i);
        	System.out.println(oRef);
        }
        
        System.out.println("COM FOR ATUALIZADO USANDO ':' ");
        
        for(Conta conta : lista) {
        	System.out.println(conta);
        }
	}

}
