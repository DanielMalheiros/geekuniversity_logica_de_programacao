//Seção 03 - Exercício 06
/*Faça um algoritmo que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
Com esses dados, calcule e mostre o total do seu salário no referido mês. */

#include <stdio.h>

int main(){
	//Declaração de variáveis
	float valor_por_hora, salario;
	int horas_trabalhadas;

	//Entradas
	printf("Quanto você ganha por hora (em reais)? ");
	scanf("%f", &valor_por_hora);

	printf("Quantas horas você trabalhou neste mês? ");
	scanf("%d", &horas_trabalhadas);

	//Processameto
	salario = (horas_trabalhadas * valor_por_hora);

	//Saída
	printf("Neste mês seu salário será de: %.2f reais", salario);
}
