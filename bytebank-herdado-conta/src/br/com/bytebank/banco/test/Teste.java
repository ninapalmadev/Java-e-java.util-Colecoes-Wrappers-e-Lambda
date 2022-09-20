package br.com.bytebank.banco.test;

public class Teste {
	//Array []
	public static void main(String[] args) {
		
		int[] idades = new int[5]; //começa o array com valor padrão. 0
		
		idades[0] = 29;
		idades[1] = 39;
		idades[2] = 19;
		idades[3] = 49;
		idades[4] = 79;
		
		int idade3 = idades[2];
		
		System.out.println(idade3);
		System.out.println(idades.length);
		
	}

}
