//Seção 06 - Exercício 09
/* A secretaria do Meio Ambiente que controla o indice de poluição mantém 3
grupos de indústrias que são altamente poluentes sob observação. O indice
de poluição aceitavel varia de 0,05 até 0,25. Se o indice sobe para 0,3,
as indústrias do primeiro são intimadas a suspenderem suas atividades.
Se o indice crescer para 0,4, as indústrias do primeiro se segundo grupo
são intimadas a suspenderem suas atividades. Se o indice atingir 0,5,
todos os grupos devem ser notificados e suspenderem suas atividades.

Faça um algoritmo que leia o indice de poluição medido e emita a notificaçao
adequada aos diferentes grupos de indústrias. */


#include <stdio.h>
int main(){
	//Variável
	float indice_de_poluicao;

	//Entrada
	printf("Qual o indice de poluição? ");
	scanf("%f", &indice_de_poluicao);

	//Processamento
	if(indice_de_poluicao >= 0.3 && indice_de_poluicao < 0.4){
		printf("Atenção: indústrias do primeiro grupo devem suspender as atividades. ");
	}else if(indice_de_poluicao >= 0.4 && indice_de_poluicao < 0.5){
		printf("Atenção: indústrias do primeiro e segundo grupo devem suspender as atividades. ");
	}else if(indice_de_poluicao >= 0.5){
		printf("Atenção: as indústrias dos três grupos devem suspender suas atividades. ");
	}else{
		printf("Os niveis de poluição estão dentro dos limites aceitaveis. ");
	}
}
