package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio2 {
	
	// Faça um algoritmo para somar dois números e multiplicar o resultado pelo primeiro número.
	
	public static void main(String[] args) {
	    //variáveis
		int num1, num2, soma, multiplicacao;
		Scanner teclado = new Scanner(System.in); 
		//estamos chamando a função "Scanner" de teclado, mas poderiamos atribui-lá a qualquer nome.
		
		//entradas
		System.out.println("Informe o primeiro número: "); 
		//diferença entre o println e o print é que o println pula uma linha, como "\n" em C.
		num1 = teclado.nextInt(); 
		System.out.println("Informe o primeiro número: ");
		num2 = teclado.nextInt(); 
		
		//processamento
		soma = num1 + num2;
		multiplicacao = soma * num1;
		
		//saída
		System.out.println("O resultado da multiplicação é " + multiplicacao);
		
		teclado.close();
	}

}



