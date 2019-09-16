package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio5 {

	/*Faça um programa que calcule um vetor com dez números inteiros. Calcule e
	  mostre os números superiores a 50 e suas respectivas posições. Mostrar 
	  mensagem se não existir nenhum número nesta condição. */
	
	public static void main(String[] args) {
		
		//variáveis
		int[] vetor = new int[10];
		boolean tem_maior_50 = false;
		Scanner teclado = new Scanner(System.in);
		
		//entrada e processamento
		for(int i = 0; i < 10; i++) {
			System.out.printf("Informe um valor para o vetor: (%d/10)\n", i+1);
			vetor[i] = teclado.nextInt();
			}
		
		for (int i = 0; i < 10; i++) {
			if(vetor[i] > 50) {
				System.out.printf("O número %d está na posição %d\n", vetor[i], i);
				tem_maior_50 = true;
		    }	
	    }
		if(!tem_maior_50) {
			System.out.println("Não existe nenhum número maior que 50");
		    }
		teclado.close();
	}	
}
