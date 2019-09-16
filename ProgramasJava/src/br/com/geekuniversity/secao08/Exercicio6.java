package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio6 {

	/*Faça um programa que receba um código númerico inteiro e um vetor de cinco posições de números
	  reais. Se o código for zero, termine o programa. Se o código for 1, mostre o vetor na ordem direta.
	  Se o código for 2, mostre o vetor na ordem inversa. */
	  
	public static void main(String[] args) {
		
		//variáveis
		float[] vetor = new float[5];
		int codigo;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Informe o código: ");
		codigo = teclado.nextInt();
				
		//processamento e saída
		if(codigo != 0 && codigo <= 2 && codigo > 0) {
			for(int i = 0; i < 5; i++) {
				System.out.printf("Informe um número real para o vetor: (%d/5)\n", i+1);
				vetor[i] = teclado.nextFloat();
			}
			if(codigo == 1) {
				for(int i = 0; i < 5; i++) {
					System.out.println(vetor[i]);
				}
			}
			if(codigo == 2) {
				for(int i = vetor.length - 1; i >= 0; i--) {
					System.out.println(vetor[i]);
				}
			}
		teclado.close();		
	    }
     }
}