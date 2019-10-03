"""Seção 08 - Exercício 04

Escreva um algoritmo que leia e mostre um vetor de 20 elementos inteiros, em seguida,
mostre a soma de todos os elementos."""

# variáveis
vetor = []
soma = 0

# entradas, processamento e saída
for n in range (0, 20):
    num = int(input("Defina um número para o vetor ({0}/20):".format(n+1)))
    vetor.append(num)
print("A soma do vetor é {0}".format(sum(vetor)))
