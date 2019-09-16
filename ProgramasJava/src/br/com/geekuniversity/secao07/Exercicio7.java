package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio7 {
	
	/* Sua organização acaba de contratar um estágiario para trabalhar no Suporte de Informática, com a
	   intenção de fazer um levantamento nas sucatas encontradas nesta área. A primeira tarefa dele será 
	   testar todos os cerca de 200 mouses que se encontraram lá, testando e anotando o estado de cada um
	   deles para verificar o que se pode aproveitar deles. Foi requisitado que você desenvolva um programa
	   para registrar este levantamento. O programa deverá receber um número indeterminado de entradas, cada
	   uma contendo um numero de identificação do mouse e o tipo de defeito:
	   -Necessita de esfera;
	   -Necessita de limpeza;
	   -Necessita de troca de cabo ou conector
	   -Quebrado ou inutilizado.
	   
	   Uma identificação igual a zero encerra o programa. Ao final o programa deverá emitir o seguinte relatório:
	   
	   Quantidade de mouses: 100
	   
	   Situação                                      Quantidade      Percentual
	   1-Necessidade de esfera                          40              40%
	   2-Necessita de limpeza                           30              30%
	   3-Necessita de troca de cabo ou conector         15              15%
	   4-Quebrado ou inutilizado                        15              15%
	 */
	
	public static void main(String[] args) {
		
		//variáveis
		int contador_total = 0, contador_sit_1 = 0, contador_sit_2 = 0,
				contador_sit_3 = 0, contador_sit_4 = 0, identificacao, defeito;
		float p1, p2, p3, p4;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Informe a identificação do mouse: ");
		identificacao = teclado.nextInt();
		
		while(identificacao != 0) {
			System.out.printf("Informe a situaçao do mouse ID %d:\n", identificacao);
			System.out.println("1- Necessita de esfera");
			System.out.println("2- Necessita de limpeza");
			System.out.println("3- Necessita de troca de cabo/conector");
			System.out.println("4- Quebrado ou inutilizado");
			
			defeito = teclado.nextInt();
			if(defeito == 1) {
				contador_sit_1 = contador_sit_1 + 1;
			}else if(defeito == 2) {
				contador_sit_2 = contador_sit_2 + 1;
			}else if(defeito == 3) {
				contador_sit_3 = contador_sit_3 + 3;
			}else if(defeito == 4) {
				contador_sit_4 = contador_sit_4 + 1;
		    }else {
		    	System.out.println("Defeito inválido.");
		    	contador_total = contador_total - 1;
		    }
			contador_total = contador_total + 1;
			//entrada
			System.out.println("Informe a identificação do mouse: ");
			identificacao = teclado.nextInt();		
		}
		p1 = ((float)contador_sit_1 / (float)contador_total) * (float)100.00;
		p2 = ((float)contador_sit_2 / (float)contador_total) * (float)100.00;
		p3 = ((float)contador_sit_3 / (float)contador_total) * (float)100.00;
		p4 = ((float)contador_sit_4 / (float)contador_total) * (float)100.00;
		
		System.out.printf("Quantidade de mouses: %d\n", contador_total);
		System.out.println("Situação \t\t\t\tQuantidade \tPercentual");
		System.out.printf("1- Necessita de esfera \t\t\t%d \t\t%.2f%%\n", contador_sit_1, p1 );
		System.out.printf("2- Necessita de limpeza \t\t%d \t\t%.2f%%\n", contador_sit_2, p2 );
		System.out.printf("3- Necessita troca de cabo/conector \t%d \t\t%.2f%%\n", contador_sit_3, p3 );
		System.out.printf("4- Quebrado ou inutilizado \t\t%d \t\t%.2f%%", contador_sit_4, p4 );
		teclado.close();
	}
}
