package br.com.geekuniversity.secao08;

import java.util.ArrayList;

public class Exercicio1 {
	
	/*Faça um algoritmo que carregue um vetor de 5 elementos intiros e em seguida armazene em um
	  vetor apenas os números pares maiores que 0. No final, mostrar os elementos do vetor na tela */
	 
	public static void main(String[] args) {
		
		//variáveis
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		ArrayList<Integer> pares = new ArrayList<Integer>();
		
		//processamento
		for(int i = 0; i < 5; i++) {
			vetor.add(i);
			if(i % 2 == 0) {
				if(i > 0) {
				pares.add(i);
			    }
			}
		}
		for(Integer i : pares) {
			System.out.println(i);
		}
	}
}
