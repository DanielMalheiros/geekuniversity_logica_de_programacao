//Seção 7 - Exercício 07
/*Sua organização acaba de contratar um estagiário para trabalhar com informatica, com intenção de fazer um levantamento
nas sucatas encontradas nesta área. A primeira tarefa dele é testar todos os cerca de 200 mouses que se encontram lá,
testando e anotando o estado e cada um deles para verificar quais podem ser aproveitados. Foi requisitado que você
desenvolva um programa para registrar este levantamento. O programa deverá receber um número indeterminado de entradas,
cada uma contendo um número de identificação do mouse e o tipo de defeito:
- necessita de esfera;
- necessita de limpeza;
- necessita troca de cabo ou conector;
- quebrado ou inutilizado

Uma identificação igual a zero encerra o programa. Ao final o programa deverá emitir o seguinte relatório:

Quantidade de mouses: 100

Situação                                        Quantidade     Percentual
- necessita de esfera;                            40             40%
- necessita de limpeza;                           30             30%
- necessita troca de cabo ou conector;            15             15%
- quebrado ou inutilizado;                        15             15%
 */

#include <stdio.h>

int main(){
	//variáveis
	int contador_total = 0, contador_sit_1 = 0, contador_sit_2 = 0, contador_sit_3 = 0, contador_sit_4 = 0,
			identificacao, defeito;
	float p1, p2, p3, p4;

	//entradas
	printf("Informe a identificaçao: ");
	scanf("%d", &identificacao);

	while(identificacao != 0){
		printf("Informe o defeito: (1/2/3/4)\n");
		printf("1- Necessita de esfera.\n");
		printf("2- Necessita de limpeza.\n");
		printf("3- Necessita de troca de cabo ou conector.\n");
		printf("4- Quebrado ou inutilizado.\n");
		scanf("%d", &defeito);

		//processamento
		if(defeito == 1){
			contador_sit_1 = contador_sit_1 + 1;
		}
		if(defeito == 2){
			contador_sit_2 = contador_sit_2 + 1;
	    }
		if(defeito == 3){
			contador_sit_3 = contador_sit_3 + 1;
		}
		if(defeito == 4){
			contador_sit_4 = contador_sit_4 + 1;
		}
		if(defeito != 1 && defeito != 2 && defeito != 3 && defeito != 4){
			printf("Número inválido.\n");
			contador_total = contador_total -1;
		}


		contador_total = contador_total + 1;

		//nova entrada para continuar loop
		printf("Informe a identificaçao: ");
		scanf("%d", &identificacao);
	}
	p1 = (((float)contador_sit_1 / (float)contador_total) * 100);
	/*(float) é um CAST. Pegamos a variavel contador_sit_1, que é do tipo int (inteiro) e a transformamos
	em um float (ponto flutuante). */
	p2 = (((float)contador_sit_2 / (float)contador_total) * 100);
	p3 = (((float)contador_sit_3 / (float)contador_total) * 100);
	p4 = (((float)contador_sit_4 / (float)contador_total) * 100);

	printf("Quantidade de Mouses %d\n\n", contador_total);
	printf("Situação \t\t\tQuantidade \tPercentual\n");
	printf("1-Necessita de esfera \t\t\t%d \t%.2f%%\n", contador_sit_1, p1);
	printf("2-Necessita de limpeza \t\t\t%d \t%.2f%%\n", contador_sit_2, p2);
	printf("3-Necessita da troca de cabo/conector \t%d \t%.2f%%\n", contador_sit_3, p3);
	printf("4-Quebrado ou inutilizado \t\t%d \t%.2f%%\n", contador_sit_4, p4);
}




