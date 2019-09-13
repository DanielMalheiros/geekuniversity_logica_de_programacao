//Seção 08 - Exercicio 2
/* Escreva um algoritmo que leia dois vetores de 10 posições e faça a soma dos elementos
de mesmo índice, colocando o resultado em um terceiro vetor. Mostre o vetor resultante.
 */

#include <stdio.h>

int main(){
	//variáveis
	int vetor1[10], vetor2[10], soma[10];

	//entrada
	for(int i = 0; i < 10; i++){
		printf("Informe um valor para o primeiro vetor: ");
		scanf("%d", &vetor1[i]);
		printf("Informe um valor para o segundo vetor: ");
		scanf("%d", &vetor2[i]);

		//processamento e saída
		soma[i] = vetor1[i] + vetor2[i];
	}
	for(int i = 0; i < 10; i++){
		printf("%d\n", soma[i]);
	}
}
