//Seção 2 - Exercício 2:
//Faça um algoritmo para somar dois numeros e multiplicar o resultado pelo primeiro numero

#include <stdio.h>
// std = Standard (Padrao)
// io = input/output (Entrada/Saida)
// include = importando a biblioteca
// Logo, estamos importando a biblioteca Standard de entrada e saida de dados

int main(){
	//Declaraçao de variáveis
	int num1, num2, soma, multiplicacao;

	//Entradas
	printf("Informe o primeiro número: ");
	scanf("%d", &num1);

	printf("Informe o segundo número: ");
	scanf("%d", &num2);

	//Processamentos
	soma = num1 + num2;
	multiplicacao = soma * num1;

	//Saída
	printf("O resultado da multiplicação é %d", multiplicacao);
}

