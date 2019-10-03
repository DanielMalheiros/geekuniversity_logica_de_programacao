"""Seção 08 - Exercício 03

Faça um programa que carregue um vetor com dez números inteiros. Mostre o vetor
na ordem inversa a que foi digitado."""

# variável
vetor = []

# entrada e processamento
for n in range(0, 10):
    num = int(input("Informe o valor para o vetor ({0}/10):".format(n+1)))
    vetor.append(num)

vetor.reverse()  # inverte a lista
for n in vetor:
    print(n)

