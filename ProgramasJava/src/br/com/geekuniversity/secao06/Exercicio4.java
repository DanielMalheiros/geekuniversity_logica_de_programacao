package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio4 {

	/*Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que 
	  calcule seu peso ideal, utilizando as seguintes fórmulas:
	  Para homens: (72.7 * altura) - 58
	  Para mulheres: (62 * altura) - 44.7 */
	 
	public static void main(String[] args) {
		
		//variáveis
		float altura, peso_ideal;
		char sexo;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe sua altura: ");
		altura = teclado.nextFloat();
		System.out.println("Informe seu sexo: (M/F)");
		sexo = teclado.next().charAt(0);
		/*É necessario utilizar charAt para castar o M ou F de string para caracter.
		  O retorno da .next() viria em "string" independente de ser somente um caracter.
		  No java, aspas duplas marca string enquanto aspas simples marcam caracter. */
		
		//processamento
		if(sexo == 'm' || sexo == 'M') {
			peso_ideal = (float)(72.7 * altura) - 58;
			System.out.printf("Seu peso ideal é %.2f quilos.\n", peso_ideal);
		}
		else if(sexo == 'f' || sexo == 'F') {
			peso_ideal = (float)(62.1 * altura) - (float)44.7;
			System.out.printf("Seu peso ideal é %.2f quilos.\n", peso_ideal);
		}
		else {
			System.out.println("Sexo invalido. Reinicie o programa.");
			peso_ideal = 0;
		}
		teclado.close();
	}
}
