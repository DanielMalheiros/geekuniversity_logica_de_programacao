//Seção 07 - Exercício 02
/*Faça um algoritmo que conte de 1 a 100 e cada multiplo de 10 emita
a mensagem "Múltiplo de 10."
 */

#include <stdio.h>
int main(){
	for(int i = 1; i <= 100; i++){
		printf("%d\n", i);
		if(i % 10 == 0){
			printf("Múltiplo de 10\n");
		}
	}
}
