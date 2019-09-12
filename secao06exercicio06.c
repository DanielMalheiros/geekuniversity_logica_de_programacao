//Seçao 06 - Exercício 06
/* Elabore um algoritmo que leia as variáveis 'c' e 'n', respectivamente codigo e número de horas trabalhadas
de um operario. Calcule o salário sabendo-se que operarios ganham R$10,00 por hora. Quando do numero de horas
exceder 50 calcule o excesso de pagamento armazenando-o na variavel 'e'. Caso contrario zerar tal variável. A
hora excedente de trabalho vale R$20,00. No final do processamento, imprimir salário total e o salário excedente. */

#include <stdio.h>

int main(){
	//Variáveis
	int c;
	float n, e = 0, salario, valor_hora = 10;

	//Entradas
	printf("Informe seu código ");
	scanf("%d", &c);
	printf("Informe a quantidade de horas trabalhadas: ");
	scanf("%f", &n);

	//Processamento
	if(n > 50){
		e = (n - 50) * 20,00;
		salario = (50 * valor_hora) + e;
		//Saída
		printf("Salário Total: R$ %.2f\n", salario);
		printf("Salário excedente: R$ %.2f\n", e);
		printf("Horas extra: %.2f\n", e / 20);
	}else{
		salario = n * valor_hora;
		printf("Salário total: R$ %.2f\n", salario);
		printf("Salário excedente: R$ %.2f\n", e);
		printf("Sem horas extra.");
	}
}
