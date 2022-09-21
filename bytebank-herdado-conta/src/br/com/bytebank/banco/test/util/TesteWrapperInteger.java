package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;


public class TesteWrapperInteger {

	public static void main(String[] args) {

		int idade = 28;// Integer
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		
		int valor = idadeRef.intValue(); //unboxing
		String s = args[0]; //"10"
		//Integer numeroDoTerminal = Integer.valueOf(s);
		int numeroDoTerminal = Integer.parseInt(s);
		System.out.println(numeroDoTerminal);
		

		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //autoboxing

	}
}
