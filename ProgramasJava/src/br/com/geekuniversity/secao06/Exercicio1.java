package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio1 {

	/*Ler uma variável númerica n e imprimi-la somente se a mesma for maior que 100.
	  Caso contrario, imprimi-la com o valor zero. */
	 
	public static void main(String[] args) {
		
		//variável
		int n;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Escolha um valor para a variável n: ");
		n = teclado.nextInt();
		if(n > 100) {
		System.out.println(n);
		}else {
			n = 0;
			System.out.println(n);
		}
		teclado.close();
	}
}