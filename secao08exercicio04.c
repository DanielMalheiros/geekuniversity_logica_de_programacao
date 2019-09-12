//Seçao 08 - Exercício 04
/*Faça um algoritmo que leia e mostre um vetor de 20 elementos inteiros, em seguida,
 mostre a soma de todos os elementos. */

#include <stdio.h>

int main(){
	//variáveis
	int vetor[20], soma = 0;

	//entradas
	for(int i = 0; i < 20; i++){
		printf("Informe um número para o vetor %d/20: ", (i + 1));
		scanf("%d", &vetor[i]);
		soma = soma + vetor[i];
	}
	printf("A soma do vetor é %d.", soma);
}
