package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio7 {

	/*Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu
	  peso ideal, usando a seguinte formula: (72.7 * altura) - 58 */
	 
	public static void main(String[] args) {
		
		//variável
		float altura, peso_ideal;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Qual sua altura? ");
		altura = teclado.nextFloat();
		
		//processamento
		peso_ideal = (float)((72.7 * altura) - 58);
		//fazer o cast (float) é necessario pois o sistema nao sabe se 72.7 é um double ou float 
		
		//saída
		System.out.printf("Seu peso ideal é de %.2f quilos", peso_ideal);
		
		teclado.close();

	}

}
