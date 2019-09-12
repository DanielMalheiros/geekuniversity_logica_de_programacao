//Seção 06 - Exercício 03
//Ler um número e verificar se ele é par ou impar.
//Quando par, armazena-lo em 'p', quanto impar, armazena-lo em 'i'. Exibir 'p' e 'i' no final do processamento.


#include <stdio.h>
int main(){
	//Variáveis
	int numero, p = 0, i = 0;

	//Entradas
	printf("Informe um número inteiro: ");
	scanf("%d", &numero);

	//Processamento
	if(numero % 2 == 0){
		p = numero;
	}else{
		i = numero;
	}
	//Saída
	printf("%d\n", p);
	printf("%d", i);
}
