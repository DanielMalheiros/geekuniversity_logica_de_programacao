//Seçao 7 - Exercício 06
/* Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
O usuário deve informar o número o qual ele deseja ver a tabuada e a saída deve ser conforme o exemplo
abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 1
...
5 x 10 = 50
 */

#include <stdio.h>

int main(){
	//variável
	int numero;

	//entrada
	printf("Escolha um numero entre 1 e 10 para a tabuada: ");
	scanf("%d", &numero);

	//processamento
	while(numero < 1 || numero > 10){
		printf("Número invalido.\n");
		printf("Escolha um numero entre 1 e 10 para a tabuada: ");
		scanf("%d", &numero);
	}
	for(int i = 1; i <= 10; i++){
		printf("%d X %d = %d\n", numero, i, (numero * i));  //número informado X i (1,2,3...10) = número informado x i
	}
}
