package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio5 {

	/*João da Silva, pescador, comprou um microcomputador para controlar o rendimento diário
	  do seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo
	  regulamento de pesca (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
	  João precisa de um algoritmo que leia a variável 'p' (peso de peixes), e verifique se
	  há excesso. Se houver, gravar na variável 'e' (excesso) e na variável 'm' o valor da multa
	  que deverá ser paga. Caso contrário, mostrar tais variáveis com o conteúdo 'zero'.
	 */
	
	public static void main(String[] args) {
		
		//variáveis
		float p, m, e;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Informe o peso de peixes em quilos: ");
		p = teclado.nextFloat();
		
		//processamento e saída
		if(p > 50) {
			m = (float)(p - 50) * (float) 4.00;
			e = (float) p - 50;
			System.out.printf("Excesso de %.2f quilos.\n", e);
			System.out.printf("Você deverá pagar %.2f reais em multas.", m);	
		}else {
			m = 0;
			e = 0;
			System.out.printf("Multas: %.2f reais", m);
			System.out.printf("Excesso: %.2f reais", e);
		}
		teclado.close();

	}

}
