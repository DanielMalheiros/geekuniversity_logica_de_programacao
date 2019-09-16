package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio3 {

	/*Faça um programa que carregue um vetor com dez números inteiros.
	  Mostre o vetor na ordem inversa a que foi digitado. */
	
	public static void main(String[] args) {
		
		//variável
		int[] vetor = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		for(int i = 0; i < 10; i++) {
			System.out.printf("Informe um valor inteiro para o vetor (%d/10): ", i+1);
			vetor[i] = teclado.nextInt();
		}
		for(int i = (vetor.length -1); i >=0; i--) {
			System.out.println(vetor[i]);
		}
		teclado.close();
	}
}
