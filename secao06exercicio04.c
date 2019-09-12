//Seçao 6 - Exercício 04
/*Tendo como ddos de entrada a altura e sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal.
Para homens: (72.7 * altura) - 58
Para mulheres: (62.1 * altura) - 44.7 */

#include <stdio.h>
#include <ctype.h>

int main(){
	//Variáveis
	float altura, peso_ideal;
	char sexo;

	//Entradas
	printf("Informe sua altura (use ponto e não virgula! Ex: 1.70): ");
	scanf("%f", &altura);
	gets(stdin); //corrigir bug
	printf("Informe seu sexo (M/F):  ");
	scanf("%c", &sexo);

	//Processamento e saída
	if(tolower(sexo) == 'm'){
		peso_ideal = (72.7 * altura) - 58;
		printf("Seu peso ideal é de %.2f quilos", peso_ideal);
    }
	if(tolower(sexo) == 'f'){
		peso_ideal = (62.1 * altura) - 44.7;
		printf("Seu peso ideal é de %.2f quilos", peso_ideal);
	}
	if(tolower(sexo) != 'm' && tolower(sexo) != 'f')
		printf("Favor responder M para masculino e F para feminino.");
}
