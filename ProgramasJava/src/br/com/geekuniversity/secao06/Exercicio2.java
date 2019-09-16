package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio2 {

	/*ELabore um algoritmo que leia um número. Se for positivo, armazene-o em "a", se negativo, em "b".
	  No final, mostrar o resultado.*/
	 
	public static void main(String[] args) {
	
		//variáveis
		int n, a, b;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Defina um numero para a variável n: ");
		n = teclado.nextInt();
		
		//processamento e saída
		if(n >=0) {
			a = n;
			System.out.println(a);
		}else {
			b = n;
			System.out.println(b);
		}
		teclado.close();
	}

}
