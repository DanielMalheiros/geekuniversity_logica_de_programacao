//Seção 08 - Exercício 05
/*Faça um programa que carregue um vetor com dez números inteiros.
 Calcule e mostre os números superiores a 50 e suas respectivas posições.
 Mostrar uma mensagem se não existir nenhum número nesta condição.
*/

#include <stdio.h>

int main(){
	//variável
	int vetor[10];
	char tem_maior_50 = 0;

	//entradas
	for(int i = 0; i < 10; i++){
		printf("Infome um número inteiro para o vetor %d/10: ", (i+1));
		scanf("%d", &vetor[i]);
	}
	for(int i = 0; i < 10; i++){
		if(vetor[i] > 50){
			printf("O número %d está na posição %d.\n", vetor[i], i);
			tem_maior_50 = 1;
		}
	}
	if(tem_maior_50 < 1){
		printf("Não existe nenhum número maior que 50 no vetor.");
	}
}
