//Seção 07 - Exercicío 05
/* Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem de
erro e voltando a pedir informações.
 */

#include <stdio.h>
#include <string.h>

int main(){
	//variáveis
	char nome[100], senha[100];

	//entradas
	printf("Informe o nome: ");
	gets(nome);
	printf("Defina uma senha: ");
	gets(senha);

	//processamento
	while(!strcmp(nome, senha)){  //strcmp, da biblioteca <string.h>, compara strings (em C, vetores de caracteres)
		printf("Erro: nome e senha iguais\n");
		printf("Informe o nome: ");
				gets(nome);
				printf("Defina uma senha:");
				gets(senha);
	}
}
