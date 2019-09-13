//Seção 03 - Exercício 05
//Faça um algoritmo que converta metros para centímetros

#include <stdio.h>

int main(){
	//Declaração de variáveis
	int metros, centimetros;

	//Entrada
	printf("Informe o valor em metros: ");
	scanf("%d", &metros);

	//Processamento
	centimetros = (metros * 100);

	//Saída
	printf("%d metros em centímetros é %d", metros, centimetros);
}
