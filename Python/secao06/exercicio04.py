"""Seção 06 - Exercício 04

Tendo em conta dados de entrada como altura e sexo de uma pessoa, contrua um
algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens (72.7 * altura) -58
Para mulheres (62.1 * altura) - 44.7"""

# entradas
altura = float(input("Informe sua altura: "))
sexo = input("Informe seu sexo: (M/F)")

if sexo.lower() == "m":
    peso_ideal = (72.7 * altura) - 58
elif sexo.lower() == "f":
    peso_ideal = (62.1 * altura) - 44.7
else:
    print("Sexo não reconhecido.")
    peso_ideal = "(ERRO)"
print("Seu peso ideal é de {0:.2f} quilos.".format(peso_ideal))
