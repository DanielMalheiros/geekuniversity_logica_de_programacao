package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio7 {

	/*Desenvolva um algoritmo que:
	  a) Leia 4 números;
	  b) Calcule o quadrado de cada um;
	  c) Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	  d) Caso contrario, imprima os valores lidos e seus respectivos quadrados. */
	
	public static void main(String[] args) {
		
		//variáveis
		int n1, n2, n3, n4, q1, q2, q3, q4;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Escolha o primeiro número inteiro: ");
		n1 = teclado.nextInt();
		System.out.println("Escolha o segundo número inteiro: ");
		n2 = teclado.nextInt();
		System.out.println("Escolha o terceiro número inteiro: ");
		n3 = teclado.nextInt();
		System.out.println("Escolha o quarto número inteiro: ");
		n4 = teclado.nextInt();
		
		//processamento
		q1 = n1 * n1;
	    q2 = n2 * n2;
	    q3 = n3 * n3;
		q4 = n4 * n4;
		
		if(q3 >= 1000) {
			System.out.println(q3);
		}else {
			System.out.printf("Primeiro número: %d, Ao quadrado: %d\n", n1, q1);
			System.out.printf("Segundo número: %d, Ao quadrado: %d\n", n2, q2);
			System.out.printf("Terceiro número: %d, Ao quadrado: %d\n", n3, q3);
			System.out.printf("Quarto número: %d, Ao quadrado: %d\n", n4, q4);
	    }
		teclado.close();
	}
}

