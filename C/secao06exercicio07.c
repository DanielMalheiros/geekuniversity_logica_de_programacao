//Seção 06 - Exercício 07
/*Desenvolva um algoritmo que:
 a) Leia 4 (quatro) números;
 b) Calcule o quadrado de cada um;
 c) Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
 d) Caso contrario, imprima os valores lidos e seus respectivos quadrados.
 */

#include <stdio.h>
int main(){
	//variáveis
	int num1, num2, num3, num4, q1, q2, q3, q4;

	//Entrada
	printf("Insira o primeiro valor: ");
	scanf("%d", &num1);
	printf("Insira o segundo valor: ");
	scanf("%d", &num2);
	printf("Insira o terceiro valor: ");
	scanf("%d", &num3);
	printf("Insira o quarto valor: ");
	scanf("%d", &num4);

	//Processamento e saída
	q1 = num1 * num1;
	q2 = num2 * num2;
	q3 = num3 * num3;
	q4 = num4 * num4;

	if(q3 >= 1000){
		printf("O quadrado do número 3 é maior ou igual a 1000 (%d)", q3);
	}else{
		printf("Número 1: %d, Ao quadrado: %d\n", num1, q1);
		printf("Número 2: %d, Ao quadrado: %d\n", num2, q2);
		printf("Número 3: %d, Ao quadrado: %d\n", num3, q3);
		printf("Número 4: %d, Ao quadrado: %d\n", num4, q4);
	}
}
