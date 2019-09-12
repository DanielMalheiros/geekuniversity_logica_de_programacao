//Seção 08 - Exercício 03
/*Faça um programa que carregue um vetor com dez números inteiros.
Mostre o vetor na ordem inversa a que foi digitado.*/

#include <stdio.h>

int main(){
	//variável
	int vetor[10];

	//entradas
	for(int i = 0; i <10; i++){  //vetor[10] = 0,1,2...9
	    printf("Informe um valor inteiro para o vetor: ");
	    scanf("%d", &vetor[i]);
	}
	for(int i = 9; i >= 0; i--){
		printf("%d\n", vetor[i]);
		//se o primeiro elemento é 0 e o ultimo é 9, iniciamos com 9 até o 0 para invertermos.
	}
}
