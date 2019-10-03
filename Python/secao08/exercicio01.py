"""Seção 08 - Exercício 01

Faça um algoritmo que carregue um vetor de 5 elementos inteiros e em seguida armazene em um vetor apenas os
números pares maiores que 0. No final, mostrar os elementos do vetor."""

# variáveis
vetor = []
pares = []

for n in range(1,6):
    vetor.append(n)
    if n % 2 ==0:
        pares.append(n)
for p in pares:
    print(p)
