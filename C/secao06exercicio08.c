//Seção 06 - Exercício 08
/* Faça um algoritmo que leia um número inteiro e mostre uma mensagem indicande se este número é par
ou impar e se é positivo ou negativo. */

#include <stdio.h>
int main(){
	//Variável
	int n;

	//Entrada
	printf("Informe um número inteiro: ");
	scanf("%d", &n);

	//Processamento
	if(n % 2 == 0){
		if(n > 0){
			printf("O número %d é par e positivo. ", n);
		}else{
			printf("O número %d é par e negativo", n);
		}
	}else{
		if(n > 0){
			printf("O número %d é impar e positivo.", n);
		}else{
			printf("O número %d é impar e negativo. ", n);
		}
	}
}
