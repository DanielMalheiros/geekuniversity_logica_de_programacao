//Seção 06 - Exercício 02
//Elabore um algoritmo que leia um número. Se positivo, armazene-o em 'a', se negativo, em 'b'.

#include <stdio.h>
int main(){
	//Declaração de variáveis
	int numero, a, b;

	//Entradas
	printf("Informe um número: ");
	scanf("%d", &numero);

	//Processamento
	if(numero > 0){
		a = numero;
		printf("O número %d é positivo.\n", numero);
	}else{
		b = numero;
		printf("O número %d é negativo.\n", numero);
	}

}
