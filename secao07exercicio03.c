//Seção 07 - Exercício 03
/* Elabore um programa que gera e escreve os números impares
 dos números entre 100 e 200.
 */

#include <stdio.h>
int main(){
	for(int i = 100; i <= 200; i++){
		if(i % 2 != 0){
			printf("%d\n", i);
		}
	}
}
