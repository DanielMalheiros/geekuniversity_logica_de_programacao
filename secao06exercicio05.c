//Seção 06 - Exercicio 05
/*João da Silva, pescador, comprou um microcomputador para controlar o rendimento de seu trabalho.
 Toda vez que ele traz um peso de peixes maior do que o estabelecido pelo regulamento de pesca do Estado (5 quilos),
 deve pagar uma multa de R$4,00 por quilo excedente. João precisa que você faça um algoritmo que leia a variavel 'p'
 (peso de peixes) e verifique se há excesso. Se houver, gravar na variável 'e' (excesso) e na variável 'm' (valor da multa)
 que João deverá pagar. Caso contrario mostrar tais variáveis com conteudo 'zero'. */

#include <stdio.h>
int main(){
	//variáveis
	float p, m;
	char e[8] = "excesso"; /*Em C toda string finaliza com caracteres '\0',
	logo excesso vai de 0 (e) à 6 (o) + \0 (7 e 8). */

	//Entradas
	printf("Informe o peso dos peixes em quilos: ");
	scanf("%f", &p);

	//Processamento e saída
	if (p > 50){
		m = (p - 50) * 4.00;
		printf("Você pagará R$ %.2f em multas", m);
	}else{
		m=0;
		e[0] = 0;
		printf("Multas: %.2f\n", m);
		printf("Excesso: %d", e[0]);
	}
}
