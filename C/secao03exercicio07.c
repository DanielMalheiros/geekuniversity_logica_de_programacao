//Seção 03 - Exercício 07
/*Tendo como dado de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal
Para peso ideal, use a seguinte fórmula: (72.7 * altura) - 58 */

#include <stdio.h>
int main(){
	//Declaração de variáveis
	float altura, peso_ideal;

	//Entrada
	printf("Qual sua altura? (Sem virgula! Use ponto. Ex: 1.80, 1.60, etc...)");
	scanf("%f", &altura);

	//Processamento
	peso_ideal = (72.7 * altura) - 58;

	//Saída
	printf("Seu peso ideal seria %.2f quilos.", peso_ideal);
}
