package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio10 {

	/*ELabore um algoritmo que dada a idade de um nadador, classifique-o em uma das seguintes categorias:
	 infantil-a: 5 a 7 anos
	 infantil-b: 8 a 11 anos
	 juvenil-a: 12 a 13 anos
	 juvenil-b: 14 a 17 anos
	 adulto: Maiores de 18 anos */
	
	public static void main(String[] args) {
		
		//variável
		int idade;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Quantos anos tem o nadador? ");
		idade = teclado.nextInt();
		
		//processamento
		if(idade >=5 && idade <= 7) {
			System.out.println("Grupo: Infantil-a");
		}else if(idade >=8 && idade <= 11) {
			System.out.println("Grupo: Infantil-b");
		}else if(idade >= 12 && idade <= 13) {
			System.out.println("Grupo: Juvenil-a");
		}else if(idade >= 14 && idade <= 17) {
			System.out.println("Grupo: Juvenil-b");
		}else if(idade >= 18) {
			System.out.println("Grupo: Adulto");
		}else if(idade < 5) {
			System.out.println("A idade minima para competir é de 5 anos.");
		}
        teclado.close();
	}
}
