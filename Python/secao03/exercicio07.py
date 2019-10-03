"""Seção 03 - Exercício 07

Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu
peso ideal, considerando a seguinte formula:

peso_ideal = (72.7 * altura) - 58
"""

# entrada
altura = float(input("Qual sua altura (ex. 1.70, 1.63...)?"))

# processamento
peso_ideal = (72.7 * altura) - 58

# saída
print("Seu peso ideal é de {0}.".format(peso_ideal))

