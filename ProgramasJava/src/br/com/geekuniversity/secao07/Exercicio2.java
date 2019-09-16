package br.com.geekuniversity.secao07;

public class Exercicio2 {

	/*Faça um algoritmo que conte de 1 a 100 e a cada múltiplo de 1 emita uma mensagem: 
	  "Múltiplo de 10". */
	  	 
	public static void main(String[] args) {
		
	    for(int i = 1; i <= 100; i++) {
	    	System.out.println(i);
	    	if(i % 10 == 0) {
	    		System.out.println("Múltiplo de 10.");
	    	}
	    }
	}

}
