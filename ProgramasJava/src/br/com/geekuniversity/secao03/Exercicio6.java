package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio6 {

	/*Faça um algoritmo que pergunte quanto você ganha por hora e o número de horas 
	  trabalhadas em um mês. Calcule e mostre o total do seu salário no referido mês.*/
	
	public static void main(String[] args) {
		
		//variáveis
		float valor_por_hora, salario;
		int horas_trabalhadas;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Qual valor você ganha por hora trabalhada? ");
		valor_por_hora = teclado.nextFloat();
		
		System.out.println("Quantas horas você trabalhou neste mês? ");
		horas_trabalhadas = teclado.nextInt();
		
		//processamento
		salario = (valor_por_hora * horas_trabalhadas);
		
		//saída
		System.out.println("Neste mês, você receberá R$ " + salario);
		
		teclado.close();
	}

}
