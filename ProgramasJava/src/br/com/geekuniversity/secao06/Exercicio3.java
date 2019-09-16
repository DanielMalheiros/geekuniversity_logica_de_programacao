package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio3 {

	/*Ler um número e verificar se ele é par ou impar. Quando par, armazena-lo em 'p', quando impar,
	 armazena-lo em 'i'. Exibir 'p' e 'i' no final do processamento. */
	 
	public static void main(String[] args) {
		
		//variável
		int n, p = 0, i = 0;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Defina um número: ");
		n = teclado.nextInt();
		
		//processamento
		if(n % 2 == 0) {
			p = n;
		}else {
			i = n;
		}
		//saída
		System.out.println(p);
		System.out.println(i);
		teclado.close();
	}
}
