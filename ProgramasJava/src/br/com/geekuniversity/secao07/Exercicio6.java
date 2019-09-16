package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio6 {

	/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
	  O usuário deve informar de qual número ele deseja ver a tabuada. A saída deve ser conforme o:
	  
	  Tabuada de 5:
	  5 x 1 = 5
	  5 x 2 = 10
	  ...
	  5 x 10 = 50 */
	
	public static void main(String[] args) {
		
		//variável
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Você deseja ver a tabuada de que número entre 1 e 10? ");
	    numero = teclado.nextInt();
		
		//processamento
		while(numero < 1 || numero > 10) {
			System.out.println("Número invalido ");
			System.out.println("Você deseja ver a tabuada de que número entre 1 e 10? ");
			numero = teclado.nextInt();
		}
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d\n", numero, i, (numero * i));
		}
		teclado.close();
	}

}
