//Seçao 06 - Exercício 01
//Ler uma variável numérica n e imprimi-la somente se a mesma for maior que  100.
//Caso contrario, imprimi-la com o valor zero.

#include <stdio.h>

//Declaração de variáveis
int main(){
	int n;

	//Entrada
	printf("Informe um número: ");
	scanf("%d", &n);

	//Processamento e saída
	if(n > 100){
		printf("%d", n);
	}else{
		n = 0;
		printf("%d", n);
	}
}
