//Seção 08 - Exercício 06
/*Faça um programa que receba um código númerico inteiro e um
 vetor de cinco posiçoes de números reais. Se o código for zero,
 termine o programa. Se o código for 1, mostre o vetor na ordem
 direta. Se o codigo for 2, mostre o vetor na ordem inversa.*/

#include <stdio.h>

int main(){
	//variáveis
	int codigo;
	float vetor[5];

	//entradas
	printf("Informe o código: ");
	scanf("%d", &codigo);
	if(codigo != 0){
		for(int i = 0; i < 5; i++){
			printf("Informe um número real: (%d/5)", (i+1));
			scanf("%f", &vetor[i]);
		}
	//processamento
	if(codigo == 1 ){
		for(int i = 0; i < 5; i++){
			printf("%.2f\n", vetor[i]);
		}
	}
	if(codigo == 2){
		for(int i = 4; i >= 0; i--){
			printf("%.2f\n", vetor[i]);
		}
	}
	}
}
