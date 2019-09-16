package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio5 {

	/*Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome
	  do usuário, mostrando uma mensagem de erro e voltando a pedir informações. */
	 
	public static void main(String[] args) {
		
		//variáveis
		String nome, senha;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Informe o nome de usuário: ");
		nome = teclado.next();
		System.out.println("Informe a senha: ");
		senha = teclado.next();
		
		//processamento
		while(nome.equals(senha)) {
			System.out.println("Erro: Nome de usuário e senha devem ser diferentes.");
			System.out.println("Informe o nome de usuário: ");
			nome = teclado.next();
			System.out.println("Informe a senha: ");
			senha = teclado.next();
		}
	    teclado.close();
	}
}
