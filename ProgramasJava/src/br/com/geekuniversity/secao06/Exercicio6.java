package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio6 {

	/*Elabore um algoritmo que leia as variáveis 'c' e 'n', respectivamente código e número de horas
	  trabalhadas de um operário. Calcule o salário sabendo-se que ele ganha R$10,00 por hora. Quando 
	  o número de horas exceder a 50 calcule o excesso de pagamento, armazenando-o na variável 'e'.
	  Caso contrario, zerar tal variável. A hora excedente de trabalho vale R$20,00. No final do
	  processamento imprima o salário total e o salário excedente. */
	 
	public static void main(String[] args) {
		
		//variáveis
		float n, e = 0, valor_hora = (float) 10.00, valor_hora_excesso = (float) 20.00, salario;
		int c;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o código: ");
		c = teclado.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		n = teclado.nextFloat();
		
		//processamento e saída
		if(n > 50) {
			e = (n - 50) * valor_hora_excesso;
			salario = (50 * valor_hora) + e;
			System.out.printf("Salário total: R$ %.2f\n", salario);
			System.out.printf("Salário base: R$ %.2f\n", salario - e);
			System.out.printf("Salário (horas extra): R$ %.2f", e);
		}else {
			salario = n * valor_hora;
			System.out.printf("Salário total: R$ %.2f\n", salario);
			System.out.println("Sem horas excedentes.");
		}
		teclado.close();
	}

}
