//Seção 07 - Exercício 04
/* Construa um algoritmo que leia 10 valores inteiros e positivos e:
a) Encontre o maior valor
b) Encontre o menor valor
c) Calcule a média dos numeros lidos
 */

#include <stdio.h>
int main(){
	//variáveis
	int valor, maior = -9999, menor = 9999, soma = 0;
	float media;

	//entradas
	for(int i = 0; i <10; i++){
			printf("Informe um valor: ");
			scanf("%d", &valor);
			//processamento
			if(valor > 0){
				if(valor > maior){
					maior = valor;
				}
				if(valor < menor){
					menor = valor;
				}
				soma = soma + valor;
			}else{
				i--;
			}
		}
	media = soma / 10;
	//saída
	printf("O maior número é %d\n", maior);
	printf("O menor número é %d\n", menor);
	printf("A média dos números é %2.f", media);


}
