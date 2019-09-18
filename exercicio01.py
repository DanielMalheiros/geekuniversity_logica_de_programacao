"""Seção 03 - Exercício 02

Faça um algoritmo para calcular o estoque médio de uma peça, sendo que:

estoque_medio = (quantidade_minima + quantidade_maxima) / 2
"""

# entradas
quantidade_minima = int(input("Informe a quantidade mínima: "))
quantidade_maxima = int(input("Informe a quantidade máxima: "))

# processamento e saída
estoque_medio = (quantidade_minima + quantidade_maxima) / 2
print("O estoque médio é: {0}.".format(estoque_medio))




