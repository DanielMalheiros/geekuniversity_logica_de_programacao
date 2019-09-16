package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio4 {

	/*Faça um algoritmo que leia 10 valores inteiros e positivos e:
	  a) Encontre o maior valor;
	  b) Encontre o menos valor;
	  c) Calcule a média dos números lidos; */
	
	public static void main(String[] args) {
		
		//variáveis
		int n, maior = -999, menor = 999, soma = 0;
		float media;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		for(int i = 0; i < 10; i++) {
			System.out.printf("Informe um valor: (%d/10)\n", i+1);
			n = teclado.nextInt();
			
			if(n > 0) {
				if(n > maior) {
					maior = n;
				}
				if(n < menor) {
					menor = n;
				}
				soma = soma + n;
			}else {
				i--;
			}
		}
		media = soma / 10;
		System.out.println("O maior valor é " + maior);
		System.out.println("O menor valor é " + menor);
		System.out.println("A média entre os valores é " + media);
		teclado.close();
	}
}
