//Seçao 06 - Exercício 10
/*Elabore um algoritmo que dada a idade de um nadador, classifique-o
em uma das seguintes categorias:
infantil-a = 5 a 7 anos
infantil-b = 8 a 11 anos
juvenil-a = 12 a 13 anos
juvenil-b = 14 a 17 anos
adultos = maiores de 18 anos
 */

#include <stdio.h>
int main(){
	//variável
	int idade;

	//processamento e saída
	printf("Qual sua idade? ");
	scanf("%d", &idade);

	if(idade >= 5 && idade <= 7){
		printf("Categoria Infantil-A");
	}else if(idade >= 8 && idade <= 11){
		printf("Categoria Infantil-B");
	}else if(idade >= 12 && idade <= 13){
		printf("Categoria Juvenil-A");
	}else if(idade >= 14 && idade <= 17){
		printf("Categoria Juvenil-B");
	}else if(idade > 18){
		printf("Categoria Adulta");
	}else{
		printf("Idade invalida");
	}
}
