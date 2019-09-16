package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio8 {
	
	/*Faça um algoritmo que leia um número inteiro e mostre uma mensagem indicando se este número
	  é par ou impar e se é positivo ou negativo. */

	public static void main(String[] args) {
		
		//variável
		int n;
       
		//entrada
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha um número inteiro: ");
		n = teclado.nextInt();
		
		//processamento e saída
		if(n > 0) {
			if(n % 2 == 0) {
				System.out.printf("O número %d é par e positivo.\n", n);
			}else {
				System.out.printf("O número %d é impar e positivo;\n", n);
			}
		}
		else if(n < 0) {
			if(n % 2 == 0) {
				System.out.printf("O número %d é par e negativo.\n", n);
			}else 
				System.out.printf("O número %d é impar e negativo.\n", n);
		}
		else if(n == 0) {
			System.out.println("Número inválido.");
		}
		teclado.close();
	}
}
