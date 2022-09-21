package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(28); //autoboxing
		System.out.println(idadeRef.intValue()); //unboxing
		
		//Double dRef = new Double(3.14); - decaido
		Double dRef = Double.valueOf(3.14); //autoboxing
		System.out.println(dRef.doubleValue()); //unboxing
		
		Boolean bRef = Boolean.TRUE; //autoboxing
		System.out.println(bRef.booleanValue()); //unboxing
		
		Number refNumero = Integer.valueOf(13);
		Number refNumero2 = Double.valueOf(1.3);
		
		List<Number> lista = new ArrayList<>();
		lista.add(14);
		lista.add(13.1);
		lista.add(25.6f);
		System.out.println(lista);
		
		
		
	}

}
