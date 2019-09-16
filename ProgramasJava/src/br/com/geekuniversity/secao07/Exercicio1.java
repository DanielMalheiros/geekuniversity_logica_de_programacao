package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio1 {

	/*Faça um algoitmo que determine o maior entre N números. A condição de parada é a entrada de um valor 0,
	  ou seja, o algoritmo deve calcular o maior valor até que a entrada seja igual a 0 (zero). */ 
	
	public static void main(String[] args) {
		
		//variável
		int n, maior = 0;
        Scanner teclado = new Scanner(System.in);
	
        //entradas
        System.out.println("Informe um numero inteiro: ");
        n = teclado.nextInt();
        
        //processamento
        while(n != 0) {
        	if(n > maior) {
        		maior = n;
        	}
        	System.out.println("Informe um numero inteiro: ");
            n = teclado.nextInt();
        }
        System.out.printf("O maior número é %d", maior);
        teclado.close();
	}
}
