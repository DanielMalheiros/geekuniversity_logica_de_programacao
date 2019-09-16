package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio4 {

	/*Escreva um algoritmo que leia e mostre um vetor de 20 elementos inteiros,
	  em seguida, mostre a soma de todos os elementos. */
	 
	public static void main(String[] args) {
		
		//variáveis
		int[] vetor = new int[20];
		int soma = 0;
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < 20; i++) {
			System.out.printf("Informe um valor para o vetor: (%d/20)\n", i+1);
			vetor[i] = teclado.nextInt();
			soma = soma + vetor[i];
		}
		System.out.printf("A soma dos valores no vetor é de %d", soma);
		teclado.close();
	}
}
