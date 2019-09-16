package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio9 {

	/*A secretaria do meio ambiente que controla o indice de poluição mantém 3 grupos de industrias que
	  são altamente poluentes sob supervisão. O indice de poluição aceitavel varia entre 0,05 e 0,25. Se
	  o indice subir para 0,3, as industrias do grupo do primeiro grupo são intimadas a suspenderem suas
	  atividades. Se o indice subir até 0,4, as industrias do primeiro e segundo grupo deverão suspender
	  suas atividades. Se o indice atingir 0,5, todos os grupos devem suspender suas atividades. Faça
	  um algoritmo que leia o indice de poluição medido e emita a notificação adequada aos diferentes grupos
	  de empresas. */
	 
	public static void main(String[] args) {
		
		//entradas
		float i;
		
		//entradas
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o indice de poluição? ");
		i = teclado.nextFloat();
	
		//processamento e saída
		if(i >= 0.3 && i < 0.4) {
			System.out.println("As industrias do primeiro grupo devem suspender suas atividades.");
		}else if(i >= 0.4 && i < 0.5) {
			System.out.println("As industrias do primeiro e segundo grupo devem suspender suas atividades.");
		}else if(i >= 0.5) {
			System.out.println("Todas os grupos de industrias devem suspender suas atividades.");
		}else if(i < 03) {
			System.out.println("Indice de poluição dentro dos limites aceitaveis.");
		}	
		teclado.close();
	}
}
