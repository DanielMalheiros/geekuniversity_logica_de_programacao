//Seção 08 - Exercício 01
/*Faça um algoritmo que carregue um vetor de 5 elementos inteiros e em seguida armazene em um
vetor apenas os números pares maiores que 0. No final, mostre os elementos do vetor.
 */

#include <stdio.h>

int main(){
	//variáveis
	int vetor[5], pares[5], cont_p = 0;

	//vetor[5] = 0,1,2,3,4
	for(int i = 0; i < 5; i++){
		printf("Informe um valor para o vetor: ");
		scanf("%d", &vetor[i]);
		if(vetor[i] % 2 == 0){
			if(vetor[i] > 0){
				pares[cont_p] = vetor[i];
				cont_p = cont_p + 1;
				/* pares[] não pode usar "i" como posição de vetor pois não necessariamente todos os
				 números que serão informado pelo usuario serão pares. Como indices começam em 0, se
				 o primeiro numero par fosse o terceiro numero informado pelo usuario e tivessemos usado
				 pares[i], este numero par seria indexado em [2] e não em [0]. Por isso, usamos pares[cont_p],
				 pois cont_p = 0 e este valor só contará com numeros pares para ser incrementado.
				 */
			}

		}
	}
	for(int i = 0; i < cont_p; i++){
		printf("%d\n", pares[i]);
	}
}
