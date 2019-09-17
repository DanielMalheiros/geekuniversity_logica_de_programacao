"""Seção 08 - Exercício 02

EScreva um algoritmo que leia dois vetores de 10 posições e faça a soma dos elementos
de mesmo indice, colocando o resultado em um terceiro vetor. Mostre o vetor resultante."""

# variáveis
vetor1 = []
vetor2 = []
soma = []

# entrada e processamento
for n in range(0,10):
    num1 = int(input("Informe o valor para o primeiro vetor ({0}/10): ".format(n+1)))
    vetor1.append(num1)
    num2 = int(input("Informe o valor para o segundo vetor ({0}/10): ".format(n+1)))
    vetor2.append(num1)
    soma.append(num1 + num2)
for n in soma:
    print(n)
