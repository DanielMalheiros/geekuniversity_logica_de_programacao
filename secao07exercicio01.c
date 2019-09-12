//Seção 07 - Exercício 01
/*Faça um algoritmo que determine o maior entre N números. A condição de
parada é a entrada de um valor 0, ou seja, o algoritmo deve calcular o maior
valor até que a entrada seja igual a 0 (zero).
 */

#include <stdio.h>
int main(){
	//variáveis
	int n, maior = 0;

	//entradas
	printf("Informe um numero: ");
	scanf("%d", &n);

	//processamento
	while(n != 0){
		if(n > maior){
			maior = n;
		}
		//entradas
		printf("Informe um numero: ");
		scanf("%d", &n);
	}
	//saída
	printf("O maior numero é %d", maior);
}
