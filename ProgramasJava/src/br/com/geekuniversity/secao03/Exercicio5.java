package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio5 {

	//Faça um algoritmo que converta metros para centímetros.
	
	public static void main(String[] args) {
		
		//variáveis
		int metros, centimetros;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o valor em metros: ");
		metros = teclado.nextInt();
		
		//processamento
		centimetros = (metros * 100);
		
		//saída
		System.out.println(metros + " metros em centímetros é " + centimetros);
		
		teclado.close();

	}

}
