//Seção 3 - Exercício 2
/*Faça um algoritmo para "calcular o estoque médio de uma peça", sendo que:
estoque médio = (quantidade_minima * quantidade maxima) / 2 */

#include <stdio.h>

int main(){
	//declaração de variáveis
	int quantidade_minima, quantidade_maxima;
	float estoque_medio;

	//entradas
	printf("Informe a quantidade mínima: ");
	scanf("%d", &quantidade_minima);

	printf("Informe a quantidade máxima: ");
	scanf("%d", &quantidade_maxima);

	//processamento
	estoque_medio = (quantidade_minima + quantidade_maxima) / 2;

	//saída
	printf("O estoque médio é de %.2f", estoque_medio);
}
